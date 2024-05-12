package com.ss.android.ugc.aweme.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PrivacyUrls extends F9E {

    @InterfaceC65349Pkn("dark")
    public final String darkUrl;

    @InterfaceC65349Pkn("light")
    public final String lightUrl;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.lightUrl, this.darkUrl};
    }

    public PrivacyUrls(String lightUrl, String darkUrl) {
        o.LJIIIZ(lightUrl, "lightUrl");
        o.LJIIIZ(darkUrl, "darkUrl");
        this.lightUrl = lightUrl;
        this.darkUrl = darkUrl;
    }
}
