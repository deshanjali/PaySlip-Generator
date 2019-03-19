/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpayslip;

/**
 *
 * @author User
 */
public abstract class Employee {
    private String ename;
    private String enumb;
    private String dept;
    private float salary;

    public Employee() {
    }
   
    public Employee(String ename, String enumb, String dept) {
        this.ename = ename;
        this.enumb = enumb;
        this.dept = dept;
        
    }
   
   
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEnumb() {
        return enumb;
    }

    public void setEnumb(String enumb) {
        this.enumb = enumb;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public abstract void calsal();
    
    @Override
    public String toString()
    {return "\n\nPay slip\n-----------------------\nEmployee name : "+ename+"\nEmployee number : "+enumb+"\nDepartment : "+dept+"\n-------------------------------\nMonthly Salary : "+getSalary();}
}
