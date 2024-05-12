package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import kotlin.jvm.internal.o;

/* renamed from: X.VmN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80735VmN extends AbstractC80736VmO {
    public final SideSheetBehavior<? extends View> LIZ;

    @Override // X.AbstractC80736VmO
    public final boolean LJIIIIZZ(float f) {
        return f < 0.0f;
    }

    @Override // X.AbstractC80736VmO
    public final int LIZJ() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.LIZ;
        int i = (sideSheetBehavior.LJIIJ - sideSheetBehavior.LJIIIZ) - sideSheetBehavior.LJIIL;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // X.AbstractC80736VmO
    public final int LIZLLL() {
        return this.LIZ.LJIIJ;
    }

    @Override // X.AbstractC80736VmO
    public final int LJ() {
        return this.LIZ.LJIIJ;
    }

    @Override // X.AbstractC80736VmO
    public final int LJFF() {
        return LIZJ();
    }

    public C80735VmN(SideSheetBehavior<? extends View> sheetBehavior) {
        o.LJIIIZ(sheetBehavior, "sheetBehavior");
        this.LIZ = sheetBehavior;
    }

    @Override // X.AbstractC80736VmO
    public final int LIZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC80736VmO
    public final float LIZIZ(int i) {
        return (this.LIZ.LJIIJ - i) / (this.LIZ.LJIIJ - LIZJ());
    }

    @Override // X.AbstractC80736VmO
    public final <V extends View> int LJI(V v) {
        o.LJI(v);
        return v.getLeft() - this.LIZ.LJIIL;
    }

    @Override // X.AbstractC80736VmO
    public final int LJII(C45621qg parent) {
        o.LJIIIZ(parent, "parent");
        return parent.getRight();
    }

    @Override // X.AbstractC80736VmO
    public final boolean LJIIIZ(View releasedChild) {
        o.LJIIIZ(releasedChild, "releasedChild");
        if (releasedChild.getLeft() > (LIZJ() + this.LIZ.LJIIJ) / 2) {
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
        if (Math.abs((f * this.LIZ.LIZIZ) + child.getRight()) > 0.5f) {
            return true;
        }
        return false;
    }
}
