package com.ss.android.ugc.aweme.notice.api.ab;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.C87329YPd;
import X.C87330YPe;
import X.C87331YPf;
import X.C87332YPg;
import X.C87333YPh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class WsConnectTimeoutReconnectExp {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87333YPh.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87330YPe.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C87329YPd.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C87332YPg.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C87331YPf.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("delay_seconds")
        public final long delaySeconds;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        @InterfaceC65349Pkn("is_only_foreground_reconnect")
        public final boolean isOnlyForegroundReconnect;

        @InterfaceC65349Pkn("is_only_connecting_reconnect")
        public final boolean isOnlyOnConnectingReconnect;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MetaData() {
            /*
                r8 = this;
                r1 = 0
                r2 = 0
                r6 = 15
                r7 = 0
                r0 = r8
                r4 = r1
                r5 = r1
                r0.<init>(r1, r2, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.api.ab.WsConnectTimeoutReconnectExp.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.enabled == metaData.enabled && this.delaySeconds == metaData.delaySeconds && this.isOnlyOnConnectingReconnect == metaData.isOnlyOnConnectingReconnect && this.isOnlyForegroundReconnect == metaData.isOnlyForegroundReconnect;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.enabled;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int LIZJ = JBR.LIZJ(this.delaySeconds, r0 * 31, 31);
            ?? r02 = this.isOnlyOnConnectingReconnect;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (LIZJ + i2) * 31;
            if (!this.isOnlyForegroundReconnect) {
                i = 0;
            }
            return i3 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", delaySeconds=");
            LIZ.append(this.delaySeconds);
            LIZ.append(", isOnlyOnConnectingReconnect=");
            LIZ.append(this.isOnlyOnConnectingReconnect);
            LIZ.append(", isOnlyForegroundReconnect=");
            return C48339Iy7.LIZJ(LIZ, this.isOnlyForegroundReconnect, ')', LIZ);
        }

        public MetaData(boolean z, long j, boolean z2, boolean z3) {
            this.enabled = z;
            this.delaySeconds = j;
            this.isOnlyOnConnectingReconnect = z2;
            this.isOnlyForegroundReconnect = z3;
        }

        public /* synthetic */ MetaData(boolean z, long j, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
    }

    static {
        boolean z = false;
        LIZ = new MetaData(z, 0L, z, z, 15, null);
    }
}
