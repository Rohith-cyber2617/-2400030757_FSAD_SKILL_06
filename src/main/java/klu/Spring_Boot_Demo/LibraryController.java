package klu.Spring_Boot_Demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {

    @SuppressWarnings("unused")
	private List<Book> bookList = new ArrayList<>();

}