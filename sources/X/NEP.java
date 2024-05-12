package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player.SearchAdPlayerModule$onModuleCreate$1$1", f = "SearchAdPlayerModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C58798N5u LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEP(C58798N5u c58798N5u, InterfaceC67352kd<? super NEP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c58798N5u;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        NEP nep = new NEP(this.LJLILLLLZI, interfaceC67352kd);
        nep.LJLIL = obj;
        return nep;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL((InterfaceC70422pa) this.LJLIL, null, null, new NEN(this.LJLILLLLZI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
