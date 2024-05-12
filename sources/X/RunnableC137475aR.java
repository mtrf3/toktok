package X;

import v5.n;

/* renamed from: X.5aR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC137475aR implements Runnable {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C137465aQ.LJLIL);

    public final void LIZ() {
        ((n) this.LJLILLLLZI.getValue()).LJ(C76800UCe.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.invoke();
            ((n) this.LJLILLLLZI.getValue()).LIZ.LJIJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC137475aR(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }
}
