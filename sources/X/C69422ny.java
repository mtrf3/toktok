package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.GroupUserRecommendationAck;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.NoticeAckPayload;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel$reportCardCloseTs$1", f = "FakeMessageViewModel.kt", l = {430}, m = "invokeSuspend")
/* renamed from: X.2ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69422ny extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ FakeMessageViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69422ny(long j, FakeMessageViewModel fakeMessageViewModel, InterfaceC67352kd<? super C69422ny> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = fakeMessageViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69422ny(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                String LJIILL = C75792yF.LIZIZ().LJIILL(new NoticeAckPayload(new GroupUserRecommendationAck(C47261Igj.LJJIJ(new Long(this.LJLILLLLZI))), null, 2, null));
                TikTokImApi LIZ = C30U.LIZ();
                String conversationId = this.LJLJI.LJLIL.getConversationId();
                this.LJLIL = 1;
                if (LIZ.acknowledgeNoticeRead("_group_chat_recommendation_report", "group_chat", 3, conversationId, LJIILL, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
