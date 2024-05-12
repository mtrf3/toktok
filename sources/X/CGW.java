package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew$configureBanner$subOnlyLiveConfig$2$1", f = "SubscriptionSettingFragmentNew.kt", l = {531}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CGW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CE3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CGW(CE3 ce3, InterfaceC67352kd<? super CGW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ce3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CGW(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long LJJJI = C30581Hy.LJJJI(1, K74.SECONDS);
            this.LJLIL = 1;
            if (K72.LIZLLL(LJJJI) > 0) {
                j = K72.LJ(LJJJI);
                if (j < 1) {
                    j = 1;
                }
            } else {
                j = 0;
            }
            Object LIZJ = C1JD.LIZJ(j, this);
            if (LIZJ != obj2) {
                LIZJ = C76800UCe.LIZ;
            }
            if (LIZJ == obj2) {
                return obj2;
            }
        }
        this.LJLILLLLZI.LJLIL.setVisibility(8);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
