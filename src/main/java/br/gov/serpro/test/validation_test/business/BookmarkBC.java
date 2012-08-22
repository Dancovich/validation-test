package br.gov.serpro.test.validation_test.business;

import br.gov.frameworkdemoiselle.annotation.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

import br.gov.serpro.test.validation_test.domain.Bookmark;
import br.gov.serpro.test.validation_test.persistence.BookmarkDAO;

@BusinessController
public class BookmarkBC extends DelegateCrud<Bookmark, Long, BookmarkDAO> {
	
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		if (findAll().isEmpty()) {
			insert(new Bookmark("Demoiselle Portal", "http://www.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Demoiselle SourceForge", "http://sf.net/projects/demoiselle","41100290","81986912515"));
			insert(new Bookmark("Twitter", "http://twitter.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Blog", "http://blog.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Wiki", "http://wiki.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Bug Tracking", "http://tracker.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Forum", "http://forum.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("SVN", "http://svn.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Maven", "http://repository.frameworkdemoiselle.gov.br","41100290","81986912515"));
			insert(new Bookmark("Downloads", "http://download.frameworkdemoiselle.gov.br","41100290","81986912515"));
		}
	}
	
}
