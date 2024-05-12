package X;

/* renamed from: X.XBi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84422XBi {
    public final C0R1 LIZ = new C0R1(false);
    public final C0R4 LIZIZ = new C0R4(0);

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ.LIZLLL(true);
        interfaceC65784Pro.invoke();
        C0R4 c0r4 = this.LIZIZ;
        synchronized (c0r4.LIZ) {
            c0r4.LIZ.notifyAll();
        }
    }
}
