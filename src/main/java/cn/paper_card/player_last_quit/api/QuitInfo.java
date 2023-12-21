package cn.paper_card.player_last_quit.api;

import java.util.UUID;

public record QuitInfo(
        UUID uuid,
        String name,
        String ip,
        long time
) {
}
