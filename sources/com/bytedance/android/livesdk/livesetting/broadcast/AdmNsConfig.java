package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AdmNsConfig {

    @InterfaceC65349Pkn("enable_ns_on_headset")
    public boolean enable;

    @InterfaceC65349Pkn("enable_sami_enginecommon_debug")
    public boolean enableDebug;

    @InterfaceC65349Pkn("live_adm_ns_type")
    public int nsType;

    @InterfaceC65349Pkn("live_adm_ns_url")
    public String nsUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public AdmNsConfig() {
        this(0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public AdmNsConfig(int i, boolean z, String nsUrl, boolean z2) {
        o.LJIIIZ(nsUrl, "nsUrl");
        this.nsType = i;
        this.enable = z;
        this.nsUrl = nsUrl;
        this.enableDebug = z2;
    }

    public /* synthetic */ AdmNsConfig(int i, boolean z, String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z2);
    }
}
