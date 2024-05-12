package X;

import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$onOecInitDataReady$2$1$1$1$1$1", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rx2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71204Rx2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC71187Rwl LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ PopProductResp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71204Rx2(AbstractC71187Rwl abstractC71187Rwl, long j, PopProductResp popProductResp, InterfaceC67352kd<? super C71204Rx2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC71187Rwl;
        this.LJLILLLLZI = j;
        this.LJLJI = popProductResp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71204Rx2(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!C53175Ktv.LIZ()) {
            this.LJLIL.LJIJI().LJIIIIZZ(String.valueOf(this.LJLILLLLZI), C27739Aud.LJI(this.LJLJI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
