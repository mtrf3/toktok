package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.ViewController$postState$1", f = "ViewController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SDw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71748SDw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71746SDu<T> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<T, T> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71748SDw(C71746SDu<T> c71746SDu, InterfaceC88472Yns<? super T, ? extends T> interfaceC88472Yns, InterfaceC67352kd<? super C71748SDw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71746SDu;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71748SDw(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
