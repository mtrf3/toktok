package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public class ControlMessage extends CR6 {

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("extra")
    public Extra extraInfo;

    @InterfaceC65349Pkn("float_style")
    public int floatStyle;

    @InterfaceC65349Pkn("float_text")
    public Text floatText;

    @InterfaceC65349Pkn("perception_audience_text")
    public Text perceptionAudienceText;

    @InterfaceC65349Pkn("perception_dialog")
    public PerceptionDialogInfo perceptionDialogInfo;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn("tips")
    public String tips;

    /* loaded from: classes6.dex */
    public static class Extra {

        @InterfaceC65349Pkn("ban_info_url")
        public String banInfoUrl;

        @InterfaceC65349Pkn("display_text")
        public Text illegalText;

        @InterfaceC65349Pkn("reason_no")
        public long reasonNo;

        @InterfaceC65349Pkn("title")
        public Text title;

        @InterfaceC65349Pkn("violation_reason")
        public Text violationReason;
    }

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        int i = this.action;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public ControlMessage() {
        this.type = EnumC31509CYf.CONTROL;
    }
}
