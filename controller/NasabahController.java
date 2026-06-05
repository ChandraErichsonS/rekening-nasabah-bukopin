package My.Spring.Application.controller;

import My.Spring.Application.model.NasabahBukopin;
import My.Spring.Application.repository.NasabahRepository;
import My.Spring.Application.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nasabah")
public class NasabahController {

    @Autowired
    private NasabahRepository nasabahRepository;

    @Autowired
    private NasabahService nasabahService; 

    // URL nasabah: http://localhost:8080/api/nasabah
    @GetMapping
    public List<NasabahBukopin> getAllNasabah() {
        return nasabahRepository.findAll();
    }

    // URL atasan terbikku: http://localhost:8080/api/nasabah/atasan-terbaik
    @GetMapping("/atasan-terbaik")
    public String getAtasanTerbaik() {
        String namaAtasan = nasabahService.getAtasanTerbaik();
        return "Atasan terbaik sepanjang masa saya adalah: " + namaAtasan;
    }
}