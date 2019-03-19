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
public class TemporaryEmployee extends Employee {
    private int days;
    private float msal;
    private final float daily=(float) 2000.00;

    public TemporaryEmployee() {
    }

    public TemporaryEmployee(String ename, String enumb, String dept,int days) {
        super(ename, enumb, dept);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    @Override
    public void calsal()
    {if(days>20)
    {msal=(days*daily*11)/10;}
    else{msal=days*daily;}
     super.setSalary(msal);
    }
    @Override
    public String toString()
{return super.toString()+"\nWorking days : "+days+"\nEmployee type : Temporary";}
}
