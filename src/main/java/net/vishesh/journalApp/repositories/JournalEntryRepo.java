package net.vishesh.journalApp.repositories;

import net.vishesh.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {

}
