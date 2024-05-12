package X;

/* renamed from: X.230, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass230 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C34351Wl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ InterfaceC88474Ynu<Float, Float, InterfaceC24520xk, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass230(C34351Wl c34351Wl, String str, float f, float f2, InterfaceC88474Ynu<? super Float, ? super Float, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88474Ynu, int i) {
        super(2);
        this.LJLIL = c34351Wl;
        this.LJLILLLLZI = str;
        this.LJLJI = f;
        this.LJLJJI = f2;
        this.LJLJJL = interfaceC88474Ynu;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        this.LJLIL.LJIIIIZZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1);
        return C76800UCe.LIZ;
    }
}
