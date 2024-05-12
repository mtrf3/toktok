package X;

/* renamed from: X.2KQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2KQ implements Runnable {
    public final Runnable LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    public C2KQ() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Runnable runnable = this.LJLIL;
            if (runnable != null) {
                runnable.run();
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C2KQ(Runnable runnable) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = null;
    }
}
