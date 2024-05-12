package X;

/* renamed from: X.QeK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67496QeK implements InterfaceC67508QeW<AbstractC67411Qcx> {
    public static final C67496QeK LIZ = new C67496QeK();
    public static final C48260Iwq LIZIZ = C48260Iwq.LIZ("networkType");
    public static final C48260Iwq LIZJ = C48260Iwq.LIZ("mobileSubtype");

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        AbstractC67411Qcx abstractC67411Qcx = (AbstractC67411Qcx) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZIZ(LIZIZ, abstractC67411Qcx.LIZIZ());
        interfaceC67543Qf52.LIZIZ(LIZJ, abstractC67411Qcx.LIZ());
    }
}
