package com.ss.android.ugc.aweme.web.experiment;

import X.C221108m2;
import X.C53250Kv8;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AdSparkWebViewJSBConfig {
    public static final AdSparkWebViewJSBConfigModel LIZ = new AdSparkWebViewJSBConfigModel(false, 1, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53250Kv8.LJLIL);

    /* loaded from: classes10.dex */
    public static final class AdSparkWebViewJSBConfigModel {

        @InterfaceC65349Pkn("ad_spark_webview_jsb_lazy_register")
        public final boolean jsbLazyRegister;

        public AdSparkWebViewJSBConfigModel() {
            this(false, 1, null);
        }

        public AdSparkWebViewJSBConfigModel(boolean z) {
            this.jsbLazyRegister = z;
        }

        public /* synthetic */ AdSparkWebViewJSBConfigModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }
}
