package com.ss.android.ugc.aweme.settings;

import X.C221108m2;
import X.C251899ub;
import X.C48339Iy7;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SparkWebViewOptimizeExperiment {
    public static final WebViewOptimizeModel LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes5.dex */
    public static final class WebViewOptimizeModel {

        @InterfaceC65349Pkn("enable_common_opt")
        public final boolean enableCommonOpt;

        @InterfaceC65349Pkn("enable_lazy_bridge")
        public final boolean enableLazyBridge;

        @InterfaceC65349Pkn("enable_multi_thread")
        public final boolean enableMultiThread;

        @InterfaceC65349Pkn("enable_warmup_spark")
        public final boolean enableWarmupSpark;

        @InterfaceC65349Pkn("enable_warmup_webview")
        public final boolean enableWarmupWebView;

        @InterfaceC65349Pkn("warmup_webview_in_idle")
        public final boolean warmupWebviewInIdle;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WebViewOptimizeModel() {
            /*
                r9 = this;
                r1 = 0
                r7 = 63
                r8 = 0
                r0 = r9
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment.WebViewOptimizeModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewOptimizeModel)) {
                return false;
            }
            WebViewOptimizeModel webViewOptimizeModel = (WebViewOptimizeModel) obj;
            return this.enableCommonOpt == webViewOptimizeModel.enableCommonOpt && this.enableWarmupSpark == webViewOptimizeModel.enableWarmupSpark && this.enableWarmupWebView == webViewOptimizeModel.enableWarmupWebView && this.enableMultiThread == webViewOptimizeModel.enableMultiThread && this.enableLazyBridge == webViewOptimizeModel.enableLazyBridge && this.warmupWebviewInIdle == webViewOptimizeModel.warmupWebviewInIdle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
        public final int hashCode() {
            boolean z = this.enableCommonOpt;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.enableWarmupSpark;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.enableWarmupWebView;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            ?? r04 = this.enableMultiThread;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            int i7 = (i5 + i6) * 31;
            ?? r05 = this.enableLazyBridge;
            int i8 = r05;
            if (r05 != 0) {
                i8 = 1;
            }
            return ((i7 + i8) * 31) + (this.warmupWebviewInIdle ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebViewOptimizeModel(enableCommonOpt=");
            LIZ.append(this.enableCommonOpt);
            LIZ.append(", enableWarmupSpark=");
            LIZ.append(this.enableWarmupSpark);
            LIZ.append(", enableWarmupWebView=");
            LIZ.append(this.enableWarmupWebView);
            LIZ.append(", enableMultiThread=");
            LIZ.append(this.enableMultiThread);
            LIZ.append(", enableLazyBridge=");
            LIZ.append(this.enableLazyBridge);
            LIZ.append(", warmupWebviewInIdle=");
            return C48339Iy7.LIZJ(LIZ, this.warmupWebviewInIdle, ')', LIZ);
        }

        public WebViewOptimizeModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.enableCommonOpt = z;
            this.enableWarmupSpark = z2;
            this.enableWarmupWebView = z3;
            this.enableMultiThread = z4;
            this.enableLazyBridge = z5;
            this.warmupWebviewInIdle = z6;
        }

        public /* synthetic */ WebViewOptimizeModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) == 0 ? z5 : false, (i & 32) != 0 ? true : z6);
        }
    }

    static {
        boolean z = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        LIZ = new WebViewOptimizeModel(z, z, z, z, z, z, 63, defaultConstructorMarker);
        boolean z2 = true;
        new WebViewOptimizeModel(z2, z2, z2, z2, z2, z, 32, defaultConstructorMarker);
        LIZIZ = C221108m2.LIZIZ(C251899ub.LJLIL);
    }

    public static final WebViewOptimizeModel LIZ() {
        return (WebViewOptimizeModel) LIZIZ.getValue();
    }
}
