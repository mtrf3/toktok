package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVC implements C33Q {
    public final boolean LJLIL;
    public final C206898Ab LJLILLLLZI;
    public final RVE LJLJI;
    public final Y07 LJLJJI;
    public final boolean LJLJJL;

    public RVC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVC)) {
            return false;
        }
        RVC rvc = (RVC) obj;
        return this.LJLIL == rvc.LJLIL && o.LJ(this.LJLILLLLZI, rvc.LJLILLLLZI) && o.LJ(this.LJLJI, rvc.LJLJI) && o.LJ(this.LJLJJI, rvc.LJLJJI) && this.LJLJJL == rvc.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LJLJI.hashCode() + ((this.LJLILLLLZI.hashCode() + (r0 * 31)) * 31)) * 31;
        Y07 y07 = this.LJLJJI;
        return ((hashCode + (y07 == null ? 0 : y07.hashCode())) * 31) + (this.LJLJJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCrossLanguageState(showCaptions=");
        LIZ.append(this.LJLIL);
        LIZ.append(", updateCaptionUI=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", updateDebug=");
        LIZ.append(this.LJLJI);
        LIZ.append(", decorationModelUpdate=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", showGuidedTooltip=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ RVC(int i) {
        this(false, new C206898Ab(false), new RVE(false, ""), null, false);
    }

    public RVC(boolean z, C206898Ab updateCaptionUI, RVE updateDebug, Y07 y07, boolean z2) {
        o.LJIIIZ(updateCaptionUI, "updateCaptionUI");
        o.LJIIIZ(updateDebug, "updateDebug");
        this.LJLIL = z;
        this.LJLILLLLZI = updateCaptionUI;
        this.LJLJI = updateDebug;
        this.LJLJJI = y07;
        this.LJLJJL = z2;
    }

    public static RVC LIZ(RVC rvc, boolean z, C206898Ab c206898Ab, RVE rve, Y07 y07, boolean z2, int i) {
        boolean z3 = z2;
        Y07 y072 = y07;
        RVE updateDebug = rve;
        boolean z4 = z;
        C206898Ab updateCaptionUI = c206898Ab;
        if ((i & 1) != 0) {
            z4 = rvc.LJLIL;
        }
        if ((i & 2) != 0) {
            updateCaptionUI = rvc.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            updateDebug = rvc.LJLJI;
        }
        if ((i & 8) != 0) {
            y072 = rvc.LJLJJI;
        }
        if ((i & 16) != 0) {
            z3 = rvc.LJLJJL;
        }
        rvc.getClass();
        o.LJIIIZ(updateCaptionUI, "updateCaptionUI");
        o.LJIIIZ(updateDebug, "updateDebug");
        return new RVC(z4, updateCaptionUI, updateDebug, y072, z3);
    }
}
