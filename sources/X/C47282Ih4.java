package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.List;

/* renamed from: X.Ih4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47282Ih4 {
    public Context LIZ;
    public ITZ LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public SparseIntArray LJFF;
    public SparseArray LJI;
    public C47286Ih8 LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final int LJIIJ;
    public InterfaceC47280Ih2 LJIIJJI;
    public C47279Ih1 LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public InterfaceC47412IjA LJIJJ;
    public final InterfaceC46841IZx LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public boolean LJJIIJZLJL;
    public final int LJJIIZ;
    public final int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public final boolean LJJIJL;
    public boolean LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public final boolean LJJJI;
    public final int LJJJIL;
    public final int LJJJJ;
    public C47274Igw LJJJJI;
    public boolean LJJJJIZL;
    public final boolean LJJJJJ;
    public final int LJJJJJL;
    public final int LJJJJL;
    public List<C46898Ias> LJJJJLI;

    public static C47282Ih4 LIZIZ() {
        return new C47282Ih4();
    }

    public final void LJ() {
        this.LJIIIIZZ |= 2;
    }

    public final void LJFF() {
        this.LJIIIIZZ |= 1;
    }

    public C47282Ih4() {
        this.LJIILIIL = true;
        this.LJIILJJIL = 1;
        this.LJIILLIIL = true;
        this.LJJIIZI = 30;
        this.LJJIJ = 576;
        this.LJJIJIIJI = 1024;
        this.LJJIJIL = true;
        this.LJJJIL = 2;
    }

    public C47282Ih4(C47283Ih5 c47283Ih5) {
        this.LJIILIIL = true;
        this.LJIILJJIL = 1;
        this.LJIILLIIL = true;
        this.LJJIIZI = 30;
        this.LJJIJ = 576;
        this.LJJIJIIJI = 1024;
        this.LJJIJIL = true;
        this.LJJJIL = 2;
        this.LIZ = c47283Ih5.LIZ;
        this.LIZIZ = c47283Ih5.LIZIZ;
        this.LIZJ = c47283Ih5.LJIIIIZZ;
        this.LIZLLL = c47283Ih5.LJIIIZ;
        this.LJ = c47283Ih5.LJIIJ;
        this.LJFF = c47283Ih5.LIZLLL;
        this.LJI = c47283Ih5.LJ;
        this.LJII = c47283Ih5.LJFF;
        this.LJIIIIZZ = c47283Ih5.LJIIJJI;
        this.LJIIIZ = c47283Ih5.LJIIL;
        this.LJIIJ = c47283Ih5.LJIILIIL;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = c47283Ih5.LJIILJJIL;
        this.LJIILJJIL = c47283Ih5.LJIILL;
        this.LJIILL = c47283Ih5.LJIILLIIL;
        this.LJIILLIIL = c47283Ih5.LJIIZILJ;
        this.LJIIZILJ = c47283Ih5.LJIJ;
        this.LJIJ = c47283Ih5.LJIJI;
        this.LJIJI = c47283Ih5.LJIJJ;
        this.LJIJJ = c47283Ih5.LIZJ;
        this.LJIJJLI = null;
        this.LJIL = c47283Ih5.LJIJJLI;
        this.LJJ = c47283Ih5.LJIL;
        this.LJJI = c47283Ih5.LJJ;
        this.LJJIFFI = c47283Ih5.LJJI;
        this.LJJII = c47283Ih5.LJJIFFI;
        this.LJJIII = c47283Ih5.LJJII;
        this.LJJIIJ = c47283Ih5.LJJIII;
        this.LJJIIJZLJL = c47283Ih5.LJJIIJ;
        this.LJJIIZ = c47283Ih5.LJJIIJZLJL;
        this.LJJIIZI = c47283Ih5.LJJIIZ;
        this.LJJIJ = c47283Ih5.LJJIIZI;
        this.LJJIJIIJI = c47283Ih5.LJJIJ;
        this.LJJIJIIJIL = c47283Ih5.LJJIJIIJI;
        this.LJJIJIL = c47283Ih5.LJJIJIIJIL;
        this.LJJIJL = c47283Ih5.LJJIJIL;
        this.LJJIJLIJ = c47283Ih5.LJJIJL;
        this.LJJIL = c47283Ih5.LJJIJLIJ;
        this.LJJIZ = c47283Ih5.LJJIL;
        this.LJJJ = c47283Ih5.LJJIZ;
        this.LJJJI = c47283Ih5.LJJJ;
        this.LJJJIL = c47283Ih5.LJJJI;
        this.LJJJJ = c47283Ih5.LJJJIL;
        this.LJJJJI = c47283Ih5.LJI;
        this.LJJJJIZL = c47283Ih5.LJJJJ;
        this.LJJJJJ = c47283Ih5.LJJJJI;
        this.LJJJJJL = c47283Ih5.LJJJJIZL;
        this.LJJJJL = c47283Ih5.LJJJJJ;
        this.LJJJJLI = c47283Ih5.LJII;
    }

    public final void LIZ(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(SparseArray sparseArray) {
        this.LJI = sparseArray;
    }

    public final void LIZLLL(SparseIntArray sparseIntArray) {
        this.LJFF = sparseIntArray;
    }

    public final void LJI(ITZ itz) {
        this.LIZIZ = itz;
    }
}
