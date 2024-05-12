package X;

import android.view.View;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import java.lang.ref.Reference;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.VmL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80733VmL extends AbstractC270614k {
    public final /* synthetic */ SideSheetBehavior<V> LIZ;

    public C80733VmL(SideSheetBehavior<V> sideSheetBehavior) {
        this.LIZ = sideSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewHorizontalDragRange(View child) {
        o.LJIIIZ(child, "child");
        SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
        return sideSheetBehavior.LJIIIZ + sideSheetBehavior.LJIIL;
    }

    @Override // X.AbstractC270614k
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
            if (sideSheetBehavior.LIZ) {
                sideSheetBehavior.setStateInternal(1);
            }
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View child, int i) {
        Reference reference;
        Object obj;
        o.LJIIIZ(child, "child");
        SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
        if (sideSheetBehavior.LIZJ == 1 || (reference = sideSheetBehavior.LIZLLL) == null || (obj = reference.get()) == null || !o.LJ(obj, child)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionHorizontal(View child, int i, int i2) {
        o.LJIIIZ(child, "child");
        return C78609UtB.LJJIIZ(i, this.LIZ.LJIILJJIL.LJFF(), this.LIZ.LJIILJJIL.LJ());
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionVertical(View child, int i, int i2) {
        o.LJIIIZ(child, "child");
        return child.getTop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.LJIILJJIL.LJIIIZ(r6) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (java.lang.Math.abs(r2 - r4.LJIILJJIL.LIZJ()) < java.lang.Math.abs(r2 - r4.LJIILJJIL.LIZLLL())) goto L4;
     */
    @Override // X.AbstractC270614k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            java.lang.String r0 = "releasedChild"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.bytedance.tux.sheet.sidesheet.SideSheetBehavior<V> r4 = r5.LIZ
            X.VmO r0 = r4.LJIILJJIL
            boolean r0 = r0.LJIIIIZZ(r7)
            r3 = 1
            if (r0 == 0) goto L17
        L10:
            r1 = 3
        L11:
            com.bytedance.tux.sheet.sidesheet.SideSheetBehavior<V> r0 = r5.LIZ
            r0.LIZ(r1, r6, r3)
            return
        L17:
            X.VmO r0 = r4.LJIILJJIL
            boolean r0 = r0.LJIIJJI(r6, r7)
            if (r0 == 0) goto L31
            X.VmO r0 = r4.LJIILJJIL
            boolean r0 = r0.LJIIJ(r7, r8)
            if (r0 != 0) goto L2f
            X.VmO r0 = r4.LJIILJJIL
            boolean r0 = r0.LJIIIZ(r6)
            if (r0 == 0) goto L10
        L2f:
            r1 = 5
            goto L11
        L31:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L54
        L36:
            int r2 = r6.getLeft()
            X.VmO r0 = r4.LJIILJJIL
            int r0 = r0.LIZJ()
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            X.VmO r0 = r4.LJIILJJIL
            int r0 = r0.LIZLLL()
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            if (r1 >= r0) goto L2f
            goto L10
        L54:
            float r1 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L36
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80733VmL.onViewReleased(android.view.View, float, float):void");
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i4) {
        o.LJIIIZ(changedView, "changedView");
        SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
        if (!sideSheetBehavior.LJ.isEmpty()) {
            sideSheetBehavior.LJIILJJIL.LIZIZ(i);
            Iterator<AbstractC80739VmR> it = sideSheetBehavior.LJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(changedView);
            }
        }
    }
}
