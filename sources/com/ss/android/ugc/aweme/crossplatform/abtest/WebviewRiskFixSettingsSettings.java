package com.ss.android.ugc.aweme.crossplatform.abtest;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes7.dex */
public final class WebviewRiskFixSettingsSettings {
    public static final WebviewRiskFixSettingsModel LIZ = new WebviewRiskFixSettingsModel(false, false);

    /* loaded from: classes7.dex */
    public static final class WebviewRiskFixSettingsModel {

        @InterfaceC65349Pkn("fixIntercept")
        public final boolean fixIntercept;

        @InterfaceC65349Pkn("fixPrefetch")
        public final boolean fixPrefetch;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebviewRiskFixSettingsModel)) {
                return false;
            }
            WebviewRiskFixSettingsModel webviewRiskFixSettingsModel = (WebviewRiskFixSettingsModel) obj;
            return this.fixIntercept == webviewRiskFixSettingsModel.fixIntercept && this.fixPrefetch == webviewRiskFixSettingsModel.fixPrefetch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.fixIntercept;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.fixPrefetch ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebviewRiskFixSettingsModel(fixIntercept=");
            LIZ.append(this.fixIntercept);
            LIZ.append(", fixPrefetch=");
            return C48339Iy7.LIZJ(LIZ, this.fixPrefetch, ')', LIZ);
        }

        public WebviewRiskFixSettingsModel(boolean z, boolean z2) {
            this.fixIntercept = z;
            this.fixPrefetch = z2;
        }
    }

    public static final WebviewRiskFixSettingsModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        WebviewRiskFixSettingsModel webviewRiskFixSettingsModel = LIZ;
        WebviewRiskFixSettingsModel webviewRiskFixSettingsModel2 = (WebviewRiskFixSettingsModel) LIZLLL.LJIIIIZZ("webview_risk_fix_settings", WebviewRiskFixSettingsModel.class, webviewRiskFixSettingsModel);
        if (webviewRiskFixSettingsModel2 == null) {
            return webviewRiskFixSettingsModel;
        }
        return webviewRiskFixSettingsModel2;
    }
}
