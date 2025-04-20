//package example.learning.service;
//
//import example.learning.model.TodoDB;
//import example.learning.repository.TodoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class TodoServiceDB {
//    @Autowired
//    private TodoRepository repo;
//
//    public List<TodoDB> getAllTodos() {
//        return repo.findAll();
//    }
//
//    public Todo getTodoById(String id) {
//        return repo.findById(id).orElse(null);
//    }
//
//    public Todo addTodo(Todo todo) {
//        return repo.save(todo);
//    }
//
//    public void deleteTodo(String id) {
//        repo.deleteById(id);
//    }
//
//    public Todo updateTodo(String id, Todo updated) {
//        Todo existing = repo.findById(id).orElse(null);
//        if (existing != null) {
//            existing.setData(updated.getData());
//            existing.setPriority(updated.getPriority());
//            return repo.save(existing);
//        }
//        return null;
//    }
//}
