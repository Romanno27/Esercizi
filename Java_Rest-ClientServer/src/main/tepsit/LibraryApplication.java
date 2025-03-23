@ApplicationPath("api")
public class LibraryApplication extends ResourceConfig {
    public LibraryApplication() {
        packages("it.html.tutorial.library.api");
    }
}
@Path("test")
public class Test {
	@GET
	@Path("{name}")
	public String test(@PathParam("name") String name) {
		return "Ciao " + name.toUpperCase();
	}
}
public void filter(ContainerRequestContext requestContext)
		throws IOException;
public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
		throws IOException;