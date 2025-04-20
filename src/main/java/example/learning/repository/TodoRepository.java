
package example.learning.repository;

import example.learning.model.TodoDB;
import org.springframework.data.mongodb.repository.MongoRepository;

// This interface will automatically provide CRUD methods
public interface TodoRepository extends MongoRepository<TodoDB, String> {}
