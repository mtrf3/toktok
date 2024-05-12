package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes17.dex */
public final class FansGetAnchorPageResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("anchor_info")
        public User anchorInfo;

        @InterfaceC65349Pkn("comment_fans")
        public long commentFans;

        @InterfaceC65349Pkn("fans_count")
        public long fansCount;

        @InterfaceC65349Pkn("fans_gift_num")
        public long fansGiftNum;

        @InterfaceC65349Pkn("gift_coins")
        public long giftCoins;

        @InterfaceC65349Pkn("new_fans")
        public FansList newFans;

        @InterfaceC65349Pkn("quick_upgrade_fans")
        public FansList quickUpgradeFans;

        @InterfaceC65349Pkn("top_fans")
        public FansList topFans;

        @InterfaceC65349Pkn("watch_live_num")
        public long watchLiveNum;
    }
}
