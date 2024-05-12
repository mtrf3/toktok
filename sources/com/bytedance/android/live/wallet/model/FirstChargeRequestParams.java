package com.bytedance.android.live.wallet.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class FirstChargeRequestParams extends F9E {

    @InterfaceC65349Pkn("channel")
    public String channel;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("force_source_region")
    public boolean forceSourceRegion;

    @InterfaceC65349Pkn("live_id")
    public Long liveId;

    @InterfaceC65349Pkn("type")
    public Long type;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.liveId;
        Long l2 = this.type;
        String str = this.channel;
        String str2 = this.currency;
        return new Object[]{l, l, l2, l2, str, str, str2, str2};
    }
}
