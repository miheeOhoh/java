package mihee.com.service;

import lombok.RequiredArgsConstructor;
import mihee.com.models.category.Category;
import mihee.com.repository.category.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryLogic {
    private final CategoryRepository categoryRepository;

    public void test() {
        List<String> arr = Arrays.asList("a","b","c");
        Category test = new Category();
        test.setName("category1");
        //test.setSubCategories(arr);
        test.setTest(arr);

        categoryRepository.save(test);
        List<Category> result =categoryRepository.findAll();
        result.get(0);
    }
}
