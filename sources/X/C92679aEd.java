package X;

/* renamed from: X.aEd, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92679aEd extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC23370vt LJLJJL;
    public final /* synthetic */ InterfaceC91938a2g<?> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92679aEd(InterfaceC35811ar<Integer> interfaceC35811ar, int i, InterfaceC35811ar<Integer> interfaceC35811ar2, boolean z, InterfaceC23370vt interfaceC23370vt, InterfaceC91938a2g<?> interfaceC91938a2g) {
        super(1);
        this.LJLIL = interfaceC35811ar;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC35811ar2;
        this.LJLJJI = z;
        this.LJLJJL = interfaceC23370vt;
        this.LJLJJLL = interfaceC91938a2g;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        int i;
        float LJJJJIZL;
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            this.LJLIL.setValue(Integer.valueOf(this.LJLILLLLZI));
        }
        InterfaceC35811ar<Integer> interfaceC35811ar = this.LJLJI;
        if (this.LJLJJI) {
            LJJJJIZL = this.LJLJJL.LJJJJIZL(93);
        } else if (this.LJLJJLL instanceof C92357a9R) {
            LJJJJIZL = this.LJLJJL.LJJJJIZL(136);
        } else {
            i = 0;
            interfaceC35811ar.setValue(Integer.valueOf(i));
            this.LJLJJLL.LIZ().invoke(Boolean.valueOf(booleanValue));
            return C76800UCe.LIZ;
        }
        i = (int) LJJJJIZL;
        interfaceC35811ar.setValue(Integer.valueOf(i));
        this.LJLJJLL.LIZ().invoke(Boolean.valueOf(booleanValue));
        return C76800UCe.LIZ;
    }
}
