package com.examples.java.core.accmgr3;

public interface AccountService {
    public void createAccount(Account account);
    public Account[] getAccounts();
    public Account getAccount(int id);
    public void updateAccount(int id, Account account);
    public void deleteAccount(int id);
}
