package com.codeclan.example.userservice.components;

import com.codeclan.example.userservice.models.File;
import com.codeclan.example.userservice.models.Folder;
import com.codeclan.example.userservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.example.userservice.repositories.FileRepository;
import com.codeclan.example.userservice.repositories.FolderRepository;
import com.codeclan.example.userservice.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User tony = new User("Tony the Pony");
        userRepository.save(tony);

        User calum = new User("Calum the Magnum");
        userRepository.save(calum);

        Folder goldenStick = new Folder("Golden Stick", tony);
        folderRepository.save(goldenStick);

        Folder memories = new Folder("Calum's memories", calum);
        folderRepository.save(memories);

        File binLaden = new File("Osama bin Laden","rb", 2.3, memories);
        fileRepository.save(binLaden);

        File bush = new File("George W. Bush", "java",2.6, goldenStick);
        fileRepository.save(bush);
    }
}
