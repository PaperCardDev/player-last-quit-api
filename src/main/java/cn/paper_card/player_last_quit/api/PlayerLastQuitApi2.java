package cn.paper_card.player_last_quit.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface PlayerLastQuitApi2 {
    boolean addOrUpdateByUuid(@NotNull QuitInfo info) throws Exception;

    @Nullable QuitInfo queryByIpLatest(@NotNull String ip) throws Exception;
}
