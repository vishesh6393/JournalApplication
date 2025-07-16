package net.vishesh.journalApp.service;

import net.vishesh.journalApp.entity.JournalEntry;
import net.vishesh.journalApp.repositories.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepo.save(journalEntry);
    }

    /*
    * Controller ---service---repository
    * */
}
