package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import java.util.List;

/* loaded from: classes6.dex */
public final class GetAnchorSubscriptionResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("anchor_gift_sub_auth")
        public boolean anchorGiftSubAuth;

        @InterfaceC65349Pkn("banner")
        public SubLiveBanner banner;

        @InterfaceC65349Pkn("count_info")
        public List<SubscriberCountInfo> countInfo;

        @InterfaceC65349Pkn("enable_wave_status")
        public boolean enableWaveStatus;

        @InterfaceC65349Pkn("gift_sub")
        public SubGifInfo giftSub;

        @InterfaceC65349Pkn("perks_pin_panel")
        public PerksPinPanel perksPinPanel;

        @InterfaceC65349Pkn("received_subs")
        public long receivedSubs;

        @InterfaceC65349Pkn("sub_goal")
        public SubGoal subGoal;

        @InterfaceC65349Pkn("timer_detail")
        public TimerDetail timerDetail;

        @InterfaceC65349Pkn("tip")
        public Tip tip;
    }
}
