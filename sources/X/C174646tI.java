package X;

/* renamed from: X.6tI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174646tI extends C8BR<C176426wA, InterfaceC174656tJ> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        C176096vd.LJ.LJ = System.currentTimeMillis();
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            C176426wA c176426wA = (C176426wA) t;
            ((InterfaceC174656tJ) k).vp0(c176426wA.LJLJI, c176426wA.LJLJJI);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        T t;
        C176096vd.LJ.LJ = System.currentTimeMillis();
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            C176426wA c176426wA = (C176426wA) t;
            ((InterfaceC174656tJ) k).PB(c176426wA.LJLJI, c176426wA.LJLJJI, exc);
        }
        T t2 = this.LJLIL;
        if (t2 != 0) {
            ((AbstractC176586wQ) t2).LJLILLLLZI.LJI(C64920Pds.LIZ(EF7.LIZIZ(), exc));
        }
    }
}
