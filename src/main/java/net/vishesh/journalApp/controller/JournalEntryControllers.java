package net.vishesh.journalApp.controller;
import net.vishesh.journalApp.entity.JournalEntry;
import net.vishesh.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllers {

    @Autowired
    private JournalEntryService journalEntryService;


    @PostMapping
    public JournalEntry create(@RequestBody JournalEntry journalEntry){
        journalEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(journalEntry);
        return journalEntry;
    }

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @GetMapping("id/{id}")
    public JournalEntry getbyId(@PathVariable ObjectId id) {
        return journalEntryService.getById(id);
    }

    @DeleteMapping("id/{id}")
    public JournalEntry deleteById(@PathVariable ObjectId id){
       JournalEntry toDelete= journalEntryService.getById(id);
       journalEntryService.deleteById(id);
       if(toDelete!=null){
           return toDelete;
       }
       return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry update(@PathVariable ObjectId id, @RequestBody JournalEntry updatedEntry){

        Optional<JournalEntry> old= journalEntryService.optionalJournalEntry(id);
        old.ifPresent(toUpdate ->{
            if(updatedEntry.getTitle()!= null) toUpdate.setTitle(updatedEntry.getTitle());
            if(updatedEntry.getContent() !=null) toUpdate.setContent((updatedEntry.getContent()));
            journalEntryService.saveEntry(toUpdate);
        });
        return old.orElse(null);
    }
//
//        Optional<JournalEntry> toUpdate=
////        JournalEntry entry = toUpdate.get();
////        if (updatedEntry.getTitle() != null) entry.setTitle(updatedEntry.getTitle());
////        if (updatedEntry.getContent() != null) entry.setContent(updatedEntry.getContent());
////        entry.setDate(LocalDateTime.now());
////        journalEntryService.saveEntry(entry);
//    }

}
