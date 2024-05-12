package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class BannerUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("data")
    public BannerInRoomCollection data;

    @InterfaceC65349Pkn("position")
    public Integer position;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public BannerUpdateMessage() {
        this.type = EnumC31509CYf.BANNER_UPDATE;
    }
}
