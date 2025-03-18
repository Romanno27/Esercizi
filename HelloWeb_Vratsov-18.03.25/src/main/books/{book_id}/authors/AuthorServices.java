
public class AuthoeServices {
	@GET
	public List list(@PathParam("{book_id}") long bookId) {
		Author author = new Author();
		author.setId(1);
		author.setName("Joanne");
		author.setSurname("Rowling");
		List authors = new ArrayList();
		authors.add(author);
		return authors;
	}
}