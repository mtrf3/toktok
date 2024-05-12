package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAboutMeMergeConfig {

    @InterfaceC65349Pkn("url_fullscreen")
    public String urlFullscreen;

    @InterfaceC65349Pkn("url_popup")
    public String urlPopup;

    @InterfaceC65349Pkn("url_popup_live_sheet")
    public String urlPopupLiveSheet;

    @InterfaceC65349Pkn("url_upgrade_popup")
    public String urlUpgradePopup;

    @InterfaceC65349Pkn("url_upgrade_popup_live_sheet")
    public String urlUpgradePopupLiveSheet;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveAboutMeMergeConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public LiveAboutMeMergeConfig(String urlPopup, String urlPopupLiveSheet, String urlFullscreen, String urlUpgradePopup, String urlUpgradePopupLiveSheet) {
        o.LJIIIZ(urlPopup, "urlPopup");
        o.LJIIIZ(urlPopupLiveSheet, "urlPopupLiveSheet");
        o.LJIIIZ(urlFullscreen, "urlFullscreen");
        o.LJIIIZ(urlUpgradePopup, "urlUpgradePopup");
        o.LJIIIZ(urlUpgradePopupLiveSheet, "urlUpgradePopupLiveSheet");
        this.urlPopup = urlPopup;
        this.urlPopupLiveSheet = urlPopupLiveSheet;
        this.urlFullscreen = urlFullscreen;
        this.urlUpgradePopup = urlUpgradePopup;
        this.urlUpgradePopupLiveSheet = urlUpgradePopupLiveSheet;
    }

    public /* synthetic */ LiveAboutMeMergeConfig(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
