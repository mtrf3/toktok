package com.bytedance.android.livesdk.container.config.live;

import X.CNS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePageConfig extends LiveHybridConfig {

    @CNS(name = "soft_input_mode")
    public String softInputMode = "adjustNothing";

    public final String getSoftInputMode() {
        return this.softInputMode;
    }

    public final void setSoftInputMode(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.softInputMode = str;
    }
}
