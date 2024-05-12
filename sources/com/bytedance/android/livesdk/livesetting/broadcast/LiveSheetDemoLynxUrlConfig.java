package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C43588H8u;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LiveSheetDemoLynxUrlConfig {

    @InterfaceC65349Pkn("spark_navigate")
    public String sparkNavigate;

    @InterfaceC65349Pkn("spark_offline_navigate")
    public String sparkOfflineNavigate;

    @InterfaceC65349Pkn("spark_offline_overlay")
    public String sparkOfflineOverlay;

    @InterfaceC65349Pkn("spark_overlay")
    public String sparkOverlay;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSheetDemoLynxUrlConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public LiveSheetDemoLynxUrlConfig(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "sparkOverlay", str2, "sparkNavigate", str3, "sparkOfflineOverlay", str4, "sparkOfflineNavigate");
        this.sparkOverlay = str;
        this.sparkNavigate = str2;
        this.sparkOfflineOverlay = str3;
        this.sparkOfflineNavigate = str4;
    }

    public /* synthetic */ LiveSheetDemoLynxUrlConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
