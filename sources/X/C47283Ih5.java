package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ih5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47283Ih5 {
    public final Context LIZ;
    public final ITZ LIZIZ;
    public final InterfaceC47412IjA LIZJ;
    public final SparseIntArray LIZLLL;
    public final SparseArray LJ;
    public final C47286Ih8 LJFF;
    public final C47274Igw LJI;
    public final List<C46898Ias> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final boolean LJIJJLI;
    public final int LJIL;
    public final int LJJ;
    public final int LJJI;
    public final boolean LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final boolean LJJIIJ;
    public final int LJJIIJZLJL;
    public final int LJJIIZ;
    public final int LJJIIZI;
    public final int LJJIJ;
    public final boolean LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final boolean LJJIJIL;
    public final boolean LJJIJL;
    public final int LJJIJLIJ;
    public final int LJJIL;
    public final int LJJIZ;
    public final boolean LJJJ;
    public final int LJJJI;
    public final int LJJJIL;
    public final boolean LJJJJ;
    public final boolean LJJJJI;
    public final int LJJJJIZL;
    public final int LJJJJJ;

    public final C47282Ih4 LIZ() {
        return new C47282Ih4(this);
    }

    public C47283Ih5(C47282Ih4 c47282Ih4, Context context, ITZ itz, C1EU c1eu, InterfaceC47412IjA interfaceC47412IjA) {
        SparseIntArray clone;
        SparseArray clone2;
        C47286Ih8 c47286Ih8;
        C47274Igw c47274Igw;
        this.LIZ = context;
        this.LIZIZ = itz;
        this.LIZJ = interfaceC47412IjA;
        SparseIntArray sparseIntArray = c47282Ih4.LJFF;
        if (sparseIntArray == null) {
            clone = null;
        } else {
            clone = sparseIntArray.clone();
        }
        this.LIZLLL = clone;
        SparseArray sparseArray = c47282Ih4.LJI;
        if (sparseArray == null) {
            clone2 = null;
        } else {
            clone2 = sparseArray.clone();
        }
        this.LJ = clone2;
        C47286Ih8 c47286Ih82 = c47282Ih4.LJII;
        if (c47286Ih82 == null) {
            c47286Ih8 = null;
        } else {
            c47286Ih8 = new C47286Ih8(new C47287Ih9(c47286Ih82));
        }
        this.LJFF = c47286Ih8;
        C47274Igw c47274Igw2 = c47282Ih4.LJJJJI;
        if (c47274Igw2 == null) {
            c47274Igw = null;
        } else {
            c47274Igw = new C47274Igw(new C47275Igx(c47274Igw2));
        }
        this.LJI = c47274Igw;
        this.LJII = c47282Ih4.LJJJJLI != null ? new ArrayList(c47282Ih4.LJJJJLI) : null;
        this.LJIIIIZZ = c47282Ih4.LIZJ;
        this.LJIIIZ = c47282Ih4.LIZLLL;
        this.LJIIJ = c47282Ih4.LJ;
        this.LJIIJJI = c47282Ih4.LJIIIIZZ;
        this.LJIIL = c47282Ih4.LJIIIZ;
        this.LJIILIIL = c47282Ih4.LJIIJ;
        this.LJIILJJIL = c47282Ih4.LJIILIIL;
        this.LJIILL = c47282Ih4.LJIILJJIL;
        this.LJIILLIIL = c47282Ih4.LJIILL;
        this.LJIIZILJ = c47282Ih4.LJIILLIIL;
        this.LJIJ = c47282Ih4.LJIIZILJ;
        this.LJIJI = c47282Ih4.LJIJ;
        this.LJIJJ = c47282Ih4.LJIJI;
        this.LJIJJLI = c47282Ih4.LJIL;
        this.LJIL = c47282Ih4.LJJ;
        this.LJJ = c47282Ih4.LJJI;
        this.LJJI = c47282Ih4.LJJIFFI;
        this.LJJIFFI = c47282Ih4.LJJII;
        this.LJJII = c47282Ih4.LJJIII;
        this.LJJIII = c47282Ih4.LJJIIJ;
        this.LJJIIJ = c47282Ih4.LJJIIJZLJL;
        this.LJJIIJZLJL = c47282Ih4.LJJIIZ;
        this.LJJIIZ = c47282Ih4.LJJIIZI;
        this.LJJIIZI = c47282Ih4.LJJIJ;
        this.LJJIJ = c47282Ih4.LJJIJIIJI;
        this.LJJIJIIJI = c47282Ih4.LJJIJIIJIL;
        this.LJJIJIIJIL = c47282Ih4.LJJIJIL;
        this.LJJIJIL = c47282Ih4.LJJIJL;
        this.LJJIJL = c47282Ih4.LJJIJLIJ;
        this.LJJIJLIJ = c47282Ih4.LJJIL;
        this.LJJIL = c47282Ih4.LJJIZ;
        this.LJJIZ = c47282Ih4.LJJJ;
        this.LJJJ = c47282Ih4.LJJJI;
        this.LJJJI = c47282Ih4.LJJJIL;
        this.LJJJIL = c47282Ih4.LJJJJ;
        this.LJJJJ = c47282Ih4.LJJJJIZL;
        this.LJJJJI = c47282Ih4.LJJJJJ;
        this.LJJJJIZL = c47282Ih4.LJJJJJL;
        this.LJJJJJ = c47282Ih4.LJJJJL;
    }
}
