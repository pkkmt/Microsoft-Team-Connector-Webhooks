package api.pack;

import com.andrewthom.microsoft.teams.api.Webhook;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.andrewthom.microsoft.teams.api.MicrosoftTeams;;

public abstract class Team implements Webhook{
	public static void main(String[] args) {
		String sb="Hello @Chhavi Hows you";
	
	try {
		MicrosoftTeams.forUrl(new Webhook() {
			public String getUrl() {
				System.out.println("hello I am here");
          return "https://outlook.office.com/webhook/6fa21b88-3065-42d0-b62e-7a7fc27f7667@5cd004ac-6552-40dd-8213-33766dc0b059/IncomingWebhook/8ec2b8910119408d902bf928e49147f0/4bf50093-1fe0-4e57-b641-ee0bb0e5038c";			}
		}).sendMessage(sb);
	} catch (UnirestException e) {
		
		e.printStackTrace();
	}
}
}
