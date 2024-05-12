package com.ss.android.ugc.aweme.innerpush.settings;

import X.C16880lQ;
import X.C221108m2;
import X.C47135Ieh;
import X.C62822Ol8;
import X.C86526Xxa;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class PullSettings {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C86526Xxa.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("account_switch_delay")
        public final long accountSwitchDelaySeconds;

        @InterfaceC65349Pkn("cold_start_delay")
        public final long coldStartDelaySeconds;

        @InterfaceC65349Pkn("hot_start_delay")
        public final long hotStartDelaySeconds;

        @InterfaceC65349Pkn("min_req_duration")
        public final long minReqDurationSeconds;

        @InterfaceC65349Pkn("warm_start_delay")
        public final long warmStartDelaySeconds;

        @InterfaceC65349Pkn("ws_disconnect_poll_duration")
        public final long wsDisconnectPollDurationSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MetaData() {
            /*
                r15 = this;
                r1 = 0
                r13 = 63
                r14 = 0
                r0 = r15
                r3 = r1
                r5 = r1
                r7 = r1
                r9 = r1
                r11 = r1
                r0.<init>(r1, r3, r5, r7, r9, r11, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.settings.PullSettings.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.coldStartDelaySeconds == metaData.coldStartDelaySeconds && this.warmStartDelaySeconds == metaData.warmStartDelaySeconds && this.hotStartDelaySeconds == metaData.hotStartDelaySeconds && this.accountSwitchDelaySeconds == metaData.accountSwitchDelaySeconds && this.wsDisconnectPollDurationSeconds == metaData.wsDisconnectPollDurationSeconds && this.minReqDurationSeconds == metaData.minReqDurationSeconds;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.minReqDurationSeconds) + JBR.LIZJ(this.wsDisconnectPollDurationSeconds, JBR.LIZJ(this.accountSwitchDelaySeconds, JBR.LIZJ(this.hotStartDelaySeconds, JBR.LIZJ(this.warmStartDelaySeconds, C16880lQ.LLJIJIL(this.coldStartDelaySeconds) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(coldStartDelaySeconds=");
            LIZ.append(this.coldStartDelaySeconds);
            LIZ.append(", warmStartDelaySeconds=");
            LIZ.append(this.warmStartDelaySeconds);
            LIZ.append(", hotStartDelaySeconds=");
            LIZ.append(this.hotStartDelaySeconds);
            LIZ.append(", accountSwitchDelaySeconds=");
            LIZ.append(this.accountSwitchDelaySeconds);
            LIZ.append(", wsDisconnectPollDurationSeconds=");
            LIZ.append(this.wsDisconnectPollDurationSeconds);
            LIZ.append(", minReqDurationSeconds=");
            return C47135Ieh.LIZIZ(LIZ, this.minReqDurationSeconds, ')', LIZ);
        }

        public MetaData(long j, long j2, long j3, long j4, long j5, long j6) {
            this.coldStartDelaySeconds = j;
            this.warmStartDelaySeconds = j2;
            this.hotStartDelaySeconds = j3;
            this.accountSwitchDelaySeconds = j4;
            this.wsDisconnectPollDurationSeconds = j5;
            this.minReqDurationSeconds = j6;
        }

        public /* synthetic */ MetaData(long j, long j2, long j3, long j4, long j5, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 45L : j, (i & 2) != 0 ? 45L : j2, (i & 4) != 0 ? 45L : j3, (i & 8) == 0 ? j4 : 45L, (i & 16) != 0 ? 900L : j5, (i & 32) != 0 ? 10L : j6);
        }
    }

    static {
        long j = 0;
        LIZ = new MetaData(j, j, j, j, j, j, 63, null);
    }

    public static MetaData LIZ() {
        return (MetaData) LIZIZ.getValue();
    }
}
