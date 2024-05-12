package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetRequest;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetResponse;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedstickers.SuggestedStickersManager$manualFetchIfRequired$1", f = "SuggestedStickersManager.kt", l = {192}, m = "invokeSuspend")
/* renamed from: X.2tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73012tl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C73012tl(InterfaceC67352kd<? super C73012tl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73012tl(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                XLM xlm = C73022tm.LJLJI;
                Object value = xlm.getValue();
                C73102tu c73102tu = C73102tu.LIZ;
                if (o.LJ(value, c73102tu) || ((xlm.getValue() instanceof C59702Vy) && (C73042to.LIZ() instanceof C59712Vz))) {
                    return C76800UCe.LIZ;
                }
                if (!o.LJ(xlm.getValue(), C73092tt.LIZ)) {
                    return C76800UCe.LIZ;
                }
                xlm.setValue(c73102tu);
                TiktokV1ImInboxDataGetRequest tiktokV1ImInboxDataGetRequest = new TiktokV1ImInboxDataGetRequest(C47261Igj.LJJIJ(new Integer(EnumC72992tj.CONVERSATION_PROPERTY_TYPES_SUGGESTED_STICKERS.getValue())), null, 2, null);
                TikTokImApi LIZ = C30U.LIZ();
                this.LJLIL = 1;
                obj = LIZ.updateConversationProperties(tiktokV1ImInboxDataGetRequest, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            tiktokV1ImInboxDataGetResponse = (TiktokV1ImInboxDataGetResponse) obj;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sendRequest: request error ");
            LIZ2.append(e);
            C34B.LIZJ("SuggestedStickersManager", X1D.LIZIZ(LIZ2));
        }
        C73022tm.LJI(tiktokV1ImInboxDataGetResponse);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C73012tl(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
