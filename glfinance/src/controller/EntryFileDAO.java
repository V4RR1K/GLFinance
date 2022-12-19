package controller;

import java.io.IOException;

import model.Entry;
import model.category;
import model.subcategory;

/**
 * EntryFileDAO implements defined behavior for EntryDAO interface
 * This file uses a csv file to store the data
 * 
 * @author Greg Lynskey
 * @date   12-19-22
 */
public class EntryFileDAO implements EntryDAO{

    @Override
    public Entry[] get_all_entries() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry get_entry(int id) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry[] find_all_by_category(category c) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry[] find_all_by_subcategory(subcategory s) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry create_entry(Entry entry) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry update_entry(int id, Entry entry) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete_entry(int id) throws IOException {
        // TODO Auto-generated method stub
        return false;
    }

    
}
