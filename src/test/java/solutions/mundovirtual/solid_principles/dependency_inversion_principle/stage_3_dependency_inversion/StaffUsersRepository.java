package solutions.mundovirtual.solid_principles.dependency_inversion_principle.stage_3_dependency_inversion;

import solutions.mundovirtual.solid_principles.dependency_inversion_principle.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// User repository for test usage. It is used as a _Test double_, more specifically, it's a _Mother_.
// More info on the difference between Mothers and Mocks: https://martinfowler.com/articles/mocksArentMothers.html
final class StaffUsersRepository implements UsersRepository {
    private Map<Integer, User> users = Collections.unmodifiableMap(new HashMap<Integer, User>() {
        {
            put(UserMother.OBJ1_ID, UserMother.obj1());
            put(UserMother.OBJ2_ID, UserMother.obj2());
        }
    });

    @Override
    public Optional<User> search(Integer id) {
        return Optional.ofNullable(users.get(id));
    }
}

