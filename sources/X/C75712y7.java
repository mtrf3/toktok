package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ConversationContentResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.ConversationContentHandler$doRequest$1", f = "ConversationContentHandler.kt", l = {98}, m = "invokeSuspend")
/* renamed from: X.2y7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75712y7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C63120Opw LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75712y7(int i, C63120Opw c63120Opw, InterfaceC67352kd<? super C75712y7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = c63120Opw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75712y7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ConversationContentResponse conversationContentResponse;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        Integer num = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                TikTokImApi LIZ = C30U.LIZ();
                String valueOf = String.valueOf(this.LJLILLLLZI);
                int inboxType = this.LJLJI.getInboxType();
                int conversationType = this.LJLJI.getConversationType();
                long conversationShortId = this.LJLJI.getConversationShortId();
                this.LJLIL = 1;
                obj = LIZ.getConversationContent(valueOf, inboxType, conversationType, conversationShortId, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            conversationContentResponse = (ConversationContentResponse) obj;
        } catch (Exception unused) {
            C34B.LIZJ("ConversationContentHandler", "sendRequest: request error");
            conversationContentResponse = null;
        }
        String conversationId = this.LJLJI.getConversationId();
        o.LJIIIIZZ(conversationId, "conv.conversationId");
        if (conversationContentResponse == null || conversationContentResponse.status_code != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("handleResponse: request fail, status_code=");
            if (conversationContentResponse != null) {
                num = Integer.valueOf(conversationContentResponse.status_code);
            }
            LIZ2.append(num);
            C34B.LJI("ConversationContentHandler", X1D.LIZIZ(LIZ2));
            synchronized (C75732y9.LIZ) {
                C75732y9.LIZIZ.put(conversationId, -1L);
            }
        } else {
            int i2 = conversationContentResponse.action;
            String str2 = conversationContentResponse.content;
            if (str2 == null) {
                C34B.LJI("ConversationContentHandler", "handleResponse: content is empty");
                synchronized (C75732y9.LIZ) {
                    C75732y9.LIZIZ.put(conversationId, -1L);
                }
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("request content success, ");
                if (str2.length() == 0) {
                    str = "data is empty";
                } else {
                    str = "";
                }
                C48690J9a.LJIIL(LIZ3, str, LIZ3, "ConversationContentHandler");
                C75732y9.LIZJ(i2, null, conversationId, str2);
                synchronized (C75732y9.LIZ) {
                    C75732y9.LIZIZ.put(conversationId, Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
