package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1$1", f = "SearchAdStateBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C58824N6u LJLILLLLZI;
    public final /* synthetic */ N6F LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEI(C58824N6u c58824N6u, N6F n6f, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super NEI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c58824N6u;
        this.LJLJI = n6f;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        NEI nei = new NEI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        nei.LJLIL = obj;
        return nei;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL((InterfaceC70422pa) this.LJLIL, null, null, new NEH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
