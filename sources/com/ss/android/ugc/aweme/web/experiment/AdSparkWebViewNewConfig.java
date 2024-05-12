package com.ss.android.ugc.aweme.web.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.C87540YXg;
import X.C87541YXh;
import X.C87542YXi;
import X.C87543YXj;
import X.C87544YXk;
import X.C87545YXl;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class AdSparkWebViewNewConfig {
    public static final AdSparkWebViewNewConfigModel LIZ = new AdSparkWebViewNewConfigModel(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87540YXg.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87541YXh.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C87545YXl.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C87544YXk.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C87543YXj.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C87542YXi.LJLIL);

    public static boolean LIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    /* loaded from: classes17.dex */
    public static final class AdSparkWebViewNewConfigModel {

        @InterfaceC65349Pkn("ad_webview_page_use_spark_hide_loading_js")
        public final boolean hideLoadingJs;

        @InterfaceC65349Pkn("ad_webview_page_use_spark_hide_loading_js_fmp")
        public final int loadingJsFmp;

        @InterfaceC65349Pkn("ad_webview_page_use_spark_new_header")
        public final boolean newHeader;

        @InterfaceC65349Pkn("ad_webview_page_use_spark_remove_loading")
        public final boolean removeLoading;

        @InterfaceC65349Pkn("ad_webview_page_use_spark_use_webview_title")
        public final int useWebViewTitle;

        @InterfaceC65349Pkn("ad_webview_page_use_spark_webview_progress_bar")
        public final boolean webViewProgressBar;

        /* JADX WARN: Multi-variable type inference failed */
        public AdSparkWebViewNewConfigModel() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
        }

        public AdSparkWebViewNewConfigModel(boolean z, int i, boolean z2, int i2, boolean z3, boolean z4) {
            this.hideLoadingJs = z;
            this.loadingJsFmp = i;
            this.webViewProgressBar = z2;
            this.useWebViewTitle = i2;
            this.newHeader = z3;
            this.removeLoading = z4;
        }

        public /* synthetic */ AdSparkWebViewNewConfigModel(boolean z, int i, boolean z2, int i2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? 2 : i2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? false : z4);
        }
    }
}
