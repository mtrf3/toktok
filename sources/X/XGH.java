package X;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes16.dex */
public final class XGH<D> implements InterfaceC64672gJ<XGX<D>> {
    public final /* synthetic */ XGD LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr LJLJJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<D> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new XGI(xgx, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public XGH(XGD xgd, String str, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2) {
        this.LJLIL = xgd;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = interfaceC88471Ynr2;
    }
}
