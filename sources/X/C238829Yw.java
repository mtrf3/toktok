package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$deleteKeywordMessage$1$1$1", f = "BaAutoReplyEditActivity.kt", l = {287}, m = "invokeSuspend")
/* renamed from: X.9Yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238829Yw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaAutoReplyEditActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238829Yw(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC67352kd<? super C238829Yw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baAutoReplyEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C238829Yw c238829Yw = new C238829Yw(this.LJLJI, interfaceC67352kd);
        c238829Yw.LJLILLLLZI = obj;
        return c238829Yw;
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
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.LJLJI;
            IBaAutoMessageService iBaAutoMessageService = baAutoReplyEditActivity.LJLJI;
            C9Z3 c9z3 = baAutoReplyEditActivity.LJLJJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            obj = iBaAutoMessageService.LJI(c9z3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C238909Ze.LIZLLL(7);
            XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C238839Yx(this.LJLJI, null), 2);
            this.LJLJI.finish();
        } else {
            this.LJLJI.LLIIIILZ(true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
