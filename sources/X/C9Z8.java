package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$onResume$4", f = "BaMessageSettingActivity.kt", l = {291}, m = "invokeSuspend")
/* renamed from: X.9Z8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public BaMessageSettingActivity LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BaMessageSettingActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z8(BaMessageSettingActivity baMessageSettingActivity, InterfaceC67352kd<? super C9Z8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baMessageSettingActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Z8(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BaMessageSettingActivity baMessageSettingActivity;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                baMessageSettingActivity = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            baMessageSettingActivity = this.LJLJI;
            IBaAutoMessageService iBaAutoMessageService = baMessageSettingActivity.LJLJJI;
            this.LJLIL = baMessageSettingActivity;
            this.LJLILLLLZI = 1;
            obj = iBaAutoMessageService.LJFF(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        baMessageSettingActivity.getClass();
        XKX.LIZLLL(baMessageSettingActivity, null, null, new C9Z7(baMessageSettingActivity, booleanValue, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
