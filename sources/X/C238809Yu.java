package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$submitKeywordMessage$2$1$1", f = "BaAutoReplyEditActivity.kt", l = {254, 256}, m = "invokeSuspend")
/* renamed from: X.9Yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238809Yu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaAutoReplyEditActivity LJLJI;
    public final /* synthetic */ C9Z3 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238809Yu(BaAutoReplyEditActivity baAutoReplyEditActivity, C9Z3 c9z3, InterfaceC67352kd<? super C238809Yu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baAutoReplyEditActivity;
        this.LJLJJI = c9z3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C238809Yu c238809Yu = new C238809Yu(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c238809Yu.LJLILLLLZI = obj;
        return c238809Yu;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        boolean booleanValue;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                    C141335gf.LIZJ(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
                booleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.LJLJI;
            if (baAutoReplyEditActivity.LJLJJI.LIZIZ == 1) {
                IBaAutoMessageService iBaAutoMessageService = baAutoReplyEditActivity.LJLJI;
                C9Z3 c9z3 = this.LJLJJI;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 1;
                obj = iBaAutoMessageService.LJ(c9z3, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                booleanValue = ((Boolean) obj).booleanValue();
            } else {
                IBaAutoMessageService iBaAutoMessageService2 = baAutoReplyEditActivity.LJLJI;
                C9Z3 c9z32 = this.LJLJJI;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 2;
                obj = iBaAutoMessageService2.LJIIJJI(c9z32, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                booleanValue = ((Boolean) obj).booleanValue();
            }
        }
        if (booleanValue) {
            C238909Ze.LIZLLL(5);
            XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C238819Yv(this.LJLJI, null), 2);
            this.LJLJI.finish();
        } else {
            XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C238799Yt(this.LJLJI, null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
