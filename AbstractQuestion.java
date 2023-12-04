/*
 * AbstractQuestion Class 
 * Attributes: String question, String answer
 * December 4, 2023
 */

/**
 *
 * @author hamah5330
 */
public class AbstractQuestion {
    //Declare instance variables
    protected String question; 
    protected String answer; 
    
    /**
     * 
     * @param question
     * @param answer 
     */
    public AbstractQuestion(String question, String answer) { //Question cannot exist without the question and answer
        this.question = question; 
        this.answer = answer; 
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
     * @param other
     * @return 
     */
    public boolean equals(AbstractQuestion other) {
        return this.question.equals(other.getQuestion()) && this.answer.equals(other.getAnswer()); 
    }
    
    /**
     * 
     * @return 
     */
    public AbstractQuestion clone() {
        AbstractQuestion q2; 
        q2 = new AbstractQuestion(question,answer); 
        return q2;
    }
    
    /**
     * 
     * @return 
     */
    public String ToString() {
        return "Question: " + this.question + "\nAnswer: " + this.answer; 
    }
}
