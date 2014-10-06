package ca.bradj.scrape.matching;

public interface MatchFailHandler<T> {

	void addFailedMatch(FailedMatch<T> failedMatch);

}
