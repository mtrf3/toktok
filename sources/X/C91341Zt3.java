package X;

import android.view.MotionEvent;

/* renamed from: X.Zt3, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91341Zt3 implements InterfaceC91108ZpI {
    public float LIZ;
    public final /* synthetic */ AbstractC91339Zt1 LIZIZ;

    public C91341Zt3(AbstractC91339Zt1 abstractC91339Zt1) {
        this.LIZIZ = abstractC91339Zt1;
    }

    @Override // X.InterfaceC91108ZpI
    public final void LIZ(MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
            return;
        }
        if (valueOf.intValue() == 0) {
            this.LIZ = motionEvent.getY();
            return;
        }
        if (valueOf.intValue() == 2) {
            AbstractC91339Zt1 abstractC91339Zt1 = this.LIZIZ;
            C91542ZwI c91542ZwI = abstractC91339Zt1.LJLLJ;
            if (c91542ZwI == null || c91542ZwI.getScrollState() == 0) {
                return;
            }
            abstractC91339Zt1.LJLJJLL.getClass();
            abstractC91339Zt1.LJLJJLL.getClass();
            return;
        }
        if (valueOf.intValue() != 1) {
            return;
        }
        AbstractC91339Zt1 abstractC91339Zt12 = this.LIZIZ;
        C91542ZwI c91542ZwI2 = abstractC91339Zt12.LJLLJ;
        if (c91542ZwI2 != null && c91542ZwI2.getScrollState() != 0) {
            abstractC91339Zt12.LJLJJLL.getClass();
            abstractC91339Zt12.LJLJJLL.getClass();
        }
        this.LIZIZ.LJ();
        if (Math.abs(motionEvent.getY() - this.LIZ) <= this.LIZIZ.LJLIL) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ.hashCode());
        LIZ.append("  -> notify lyrics moved");
        X1D.LIZIZ(LIZ);
    }
}
