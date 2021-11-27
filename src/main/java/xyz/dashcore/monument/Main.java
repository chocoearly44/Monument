package xyz.dashcore.monument;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
		id = "monument",
		name = "Monument",
		version = "1.0",
		description = "A SpongeForge alternative for Vault Bukkit.",
		url = "https://dashcore.xyz",
		authors = {
				"Dashcore Team",
				"chocoearly44"
		}
)
public class Main {
	@Inject
	private Logger logger;

	@Listener
	public void onServerStart(GameStartedServerEvent event) {
		logger.info("Monument enabled.");
	}
}
