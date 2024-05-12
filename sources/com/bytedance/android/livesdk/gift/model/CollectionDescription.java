package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class CollectionDescription extends F9E {

    @InterfaceC65349Pkn("audience_description")
    public String audienceDescription;

    @InterfaceC65349Pkn("common_description")
    public String commonDescription;

    @InterfaceC65349Pkn("host_description")
    public String hostDescription;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.commonDescription;
        String str2 = this.hostDescription;
        String str3 = this.audienceDescription;
        return new Object[]{str, str, str2, str2, str3, str3};
    }
}
