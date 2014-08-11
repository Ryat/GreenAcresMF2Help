package calm.frenetic.ga;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.plugin.java.JavaPlugin;


public final class MainHelp extends JavaPlugin{
	
	
	@Override
    public void onEnable(){
		getLogger().info("onEnable has been invoked!");
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked!");
    }
   
    @EventHandler(priority = EventPriority.HIGH)
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		//******************MAIN HELP*****************************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("help")) {

        	//Main Command
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dhttp://adf.ly/qvcHo"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dKeep Calm! &2Magic Farm 2 &dis a VERY tough Mod Pack!"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bBelow are some help menus to get you through the initial curve."));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Official Forum Post. Tell the world!!! ----> http://adf.ly/qve3v"));
        	
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/trapped &b= Stuck in a claimed area? This will get you out."));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "More Help = &6/Help2"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/admins = Who are the Admins?"));
        	return false;
	}
	
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("donate")) {
		
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "http://adf.ly/qvdJ0"));
			return false;
	}
	
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("help2")) {

		
		//banned
		//suicide
		//unstuck
           
        	//LWC Help
        	//sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Chest Locking Help = &6/HelpLWC"));
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Help pay the bills. &d/donate"));
        	//Grief Prevention Help
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Grief Prevention Help = &6/HelpGP"));
           
        	//Homes Help
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Homes and TPA Help = &6/HelpHomes"));
         
        	//TCon Help
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Tinker's Construct Help = &6/HelpTCon"));
           
        	//Food Help
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Food Help = &6/HelpFood"));
        	
        	//Warp Help**************
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Available Worlds = &6/Realms"));
        	
        	//Rules Help
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Rules = &6/rules"));
        	
        	//Banned Help**********
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Banned Items = &6/banned"));
        	
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Voting Info = &6/Vote"));
        	
        	//sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Shops Info = &6/shops"));
           return false;
        }
	
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("admins")) {
		
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dLupaPup"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dFrenetic_Calm"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dNosbod"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dAntikoper"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dStgChronos"));
		return false;
	}
	
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("realms")) {
		
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dMining World"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dThe End"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dThe Promised Land"));
		
		return false;
		
	}


	//*****************/HELP BANNED**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("banned")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aList of Banned Items"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************")); 	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dMini TNT &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dBlock Placer &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dArcane Bore &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dLandmines &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dAll Needlegun ammo except Basic Ammo &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dSPAMR Launcher &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "More Help = &6/Banned2"));
     	
     	
        return false;
     }
	
	//*****************/HELP BANNED2**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("banned2")) {
		
		
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dMatter Cannon &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dTNT Cart &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dBlack Hole Focus &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dEqual Trade Focus &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dExcavation Focus &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dAxe of the Stream &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dShovel of Earthmover &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "More Help = &6/Banned3"));
	}
	
	//*****************/HELP BANNED3**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("banned3")) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dDescriptive Book &b= Mystcraft Limitation."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dBook Binder &b= Mystcraft Limitation."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dComplex Spell Crystal &b= Bypass Grief Prevention."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dPakratt's World Ship &b= Server Crash."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dCrystal Chest &b= Server Lag."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dTeleposer &b= Server Crash."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dAlchemical Chemistry Set &b= Item Dupe."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dAncient Staff &b= Portal at Spawn."));

	
	//**************************HELP GP**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("helpgp")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aHelp with Protecting your land!"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bFirst off you need a &a'Gold Shovel.'"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bYou start with the ability to &aprotect &d500 &bblocks."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/buyclaimblocks <amount> &b= 1 block per $100."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bThe initial claimed plot must be at least &d10 &bblocks wide by &d10 blocks wide."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aTo claim land, &dRIGHT &bclick the first block with your &aGold Shovel &bin Hand."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bMove to the other spot and &dRIGHT &bclick the second spot."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dABOVE WILL BE &aCANCELLED &dIF YOU &aDESELECT &dYOUR GOLD SHOVEL. &bYou will have to start over if this happens."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6For &aAdvanced Commands &bvisit the Site below"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a----->  http://adf.ly/qvdQk  <-----"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/helpgp2"));
        return false;
     }
	
	//**************************HELP GP2**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("helpgp2")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aHelp Allowing Friends to modify your land."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/AbandonClaim &b= Removes your stake on the claim you are standing in."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/AbandonAllClaims &b= Removes your stake on ALL claims you own."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/Trust [player] &b= Allows a friends to modify and use blocks in your claim."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/UnTrust [player] &b= Disallows a friends to modify and use blocks in your claim."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/ContainerTrust [player] &b= Grants a player access to your inventory, bed, and buttons/levers."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/AccessTrust [player] &b= Grants a player access to your bed, buttons, and levers."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/PermissionTrust [player] &b= Permits a player to share his permission level with others."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/Trapped &b= Ejects you to nearby unclaimed land.  Has a substantial cooldown period."));
    	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/Trustlist &b= Lists permissions for the claim you're standing in."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/ClaimExplosions &b= Toggles whether explosives may be used in a specific land claim."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6For Advanced commands visit the Site"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/helpgp3"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a----->  http://adf.ly/qvdQk  <-----"));
     	
        return false;
     }
	
	//**************************HELP GP3**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("helpgp3")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aExtras."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/trapped &b= Stuck in a claimed area? This will get you out."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a----->  http://adf.ly/qvdQk  <-----"));
     	
        return false;
     }
	
	//**************************HELP HOMES**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("helphomes")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aHelp to set a Home."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You get 2 homes. You can tpa to any friend."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Additional homes can be obtained through voting."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/sethome &b= Makes the current block your 'home' block that you can teleport to later."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/home &b= Teleports you to your home block."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/tpa [player] &b= Asks a friend to teleport to them. They must accept."));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/tpaccept &b= Accepts the tpa request"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d/tpadeny &b= Denys the tpa request."));
        return false;
     }
	
	//**************************HELP TCON**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("helptcon")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aTinker's Construct Basic Help Video - A Must Watch"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dhttp://adf.ly/qvdem"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dhttp://adf.ly/qvdhO"));
     	

        return false;
     }
	
	//**************************HELP FOOD**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("helpfood")) {

     	//Main Command
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aMagic Farm 2 FOOD Basics Help Video - A Must Watch"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6***************************************************************"));
     	
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&ahttp://adf.ly/qvdhO"));

        return false;
     }
	
	//**************************Vote FOOD**********************
	if (sender instanceof Player && cmd.getName().equalsIgnoreCase("vote")) {

     	//Main Command
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aEach vote gets you an additional $50 and 25 WebStore Points which can be used at shops."));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aVoting Perks ----> &6http://adf.ly/qvdt3"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aVoting will earn you anything from mob eggs to alumite ingots"));
     	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6http://adf.ly/qvdt3"));

        return false;
     }
	}

	
        return false;
	}

}
