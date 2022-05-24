package solutions.mundovirtual.solid_principles.dependency_inversion_principle.stage_1_instantiating_from_clients;

import solutions.mundovirtual.solid_principles.dependency_inversion_principle.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

final class HardcodedInMemoryUsersRepository {
    private Map<Integer, User> users = Collections.unmodifiableMap(new HashMap<Integer, User>() {
        {
            put(1, new User(1, "test"));
            put(2, new User(2, "test2"));
        }
    });

    public Optional<User> search(Integer id) {
        return Optional.ofNullable(users.get(id));
    }
}
