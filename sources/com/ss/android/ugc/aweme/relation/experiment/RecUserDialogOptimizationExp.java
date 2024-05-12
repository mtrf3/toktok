package com.ss.android.ugc.aweme.relation.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.C87546YXm;
import X.C87547YXn;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class RecUserDialogOptimizationExp {
    public static final RecUserDialogOptimizationConfig LIZ = new RecUserDialogOptimizationConfig(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87546YXm.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87547YXn.LJLIL);

    /* loaded from: classes5.dex */
    public static final class RecUserDialogOptimizationConfig {

        @InterfaceC65349Pkn("rec_user_optimization_enabled")
        public boolean enableUIOptimizations;

        @InterfaceC65349Pkn("dialog_resize_frequency")
        public int recUserDialogResizeFrequency;

        @InterfaceC65349Pkn("rec_user_fetch_count")
        public int recUserInitialFetchCount;

        /* JADX WARN: Multi-variable type inference failed */
        public RecUserDialogOptimizationConfig() {
            this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecUserDialogOptimizationConfig)) {
                return false;
            }
            RecUserDialogOptimizationConfig recUserDialogOptimizationConfig = (RecUserDialogOptimizationConfig) obj;
            return this.recUserDialogResizeFrequency == recUserDialogOptimizationConfig.recUserDialogResizeFrequency && this.enableUIOptimizations == recUserDialogOptimizationConfig.enableUIOptimizations && this.recUserInitialFetchCount == recUserDialogOptimizationConfig.recUserInitialFetchCount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.recUserDialogResizeFrequency * 31;
            boolean z = this.enableUIOptimizations;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return ((i + i2) * 31) + this.recUserInitialFetchCount;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RecUserDialogOptimizationConfig(recUserDialogResizeFrequency=");
            LIZ.append(this.recUserDialogResizeFrequency);
            LIZ.append(", enableUIOptimizations=");
            LIZ.append(this.enableUIOptimizations);
            LIZ.append(", recUserInitialFetchCount=");
            return b0.LIZJ(LIZ, this.recUserInitialFetchCount, ')', LIZ);
        }

        public RecUserDialogOptimizationConfig(int i, boolean z, int i2) {
            this.recUserDialogResizeFrequency = i;
            this.enableUIOptimizations = z;
            this.recUserInitialFetchCount = i2;
        }

        public /* synthetic */ RecUserDialogOptimizationConfig(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 60 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 30 : i2);
        }
    }
}
