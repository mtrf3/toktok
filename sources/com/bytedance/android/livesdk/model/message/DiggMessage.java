package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class DiggMessage extends CR6 {

    @InterfaceC65349Pkn("color")
    public int color;

    @InterfaceC65349Pkn("digg_count")
    public int diggCount;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.user != null) {
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

    public DiggMessage() {
        this.type = EnumC31509CYf.DIGG;
    }
}
