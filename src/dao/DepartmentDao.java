package dao;

import entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department dep);
    void update(Department dep);
    void deleteById(int id);
    Department findById(Integer id);
    List<Department> findAll();

}
