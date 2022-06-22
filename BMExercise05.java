import java.util.List;

enum PlayerPosition {
    STRIKER,
    DEFENDER,
    GOALKEEPER,
    MIDDLE_CAMPER
}

class Player {
    String name;
    PlayerPosition position;
}

class Team {
    String name;
    String flag; // image URL
    String crest; // image URL
    List<Player> players;
}