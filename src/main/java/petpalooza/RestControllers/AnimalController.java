package petpalooza.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import petpalooza.Entities.Animal;
import petpalooza.Entities.RatingAnimal;
import petpalooza.Services.AnimalService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @GetMapping("/")
    public List<Animal> getAll(){
        return this.animalService.getAllAnimals();
    }

    @PutMapping("/update")
    public Animal updateAnimal(@RequestBody Animal animal){
        return this.animalService.updateAnimal(animal);
    }

    @PostMapping("/add")
    public Animal addAnimal(@RequestBody Animal animal){
        return this.animalService.addAnimal(animal);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimal(@PathVariable long id){
        this.animalService.deleteAnimal(id);
    }

    @GetMapping("/{id}")
    public Animal getById(@PathVariable long id){
        return this.animalService.getById(id);

    }

    @GetMapping("/search/{name}")
    public List<Animal> searchByName(@PathVariable String name){

        return this.animalService.searchAnimal(name);
    }

    @GetMapping("/filter/{race}")
    public List<Animal> filterByRace(@PathVariable String race){

        return this.animalService.filterByRace(race);
    }

    @GetMapping("/races")
    public List<String> getAllRaces(){

        return this.animalService.getAllRaces();
    }

    @GetMapping("/sexe/{genderAnimal}")
    public List<Animal> getByGender(@PathVariable String genderAnimal){
        return this.animalService.getByGender(genderAnimal);
    }

    @PostMapping("/rate")
    public RatingAnimal rate(@RequestBody RatingAnimal ratingAnimal){
        return this.animalService.rate(ratingAnimal);
    }

    @GetMapping("/getlikes/{idAnimal}")
    public List<RatingAnimal> getlikes(@PathVariable long idAnimal){
        return this.animalService.getlikes(idAnimal);

    }

    @GetMapping("/getdislikes/{idAnimal}")
    public List<RatingAnimal> getdislikes(@PathVariable long idAnimal){
        return this.animalService.getdislikes(idAnimal);
    }

    @GetMapping("/getrate/{idAnimal}/{idUser}")
    public RatingAnimal likeUserToAnimal(@PathVariable long idAnimal,@PathVariable long idUser){
        return this.animalService.likeUserToAnimal(idAnimal,idUser);
    }
}
