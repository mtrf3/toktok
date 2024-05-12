package com.bytedance.android.livesdk.livesetting.watchlive;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_time_ntp_opt")
/* loaded from: classes6.dex */
public final class LiveTimeNtpOpt {

    @Group(isDefault = true, value = "default")
    public static final TimeNormal DEFAULT;
    public static final LiveTimeNtpOpt INSTANCE = new LiveTimeNtpOpt();

    static {
        boolean z = false;
        DEFAULT = new TimeNormal(z, z, 0L, 7, null);
    }

    public final TimeNormal getValue() {
        TimeNormal timeNormal = (TimeNormal) SettingsManager.INSTANCE.getValueSafely(LiveTimeNtpOpt.class);
        if (timeNormal == null) {
            return DEFAULT;
        }
        return timeNormal;
    }

    /* loaded from: classes6.dex */
    public static final class TimeNormal {

        @InterfaceC65349Pkn("enable_http")
        public boolean enableHttp;

        @InterfaceC65349Pkn("enable_ws")
        public boolean enableWS;

        @InterfaceC65349Pkn("http_delay_threshold_for_ntp")
        public long httpDelayThresholdForNTP;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TimeNormal() {
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.LiveTimeNtpOpt.TimeNormal.<init>():void");
        }

        public TimeNormal(boolean z, boolean z2, long j) {
            this.enableWS = z;
            this.enableHttp = z2;
            this.httpDelayThresholdForNTP = j;
        }

        public /* synthetic */ TimeNormal(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 1000L : j);
        }
    }
}
