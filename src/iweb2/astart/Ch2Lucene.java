package iweb2.astart;

import iweb2.ch2.shell.FetchAndProcessCrawler;
import iweb2.ch2.shell.LuceneIndexer;
import iweb2.ch2.shell.MySearcher;

public class Ch2Lucene {

	public static void main(String[] args) {

		FetchAndProcessCrawler c = new FetchAndProcessCrawler("c:/iWeb2/data/ch02", 5, 200);
		c.setDefaultUrls();
		c.run();

		LuceneIndexer lidx = new LuceneIndexer(c.getRootDir());
		lidx.run();

		MySearcher oracle = new MySearcher(lidx.getLuceneDir());
		oracle.search("armstrong", 5);

	}

}
