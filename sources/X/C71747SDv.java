package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.ViewController$setState$1", f = "ViewController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SDv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71747SDv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71746SDu<T> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<T, T> LJLILLLLZI;
    public final /* synthetic */ AbstractC71743SDr LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71747SDv(C71746SDu<T> c71746SDu, InterfaceC88472Yns<? super T, ? extends T> interfaceC88472Yns, AbstractC71743SDr abstractC71743SDr, InterfaceC67352kd<? super C71747SDv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71746SDu;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = abstractC71743SDr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71747SDv(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ(this.LJLILLLLZI);
        this.LJLJI.LJLIL.setValue(0);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
