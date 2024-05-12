package X;

/* renamed from: X.aKC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93024aKC extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C0Q5<Boolean> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC91781a09 LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93024aKC(boolean z, C0Q5<Boolean> c0q5, String str, InterfaceC91781a09 interfaceC91781a09, int i) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = c0q5;
        this.LJLJI = str;
        this.LJLJJI = interfaceC91781a09;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        C1I9 LJIIJ;
        C1IB LJIILIIL;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            if (this.LJLIL) {
                interfaceC24520xk2.LJJIIJ(1445500419);
                C0Q5<Boolean> c0q5 = this.LJLILLLLZI;
                C1I9 LIZLLL = C06670Nz.LIZLLL(null, 3);
                LJIIJ = C06670Nz.LJIIJ(C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1), C93028aKG.LJLIL);
                C1I9 LIZIZ = LIZLLL.LIZIZ(LJIIJ);
                C1IB LJ = C06670Nz.LJ(null, 3);
                LJIILIIL = C06670Nz.LJIILIIL(C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1), C93029aKH.LJLIL);
                C06500Ni.LIZIZ(c0q5, null, LIZIZ, LJ.LIZIZ(LJIILIIL), null, C1DJ.LJ(interfaceC24520xk2, -819894195, new C93030aKI(this.LJLJI, this.LJLJJI, this.LJLJJL)), interfaceC24520xk2, 200064, 18);
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                interfaceC24520xk2.LJJIIJ(1445500820);
                C92099a5H.LIZJ(this.LJLJI, this.LJLJJI, interfaceC24520xk2, ((this.LJLJJL >> 3) & 14) | 64, 0);
                interfaceC24520xk2.LJJIJIIJIL();
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
