package com.bytedance.android.livesdk.model.message;

import X.C47135Ieh;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public class MemberMessage extends CR6 implements Comparator {
    public boolean LJLIL;
    public boolean LJLILLLLZI = true;

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("action_description")
    public String actionDescription;

    @InterfaceC65349Pkn("action_duration")
    public Long actionDuration;

    @InterfaceC65349Pkn("admin_permissions")
    public Map<Integer, Integer> adminPermissions;

    @InterfaceC65349Pkn("allow_preview_time")
    public long allowPreviewTime;

    @InterfaceC65349Pkn("anchor_display_text")
    public Text anchorDisplayText;

    @InterfaceC65349Pkn("background_image_v2")
    public ImageModel background;

    @InterfaceC65349Pkn("client_enter_source")
    public String clientEnterSource;

    @InterfaceC65349Pkn("client_enter_type")
    public String clientEnterType;

    @InterfaceC65349Pkn("client_live_reason")
    public String clientLiveReason;

    @InterfaceC65349Pkn("member_count")
    public int count;

    @InterfaceC65349Pkn("display_style")
    public int displayStyle;

    @InterfaceC65349Pkn("enter_effect_config")
    public EffectConfigBean effectConfig;

    @InterfaceC65349Pkn("enter_type")
    public int enterType;

    @InterfaceC65349Pkn("is_top_user")
    public boolean isTopUser;

    @InterfaceC65349Pkn("kick_source")
    public int kickSource;

    @InterfaceC65349Pkn("operator")
    public User operator;

    @InterfaceC65349Pkn("pop_str")
    public String popStr;

    @InterfaceC65349Pkn("rank_score")
    public int rankScore;

    @InterfaceC65349Pkn("is_set_to_admin")
    public boolean setToAdmin;

    @InterfaceC65349Pkn("top_user_no")
    public int topUserNo;

    @InterfaceC65349Pkn("user")
    public User user;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("user_share_type")
    public String userShareType;

    /* loaded from: classes6.dex */
    public static class EffectConfigBean {

        @InterfaceC65349Pkn("badge")
        public ImageModel badge;

        @InterfaceC65349Pkn("icon")
        public ImageModel icon;

        @InterfaceC65349Pkn("text")
        public Text textKey;

        @InterfaceC65349Pkn("type")
        public int type;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.user != null && (this.LJLIL || this.action != 7)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            return Objects.hash(Long.valueOf(commonMessageData.messageId));
        }
        return super.hashCode();
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData;
        if (this.LJLILLLLZI && (commonMessageData = this.baseMessage) != null && commonMessageData.displayText != null && !this.isTopUser) {
            return true;
        }
        return false;
    }

    public MemberMessage() {
        this.type = EnumC31509CYf.MEMBER;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MemberMessage{action=");
        LIZ.append(this.action);
        LIZ.append(", enterType=");
        LIZ.append(this.enterType);
        LIZ.append(", actionDescription='");
        Q89.LIZIZ(LIZ, this.actionDescription, '\'', ", enterEffectConfig=");
        LIZ.append(this.effectConfig);
        LIZ.append(", userId=");
        return C47135Ieh.LIZIZ(LIZ, this.userId, '}', LIZ);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        if (!(obj instanceof MemberMessage) || (commonMessageData = ((BaseMessage) obj).baseMessage) == null || (commonMessageData2 = this.baseMessage) == null || commonMessageData2.messageId != commonMessageData.messageId) {
            return false;
        }
        return true;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((MemberMessage) obj).rankScore;
        int i2 = ((MemberMessage) obj2).rankScore;
        if (i == i2) {
            return -1;
        }
        return i - i2;
    }
}
