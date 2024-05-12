package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$countDownCoroutines$4", f = "OtpFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aM7, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93143aM7 extends AbstractC65782Prm implements InterfaceC88471Ynr<Integer, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93143aM7(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C93143aM7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C93143aM7 c93143aM7 = new C93143aM7(this.LJLILLLLZI, interfaceC67352kd);
        c93143aM7.LJLIL = ((Number) obj).intValue();
        return c93143aM7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.invoke(new Integer(this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Integer num, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
