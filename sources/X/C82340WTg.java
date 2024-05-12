package X;

/* renamed from: X.WTg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82340WTg implements InterfaceC64672gJ<Boolean> {
    public final /* synthetic */ C82334WTa LJLIL;
    public final /* synthetic */ Class LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Boolean bool, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C0I6 m0;
        if (bool.booleanValue() && (m0 = this.LJLIL.m0(this.LJLILLLLZI)) != null) {
            this.LJLJI.invoke(m0);
        }
        return C76800UCe.LIZ;
    }

    public C82340WTg(C82334WTa c82334WTa, Class cls, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = c82334WTa;
        this.LJLILLLLZI = cls;
        this.LJLJI = interfaceC88472Yns;
    }
}
