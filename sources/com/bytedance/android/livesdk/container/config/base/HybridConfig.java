package com.bytedance.android.livesdk.container.config.base;

import X.C31934Cg6;
import X.CN1;
import X.CNI;
import X.CNK;
import X.CNS;
import X.COQ;
import X.OFH;
import android.net.Uri;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.android.livesdk.container.type.HColor;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class HybridConfig implements Serializable {

    @CNS(name = "container_bg_color")
    public HColor containerBgColor;
    public String containerId;

    @CNS(name = "disable_back_press")
    public boolean disableBackPress;

    @CNS(name = "disable_builtin")
    public boolean disableBuiltin;

    @CNS(name = "disable_offline")
    public boolean disableOffline;

    @CNS(name = "enable_canvas")
    public boolean enableCanvas;
    public CNK engineType;

    @CNS(name = "fallback_url")
    public String fallbackUrl;

    @CNS(name = "hide_loading")
    public boolean hideLoading;

    @CNS(name = "initial_data")
    public String initialData;

    @CNS(name = "landscape_screen_size_as_portrait")
    public boolean landscapeAsPortrait;

    @CNS(name = "loading_bg_color")
    public HColor loadingBgColor;
    public String originUri;

    @CNS(name = "url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final HColor getContainerBgColor() {
        return this.containerBgColor;
    }

    public final String getContainerId() {
        return this.containerId;
    }

    public final boolean getDisableBackPress() {
        return this.disableBackPress;
    }

    public final boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final boolean getDisableOffline() {
        return this.disableOffline;
    }

    public final boolean getEnableCanvas() {
        return this.enableCanvas;
    }

    public final CNK getEngineType() {
        return this.engineType;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final boolean getLandscapeAsPortrait() {
        return this.landscapeAsPortrait;
    }

    public final HColor getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public final String getOriginUri() {
        return this.originUri;
    }

    public final String getUrl() {
        return this.url;
    }

    public HybridConfig(Uri uri) {
        COQ b90;
        C31934Cg6 PR;
        CNK cnk = CNK.WEB_VIEW;
        this.engineType = cnk;
        this.url = "";
        this.fallbackUrl = "";
        this.initialData = "";
        OFH.LIZLLL.getClass();
        this.containerId = OFH.LJ();
        if (uri != null) {
            OFH.LIZIZ(System.currentTimeMillis(), this.containerId, "open_time");
            OFH.LIZIZ(System.currentTimeMillis(), this.containerId, "container_init_start");
            OFH.LIZJ(this.containerId, "container_name", "webcast_oversea");
            this.originUri = uri.toString();
            if (CNI.LIZJ.contains(uri.getHost())) {
                IContainerService iContainerService = (IContainerService) CN1.LIZ(IContainerService.class);
                if (iContainerService != null && (PR = iContainerService.PR()) != null) {
                    String uri2 = uri.toString();
                    o.LJIIIIZZ(uri2, "it.toString()");
                    PR.LJFF(uri2);
                }
                cnk = CNK.LYNX;
            } else {
                IContainerService iContainerService2 = (IContainerService) CN1.LIZ(IContainerService.class);
                if (iContainerService2 != null && (b90 = iContainerService2.b90()) != null) {
                    String uri3 = uri.toString();
                    o.LJIIIIZZ(uri3, "it.toString()");
                    b90.LJFF(uri3);
                }
            }
            this.engineType = cnk;
            checkSchema(uri);
        }
    }

    public void checkSchema(Uri uri) {
        C31934Cg6 PR;
        COQ b90;
        o.LJIIIZ(uri, "uri");
        if (!CNI.LIZ.contains(uri.getHost())) {
            if (this.engineType == CNK.WEB_VIEW) {
                IContainerService iContainerService = (IContainerService) CN1.LIZ(IContainerService.class);
                if (iContainerService != null && (b90 = iContainerService.b90()) != null) {
                    String uri2 = uri.toString();
                    o.LJIIIIZZ(uri2, "uri.toString()");
                    b90.LJI(uri2);
                    return;
                }
                return;
            }
            IContainerService iContainerService2 = (IContainerService) CN1.LIZ(IContainerService.class);
            if (iContainerService2 == null || (PR = iContainerService2.PR()) == null) {
                return;
            }
            String uri3 = uri.toString();
            o.LJIIIIZZ(uri3, "uri.toString()");
            PR.LJI(uri3);
        }
    }

    public final void setContainerBgColor(HColor hColor) {
        this.containerBgColor = hColor;
    }

    public final void setContainerId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.containerId = str;
    }

    public final void setDisableBackPress(boolean z) {
        this.disableBackPress = z;
    }

    public final void setDisableBuiltin(boolean z) {
        this.disableBuiltin = z;
    }

    public final void setDisableOffline(boolean z) {
        this.disableOffline = z;
    }

    public final void setEnableCanvas(boolean z) {
        this.enableCanvas = z;
    }

    public final void setEngineType(CNK cnk) {
        o.LJIIIZ(cnk, "<set-?>");
        this.engineType = cnk;
    }

    public final void setFallbackUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.fallbackUrl = str;
    }

    public final void setHideLoading(boolean z) {
        this.hideLoading = z;
    }

    public final void setInitialData(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.initialData = str;
    }

    public final void setLandscapeAsPortrait(boolean z) {
        this.landscapeAsPortrait = z;
    }

    public final void setLoadingBgColor(HColor hColor) {
        this.loadingBgColor = hColor;
    }

    public final void setOriginUri(String str) {
        this.originUri = str;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }

    public /* synthetic */ HybridConfig(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri);
    }
}
