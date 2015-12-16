package org.lg.dao;

import java.sql.SQLException;
import java.util.List;
import org.lg.model.User;
import org.lg.model.UserExample;

public interface UserDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int countByExample(UserExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int deleteByExample(UserExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int deleteByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	void insert(User record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	void insertSelective(User record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	List selectByExample(UserExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	User selectByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int updateByExampleSelective(User record, UserExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int updateByExample(User record, UserExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int updateByPrimaryKeySelective(User record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table user
	 * @ibatorgenerated  Wed Dec 16 18:30:16 CST 2015
	 */
	int updateByPrimaryKey(User record) throws SQLException;
}