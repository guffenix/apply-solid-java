package solutions.mundovirtual.solid_principles.dependency_inversion_principle.stage_2_0_dependency_injection;

import solutions.mundovirtual.solid_principles.dependency_inversion_principle.User;

import java.util.Optional;

final class UserSearcher {
    private HardcodedInMemoryUsersRepository usersRepository;

    public UserSearcher(HardcodedInMemoryUsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Optional<User> search(Integer id) {
        return usersRepository.search(id);
    }
}
