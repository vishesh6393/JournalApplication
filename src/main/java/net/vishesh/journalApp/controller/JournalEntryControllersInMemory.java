//package net.vishesh.journalApp.controller;
//import net.vishesh.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryControllersInMemory {
//
//
//    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public void create(@RequestBody JournalEntry journalEntry){
//        journalEntries.put(journalEntry.getId(),journalEntry);
//
//    }
//
//    @GetMapping("id/{id}")
//    public JournalEntry getbyId(@PathVariable Long id){
//        return journalEntries.get(id);
//    }
//
//}
