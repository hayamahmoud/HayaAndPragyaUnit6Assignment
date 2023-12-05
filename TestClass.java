/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement;

/**
 *
 * @author prsha1608
 */
public class TestClass {
    
    protected String title;
    protected Question[] testQ;
    
    public TestClass(String title) {
        this.title = title;
    }
    
    public TestClass(String title, Question[] testQ) {
        this(title);
        this.testQ = testQ;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Question[] loadQuestions() {
        return testQ;
    }
    
    public boolean equals(TestClass other) {
         return this.title.equals(other.getTitle()) && this.testQ.equals(other.loadQuestions()); 
    }
    
    public TestClass clone() {
         TestClass t2; 
        t2 = new TestClass(title, testQ); 
        return t2;
    }
    
    public String toString() {
        return "Title: " + this.title + "\nQuestion: " + this.testQ; 
    }
    
}
