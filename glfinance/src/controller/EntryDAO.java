package controller;

import java.io.IOException;

import model.Entry;
import model.category;
import model.subcategory;

/**
 * EntryDAO sets up data persistence methods
 * This is injected into the view tier
 * 
 * @author Greg Lynskey
 * @date   12-19-22
 */
public interface EntryDAO {

    /**
     * gets all entries from data source
     * @return array of all entries
     * @throws IOException if data source is not found
     */
    Entry[] get_all_entries() throws IOException;

    /**
     * gets entry corresponding to id
     * @param id of entry being searched for
     * @return null if no entry found, else returns the entry
     * @throws IOException if data source is not found
     */
    Entry get_entry( int id ) throws IOException;

    /**
     * finds all entries by category
     * @param c category being searched for
     * @return array of all entries with coresponding category tag
     * @throws IOException if data source is not found
     */
    Entry[] find_all_by_category( category c ) throws IOException;
    
    /**
     * finds all entries by subcategory
     * @param s subcategory being searched for
     * @return array of all entries with coresponding subcategory tag
     * @throws IOException if data source is not found
     */
    Entry[] find_all_by_subcategory( subcategory s ) throws IOException;

    /**
     * creates an entry in the dataset
     * @param entry to be added
     * @return entry added to set
     * @throws IOException if data source is not found
     */
    Entry create_entry (Entry entry) throws IOException;

    /**
     * updates a given entry in the dataset
     * @param id entry id to be updated
     * @param entry new entry data to be added
     * @return updated entry
     * @throws IOException if data source is not found
     */
    Entry update_entry ( int id, Entry entry) throws IOException;

    /**
     * deletes given entry from the dataset
     * @param id entry id to be deleted
     * @return true on success, false on failure
     * @throws IOException if data source is not found
     */
    boolean delete_entry ( int id ) throws IOException; 

}
