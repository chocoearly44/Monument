package tk.thesuperlab.monument.api.economy;

import org.spongepowered.api.entity.living.player.Player;

/**
 * The main economy API
 */
public interface Economy {
	/* GENERAL SETUP */

	/**
	 * Checks if economy method is enabled.
	 *
	 * @return Success or Failure
	 */
	public boolean isEnabled();

	/**
	 * Gets name of Economy plugin
	 *
	 * @return Name of Economy plugin
	 */
	public String getEconomyName();

	/**
	 * Returns the name of the currency in singular form.
	 * If the economy being used does not support currency names then an empty string will be returned.
	 *
	 * @return name of the currency (singular)
	 */
	public String currencyNameSingular();

	/**
	 * Returns the name of the currency in plural form.
	 * If the economy being used does not support currency names then an empty string will be returned.
	 *
	 * @return name of the currency (plural)
	 */
	public String currencyNamePlural();

	/**
	 * Format amount into a human-readable String.
	 * This provides translation into economy specific formatting to improve consistency between plugins.
	 *
	 * @param amount to format
	 * @return Human-readable string describing amount
	 */
	public String format(double amount);
	/* GENERAL SETUP */

	/* ACCOUNT */

	/**
	 * Attempts to create a player account for the given player
	 *
	 * @param player Player
	 * @return if the account creation was successful
	 */
	public boolean createPlayerAccount(Player player);

	/**
	 * Checks if this player has an account on the server yet
	 * This will always return true if the player has joined the server at least once as all major economy plugins auto-generate a player account when the player joins the server.
	 *
	 * @param player to check
	 * @return if the player has an account
	 */
	public boolean hasAccount(Player player);
	/* ACCOUNT */

	/* BALANCE */

	/**
	 * Gets balance of a player
	 *
	 * @param player of the player
	 * @return Amount currently held in players account
	 */
	public double getBalance(Player player);

	/**
	 * Deposit an amount to a player - DO NOT USE NEGATIVE AMOUNTS
	 *
	 * @param player to deposit to
	 * @param amount Amount to deposit
	 * @return Detailed response of transaction
	 */
	public EconomyResponse depositPlayer(Player player, double amount);

	/**
	 * Withdraw an amount from a player - DO NOT USE NEGATIVE AMOUNTS
	 *
	 * @param player to withdraw from
	 * @param amount Amount to withdraw
	 * @return Detailed response of transaction
	 */
	public EconomyResponse withdrawPlayer(Player player, double amount);

	/**
	 * Checks if the player account has the amount - DO NOT USE NEGATIVE AMOUNTS
	 *
	 * @param player to check
	 * @param amount to check for
	 * @return if player has required amount
	 */
	public boolean hasBalance(Player player, double amount);
	/* BALANCE */
}