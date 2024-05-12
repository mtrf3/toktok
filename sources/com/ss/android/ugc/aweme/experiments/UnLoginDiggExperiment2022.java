package com.ss.android.ugc.aweme.experiments;

import X.C16880lQ;
import X.C221108m2;
import X.C47135Ieh;
import X.C62822Ol8;
import X.C79062V1e;
import X.E44;
import X.E45;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnLoginDiggExperiment2022 {
    public static final UnLoginDiggExperimentModel LIZIZ;
    public static UnLoginDiggExperimentModel LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(E45.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(E44.LJLIL);

    /* loaded from: classes7.dex */
    public static final class UnLoginDiggExperimentModel {

        @InterfaceC65349Pkn("ab_group")
        public final int abGroup;

        @InterfaceC65349Pkn("active_days")
        public final int activeDays;

        @InterfaceC65349Pkn("data_cap")
        public final int dataCap;

        @InterfaceC65349Pkn("data_expiration")
        public final int dataExpiration;

        @InterfaceC65349Pkn("day_count_limit")
        public final int dayCountLimit;

        @InterfaceC65349Pkn("init_timestamp")
        public final long initTimestamp;

        @InterfaceC65349Pkn("precise_exp_vid")
        public final String preciseExpVid;

        @InterfaceC65349Pkn("toast_color")
        public final int toastColor;

        @InterfaceC65349Pkn("total_count_limit")
        public final int totalCountLimit;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public UnLoginDiggExperimentModel() {
            /*
                r13 = this;
                r1 = 0
                r5 = 0
                r9 = 0
                r11 = 511(0x1ff, float:7.16E-43)
                r0 = r13
                r2 = r1
                r3 = r1
                r4 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r12 = r5
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiments.UnLoginDiggExperiment2022.UnLoginDiggExperimentModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnLoginDiggExperimentModel)) {
                return false;
            }
            UnLoginDiggExperimentModel unLoginDiggExperimentModel = (UnLoginDiggExperimentModel) obj;
            return this.abGroup == unLoginDiggExperimentModel.abGroup && this.toastColor == unLoginDiggExperimentModel.toastColor && this.dayCountLimit == unLoginDiggExperimentModel.dayCountLimit && this.totalCountLimit == unLoginDiggExperimentModel.totalCountLimit && o.LJ(this.preciseExpVid, unLoginDiggExperimentModel.preciseExpVid) && this.dataCap == unLoginDiggExperimentModel.dataCap && this.dataExpiration == unLoginDiggExperimentModel.dataExpiration && this.activeDays == unLoginDiggExperimentModel.activeDays && this.initTimestamp == unLoginDiggExperimentModel.initTimestamp;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.initTimestamp) + ((((((C79062V1e.LJ(this.preciseExpVid, ((((((this.abGroup * 31) + this.toastColor) * 31) + this.dayCountLimit) * 31) + this.totalCountLimit) * 31, 31) + this.dataCap) * 31) + this.dataExpiration) * 31) + this.activeDays) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UnLoginDiggExperimentModel(abGroup=");
            LIZ.append(this.abGroup);
            LIZ.append(", toastColor=");
            LIZ.append(this.toastColor);
            LIZ.append(", dayCountLimit=");
            LIZ.append(this.dayCountLimit);
            LIZ.append(", totalCountLimit=");
            LIZ.append(this.totalCountLimit);
            LIZ.append(", preciseExpVid=");
            LIZ.append(this.preciseExpVid);
            LIZ.append(", dataCap=");
            LIZ.append(this.dataCap);
            LIZ.append(", dataExpiration=");
            LIZ.append(this.dataExpiration);
            LIZ.append(", activeDays=");
            LIZ.append(this.activeDays);
            LIZ.append(", initTimestamp=");
            return C47135Ieh.LIZIZ(LIZ, this.initTimestamp, ')', LIZ);
        }

        public UnLoginDiggExperimentModel(int i, int i2, int i3, int i4, String preciseExpVid, int i5, int i6, int i7, long j) {
            o.LJIIIZ(preciseExpVid, "preciseExpVid");
            this.abGroup = i;
            this.toastColor = i2;
            this.dayCountLimit = i3;
            this.totalCountLimit = i4;
            this.preciseExpVid = preciseExpVid;
            this.dataCap = i5;
            this.dataExpiration = i6;
            this.activeDays = i7;
            this.initTimestamp = j;
        }

        public /* synthetic */ UnLoginDiggExperimentModel(int i, int i2, int i3, int i4, String str, int i5, int i6, int i7, long j, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? 1 : i, (i8 & 2) == 0 ? i2 : 1, (i8 & 4) != 0 ? -1 : i3, (i8 & 8) != 0 ? -1 : i4, (i8 & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i8 & 32) != 0 ? 50 : i5, (i8 & 64) != 0 ? 604800 : i6, (i8 & 128) == 0 ? i7 : -1, (i8 & 256) != 0 ? System.currentTimeMillis() : j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        LIZIZ = new UnLoginDiggExperimentModel(1, i, i, i, null, i, i, i, 0L, 510, 0 == true ? 1 : 0);
    }

    public static UnLoginDiggExperimentModel LIZ() {
        return (UnLoginDiggExperimentModel) LJFF.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZIZ.abGroup != LIZ().abGroup) {
            return true;
        }
        return false;
    }
}
