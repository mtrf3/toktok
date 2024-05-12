package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.couponcard.impl.ECLiveNewUserCouponCardImpl$forceDismissWithDelay$1", f = "ECLiveNewUserCouponCardImpl.kt", l = {562}, m = "invokeSuspend")
/* renamed from: X.2lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67992lf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C71113RvZ LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67992lf(long j, C71113RvZ c71113RvZ, InterfaceC67352kd<? super C67992lf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = c71113RvZ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67992lf c67992lf = new C67992lf(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c67992lf.LJLILLLLZI = obj;
        return c67992lf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            long j = this.LJLJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            return C76800UCe.LIZ;
        }
        this.LJLJJI.LIZJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
