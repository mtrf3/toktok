package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.ShopMallObserver$preload$1", f = "ShopMallObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M0G extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public M0G(InterfaceC67352kd<? super M0G> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new M0G(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        M0F.LIZ.LIZ();
        KSH.LIZ.LIZ();
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_CREATE_LOAD_CACHE.getStage(), System.currentTimeMillis() - M0M.LIZ, false, 28);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new M0G(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
