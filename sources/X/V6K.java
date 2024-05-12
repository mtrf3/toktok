package X;

/* loaded from: classes14.dex */
public final class V6K implements InterfaceC64672gJ<Boolean> {
    public final /* synthetic */ V6O LJLIL;
    public final /* synthetic */ V7O LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr LJLJI;
    public final /* synthetic */ InterfaceC24760y8 LJLJJI;
    public final /* synthetic */ InterfaceC24760y8 LJLJJL;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Boolean bool, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        bool.booleanValue();
        Object LIZIZ = V6M.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }

    public V6K(V6O v6o, V7O v7o, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC24760y8 interfaceC24760y8, InterfaceC24760y8 interfaceC24760y82) {
        this.LJLIL = v6o;
        this.LJLILLLLZI = v7o;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = interfaceC24760y8;
        this.LJLJJL = interfaceC24760y82;
    }
}
