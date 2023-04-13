/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoApp;


import controller.ProjectController;
import controller.TaskController;
import model.Project;
import model.Task;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;


/**
 * @author Vinicius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

//        ProjectController projectController = new ProjectController();
//
//        Project project = new Project();
//        project.setId(1);
//        project.setName("Projeto 1");
//        project.setDescription("description");
//
//        projectController.save(project);

//        projectController.update(project);

//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());

//        projectController.removeById(2);

        TaskController taskController = new TaskController();

        Task task= new Task();
        task.setIdProject(1);
        task.setName("Criar as telas da aplicação");
        task.setDescription("Devem ser criadas telas para os cadastros");
        task.setNotes("Sem notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());

        taskController.save(task);

//        task.setName("Alterar telas da aplicação");
//        taskController.update(task);

        List<Task> tasks = taskController.getAll(1);
        System.out.println("Total de tarefas = " + tasks.size());
    }

}
