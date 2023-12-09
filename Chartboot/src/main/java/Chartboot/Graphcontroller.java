package Chartboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class Graphcontroller {

    @GetMapping("/displayBarGraph")
    public String barGraph(Model model) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 40);
        map.put(".Net",15);
        map.put("Python",20);
        map.put("Dev oops",25);
        // Add your logic to populate the map with data
        // For example: map.put("Category1", 10);
        model.addAttribute("survey.map", map);
        return "home"; // Assuming you have a Thymeleaf template named "home.html"
    }
}
