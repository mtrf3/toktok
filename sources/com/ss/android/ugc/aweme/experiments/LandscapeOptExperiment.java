package com.ss.android.ugc.aweme.experiments;

import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes4.dex */
public final class LandscapeOptExperiment {
    public static final LandscapeOptFeature LIZ = new LandscapeOptFeature(false, false, false, false, false);

    /* loaded from: classes4.dex */
    public static final class LandscapeOptFeature {

        @InterfaceC65349Pkn("lazy_load_interaction_area")
        public final boolean lazyLoadInteractionArea;

        @InterfaceC65349Pkn("lazy_load_player_ui")
        public final boolean lazyLoadPlayerUI;

        @InterfaceC65349Pkn("lazy_load_speed_selector")
        public final boolean lazyLoadSpeedSelector;

        @InterfaceC65349Pkn("other_optimization")
        public final boolean otherOptimization;

        @InterfaceC65349Pkn("transition_optimization")
        public final boolean transitionOptimization;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LandscapeOptFeature)) {
                return false;
            }
            LandscapeOptFeature landscapeOptFeature = (LandscapeOptFeature) obj;
            return this.lazyLoadPlayerUI == landscapeOptFeature.lazyLoadPlayerUI && this.lazyLoadInteractionArea == landscapeOptFeature.lazyLoadInteractionArea && this.lazyLoadSpeedSelector == landscapeOptFeature.lazyLoadSpeedSelector && this.transitionOptimization == landscapeOptFeature.transitionOptimization && this.otherOptimization == landscapeOptFeature.otherOptimization;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        public final int hashCode() {
            boolean z = this.lazyLoadPlayerUI;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.lazyLoadInteractionArea;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.lazyLoadSpeedSelector;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            ?? r04 = this.transitionOptimization;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            return ((i5 + i6) * 31) + (this.otherOptimization ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LandscapeOptFeature(lazyLoadPlayerUI=");
            LIZ.append(this.lazyLoadPlayerUI);
            LIZ.append(", lazyLoadInteractionArea=");
            LIZ.append(this.lazyLoadInteractionArea);
            LIZ.append(", lazyLoadSpeedSelector=");
            LIZ.append(this.lazyLoadSpeedSelector);
            LIZ.append(", transitionOptimization=");
            LIZ.append(this.transitionOptimization);
            LIZ.append(", otherOptimization=");
            return C48339Iy7.LIZJ(LIZ, this.otherOptimization, ')', LIZ);
        }

        public LandscapeOptFeature(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.lazyLoadPlayerUI = z;
            this.lazyLoadInteractionArea = z2;
            this.lazyLoadSpeedSelector = z3;
            this.transitionOptimization = z4;
            this.otherOptimization = z5;
        }
    }

    public static final boolean LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        LandscapeOptFeature landscapeOptFeature = LIZ;
        LJIIIZ.getClass();
        LandscapeOptFeature landscapeOptFeature2 = (LandscapeOptFeature) FFL.LJIJ(true, "landscape_feed_optimization", 31744, LandscapeOptFeature.class, landscapeOptFeature);
        if (landscapeOptFeature2 != null) {
            return landscapeOptFeature2.lazyLoadInteractionArea;
        }
        return false;
    }

    public static final boolean LIZIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        LandscapeOptFeature landscapeOptFeature = LIZ;
        LJIIIZ.getClass();
        LandscapeOptFeature landscapeOptFeature2 = (LandscapeOptFeature) FFL.LJIJ(true, "landscape_feed_optimization", 31744, LandscapeOptFeature.class, landscapeOptFeature);
        if (landscapeOptFeature2 != null) {
            return landscapeOptFeature2.lazyLoadPlayerUI;
        }
        return false;
    }
}
