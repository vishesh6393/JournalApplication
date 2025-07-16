package net.vishesh.journalApp.service;

import net.vishesh.journalApp.entity.JournalEntry;
import net.vishesh.journalApp.repositories.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntry journalEntry){

        journalEntryRepo.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepo.findAll();
    }

//    public JournalEntry getById(ObjectId id){
//        return  journalEntryRepo.findById(id).get();
//    }
    public JournalEntry getById(ObjectId id){
        return journalEntryRepo.findById(id).orElse(null);

    }
    public Optional<JournalEntry> optionalJournalEntry(ObjectId id){
        return journalEntryRepo.findById(id);
    }
    public void deleteById(ObjectId id) {
        journalEntryRepo.deleteById(id);
    }

    /*
    * Controller ---service---repository
    * */
}
