package com.ss.android.ugc.aweme.feed.experiment;

import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes10.dex */
public final class FeedTouchProtectionExperiment {
    public static final TouchProtectionModel LIZ = new TouchProtectionModel(false, false);
    public static TouchProtectionModel LIZIZ;

    /* loaded from: classes10.dex */
    public static final class TouchProtectionModel {

        @InterfaceC65349Pkn("enable_left_interaction")
        public final boolean enableLeftInteraction;

        @InterfaceC65349Pkn("enable_touch_protection")
        public final boolean enableTouchProtection;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TouchProtectionModel)) {
                return false;
            }
            TouchProtectionModel touchProtectionModel = (TouchProtectionModel) obj;
            return this.enableTouchProtection == touchProtectionModel.enableTouchProtection && this.enableLeftInteraction == touchProtectionModel.enableLeftInteraction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enableTouchProtection;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.enableLeftInteraction ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TouchProtectionModel(enableTouchProtection=");
            LIZ.append(this.enableTouchProtection);
            LIZ.append(", enableLeftInteraction=");
            return C48339Iy7.LIZJ(LIZ, this.enableLeftInteraction, ')', LIZ);
        }

        public TouchProtectionModel(boolean z, boolean z2) {
            this.enableTouchProtection = z;
            this.enableLeftInteraction = z2;
        }
    }

    public static boolean LIZ() {
        if (LIZIZ == null) {
            FFL LJIIIZ = FFL.LJIIIZ();
            TouchProtectionModel touchProtectionModel = LIZ;
            LJIIIZ.getClass();
            TouchProtectionModel touchProtectionModel2 = (TouchProtectionModel) FFL.LJIJ(true, "touch_protection_configuration", 31744, TouchProtectionModel.class, touchProtectionModel);
            if (touchProtectionModel2 != null) {
                touchProtectionModel = touchProtectionModel2;
            }
            LIZIZ = touchProtectionModel;
        }
        TouchProtectionModel touchProtectionModel3 = LIZIZ;
        if (touchProtectionModel3 != null && (touchProtectionModel3.enableTouchProtection || touchProtectionModel3.enableLeftInteraction)) {
            return true;
        }
        return false;
    }
}
