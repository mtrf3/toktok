package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class EcomEventMonitorSettings {
    public static final EcomEventMonitorConfig LIZ;

    /* loaded from: classes9.dex */
    public static final class EcomEventMonitorConfig {

        @InterfaceC65349Pkn("event_pair_detect_threshold")
        public final long eventPairDetectThreshold;

        @InterfaceC65349Pkn("event_report_threshold")
        public final int eventReportThreshold;

        @InterfaceC65349Pkn("event_size_threshold")
        public final int eventSizeThreshold;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EcomEventMonitorConfig() {
            /*
                r7 = this;
                r1 = 0
                r3 = 0
                r5 = 7
                r6 = 0
                r0 = r7
                r2 = r1
                r0.<init>(r1, r2, r3, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings.EcomEventMonitorConfig.<init>():void");
        }

        public static /* synthetic */ EcomEventMonitorConfig copy$default(EcomEventMonitorConfig ecomEventMonitorConfig, int i, int i2, long j, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ecomEventMonitorConfig.eventReportThreshold;
            }
            if ((i3 & 2) != 0) {
                i2 = ecomEventMonitorConfig.eventSizeThreshold;
            }
            if ((i3 & 4) != 0) {
                j = ecomEventMonitorConfig.eventPairDetectThreshold;
            }
            return ecomEventMonitorConfig.copy(i, i2, j);
        }

        public final EcomEventMonitorConfig copy(int i, int i2, long j) {
            return new EcomEventMonitorConfig(i, i2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomEventMonitorConfig)) {
                return false;
            }
            EcomEventMonitorConfig ecomEventMonitorConfig = (EcomEventMonitorConfig) obj;
            return this.eventReportThreshold == ecomEventMonitorConfig.eventReportThreshold && this.eventSizeThreshold == ecomEventMonitorConfig.eventSizeThreshold && this.eventPairDetectThreshold == ecomEventMonitorConfig.eventPairDetectThreshold;
        }

        public int hashCode() {
            return C16880lQ.LLJIJIL(this.eventPairDetectThreshold) + (((this.eventReportThreshold * 31) + this.eventSizeThreshold) * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomEventMonitorConfig(eventReportThreshold=");
            LIZ.append(this.eventReportThreshold);
            LIZ.append(", eventSizeThreshold=");
            LIZ.append(this.eventSizeThreshold);
            LIZ.append(", eventPairDetectThreshold=");
            return C47135Ieh.LIZIZ(LIZ, this.eventPairDetectThreshold, ')', LIZ);
        }

        public final long getEventPairDetectThreshold() {
            return this.eventPairDetectThreshold;
        }

        public final int getEventReportThreshold() {
            return this.eventReportThreshold;
        }

        public final int getEventSizeThreshold() {
            return this.eventSizeThreshold;
        }

        public EcomEventMonitorConfig(int i, int i2, long j) {
            this.eventReportThreshold = i;
            this.eventSizeThreshold = i2;
            this.eventPairDetectThreshold = j;
        }

        public /* synthetic */ EcomEventMonitorConfig(int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 512000 : i2, (i3 & 4) != 0 ? 10000L : j);
        }
    }

    static {
        new EcomEventMonitorSettings();
        int i = 0;
        LIZ = new EcomEventMonitorConfig(i, i, 0L, 7, null);
    }

    public static final EcomEventMonitorConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomEventMonitorConfig ecomEventMonitorConfig = LIZ;
        EcomEventMonitorConfig ecomEventMonitorConfig2 = (EcomEventMonitorConfig) LIZLLL.LJIIIIZZ("ec_event_monitor_config", EcomEventMonitorConfig.class, ecomEventMonitorConfig);
        if (ecomEventMonitorConfig2 == null) {
            return ecomEventMonitorConfig;
        }
        return ecomEventMonitorConfig2;
    }
}
