package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import webcast.data.FansLevelInfo;

/* loaded from: classes17.dex */
public final class FansGetUserDataResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("anchor_info")
        public User anchorInfo;

        @InterfaceC65349Pkn("Badge")
        public ImageModel badge;

        @InterfaceC65349Pkn("join_fans_timestamp_second")
        public long joinFansTimestampSecond;

        @InterfaceC65349Pkn("level_info")
        public FansLevelInfo levelInfo;

        @InterfaceC65349Pkn("send_comment_num")
        public long sendCommentNum;

        @InterfaceC65349Pkn("sending_gift_num")
        public long sendingGiftNum;

        @InterfaceC65349Pkn("show_data_types")
        public List<Integer> showDataTypes;

        @InterfaceC65349Pkn("user_info")
        public User userInfo;

        @InterfaceC65349Pkn("watch_live_minute")
        public long watchLiveMinute;

        @InterfaceC65349Pkn("watch_live_times")
        public long watchLiveTimes;
    }
}
