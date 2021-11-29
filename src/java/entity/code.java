/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author sonph
 */
public class code {
    
    private String id;
    private String name;
    private Long total;
    private Long dis;
    private Date begin;
    private Date end;

    public code() {
    }

    public code(String id, String name, Long total, Long dis, Date begin, Date end) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.dis = dis;
        this.begin = begin;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getDis() {
        return dis;
    }

    public void setDis(Long dis) {
        this.dis = dis;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "code{" + "id=" + id + ", name=" + name + ", total=" + total + ", dis=" + dis + ", begin=" + begin + ", end=" + end + '}';
    }
    
    
}
