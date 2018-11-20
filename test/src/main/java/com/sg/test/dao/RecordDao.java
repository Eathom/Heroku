/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.test.dao;


import com.sg.test.model.Record;
import java.util.List;

/**
 *
 * @author ahill
 */
public interface RecordDao {
    
    // CREATE
    public void addRecord(Record record);
    
    // READ
    public List<Record> getAllRecords();
    public Record getRecord(int id);
    
    // UPDATE
    public void updateRecord(Record record);
    
    // DELETE
    public void deleteRecord(int id);
    
}
