package X;

/* renamed from: X.25b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C527125b extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC21770tJ> {
    public static final C527125b LJLIL = new C527125b();

    public C527125b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC21770tJ invoke() {
        return new InterfaceC21770tJ() { // from class: X.1ZL
            @Override // X.InterfaceC21770tJ
            public final long LIZ(long j, float f, InterfaceC24520xk interfaceC24520xk, int i) {
                C21530sv LIZ2 = C21350sd.LIZ(interfaceC24520xk);
                if (Float.compare(f, 0) > 0 && !LIZ2.LJII()) {
                    return C78897Uxp.LJIIJJI(C11850dJ.LIZIZ(C21570sz.LIZIZ(j, interfaceC24520xk), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j);
                }
                return j;
            }
        };
    }
}
