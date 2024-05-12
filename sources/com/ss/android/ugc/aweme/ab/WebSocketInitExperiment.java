package com.ss.android.ugc.aweme.ab;

import X.C221108m2;
import X.C34301DdB;
import X.C34302DdC;
import X.C35018Dok;
import X.C35121DqP;
import X.C35122DqQ;
import X.C35123DqR;
import X.C35124DqS;
import X.C35125DqT;
import X.C35126DqU;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class WebSocketInitExperiment {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35018Dok.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C34301DdB.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C34302DdC.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C35125DqT.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C35126DqU.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C35124DqS.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C35123DqR.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C35122DqQ.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C35121DqP.LJLIL);

    /* loaded from: classes7.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("init_delay_seconds")
        public final long initDelaySeconds;

        @InterfaceC65349Pkn("init_task_work_type")
        public final int initTaskWorkType;

        @InterfaceC65349Pkn("init_timing_group")
        public final int initTimingGroup;

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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ab.WebSocketInitExperiment.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.initTimingGroup == metaData.initTimingGroup && this.initDelaySeconds == metaData.initDelaySeconds && this.initTaskWorkType == metaData.initTaskWorkType;
        }

        public final int hashCode() {
            return JBR.LIZJ(this.initDelaySeconds, this.initTimingGroup * 31, 31) + this.initTaskWorkType;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(initTimingGroup=");
            LIZ.append(this.initTimingGroup);
            LIZ.append(", initDelaySeconds=");
            LIZ.append(this.initDelaySeconds);
            LIZ.append(", initTaskWorkType=");
            return b0.LIZJ(LIZ, this.initTaskWorkType, ')', LIZ);
        }

        public MetaData(int i, long j, int i2) {
            this.initTimingGroup = i;
            this.initDelaySeconds = j;
            this.initTaskWorkType = i2;
        }

        public /* synthetic */ MetaData(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    static {
        int i = 0;
        LIZ = new MetaData(i, 0L, i, 7, null);
    }

    public static int LIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }
}
