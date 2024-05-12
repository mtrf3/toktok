package com.ss.android.ugc.aweme.notice.api.ab;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.C87326YPa;
import X.C87327YPb;
import X.C87328YPc;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import X.YPZ;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class WsNetAvailableDelayConnectExp {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87328YPc.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87327YPb.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(YPZ.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C87326YPa.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("delay_seconds")
        public final long delaySeconds;

        @InterfaceC65349Pkn("enable_connecting_reconnect")
        public final boolean enableConnectingReconnect;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MetaData() {
            /*
                r7 = this;
                r1 = 0
                r2 = 0
                r5 = 7
                r6 = 0
                r0 = r7
                r4 = r1
                r0.<init>(r1, r2, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.api.ab.WsNetAvailableDelayConnectExp.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.enabled == metaData.enabled && this.delaySeconds == metaData.delaySeconds && this.enableConnectingReconnect == metaData.enableConnectingReconnect;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final int hashCode() {
            boolean z = this.enabled;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int LIZJ = JBR.LIZJ(this.delaySeconds, r0 * 31, 31);
            if (!this.enableConnectingReconnect) {
                i = 0;
            }
            return LIZJ + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", delaySeconds=");
            LIZ.append(this.delaySeconds);
            LIZ.append(", enableConnectingReconnect=");
            return C48339Iy7.LIZJ(LIZ, this.enableConnectingReconnect, ')', LIZ);
        }

        public MetaData(boolean z, long j, boolean z2) {
            this.enabled = z;
            this.delaySeconds = j;
            this.enableConnectingReconnect = z2;
        }

        public /* synthetic */ MetaData(boolean z, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z2);
        }
    }

    static {
        boolean z = false;
        LIZ = new MetaData(z, 0L, z, 7, null);
    }
}
