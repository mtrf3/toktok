package X;

/* renamed from: X.aJA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92960aJA extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C0Q5<Boolean> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92960aJA(boolean z, C0Q5<Boolean> c0q5, String str, int i) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = c0q5;
        this.LJLJI = str;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            if (this.LJLIL) {
                interfaceC24520xk2.LJJIIJ(1787916879);
                C06500Ni.LIZIZ(this.LJLILLLLZI, null, C06670Nz.LIZLLL(C1JI.LJJIJIIJIL(300, 0, new C1JS(0.32f, 0.0f, 0.67f, 0.0f), 2), 2).LIZIZ(C06670Nz.LJIIJ(C1JI.LJJIJIIJIL(300, 0, new C1JS(0.33f, 1.0f, 0.68f, 1.0f), 2), C92962aJC.LJLIL)), C06670Nz.LJ(C1JI.LJJIJIIJIL(300, 0, new C1JS(0.33f, 1.0f, 0.68f, 1.0f), 2), 2).LIZIZ(C06670Nz.LJIILIIL(C1JI.LJJIJIIJIL(300, 0, new C1JS(0.33f, 1.0f, 0.68f, 1.0f), 2), C92963aJD.LJLIL)), null, C1DJ.LJ(interfaceC24520xk2, -819894018, new C92964aJE(this.LJLJI, this.LJLJJI)), interfaceC24520xk2, 196608, 18);
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                interfaceC24520xk2.LJJIIJ(1787917312);
                C92030a4A.LIZIZ((this.LJLJJI >> 3) & 14, interfaceC24520xk2, this.LJLJI);
                interfaceC24520xk2.LJJIJIIJIL();
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
