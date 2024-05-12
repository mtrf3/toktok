package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$initSuggestedQuestion$3", f = "BaMessageSettingActivity.kt", l = {254, 256}, m = "invokeSuspend")
/* renamed from: X.9ZB, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaMessageSettingActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZB(BaMessageSettingActivity baMessageSettingActivity, InterfaceC67352kd<? super C9ZB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baMessageSettingActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9ZB c9zb = new C9ZB(this.LJLJI, interfaceC67352kd);
        c9zb.LJLILLLLZI = obj;
        return c9zb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        BaMessageSettingActivity baMessageSettingActivity;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    baMessageSettingActivity = (BaMessageSettingActivity) this.LJLILLLLZI;
                    C141335gf.LIZJ(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    baMessageSettingActivity.getClass();
                    XKX.LIZLLL(baMessageSettingActivity, C36636EZk.LIZ, null, new C9ZG(baMessageSettingActivity, booleanValue, null), 2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            IBaAutoMessageService iBaAutoMessageService = this.LJLJI.LJLJJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            obj = iBaAutoMessageService.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C238889Zc c238889Zc = (C238889Zc) obj;
        if (c238889Zc == null) {
            return C76800UCe.LIZ;
        }
        XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9ZC(this.LJLJI, c238889Zc, null), 2);
        baMessageSettingActivity = this.LJLJI;
        IBaAutoMessageService iBaAutoMessageService2 = baMessageSettingActivity.LJLJJI;
        this.LJLILLLLZI = baMessageSettingActivity;
        this.LJLIL = 2;
        obj = iBaAutoMessageService2.LJIILL(this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        baMessageSettingActivity.getClass();
        XKX.LIZLLL(baMessageSettingActivity, C36636EZk.LIZ, null, new C9ZG(baMessageSettingActivity, booleanValue2, null), 2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
