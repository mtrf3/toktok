package com.ss.android.ugc.aweme.feed.landscape.experiments;

import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes9.dex */
public final class LandscapeRefactorExperiment {
    public static final LandscapeRefactorExperiment LIZ = new LandscapeRefactorExperiment();
    public static final RefactorFeature LIZIZ = new RefactorFeature(false, false, false, false, false);

    public static boolean LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RefactorFeature refactorFeature = LIZIZ;
        LJIIIZ.getClass();
        RefactorFeature refactorFeature2 = (RefactorFeature) FFL.LJIJ(true, "landscape_feed_refactor", 31744, RefactorFeature.class, refactorFeature);
        if (refactorFeature2 == null) {
            return true;
        }
        return refactorFeature2.dataLoadLogicComponent;
    }

    public static boolean LIZIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RefactorFeature refactorFeature = LIZIZ;
        LJIIIZ.getClass();
        RefactorFeature refactorFeature2 = (RefactorFeature) FFL.LJIJ(true, "landscape_feed_refactor", 31744, RefactorFeature.class, refactorFeature);
        if (refactorFeature2 == null) {
            return true;
        }
        return refactorFeature2.earphonePlayerControlComponent;
    }

    public static boolean LIZJ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RefactorFeature refactorFeature = LIZIZ;
        LJIIIZ.getClass();
        RefactorFeature refactorFeature2 = (RefactorFeature) FFL.LJIJ(true, "landscape_feed_refactor", 31744, RefactorFeature.class, refactorFeature);
        if (refactorFeature2 == null) {
            return true;
        }
        return refactorFeature2.playerComponent;
    }

    public static boolean LJ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RefactorFeature refactorFeature = LIZIZ;
        LJIIIZ.getClass();
        RefactorFeature refactorFeature2 = (RefactorFeature) FFL.LJIJ(true, "landscape_feed_refactor", 31744, RefactorFeature.class, refactorFeature);
        if (refactorFeature2 == null) {
            return true;
        }
        return refactorFeature2.viewpagerComponent;
    }

    /* loaded from: classes9.dex */
    public static final class RefactorFeature {

        @InterfaceC65349Pkn("data_load_logic_component")
        public final boolean dataLoadLogicComponent;

        @InterfaceC65349Pkn("data_load_ui_component")
        public final boolean dataLoadUiComponent;

        @InterfaceC65349Pkn("earphone_player_control_component")
        public final boolean earphonePlayerControlComponent;

        @InterfaceC65349Pkn("player_component")
        public final boolean playerComponent;

        @InterfaceC65349Pkn("viewpager_component")
        public final boolean viewpagerComponent;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefactorFeature)) {
                return false;
            }
            RefactorFeature refactorFeature = (RefactorFeature) obj;
            return this.playerComponent == refactorFeature.playerComponent && this.viewpagerComponent == refactorFeature.viewpagerComponent && this.dataLoadLogicComponent == refactorFeature.dataLoadLogicComponent && this.earphonePlayerControlComponent == refactorFeature.earphonePlayerControlComponent && this.dataLoadUiComponent == refactorFeature.dataLoadUiComponent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        public final int hashCode() {
            boolean z = this.playerComponent;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.viewpagerComponent;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.dataLoadLogicComponent;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            ?? r04 = this.earphonePlayerControlComponent;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            return ((i5 + i6) * 31) + (this.dataLoadUiComponent ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RefactorFeature(playerComponent=");
            LIZ.append(this.playerComponent);
            LIZ.append(", viewpagerComponent=");
            LIZ.append(this.viewpagerComponent);
            LIZ.append(", dataLoadLogicComponent=");
            LIZ.append(this.dataLoadLogicComponent);
            LIZ.append(", earphonePlayerControlComponent=");
            LIZ.append(this.earphonePlayerControlComponent);
            LIZ.append(", dataLoadUiComponent=");
            return C48339Iy7.LIZJ(LIZ, this.dataLoadUiComponent, ')', LIZ);
        }

        public RefactorFeature(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.playerComponent = z;
            this.viewpagerComponent = z2;
            this.dataLoadLogicComponent = z3;
            this.earphonePlayerControlComponent = z4;
            this.dataLoadUiComponent = z5;
        }
    }

    public static boolean LIZLLL() {
        if (LJ() || LIZJ() || LIZ()) {
            return true;
        }
        return false;
    }
}
