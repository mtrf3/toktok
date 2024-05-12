package com.bytedance.android.livesdk.model.message;

import X.C48339Iy7;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.FlyingMicResources;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public class GiftMessage extends CR6 {
    public transient boolean LJLIL;
    public transient boolean LJLILLLLZI;
    public transient String LJLJI;

    @InterfaceC65349Pkn("banned_display_effects")
    public Long bannedDisplayEffects;

    @InterfaceC65349Pkn("color_id")
    public Long colorId;

    @InterfaceC65349Pkn("combo_count")
    public int comboCount;

    @InterfaceC65349Pkn("disable_gift_tracking")
    public boolean disableGiftTracking;

    @InterfaceC65349Pkn("display_text_for_anchor")
    public Text displayTextForAnchor;

    @InterfaceC65349Pkn("display_text_for_audience")
    public Text displayTextForAudience;

    @InterfaceC65349Pkn("fan_ticket_count")
    public int fanTicketCount;

    @InterfaceC65349Pkn("flying_mic_resources")
    public FlyingMicResources flyingMicResources;

    @InterfaceC65349Pkn("user")
    public User fromUser;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("monitor_info")
    public GiftMonitorInfo giftMonitorInfo;

    @InterfaceC65349Pkn("gifts_in_box")
    public GiftsBoxInfo giftsInBox;

    @InterfaceC65349Pkn("group_count")
    public int groupCount;

    @InterfaceC65349Pkn("group_id")
    public long groupId;

    @InterfaceC65349Pkn("income_taskgifts")
    public Long incomeTaskgifts;

    @InterfaceC65349Pkn("is_first_sent")
    public boolean isFirstSendGift;

    @InterfaceC65349Pkn("linkmic_gift_expression_strategy")
    public int linkmicGiftExpressionStrategy;

    @InterfaceC65349Pkn("lynx_extra")
    public List<LynxGiftExtra> lynxExtra;

    @InterfaceC65349Pkn("gift")
    public Gift mGift;

    @InterfaceC65349Pkn("log_id")
    public String mLogId = "";

    @InterfaceC65349Pkn("tray_info")
    public GiftTrayInfo mTrayInfo;

    @InterfaceC65349Pkn("match_info")
    public MatchInfo matchInfo;

    @InterfaceC65349Pkn("msg_filter")
    public MsgFilter msgFilter;

    @InterfaceC65349Pkn("order_id")
    public String orderId;

    @InterfaceC65349Pkn("priority")
    public GiftIMPriority priority;

    @InterfaceC65349Pkn("public_area_common")
    public PublicAreaCommon publicAreaCommon;

    @InterfaceC65349Pkn("repeat_count")
    public int repeatCount;

    @InterfaceC65349Pkn("repeat_end")
    public int repeatEnd;

    @InterfaceC65349Pkn("room_fan_ticket_count")
    public long roomFanTicketCount;

    @InterfaceC65349Pkn("send_type")
    public Long sendType;

    @InterfaceC65349Pkn("text_effect")
    public TextEffect textEffect;

    @InterfaceC65349Pkn("to_user")
    public User toUser;

    @InterfaceC65349Pkn("tray_display_text")
    public Text trayDisplayText;

    @InterfaceC65349Pkn("user_identity")
    public UserIdentity userIdentity;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.fromUser != null) {
            return true;
        }
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public GiftMessage() {
        this.type = EnumC31509CYf.GIFT;
    }

    public final String toString() {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftMessage{fromUserId=");
        LIZ.append(this.fromUser);
        LIZ.append(", toUserId=");
        User user = this.toUser;
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        LIZ.append(j);
        LIZ.append(", giftId=");
        LIZ.append(this.giftId);
        LIZ.append(", repeatCount=");
        LIZ.append(this.repeatCount);
        LIZ.append(", fanTicketCount=");
        LIZ.append(this.fanTicketCount);
        LIZ.append(", repeatEnd=");
        LIZ.append(this.repeatEnd);
        LIZ.append(", comboCount=");
        LIZ.append(this.comboCount);
        LIZ.append(", groupCount=");
        LIZ.append(this.groupCount);
        LIZ.append(", groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", textEffect=");
        LIZ.append(GsonProtectorUtils.toJson(new Gson(), this.textEffect));
        LIZ.append(", isUrgent=");
        LIZ.append(false);
        LIZ.append(", isLocal=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, '}', LIZ);
    }
}
