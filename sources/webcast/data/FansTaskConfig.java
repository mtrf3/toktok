package webcast.data;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class FansTaskConfig {

    @InterfaceC65349Pkn("average_reward_config")
    public FansTaskAverageRewardConfig averageRewardConfig;

    @InterfaceC65349Pkn("duration_type")
    public int durationType;

    @InterfaceC65349Pkn("level_reward_config")
    public List<FansTaskLevelRewardConfig> levelRewardConfig = new ArrayList();

    @InterfaceC65349Pkn("reward_type")
    public int rewardType;
}
