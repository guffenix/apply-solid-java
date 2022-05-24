package solutions.mundovirtual.solid_principles.dependency_inversion_principle.stage_3_dependency_inversion;

import solutions.mundovirtual.solid_principles.dependency_inversion_principle.User;

final class UserMother {
    static final int OBJ1_ID = 1;
    static final int OBJ2_ID = 2;

    private static final String OBJ1_NAME = "test";
    private static final String OBJ2_NAME = "test2";

    static User obj1() {
        return new User(OBJ1_ID, OBJ1_NAME);
    }

    static User obj2() {
        return new User(OBJ2_ID, OBJ2_NAME);
    }
}
