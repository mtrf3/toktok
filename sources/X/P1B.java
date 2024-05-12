package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.SuggestedQuestionsResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchSuggestedQuestion$1", f = "BaAutoMessageServiceImpl.kt", l = {354}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P1B extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1B(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super P1B> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P1B(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C84657XKj LIZ = XPR.LIZ(AutoMsgSettingApiManager.LIZJ());
                this.LJLIL = 1;
                obj = LIZ.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            SuggestedQuestionsResponse suggestedQuestionsResponse = (SuggestedQuestionsResponse) obj;
            if (suggestedQuestionsResponse.status_code != 0) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LJLILLLLZI;
                baAutoMessageServiceImpl.LJIIIZ = null;
                baAutoMessageServiceImpl.LJIIIIZZ = null;
                return C76800UCe.LIZ;
            }
            int i3 = suggestedQuestionsResponse.totalQuestionsNum;
            List<Object> list = suggestedQuestionsResponse.suggestedQuestionStatus;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            this.LJLILLLLZI.LJIIIZ = new C238889Zc(i3, i);
            return C76800UCe.LIZ;
        } catch (Exception unused) {
            this.LJLILLLLZI.LJIIIIZZ = null;
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
