package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MatchXData {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("url")
    public String lynxUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchXData() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public MatchXData(boolean z, String lynxUrl) {
        o.LJIIIZ(lynxUrl, "lynxUrl");
        this.enable = z;
        this.lynxUrl = lynxUrl;
    }

    public /* synthetic */ MatchXData(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
