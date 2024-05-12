package com.ss.android.ugc.aweme.im.sdk.chat.experiment;

import X.C221108m2;
import X.C4GF;
import X.C4GG;
import X.C4GH;
import X.C4GI;
import X.C4GJ;
import X.C4GK;
import X.C4GL;
import X.C4GM;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SuggestedReplyExperiment {
    public static final SuggestedReplyConfig LIZ = new SuggestedReplyConfig(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C4GG.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C4GF.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C4GK.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C4GI.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C4GH.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C4GJ.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C4GL.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C4GM.LJLIL);

    /* loaded from: classes2.dex */
    public static final class SuggestedReplyConfig {

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        @InterfaceC65349Pkn("phase_one_hide_days")
        public final int phaseOneHideDays;

        @InterfaceC65349Pkn("phase_one_show_count")
        public final int phaseOneShowCount;

        @InterfaceC65349Pkn("phase_two_hide_days")
        public final int phaseTwoHideDays;

        @InterfaceC65349Pkn("phase_two_show_count")
        public final int phaseTwoShowCount;

        /* JADX WARN: Multi-variable type inference failed */
        public SuggestedReplyConfig() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
        }

        public static /* synthetic */ SuggestedReplyConfig copy$default(SuggestedReplyConfig suggestedReplyConfig, boolean z, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z = suggestedReplyConfig.enabled;
            }
            if ((i5 & 2) != 0) {
                i = suggestedReplyConfig.phaseOneShowCount;
            }
            if ((i5 & 4) != 0) {
                i2 = suggestedReplyConfig.phaseTwoShowCount;
            }
            if ((i5 & 8) != 0) {
                i3 = suggestedReplyConfig.phaseOneHideDays;
            }
            if ((i5 & 16) != 0) {
                i4 = suggestedReplyConfig.phaseTwoHideDays;
            }
            return suggestedReplyConfig.copy(z, i, i2, i3, i4);
        }

        public final SuggestedReplyConfig copy(boolean z, int i, int i2, int i3, int i4) {
            return new SuggestedReplyConfig(z, i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestedReplyConfig)) {
                return false;
            }
            SuggestedReplyConfig suggestedReplyConfig = (SuggestedReplyConfig) obj;
            return this.enabled == suggestedReplyConfig.enabled && this.phaseOneShowCount == suggestedReplyConfig.phaseOneShowCount && this.phaseTwoShowCount == suggestedReplyConfig.phaseTwoShowCount && this.phaseOneHideDays == suggestedReplyConfig.phaseOneHideDays && this.phaseTwoHideDays == suggestedReplyConfig.phaseTwoHideDays;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((((r0 * 31) + this.phaseOneShowCount) * 31) + this.phaseTwoShowCount) * 31) + this.phaseOneHideDays) * 31) + this.phaseTwoHideDays;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SuggestedReplyConfig(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", phaseOneShowCount=");
            LIZ.append(this.phaseOneShowCount);
            LIZ.append(", phaseTwoShowCount=");
            LIZ.append(this.phaseTwoShowCount);
            LIZ.append(", phaseOneHideDays=");
            LIZ.append(this.phaseOneHideDays);
            LIZ.append(", phaseTwoHideDays=");
            return b0.LIZJ(LIZ, this.phaseTwoHideDays, ')', LIZ);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getPhaseOneHideDays() {
            return this.phaseOneHideDays;
        }

        public final int getPhaseOneShowCount() {
            return this.phaseOneShowCount;
        }

        public final int getPhaseTwoHideDays() {
            return this.phaseTwoHideDays;
        }

        public final int getPhaseTwoShowCount() {
            return this.phaseTwoShowCount;
        }

        public SuggestedReplyConfig(boolean z, int i, int i2, int i3, int i4) {
            this.enabled = z;
            this.phaseOneShowCount = i;
            this.phaseTwoShowCount = i2;
            this.phaseOneHideDays = i3;
            this.phaseTwoHideDays = i4;
        }

        public /* synthetic */ SuggestedReplyConfig(boolean z, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? 2 : i, (i5 & 4) != 0 ? 4 : i2, (i5 & 8) != 0 ? 14 : i3, (i5 & 16) != 0 ? 30 : i4);
        }
    }

    public static SuggestedReplyConfig LIZ() {
        return (SuggestedReplyConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LJFF.getValue()).booleanValue();
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static boolean LJ() {
        return ((Boolean) LJII.getValue()).booleanValue();
    }
}
