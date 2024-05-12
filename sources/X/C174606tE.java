package X;

/* renamed from: X.6tE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174606tE extends C8BR<C176436wB, InterfaceC174626tG> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        C174666tK c174666tK = C176096vd.LIZJ;
        c174666tK.LJ = System.currentTimeMillis();
        C176096vd.LIZJ(c174666tK);
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            C176436wB c176436wB = (C176436wB) t;
            ((InterfaceC174626tG) k).onDeleteSuccess(c176436wB.LJLJI, c176436wB.LJLJJI);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        C174666tK c174666tK = C176096vd.LIZJ;
        c174666tK.LJ = System.currentTimeMillis();
        C176096vd.LIZJ(c174666tK);
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC174626tG) k).onDeleteFailed(exc);
        }
    }
}
