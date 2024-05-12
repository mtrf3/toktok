package com.ss.android.ugc.aweme.notification.perf.monitor;

import X.C221108m2;
import X.C48339Iy7;
import X.C53537Kzl;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AdapterNotifyCrashFixer {
    public static final Meta LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53537Kzl.LJLIL);

    /* loaded from: classes10.dex */
    public static final class Meta {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("enable_slardar")
        public final boolean enableSlardar;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Meta() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.monitor.AdapterNotifyCrashFixer.Meta.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) obj;
            return this.enable == meta.enable && this.enableSlardar == meta.enableSlardar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.enableSlardar ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Meta(enable=");
            LIZ.append(this.enable);
            LIZ.append(", enableSlardar=");
            return C48339Iy7.LIZJ(LIZ, this.enableSlardar, ')', LIZ);
        }

        public Meta(boolean z, boolean z2) {
            this.enable = z;
            this.enableSlardar = z2;
        }

        public /* synthetic */ Meta(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
        }
    }

    static {
        boolean z = false;
        LIZ = new Meta(z, z, 3, null);
    }
}
