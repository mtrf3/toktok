package X;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;

/* renamed from: X.VRj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79743VRj {
    public Integer LIZJ;
    public int LJ;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIL;
    public C79729VQv LJIJJLI;
    public int LJIL;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZLLL = 3;
    public int LJFF = -1;
    public float LJIIJ = 1.0E21f;
    public float LJIIJJI = 1.0E21f;
    public float LJIILIIL = Math.round(V9Y.LIZ(14.0f));
    public C79754VRu LJIILJJIL = null;
    public float LJIILL = 0.0f;
    public boolean LJIILLIIL = false;
    public boolean LJIIZILJ = false;
    public boolean LJIJ = false;
    public String LJIJI = null;
    public int LJIJJ = 0;
    public int LJJ = 4;
    public int LJJI = 0;
    public int LJJIFFI = 0;
    public float LJJII = 0.0f;
    public VRP LJJIII = null;

    public final TextDirectionHeuristic LIZ() {
        int i = this.LJ;
        if (i == 0) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return TextDirectionHeuristics.LTR;
        }
        return TextDirectionHeuristics.RTL;
    }

    public final int LIZJ() {
        int i = this.LJI;
        if (i == 1) {
            if (this.LJII == 2) {
                return 3;
            }
            return i;
        }
        if (i == 1) {
            return i;
        }
        int i2 = this.LJII;
        if (i2 == 2) {
            return i2;
        }
        return 0;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i2 = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -16777216;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJIILIIL, C47959Irz.LIZIZ(this.LJIIL, C47959Irz.LIZIZ(this.LJIIJJI, C47959Irz.LIZIZ(this.LJIIJ, (((((((((((i2 + i) * 31) + this.LIZLLL) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31, 31), 31), 31), 31);
        C79754VRu c79754VRu = this.LJIILJJIL;
        int i3 = 0;
        if (c79754VRu == null) {
            hashCode = 0;
        } else {
            hashCode = c79754VRu.hashCode();
        }
        int LIZIZ2 = (((((C47959Irz.LIZIZ(this.LJIILL, (LIZIZ + hashCode) * 31, 31) + (this.LJIILLIIL ? 1 : 0)) * 31) + (this.LJIIZILJ ? 1 : 0)) * 31) + (this.LJIJ ? 1 : 0)) * 31;
        String str = this.LJIJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (LIZIZ2 + hashCode2) * 31;
        C79729VQv c79729VQv = this.LJIJJLI;
        if (c79729VQv == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c79729VQv.hashCode();
        }
        int LIZIZ3 = (((C47959Irz.LIZIZ(this.LJJII, (((((((i4 + hashCode3) * 31) + this.LJIL) * 31) + this.LJJ) * 31) + this.LJJI) * 31, 31) + this.LJJIFFI) * 31) + this.LJ) * 31;
        VRP vrp = this.LJJIII;
        if (vrp != null) {
            i3 = vrp.hashCode();
        }
        return ((LIZIZ3 + i3) * 31) + this.LJIJJ;
    }

    public final Layout.Alignment LIZIZ(boolean z) {
        int i = this.LIZLLL;
        if (i == 0) {
            int i2 = this.LJ;
            if (i2 == 0) {
                if (z) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (i2 == 3) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i == 2) {
            int i3 = this.LJ;
            if (i3 == 0) {
                if (z) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i3 == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79743VRj)) {
            return false;
        }
        C79743VRj c79743VRj = (C79743VRj) obj;
        if (this.LIZ != c79743VRj.LIZ || this.LIZIZ != c79743VRj.LIZIZ) {
            return false;
        }
        Integer num = c79743VRj.LIZJ;
        Integer num2 = this.LIZJ;
        if (num2 != null) {
            if (num == null || !num2.equals(num)) {
                return false;
            }
        } else if (num != null) {
            return false;
        }
        if (this.LIZLLL != c79743VRj.LIZLLL || this.LJFF != c79743VRj.LJFF || this.LJI != c79743VRj.LJI || this.LJII != c79743VRj.LJII || this.LJIIIIZZ != c79743VRj.LJIIIIZZ || this.LJIIIZ != c79743VRj.LJIIIZ || this.LJIIJ != c79743VRj.LJIIJ || this.LJIIJJI != c79743VRj.LJIIJJI || this.LJIIL != c79743VRj.LJIIL || this.LJIILIIL != c79743VRj.LJIILIIL || this.LJIILJJIL != c79743VRj.LJIILJJIL || this.LJIILL != c79743VRj.LJIILL || this.LJIILLIIL != c79743VRj.LJIILLIIL || this.LJIIZILJ != c79743VRj.LJIIZILJ || this.LJIJ != c79743VRj.LJIJ || !TextUtils.equals(this.LJIJI, c79743VRj.LJIJI) || this.LJIJJLI != c79743VRj.LJIJJLI || this.LJIL != c79743VRj.LJIL || this.LJ != c79743VRj.LJ || this.LJJI != c79743VRj.LJJI || this.LJJ != c79743VRj.LJJ || this.LJJIFFI != c79743VRj.LJJIFFI || this.LJJII != c79743VRj.LJJII || this.LJIJJ != c79743VRj.LJIJJ) {
            return false;
        }
        return true;
    }
}
