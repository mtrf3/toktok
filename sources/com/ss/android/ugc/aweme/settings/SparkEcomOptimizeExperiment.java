package com.ss.android.ugc.aweme.settings;

import X.C221108m2;
import X.C35120DqO;
import X.C48339Iy7;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SparkEcomOptimizeExperiment {
    public static final EcomOptimizeModel LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes7.dex */
    public static final class EcomOptimizeModel {

        @InterfaceC65349Pkn("spark_create_container_opt")
        public final boolean enableSparkCreateContainerOpt;

        @InterfaceC65349Pkn("spark_prefetch_opt")
        public final boolean enableSparkPrefetchOpt;

        @InterfaceC65349Pkn("spark_use_spark_opt")
        public final boolean enableSparkUseSparkOpt;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EcomOptimizeModel() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.SparkEcomOptimizeExperiment.EcomOptimizeModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomOptimizeModel)) {
                return false;
            }
            EcomOptimizeModel ecomOptimizeModel = (EcomOptimizeModel) obj;
            return this.enableSparkCreateContainerOpt == ecomOptimizeModel.enableSparkCreateContainerOpt && this.enableSparkPrefetchOpt == ecomOptimizeModel.enableSparkPrefetchOpt && this.enableSparkUseSparkOpt == ecomOptimizeModel.enableSparkUseSparkOpt;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enableSparkCreateContainerOpt;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.enableSparkPrefetchOpt;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            return ((i + i2) * 31) + (this.enableSparkUseSparkOpt ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomOptimizeModel(enableSparkCreateContainerOpt=");
            LIZ.append(this.enableSparkCreateContainerOpt);
            LIZ.append(", enableSparkPrefetchOpt=");
            LIZ.append(this.enableSparkPrefetchOpt);
            LIZ.append(", enableSparkUseSparkOpt=");
            return C48339Iy7.LIZJ(LIZ, this.enableSparkUseSparkOpt, ')', LIZ);
        }

        public EcomOptimizeModel(boolean z, boolean z2, boolean z3) {
            this.enableSparkCreateContainerOpt = z;
            this.enableSparkPrefetchOpt = z2;
            this.enableSparkUseSparkOpt = z3;
        }

        public /* synthetic */ EcomOptimizeModel(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }

    static {
        boolean z = false;
        LIZ = new EcomOptimizeModel(z, z, z, 7, null);
        new EcomOptimizeModel(true, true, true);
        LIZIZ = C221108m2.LIZIZ(C35120DqO.LJLIL);
    }
}
