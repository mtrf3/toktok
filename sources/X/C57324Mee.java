package X;

/* renamed from: X.Mee, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57324Mee implements InterfaceC64672gJ<XGX<C57335Mep>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C57324Mee(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C57335Mep> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (xgx instanceof XGW) {
            C2U8.LIZ(new C241269dS(this.LJLIL, this.LJLILLLLZI, true, false));
        } else if (xgx instanceof XGT) {
            C2U8.LIZ(new C241269dS(this.LJLIL, this.LJLILLLLZI, false, false));
        }
        return C76800UCe.LIZ;
    }
}
