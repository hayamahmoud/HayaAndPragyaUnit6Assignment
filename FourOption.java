/*
 * Four option question class
 * Attributes: question, answer, option 1, option 2, option 3, option 4
 * December 5, 2023
 */
package projectmanagement;

/**
 *
 * @author hamah5330
 */
public class FourOption {
    //Declare instance variables
    protected String question; 
    protected String answer; 
    protected String option1; 
    protected String option2; 
    protected String option3; 
    protected String option4; 
    
    /**
     * Main constructor 
     * @param question
     * @param answer 
     */
    public FourOption(String question, String answer) {
        this.question = question; 
        this.answer = answer; 
    }
    
    /**
     * 
     * @param question
     * @param answer
     * @param o1
     * @param o2
     * @param o3
     * @param o4 
     */
    public FourOption(String question, String answer, String o1, String o2, String o3, String o4) {
        this(question, answer); 
        this.option1 = o1; 
        this.option2 = o2; 
        this.option3 = o3; 
        this.option4 = o4;
    }
    
    /**
     * 
     * @return 
     */
    public String getQuestion() {
        return this.question; 
    }
    
    /**
     * 
     * @param q 
     */
    public void setQuestion(String q) {
        this.question = q; 
    }
    
    /**
     * 
     * @return 
     */
    public String getAnswer() {
        return this.answer; 
    }
    
    /**
     * 
     * @param a 
     */
    public void setAnswer(String a) {
        this.answer = a; 
    }
    
    /**
     * 
     * @return 
     */
    public String getOption1() {
        return this.option1; 
    }
    
    /**
     * 
     * @param o1 
     */
    public void setOption1(String o1) {
        this.option1 = o1; 
    }
    
    /**
     * 
     * @return 
     */
    public String getOption2() {
        return this.option2; 
    }
    
    /**
     * 
     * @param o2 
     */
    public void setOption2(String o2) {
        this.option2 = o2; 
    }
    
    /**
     * 
     * @return 
     */
    public String getOption3() {
        return this.option3; 
    }
    
    /**
     * 
     * @param o3 
     */
    public void setOption3(String o3) {
        this.option3 = o3; 
    }
    
    /**
     * 
     * @return 
     */
    public String getOption4() {
        return this.option4; 
    }
    
    /**
     * 
     * @param o4 
     */
    public void setOption4(String o4) {
        this.option4 = o4; 
    }
   
    /**
     * 
     * @param other
     * @return 
     */
    public boolean equals(FourOption other){
        return this.answer.equals(other.getAnswer()); 
    }
    
    /**
     * 
     * @return 
     */
    public FourOption clone() {
        FourOption clone; 
        clone = new FourOption(question,answer,option1,option2,option3,option4);
        return clone; 
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return "Question: " + this.question + "\nAnswer: " + this.answer
                + "\nOption 1: " + this.option1 + "\nOption 2: " + this.option2
                + "\nOption 3: " + this.option3 + "\nOption 4: " + this.option4; 
    }
     
}
