package X;

/* renamed from: X.8Pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC210938Pp implements Runnable {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public boolean LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLILLLLZI) {
                this.LJLILLLLZI = true;
                this.LJLIL.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC210938Pp(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }
}
