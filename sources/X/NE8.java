package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdModuleExtKt$handlePlayerState$1$1", f = "SearchAdModuleExt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NE8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC58799N5v LJLILLLLZI;
    public final /* synthetic */ java.util.Map<N62, InterfaceC65784Pro<C76800UCe>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NE8(InterfaceC58799N5v interfaceC58799N5v, java.util.Map<N62, ? extends InterfaceC65784Pro<C76800UCe>> map, InterfaceC67352kd<? super NE8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC58799N5v;
        this.LJLJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        NE8 ne8 = new NE8(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        ne8.LJLIL = obj;
        return ne8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL((InterfaceC70422pa) this.LJLIL, null, null, new NE5(this.LJLILLLLZI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
