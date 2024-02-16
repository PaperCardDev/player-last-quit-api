package cn.paper_card.player_last_quit.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface PlayerLastQuitApi2 {

    // 添加返回true，更新返回false
    boolean addOrUpdateByUuid(@NotNull QuitInfo info) throws Exception;

    // 根据IP查询记录，如果有多条，取时间上最近的一条
    @Nullable QuitInfo queryByIpLatest(@NotNull String ip) throws Exception;

    // 查询指定时间之后的记录
    @NotNull List<QuitInfo> queryTimeAfter(long time) throws Exception;

    // 查询最近的，time是过去的多少毫秒，时间相对于最后一个退出
    @NotNull List<QuitInfo> queryLatest(long time) throws Exception;
}
