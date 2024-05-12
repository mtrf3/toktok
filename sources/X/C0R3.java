package X;

/* renamed from: X.0R3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0R3 {
    public final Object LIZ = new Object();
    public final C0R1 LIZIZ = new C0R1(false);

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        synchronized (this.LIZ) {
            this.LIZIZ.LIZLLL(true);
            interfaceC65784Pro.invoke();
            this.LIZ.notifyAll();
        }
    }
}
