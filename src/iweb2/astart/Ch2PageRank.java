package iweb2.astart;

import iweb2.ch2.shell.FetchAndProcessCrawler;
import iweb2.ch2.shell.PageRank;

public class Ch2PageRank {

	public static void main(String[] args) {

		FetchAndProcessCrawler c = new FetchAndProcessCrawler("c:/iWeb2/data/ch02", 5, 200);
		c.setUrls("biz");
		c.run();

		PageRank pageRank = new PageRank(c.getCrawlData());
		pageRank.setAlpha(1);
		pageRank.setEpsilon(0.0001);
		try {
			pageRank.build();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
