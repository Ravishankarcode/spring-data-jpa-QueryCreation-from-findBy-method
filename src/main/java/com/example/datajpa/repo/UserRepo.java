package com.example.datajpa.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa.model.User;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    /**
     * Keyword : Is, Equals
     * Sample : findByFirstname, findByFirstnameIs, findByFirstnameEquals
     * JPQL snippet : … where x.firstname = 1?
     * 
     * @param firstname
     * @return
     */
	List<User> findByFirstname(String firstname);
	/**
	 * Keyword : Like
	 * Sample : findByFirstnameLike
	 * JPQL snippet : … where x.firstname like ?1
	 * 
	 * @param firstname
	 * @return
	 */
	List<User> findByFirstnameLike(String firstname);
	/**
	 * Keyword : NotLike
	 * Sample : findByFirstnameNotLike
	 * JPQL snippet : … where x.firstname not like ?1
	 * 
	 * @param firstname
	 * @return
	 */
	List<User> findByFirstnameNotLike(String firstname);
	/**
	 * Keyword : StartingWith
	 * Sample : findByFirstnameStartingWith
	 * JPQL snippet : … where x.firstname like ?1 (parameter bound with appended %)
	 * 
	 * @param firstname
	 * @return
	 */
	List<User> findByFirstnameStartingWith(String firstname);
	/**
	 * Keyword : EndingWith
	 * Sample : findByFirstnameEndingWith
	 * JPQL snippet : … where x.firstname like ?1 (parameter bound with prepended %)
	 * 
	 * @param firstname
	 * @return
	 */
	List<User> findByFirstnameEndingWith(String firstname);
	/**
	 * Keyword : Containing
	 * Sample : findByFirstnameContaining
	 * JPQL snippet : … where x.firstname like ?1 (parameter bound wrapped in %)
	 * 
	 * @param firstname
	 * @return
	 */
	List<User> findByFirstnameContaining(String firstname);
	/**
	 * Keyword : IgnoreCase
	 * Sample : findByFirstnameIgnoreCase
	 * JPQL snippet :
	 * 
	 * @param firstname
	 * @return
	 */
	List<User> findByFirstnameIgnoreCase(String firstname);
	/**
	 * Keyword : Not
	 * Sample : findByLastnameNot
	 * JPQL snippet : … where x.lastname <> ?1
	 * 
	 * @param lastname
	 * @return
	 */
	List<User> findByLastnameNot(String lastname);
	/**
	 * Keyword : And
	 * Sample : findByLastnameAndFirstname
	 * JPQL snippet : … where x.lastname = ?1 and x.firstname = ?2
	 * 
	 * @param firstname
	 * @param lastname
	 * @return
	 */
	List<User> findByLastnameAndFirstname(String lastname, String firstname);
	/**
	 * Keyword : Or
	 * Sample : findByLastnameOrFirstname
	 * JPQL snippet : … where x.lastname = ?1 or x.firstname = ?2
	 * 
	 * @param lastname
	 * @param firstname
	 * @return
	 */
	List<User> findByLastnameOrFirstname(String lastname, String firstname);
	/**
	 * Keyword : After
	 * Sample : findByStartDateAfter
	 * JPQL snippet : … where x.startDate > ?1
	 * 
	 * @param startdate
	 * @return
	 */
	List<User> findByStartDateAfter(Date startdate);
	/**
	 * Keyword : Before
	 * Sample : findByStartDateBefore
	 * JPQL snippet : … where x.startDate < ?1
	 * 
	 * @param startdate
	 * @return
	 */
	List<User> findByStartDateBefore(Date startdate);
	/**
	 * Keyword : Between
	 * Sample : findByStartDateBetween
	 * JPQL snippet : … where x.startDate between 1? and ?2
	 * 
	 * @param startdate
	 * @param enddate
	 * @return
	 */
	List<User> findByStartDateBetween(Date startdate, Date enddate);
	/**
	 * Keyword : LessThan
	 * Sample : findByAgeLessThan
	 * JPQL snippet : … where x.age < ?1
	 * 
	 * @param age
	 * @return
	 */
	List<User> findByAgeLessThan(int age);
	/**
	 * Keyword : LessThanEqual
	 * Sample : findByAgeLessThanEqual
	 * JPQL snippet : … where x.age <= ?1
	 * 
	 * @param age
	 * @return
	 */
	List<User> findByAgeLessThanEqual(int age);
	/**
	 * Keyword : GreaterThan
	 * Sample : findByAgeGreaterThan
	 * JPQL snippet : … where x.age > ?1
	 * 
	 * @param age
	 * @return
	 */
	List<User> findByAgeGreaterThan(int age);
	/**
	 * Keyword : GreaterThanEqual
	 * Sample : findByAgeGreaterThanEqual
	 * JPQL snippet : … where x.age >= ?1
	 * 
	 * @param age
	 * @return
	 */
	List<User> findByAgeGreaterThanEqual(int age);
	/**
	 * Keyword : IsNull
	 * Sample : findByAgeIsNull
	 * JPQL snippet : … where x.age is null
	 * 
	 * @return
	 */
	List<User> findByAgeIsNull();
	/**
	 * Keyword : IsNotNull,NotNull
	 * Sample : findByAgeIsNotNull, findByAgeNotNull
	 * JPQL snippet : … where x.age not null
	 * 
	 * @return
	 */
	List<User> findByAgeNotNull();
	/**
	 * Keyword : In
	 * Sample : findByAgeIn(Collection<Age> ages)
	 * JPQL snippet : … where x.age in ?1
	 * 
	 * @param ages
	 * @return
	 */
	List<User> findByAgeIn(int ages[]);
	/**
	 * Keyword : NotIn
	 * Sample : findByAgeNotIn(Collection<Age> age)
	 * JPQL snippet : … where x.age not in ?1
	 * 
	 * @param ages
	 * @return
	 */
	List<User> findByAgeNotIn(int ages[]);
	/**
	 * Keyword : OrderBy
	 * Sample : findByAgeOrderByLastnameDesc
	 * JPQL snippet : … where x.age = ?1 order by x.lastname desc
	 * 
	 * @param age
	 * @return
	 */
	List<User> findByAgeOrderByLastnameDesc(int age);
	/**
	 * Keyword : True
	 * Sample : findByActiveTrue()
	 * JPQL snippet : … where x.active = true
	 * 
	 * @return
	 */
	List<User> findByActiveTrue();
	/**
	 * Keyword : False
	 * Sample : findByActiveFalse()
	 * JPQL snippet : … where x.active = false
	 * 
	 * @return
	 */
	List<User> findByActiveFalse();
	
}
