package com.ss.android.ugc.aweme.web.settings;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class WebInfoReportConfigSettings {
    public static final WebInfoReportConfig LIZ = new WebInfoReportConfig(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);

    /* loaded from: classes10.dex */
    public static final class WebInfoReportConfig {

        @InterfaceC65349Pkn("limit_times")
        public final int limitTimes;

        @InterfaceC65349Pkn("page_count")
        public final int pageCount;

        @InterfaceC65349Pkn("wifi_only_enable")
        public final boolean wifiOnlyEnable;

        /* JADX WARN: Multi-variable type inference failed */
        public WebInfoReportConfig() {
            this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebInfoReportConfig)) {
                return false;
            }
            WebInfoReportConfig webInfoReportConfig = (WebInfoReportConfig) obj;
            return this.limitTimes == webInfoReportConfig.limitTimes && this.pageCount == webInfoReportConfig.pageCount && this.wifiOnlyEnable == webInfoReportConfig.wifiOnlyEnable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = ((this.limitTimes * 31) + this.pageCount) * 31;
            boolean z = this.wifiOnlyEnable;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebInfoReportConfig(limitTimes=");
            LIZ.append(this.limitTimes);
            LIZ.append(", pageCount=");
            LIZ.append(this.pageCount);
            LIZ.append(", wifiOnlyEnable=");
            return C48339Iy7.LIZJ(LIZ, this.wifiOnlyEnable, ')', LIZ);
        }

        public WebInfoReportConfig(int i, int i2, boolean z) {
            this.limitTimes = i;
            this.pageCount = i2;
            this.wifiOnlyEnable = z;
        }

        public /* synthetic */ WebInfoReportConfig(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? true : z);
        }
    }

    public static final WebInfoReportConfig LIZ() {
        try {
            return (WebInfoReportConfig) SettingsManager.LIZLLL().LJIIIIZZ("web_info_report_config", WebInfoReportConfig.class, LIZ);
        } catch (Exception unused) {
            return LIZ;
        }
    }
}
