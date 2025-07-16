package net.vishesh.journalApp.controller;
import net.vishesh.journalApp.entity.JournalEntry;
import net.vishesh.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllers {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
       return null;
    }

    @PostMapping
    public void create(@RequestBody JournalEntry journalEntry){
        journalEntryService.saveEntry(journalEntry);

    }

    @GetMapping("id/{id}")
    public JournalEntry getbyId(@PathVariable Long id) {
        return null;
    }

}
