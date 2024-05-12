package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$onCreate$3", f = "BaWelcomeMessageEditActivity.kt", l = {71}, m = "invokeSuspend")
/* renamed from: X.9ZQ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaWelcomeMessageEditActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZQ(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, InterfaceC67352kd<? super C9ZQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baWelcomeMessageEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9ZQ c9zq = new C9ZQ(this.LJLJI, interfaceC67352kd);
        c9zq.LJLILLLLZI = obj;
        return c9zq;
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
            IBaAutoMessageService iBaAutoMessageService = this.LJLJI.LJLJJL;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            obj = iBaAutoMessageService.LJIIL(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C9ZN c9zn = (C9ZN) obj;
        if (c9zn == null) {
            this.LJLJI.finish();
            return C76800UCe.LIZ;
        }
        BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.LJLJI;
        baWelcomeMessageEditActivity.LJLJJI = c9zn;
        XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9ZR(baWelcomeMessageEditActivity, null), 2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
