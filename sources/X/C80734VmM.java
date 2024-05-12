package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import kotlin.jvm.internal.o;

/* renamed from: X.VmM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80734VmM extends AbstractC80736VmO {
    public final SideSheetBehavior<? extends View> LIZ;

    @Override // X.AbstractC80736VmO
    public final boolean LJIIIIZZ(float f) {
        return f > 0.0f;
    }

    @Override // X.AbstractC80736VmO
    public final int LIZJ() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.LIZ;
        return Math.max(0, sideSheetBehavior.LJIIJJI + sideSheetBehavior.LJIIL);
    }

    @Override // X.AbstractC80736VmO
    public final int LIZLLL() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.LIZ;
        return (-sideSheetBehavior.LJIIIZ) - sideSheetBehavior.LJIIL;
    }

    @Override // X.AbstractC80736VmO
    public final int LJ() {
        return this.LIZ.LJIIL;
    }

    @Override // X.AbstractC80736VmO
    public final int LJFF() {
        return -this.LIZ.LJIIIZ;
    }

    public C80734VmM(SideSheetBehavior<? extends View> sheetBehavior) {
        o.LJIIIZ(sheetBehavior, "sheetBehavior");
        this.LIZ = sheetBehavior;
    }

    @Override // X.AbstractC80736VmO
    public final int LIZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // X.AbstractC80736VmO
    public final float LIZIZ(int i) {
        return (i - LIZLLL()) / (LIZJ() - LIZLLL());
    }

    @Override // X.AbstractC80736VmO
    public final <V extends View> int LJI(V v) {
        o.LJI(v);
        return v.getRight() + this.LIZ.LJIIL;
    }

    @Override // X.AbstractC80736VmO
    public final int LJII(C45621qg parent) {
        o.LJIIIZ(parent, "parent");
        return parent.getLeft();
    }

    @Override // X.AbstractC80736VmO
    public final boolean LJIIIZ(View releasedChild) {
        o.LJIIIZ(releasedChild, "releasedChild");
        if (releasedChild.getRight() < (LIZJ() - LIZLLL()) / 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC80736VmO
    public final boolean LJIIJ(float f, float f2) {
        if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC80736VmO
    public final boolean LJIIJJI(View child, float f) {
        o.LJIIIZ(child, "child");
        if (Math.abs((f * this.LIZ.LIZIZ) + child.getLeft()) > 0.5f) {
            return true;
        }
        return false;
    }
}
