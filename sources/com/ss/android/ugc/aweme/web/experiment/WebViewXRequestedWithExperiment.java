package com.ss.android.ugc.aweme.web.experiment;

import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebViewXRequestedWithExperiment {
    public static final WebViewXRequestedWithConfig LIZ;

    /* loaded from: classes7.dex */
    public static final class WebViewXRequestedWithConfig {

        @InterfaceC65349Pkn("host_list")
        public final List<String> hostList;

        @InterfaceC65349Pkn("x_requested_with")
        public final String xRequestedWith;

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewXRequestedWithConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewXRequestedWithConfig)) {
                return false;
            }
            WebViewXRequestedWithConfig webViewXRequestedWithConfig = (WebViewXRequestedWithConfig) obj;
            return o.LJ(this.hostList, webViewXRequestedWithConfig.hostList) && o.LJ(this.xRequestedWith, webViewXRequestedWithConfig.xRequestedWith);
        }

        public final int hashCode() {
            List<String> list = this.hostList;
            return this.xRequestedWith.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebViewXRequestedWithConfig(hostList=");
            LIZ.append(this.hostList);
            LIZ.append(", xRequestedWith=");
            return q.LIZIZ(LIZ, this.xRequestedWith, ')', LIZ);
        }

        public WebViewXRequestedWithConfig(List<String> list, String xRequestedWith) {
            o.LJIIIZ(xRequestedWith, "xRequestedWith");
            this.hostList = list;
            this.xRequestedWith = xRequestedWith;
        }

        public /* synthetic */ WebViewXRequestedWithConfig(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str);
        }
    }

    static {
        new WebViewXRequestedWithExperiment();
        LIZ = new WebViewXRequestedWithConfig(null, "");
    }

    public static final WebViewXRequestedWithConfig LIZ() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            WebViewXRequestedWithConfig webViewXRequestedWithConfig = LIZ;
            LJIIIZ.getClass();
            WebViewXRequestedWithConfig webViewXRequestedWithConfig2 = (WebViewXRequestedWithConfig) FFL.LJIJ(true, "webview_x_requested_with_config", 31744, WebViewXRequestedWithConfig.class, webViewXRequestedWithConfig);
            if (webViewXRequestedWithConfig2 != null) {
                webViewXRequestedWithConfig = webViewXRequestedWithConfig2;
            }
            o.LJIIIIZZ(webViewXRequestedWithConfig, "{\n            ABManager.…estedWithConfig\n        }");
            return webViewXRequestedWithConfig;
        } catch (Exception unused) {
            return LIZ;
        }
    }
}
