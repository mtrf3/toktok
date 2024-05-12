package com.ss.android.ugc.aweme.discover.experiment;

import X.C208638Gt;
import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DiscoveryFpsOptExperiment {
    public static final Config LIZ = new Config(false, false);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C208638Gt.LJLIL);

    /* loaded from: classes4.dex */
    public static final class Config {

        @InterfaceC65349Pkn("enable_opt_function")
        public final boolean enable1;

        @InterfaceC65349Pkn("enable_opt_event_trace")
        public final boolean enable2;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Config() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment.Config.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable1 == config.enable1 && this.enable2 == config.enable2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enable1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.enable2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(enable1=");
            LIZ.append(this.enable1);
            LIZ.append(", enable2=");
            return C48339Iy7.LIZJ(LIZ, this.enable2, ')', LIZ);
        }

        public Config(boolean z, boolean z2) {
            this.enable1 = z;
            this.enable2 = z2;
        }

        public /* synthetic */ Config(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }
}
