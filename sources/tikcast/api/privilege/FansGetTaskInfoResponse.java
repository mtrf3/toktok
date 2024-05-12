package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import webcast.data.FansLevelInfo;
import webcast.data.FansScoreRule;
import webcast.data.FansTask;

/* loaded from: classes6.dex */
public final class FansGetTaskInfoResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("anchor_fans_count")
        public long anchorFansCount;

        @InterfaceC65349Pkn("anchor_info")
        public User anchorInfo;

        @InterfaceC65349Pkn("fans_gift_id")
        public long fansGiftId;

        @InterfaceC65349Pkn("level_configs")
        public List<FansScoreRule> levelConfigs;

        @InterfaceC65349Pkn("level_info")
        public FansLevelInfo levelInfo;

        @InterfaceC65349Pkn("tasks")
        public List<FansTask> tasks;

        @InterfaceC65349Pkn("user_info")
        public User userInfo;

        @InterfaceC65349Pkn("user_local_month")
        public long userLocalMonth;
    }
}
