package com.example.t_race;

import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseServices {
    // The one and only instance. It starts as null (nothing created yet).
    private static FirebaseServices instance;
    private final FirebaseAuth auth;
    private final FirebaseFireStore db;

    public FirebaseStorge getStorge() {
        return storge;
    }

    public FirebaseFireStore getDb() {
        return db;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }

    private final FirebaseStorge storge;

    //Private constructor : no other class can write "new FirebaseServices ()"
    private FirebaseServices() {
        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        storge = FirebaseStorage.getInstance();

    }

    //Create this instance the first time ,then returns the same one every time
    public static FireabaseServices getInstance() {
        if (instance = null) {
            instance = new FirebaseServices();
        }
        return instance;
    }
}
