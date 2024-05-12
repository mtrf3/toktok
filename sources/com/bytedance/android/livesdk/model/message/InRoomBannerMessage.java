package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.google.gson.m;

/* loaded from: classes6.dex */
public class InRoomBannerMessage extends CR6 {

    @InterfaceC65349Pkn("action_type")
    public Integer actionType;

    @InterfaceC65349Pkn("extra")
    public m extra;

    @InterfaceC65349Pkn("position")
    public int position = 1;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public InRoomBannerMessage() {
        this.type = EnumC31509CYf.IN_ROOM_BANNER_MESSAGE;
    }
}
