package X;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TC0 {
    public CharSequence LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final int LJFF;
    public Layout.Alignment LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;
    public TextUtils.TruncateAt LJIIJ;
    public int LJIIJJI;
    public TextDirectionHeuristic LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final boolean LJIILLIIL;
    public int LJIIZILJ;
    public final int LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public int LJIL;
    public final float LJJ;
    public int LJJI;
    public int LJJIFFI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TC0)) {
            return false;
        }
        TC0 tc0 = (TC0) obj;
        return o.LJ(this.LIZ, tc0.LIZ) && this.LIZIZ == tc0.LIZIZ && this.LIZJ == tc0.LIZJ && this.LIZLLL == tc0.LIZLLL && this.LJ == tc0.LJ && this.LJFF == tc0.LJFF && this.LJI == tc0.LJI && Float.compare(this.LJII, tc0.LJII) == 0 && Float.compare(this.LJIIIIZZ, tc0.LJIIIIZZ) == 0 && this.LJIIIZ == tc0.LJIIIZ && this.LJIIJ == tc0.LJIIJ && this.LJIIJJI == tc0.LJIIJJI && o.LJ(this.LJIIL, tc0.LJIIL) && this.LJIILIIL == tc0.LJIILIIL && this.LJIILJJIL == tc0.LJIILJJIL && this.LJIILL == tc0.LJIILL && this.LJIILLIIL == tc0.LJIILLIIL && this.LJIIZILJ == tc0.LJIIZILJ && this.LJIJ == tc0.LJIJ && Float.compare(this.LJIJI, tc0.LJIJI) == 0 && Float.compare(this.LJIJJ, tc0.LJIJJ) == 0 && Float.compare(this.LJIJJLI, tc0.LJIJJLI) == 0 && this.LJIL == tc0.LJIL && Float.compare(this.LJJ, tc0.LJJ) == 0 && this.LJJI == tc0.LJJI && this.LJJIFFI == tc0.LJJIFFI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        CharSequence charSequence = this.LIZ;
        int i = 0;
        if (charSequence == null) {
            hashCode = 0;
        } else {
            hashCode = charSequence.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJIIIIZZ, C47959Irz.LIZIZ(this.LJII, (this.LJI.hashCode() + (((((((((((hashCode * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31)) * 31, 31), 31);
        boolean z = this.LJIIIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LIZIZ + i3) * 31;
        TextUtils.TruncateAt truncateAt = this.LJIIJ;
        if (truncateAt != null) {
            i = truncateAt.hashCode();
        }
        int hashCode2 = (((((((this.LJIIL.hashCode() + ((((i4 + i) * 31) + this.LJIIJJI) * 31)) * 31) + this.LJIILIIL) * 31) + this.LJIILJJIL) * 31) + this.LJIILL) * 31;
        if (!this.LJIILLIIL) {
            i2 = 0;
        }
        return ((C47959Irz.LIZIZ(this.LJJ, (C47959Irz.LIZIZ(this.LJIJJLI, C47959Irz.LIZIZ(this.LJIJJ, C47959Irz.LIZIZ(this.LJIJI, (((((hashCode2 + i2) * 31) + this.LJIIZILJ) * 31) + this.LJIJ) * 31, 31), 31), 31) + this.LJIL) * 31, 31) + this.LJJI) * 31) + this.LJJIFFI;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutParams(text=");
        sb.append((Object) this.LIZ);
        sb.append(", maxLines=");
        sb.append(this.LIZIZ);
        sb.append(", measureMode=");
        sb.append(this.LIZJ);
        sb.append(", width=");
        sb.append(this.LIZLLL);
        sb.append(", maxWidth=");
        sb.append(this.LJ);
        sb.append(", minWidth=");
        sb.append(this.LJFF);
        sb.append(", alignment=");
        sb.append(this.LJI);
        sb.append(", spacingMult=");
        sb.append(this.LJII);
        sb.append(", spacingAdd=");
        sb.append(this.LJIIIIZZ);
        sb.append(", includePadding=");
        sb.append(this.LJIIIZ);
        sb.append(", ellipsize=");
        sb.append(this.LJIIJ);
        sb.append(", ellipsizedWidth=");
        sb.append(this.LJIIJJI);
        sb.append(", textDirectionHeuristic=");
        sb.append(this.LJIIL);
        sb.append(", breakStrategy=");
        sb.append(this.LJIILIIL);
        sb.append(", hyphenationFrequency=");
        sb.append(this.LJIILJJIL);
        sb.append(", justificationMode=");
        sb.append(this.LJIILL);
        sb.append(", useLineSpacingFromFallbacks=");
        sb.append(this.LJIILLIIL);
        sb.append(", textColor=");
        sb.append(this.LJIIZILJ);
        sb.append(", linkColor=");
        sb.append(this.LJIJ);
        sb.append(", shadowDx=");
        sb.append(this.LJIJI);
        sb.append(", shadowDy=");
        sb.append(this.LJIJJ);
        sb.append(", shadowRadius=");
        sb.append(this.LJIJJLI);
        sb.append(", shadowColor=");
        sb.append(this.LJIL);
        sb.append(", letterSpacing=");
        sb.append(this.LJJ);
        sb.append(", font=");
        sb.append(this.LJJI);
        sb.append(", lineHeight=");
        return UPJ.LIZLLL(sb, this.LJJIFFI, ')');
    }

    public TC0(Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        o.LJIIIZ(alignment, "alignment");
        this.LIZ = null;
        this.LIZIZ = Integer.MAX_VALUE;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = Integer.MAX_VALUE;
        this.LJFF = 0;
        this.LJI = alignment;
        this.LJII = 1.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = true;
        this.LJIIJ = null;
        this.LJIIJJI = 0;
        this.LJIIL = textDirectionHeuristic;
        this.LJIILIIL = 0;
        this.LJIILJJIL = 0;
        this.LJIILL = 0;
        this.LJIILLIIL = false;
        this.LJIIZILJ = i;
        this.LJIJ = i2;
        this.LJIJI = 0.0f;
        this.LJIJJ = 0.0f;
        this.LJIJJLI = 0.0f;
        this.LJIL = 0;
        this.LJJ = 0.0f;
        this.LJJI = -1;
        this.LJJIFFI = 0;
    }
}
