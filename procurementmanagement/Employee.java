/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementmanagement;

/**
 *
 * @author qaziz
 */
public class Employee {

    public String name;
    public String email;
    public String cellno;

    @Override
    public String toString() {
        String line = "";
        line = name + " " + email + " " + cellno;
        return line;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        boolean flag = false;
        if (name.equals("")) {
            flag = false;
        } else {
            for (int i = 0; i < name.length(); i++) {
                if ((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') || (name.charAt(i) == ' ')) {
                    this.name = name;
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {

        boolean flag = true;
        boolean f = false;
        boolean f1 = false;
        int l = 0;
        int p = 0;
        if (email.equals("")) {
            f1 = false;
        } else {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    l++;
                    if (email.charAt(0) == '@' || email.charAt(0) == '.') {
                        flag = false;

                    }
                }
            }
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '.') {
                    p++;
                    if (p >= 1) {
                        f = true;
                    }
                }
            }
        }
        if (flag == true && f == true && l == 1 && p >= 1) {

            this.email = email;
            f1 = true;
        }
        return f1;
    }

    public String getCellno() {
        return cellno;
    }

    public boolean setCellno(String cellno) {
        boolean flag = false;
        if (cellno.equals("")) {
            flag = false;
        } else {
            if (cellno.length() >= 8) {
                for (int i = 0; i < cellno.length(); i++) {
                    if (cellno.charAt(i) >= '0' && cellno.charAt(i) <= '9') {
                        this.cellno = cellno;
                        flag = true;
                    }
                }
            }}
            return flag;
        }

    }
