package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("webcast_live_sdk_ttls_data_report_settings")
/* loaded from: classes6.dex */
public final class LiveTTLSDataReportSettings {

    @Group(isDefault = true, value = "default group")
    public static final TTLSDataReportSetting DEFAULT;
    public static final LiveTTLSDataReportSettings INSTANCE = new LiveTTLSDataReportSettings();

    static {
        boolean z = false;
        DEFAULT = new TTLSDataReportSetting(z, z, 3, null);
    }

    public final boolean isLynxOptEnabled() {
        TTLSDataReportSetting tTLSDataReportSetting = (TTLSDataReportSetting) SettingsManager.INSTANCE.getValueSafely(LiveTTLSDataReportSettings.class);
        if (tTLSDataReportSetting == null) {
            tTLSDataReportSetting = DEFAULT;
        }
        return tTLSDataReportSetting.enableLynx;
    }

    public final boolean isSoDataReportOptEnabled() {
        TTLSDataReportSetting tTLSDataReportSetting = (TTLSDataReportSetting) SettingsManager.INSTANCE.getValueSafely(LiveTTLSDataReportSettings.class);
        if (tTLSDataReportSetting == null) {
            tTLSDataReportSetting = DEFAULT;
        }
        return tTLSDataReportSetting.enableSo;
    }

    /* loaded from: classes6.dex */
    public static final class TTLSDataReportSetting {

        @InterfaceC65349Pkn("webcast_live_sdk_ttls_lynx_data_report_settings")
        public boolean enableLynx;

        @InterfaceC65349Pkn("webcast_live_sdk_ttls_so_data_report_settings")
        public boolean enableSo;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TTLSDataReportSetting() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDataReportSettings.TTLSDataReportSetting.<init>():void");
        }

        public TTLSDataReportSetting(boolean z, boolean z2) {
            this.enableSo = z;
            this.enableLynx = z2;
        }

        public /* synthetic */ TTLSDataReportSetting(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }
}
