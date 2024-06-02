package zerobase.sb.scraper;

import zerobase.sb.model.Company;
import zerobase.sb.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
