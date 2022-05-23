/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reimbursement;

/**
 *
 * @author drew
 */

enum ReimbursementType
{
    FOOD,
    LODGING,
    OTHER,
    TRAVEL
}

enum ReimbursementStatus
{
    APPROVED,
    DENIED,
    PENDING
}
public class reimbursement {
    int ID;
    String Author;
    String Resolver;
    String Description;
    int Type;
    int Status;
    int Amount;
    
    public void SubmitReimbursementMethod()
    {
        
    }
    public void UpdateReimbursementMethod()
    {
        
    }
    public void GetReimbursementByID()
    {
        
    }
    public void GetPendingReimbursements()
    {
        
    }
    public void GetResolvedReimbursements()
    {
    } 
    public void GetReimbursementsByID()
    {
    } 
}
