package db;

import java.util.List;
import java.util.Set;

import entity.Item;

/**
 * @author jinli
 *
 */
public interface DBConnection {
	/**
	 * Close the connection.
	 */	
	public void close();
	
	/**
	 * Insert the favorite items for a user.
	 * 
	 * @param userId
	 * @param ItemIds
	 */	
	public void setFavoriteItems(String userId, List<String> itemIds);

	
	/**
	 * Delete the favorite items for a user.
	 * 
	 * @param userId
	 * @param itemIds
	 */
	public void unsetFavoriteItems(String userId, List<String> itemIds);
	
	/**
	 * Get the favorite item ids for a user.
	 * 
	 * @param userId
	 * @return itemIds
	 */
	public Set<String> getFavoriteItemIds(String userId);
	
	/**
	 * Get the favorite items for a user.
	 * 
	 * @param userId
	 * @return Items
	 */
	public Set<Item> getFavoriteItems(String userId);
	
	/**
	 * Get categories based on item id.
	 * 
	 * @param itemId
	 * @return
	 */
	public Set<String> getCategories(String itemId);
	
	/**
	 * Search items near a geolocation and a term(optional).
	 * 
	 * @param lat
	 * @param lon
	 * @param term
	 * @return list of items
	 */
	public List<Item> searchItems(double lat, double lon, String term);
	
	/**
	 * Save item into db.
	 * 
	 * @param item
	 */
	public void saveItem(Item item);
	
	/**
	 * Get full name of a user.
	 * 
	 * @param userId
	 * @return
	 */
	public String getFullName(String userId);
	
	/**
	 * Return whether the credential is correct.
	 * 
	 * @param userId
	 * @param password
	 * @return boolean
	 */
	public boolean verifyLogin(String userId, String password);
	
}




