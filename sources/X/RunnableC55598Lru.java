package X;

/* renamed from: X.Lru, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55598Lru implements Runnable {
    public InterfaceC65784Pro<C76800UCe> LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                this.LJLIL = null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC55598Lru(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }
}
