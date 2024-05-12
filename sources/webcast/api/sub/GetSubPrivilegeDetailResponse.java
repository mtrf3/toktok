package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.chatroom.api.BadgeConfig;
import com.bytedance.android.livesdk.chatroom.api.BadgeDetail;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.chatroom.api.NoteDetail;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.android.livesdk.chatroom.api.SubBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SubTaskInfo;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.model.Gift;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GetSubPrivilegeDetailResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("admin_permission")
        public SubAdminPermission adminPermission;

        @InterfaceC65349Pkn("anchor_detail")
        public User anchorDetail;

        @InterfaceC65349Pkn("badge")
        public Badge badge;

        @InterfaceC65349Pkn("badge_config")
        public BadgeConfig badgeConfig;

        @InterfaceC65349Pkn("community_detail")
        public CommunityDetail communityDetail;

        @InterfaceC65349Pkn("current_badge_detail")
        public BadgeDetail currentBadgeDetail;

        @InterfaceC65349Pkn("display_strategy")
        public int displayStrategy;

        @InterfaceC65349Pkn("emote_config")
        public EmoteConfig emoteConfig;

        @InterfaceC65349Pkn("emote_detail")
        public EmoteListResult emoteDetail;

        @InterfaceC65349Pkn("goal")
        public LiveStreamGoal goal;

        @InterfaceC65349Pkn("payment_redirect")
        public boolean paymentRedirect;

        @InterfaceC65349Pkn("perks_count")
        public int perksCount;

        @InterfaceC65349Pkn("show_customized_benefit")
        public boolean showCustomizedBenefit;

        @InterfaceC65349Pkn("show_gift_sub_progress")
        public boolean showGiftSubProgress;

        @InterfaceC65349Pkn("spotlight_info")
        public SpotlightInfo spotlightInfo;

        @InterfaceC65349Pkn("sub_info")
        public SubInfo subInfo;

        @InterfaceC65349Pkn("sub_note_info")
        public SubNoteInfo subNoteInfo;

        @InterfaceC65349Pkn("sub_only_videos_brief_info")
        public SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;

        @InterfaceC65349Pkn("sub_scenario")
        public int subScenario;

        @InterfaceC65349Pkn("sub_task_status")
        public int subTaskStatus;

        @InterfaceC65349Pkn("subscribe_permission")
        public SubscribePermission subscribePermission;

        @InterfaceC65349Pkn("subscriber_count")
        public int subscriberCount;

        @InterfaceC65349Pkn("user_buy_gift_sub_auth")
        public boolean userBuyGiftSubAuth;

        @InterfaceC65349Pkn("webapp_payment")
        public boolean webappPayment;

        @InterfaceC65349Pkn("benefit_list")
        public List<SubBenefit> benefitList = new ArrayList();

        @InterfaceC65349Pkn("gift_detail")
        public List<Gift> giftDetail = new ArrayList();

        @InterfaceC65349Pkn("task_info_list")
        public List<SubTaskInfo> taskInfoList = new ArrayList();

        @InterfaceC65349Pkn("all_levels")
        public List<SubLevel> allLevels = new ArrayList();

        @InterfaceC65349Pkn("scenario_text")
        public String scenarioText = "";

        @InterfaceC65349Pkn("customized_benefits")
        public List<SubCustomizedBenefit> customizedBenefits = new ArrayList();

        @InterfaceC65349Pkn("benefits")
        public List<BenefitView> benefits = new ArrayList();

        /* loaded from: classes6.dex */
        public static final class SubNoteInfo {

            @InterfaceC65349Pkn("note_detail")
            public NoteDetail noteDetail;

            @InterfaceC65349Pkn("show_note_detail")
            public boolean showNoteDetail;
        }

        /* loaded from: classes6.dex */
        public static final class SubscribePermission {

            @InterfaceC65349Pkn("can_subscribe")
            public boolean canSubscribe;

            @InterfaceC65349Pkn("forbidden_toast")
            public String forbiddenToast = "";
        }
    }
}
