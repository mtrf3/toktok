package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import X.OHQ;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;

/* loaded from: classes6.dex */
public final class AnchorInfoResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class DropsEntrance {

        @InterfaceC65349Pkn("drops_count")
        public long dropsCount;

        @InterfaceC65349Pkn("has_sign")
        public boolean hasSign;

        @InterfaceC65349Pkn("icon")
        public String icon = "";

        @InterfaceC65349Pkn(OHQ.LIZ)
        public boolean permission;

        @InterfaceC65349Pkn("rewarded")
        public boolean rewarded;
    }

    /* loaded from: classes6.dex */
    public static final class LabelFilterInfo {

        @InterfaceC65349Pkn("gpppa_account")
        public boolean gpppaAccount;

        @InterfaceC65349Pkn("gpppa_ban_text")
        public String gpppaBanText = "";

        @InterfaceC65349Pkn("gpppa_ban_toast")
        public String gpppaBanToast = "";
    }

    /* loaded from: classes6.dex */
    public static final class PartnershipInfo {

        @InterfaceC65349Pkn("has_sign")
        public boolean hasSign;

        @InterfaceC65349Pkn(OHQ.LIZ)
        public boolean permission;
    }

    /* loaded from: classes6.dex */
    public static final class PunishInfo {

        @InterfaceC65349Pkn("punish_event_info")
        public PunishEventInfo punishEventInfo;

        @InterfaceC65349Pkn("punish_text")
        public String punishText = "";
    }

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("business_partnership")
        public boolean businessPartnership;

        @InterfaceC65349Pkn("drops_entrance")
        public DropsEntrance dropsEntrance;

        @InterfaceC65349Pkn("enable_drops_list")
        public List<PartnershipBriefDrops> enableDropsList;

        @InterfaceC65349Pkn("enable_event_list")
        public List<PartnershipGameEvent> enableEventList;

        @InterfaceC65349Pkn("label_filter_info")
        public LabelFilterInfo labelFilterInfo;

        @InterfaceC65349Pkn("live_take_decouple")
        public boolean liveTakeDecouple;

        @InterfaceC65349Pkn("partnership_info")
        public PartnershipInfo partnershipInfo;

        @InterfaceC65349Pkn("price_update_list")
        public List<TaskPriceUpdate> priceUpdateList;

        @InterfaceC65349Pkn("punish_info")
        public List<PunishInfo> punishInfo;

        @InterfaceC65349Pkn("shoot_permission")
        public boolean shootPermission;

        @InterfaceC65349Pkn("TaxPayoutConfirm")
        public boolean taxpayoutconfirm;

        @InterfaceC65349Pkn("toggle_info")
        public ToggleInfo toggleInfo;

        @InterfaceC65349Pkn("toggle_status")
        public int toggleStatus;
    }

    /* loaded from: classes6.dex */
    public static final class TaskPriceUpdate {

        @InterfaceC65349Pkn("price_update_timestamp")
        public long priceUpdateTimestamp;

        @InterfaceC65349Pkn("task_id")
        public String taskId = "";
    }

    /* loaded from: classes6.dex */
    public static final class ToggleInfo {

        @InterfaceC65349Pkn("game_tag_id")
        public long gameTagId;

        @InterfaceC65349Pkn("toggle_status")
        public int toggleStatus;
    }
}
