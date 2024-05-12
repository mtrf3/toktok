package com.ss.android.ugc.aweme.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.MIU;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class EffectDetailVideoListExperiment {
    public static final EffectDetailVideoListExperimentConfig LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes10.dex */
    public static final class EffectDetailVideoListExperimentConfig {

        @InterfaceC65349Pkn("count")
        public final int count;

        @InterfaceC65349Pkn("on")
        public final boolean on;

        /* JADX WARN: Multi-variable type inference failed */
        public EffectDetailVideoListExperimentConfig() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EffectDetailVideoListExperimentConfig)) {
                return false;
            }
            EffectDetailVideoListExperimentConfig effectDetailVideoListExperimentConfig = (EffectDetailVideoListExperimentConfig) obj;
            return this.on == effectDetailVideoListExperimentConfig.on && this.count == effectDetailVideoListExperimentConfig.count;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.on;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.count;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectDetailVideoListExperimentConfig(on=");
            LIZ.append(this.on);
            LIZ.append(", count=");
            return b0.LIZJ(LIZ, this.count, ')', LIZ);
        }

        public EffectDetailVideoListExperimentConfig(boolean z, int i) {
            this.on = z;
            this.count = i;
        }

        public /* synthetic */ EffectDetailVideoListExperimentConfig(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 20 : i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        LIZ = new EffectDetailVideoListExperimentConfig(false, objArr, 3, null);
        LIZIZ = C221108m2.LIZIZ(MIU.LJLIL);
    }
}
