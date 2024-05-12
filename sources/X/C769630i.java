package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CallbackLinkResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.BusinessAccountMessageLogicHandler$onQnSendSuccess$1", f = "BusinessAccountMessageLogicHandler.kt", l = {139}, m = "invokeSuspend")
/* renamed from: X.30i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C769630i extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C769630i(long j, C109544Rq c109544Rq, InterfaceC67352kd<? super C769630i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C769630i(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C109544Rq LJIIIIZZ;
        char[] LIZ;
        String str;
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
            long j = this.LJLILLLLZI;
            String conversationId = this.LJLJI.getConversationId();
            o.LJIIIIZZ(conversationId, "msg.conversationId");
            String str2 = this.LJLJI.getLocalExt().get("callback_link");
            this.LJLIL = 1;
            obj = C769430g.LIZ(j, conversationId, str2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CallbackLinkResponse callbackLinkResponse = (CallbackLinkResponse) obj;
        C109544Rq c109544Rq = this.LJLJI;
        String str3 = c109544Rq.getLocalExt().get("info_card_msg_id");
        if (str3 != null && (LJIIIIZZ = C106674Gp.LJIIIIZZ(str3)) != null && (LIZ = C769730j.LIZ(LJIIIIZZ)) != null && (str = c109544Rq.getLocalExt().get("qns_index")) != null) {
            int parseInt = CastIntegerProtector.parseInt(str);
            if (callbackLinkResponse != null && callbackLinkResponse.status_code == 0) {
                Integer responseStatus = callbackLinkResponse.getResponseStatus();
                if (responseStatus != null && (responseStatus.intValue() == 1 || responseStatus.intValue() == 2)) {
                    int length = LIZ.length;
                    char[] cArr = new char[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        cArr[i2] = '1';
                    }
                    C769730j.LIZJ(LJIIIIZZ, cArr);
                }
            } else {
                LIZ[parseInt] = '0';
                C769730j.LIZJ(LJIIIIZZ, LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
