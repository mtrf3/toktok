package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils.PdpButtonActionHelper;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils.PdpButtonActionHelper$addToCart$5", f = "PdpButtonActionHelper.kt", l = {104}, m = "invokeSuspend")
/* renamed from: X.Rep, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70075Rep extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpButtonActionHelper LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70075Rep(PdpButtonActionHelper pdpButtonActionHelper, InterfaceC67352kd<? super C70075Rep> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpButtonActionHelper;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70075Rep(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C70572Rmq c70572Rmq = C70572Rmq.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLILLLLZI.LJLIL.LJLJJLL;
            this.LJLIL = 1;
            if (c70572Rmq.LIZ(pdpEnterParam, 2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}