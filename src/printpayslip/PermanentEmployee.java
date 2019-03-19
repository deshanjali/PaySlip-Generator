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
public class PermanentEmployee extends Employee {
    private float basic;
    private float othrs;
    private final float hrate=(float)250.00;
    private float monsal;

    public PermanentEmployee() {
    }

    public PermanentEmployee(String name,String num,String dep,float basic, float othrs) {
        super(name,num,dep);
        this.basic = basic;
        this.othrs = othrs;
    }

    public float getBasic() {
        return basic;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public float getOthrs() {
        return othrs;
    }

    public void setOthrs(float othrs) {
        this.othrs = othrs;
    }

    

    

    @Override
    public void calsal() {
        monsal=basic+othrs*hrate;
        super.setSalary(monsal);
        
    }
    @Override
    public String toString()
    {return super.toString()+"\nBasic salary : "+basic+"\nOvertime hrs : "+othrs+"\nEmployee type : Permanent";}
            
}
