import java.util.ArrayList;

public class SocialNetwork {

  private ArrayList<User> users;

  public SocialNetwork() {
    // Inicializa a lista de usuários
    users = new ArrayList<>();
  }

  public void addUser(User user) {
    // Adiciona um novo usuário à rede social
    users.add(user);
  }

  public void removeUser(User user) {
    // Remove um usuário da rede social
    users.remove(user);
  }

  public User findUser(String username) {
    // Procura um usuário pelo nome de usuário
    for (User user : users) {
      if (user.getUsername().equals(username)) {
        return user;
      }
    }
    return null;
  }

  public ArrayList<User> getUsers() {
    // Retorna a lista de usuários da rede social
    return users;
  }

}

