package My.Spring.Application.service;

import My.Spring.Application.model.NasabahBukopin;
import My.Spring.Application.repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class NasabahService {

    @Autowired
    private NasabahRepository nasabahRepository;

    private final Random random = new Random();

    public String getAtasanTerbaik() {
        
        List<NasabahBukopin> semuaNasabah = nasabahRepository.findAll();

        
        if (semuaNasabah.isEmpty()) {
            return "Tidak ada, karna saya yang terbaik";
        }

        
        int randomIndex = random.nextInt(semuaNasabah.size());
        NasabahBukopin nasabahTerpilih = semuaNasabah.get(randomIndex);


        return nasabahTerpilih.getNamaLengkap();
    }
}