package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class CoverQuality extends F9E {

    @InterfaceC65349Pkn("bubble_tip")
    public String bubbleTip;

    @InterfaceC65349Pkn("level")
    public Long level;

    @InterfaceC65349Pkn("pop_tip")
    public String popTip;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.level;
        String str = this.bubbleTip;
        String str2 = this.popTip;
        String str3 = this.uri;
        return new Object[]{l, l, str, str, str2, str2, str3, str3};
    }
}
