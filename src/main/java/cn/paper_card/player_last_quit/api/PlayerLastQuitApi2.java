package cn.paper_card.player_last_quit.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface PlayerLastQuitApi2 {
    boolean addOrUpdateByUuid(@NotNull QuitInfo info) throws Exception;

    @Nullable QuitInfo queryByIpLatest(@NotNull String ip) throws Exception;

    @NotNull List<QuitInfo> queryTimeAfter(long time) throws Exception;
}
