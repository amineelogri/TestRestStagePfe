package com.blog.samples.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.blog.samples.domain.Produit;

/**
 * The Class FundService.
 */
@Service
public class FundService {

	private static final Logger logger_c = Logger.getLogger(FundService.class);

	/**
	 * Get the fund by id.
	 *
	 * @param fundId_p
	 *            the fund id_p
	 * @return the fund by id
	 */
	public Produit getFundById(String Id) {
		Produit produit = new Produit();

		produit.setId(Id);
		produit.setMarque("Marque"+Id);
		produit.setModel("model"+Id);
		produit.setEtat("etat"+Id);
		produit.setDesc("desc"+Id);
		return produit;
	}

	/**
	 * Gets all funds.
	 *
	 * @return the all funds
	 */
	public List<Produit> getAllFunds() {
		List<Produit> produis = new ArrayList<Produit>();

		for (int i = 0; i < 10; i++) {
			Produit produit = new Produit();

			produit.setId("12345"+i);
			produit.setMarque("Marque"+i);
			produit.setModel("model"+i);
			produit.setEtat("etat"+i);
			produit.setDesc("desc"+i);

			produis.add(produit);
		}

		return produis;
	}

	/**
	 * Creates the fund.
	 *
	 * @param fund_p
	 *            the fund_p
	 * @return the fund
	 */
	public Produit createFund(Produit fund_p) {
		
//	System.out.println("******************** "+fund_p.getFundId());
//
//		logger_c.debug("Persisting fund in database: " + fund_p.toString());
//
//		/* set id and timestamp */
//		fund_p.setFundId("12345");
//		fund_p.setLastUpdated(new Date());

		return fund_p;
	}

	/**
	 * Update fund.
	 *
	 * @param fund_p
	 *            the fund_p
	 * @return the fund
	 */
	public Produit updateFund(Produit fund_p) {

		logger_c.debug("Updating fund in database: " + fund_p.toString());

		/* set timestamp */
		//fund_p.setLastUpdated(new Date());

		return fund_p;
	}

	/**
	 * Delete fund.
	 *
	 * @param fundId_p
	 *            the fund id_p
	 */
	public void deleteFund(String fundId_p) {
		logger_c.debug("Deleting fund from database: " + fundId_p.toString());

	}

}
