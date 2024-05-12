package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$trackNoSpecificMsg$3", f = "BaseChatPanel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100403wq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ List<IMMessage> LJLILLLLZI;
    public final /* synthetic */ BaseChatPanel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C100403wq(long j, List<IMMessage> list, BaseChatPanel baseChatPanel, InterfaceC67352kd<? super C100403wq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = list;
        this.LJLJI = baseChatPanel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C100403wq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        long j = this.LJLIL;
        C31F.LIZ.getClass();
        C31G.LIZ();
        boolean LJIIL = C63164Oqe.LJIIL(j);
        int size = this.LJLILLLLZI.size();
        BaseChatPanel baseChatPanel = this.LJLJI;
        C99033ud sessionInfo = baseChatPanel.LJLJJI;
        boolean z = baseChatPanel.LLILII;
        boolean z2 = baseChatPanel.LLILIL;
        long currentTimeMillis = System.currentTimeMillis() - ((Number) this.LJLJI.LLIL.getValue()).longValue();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("msg_id", String.valueOf(sessionInfo.getMsgIdFromPush()));
        c1hq.put("enter_from", sessionInfo.getEnterFromForMob());
        c1hq.put("chat_type", C98583tu.LIZJ(sessionInfo));
        c1hq.put("conversation_id", sessionInfo.getConversationId());
        c1hq.put("msg_list_size", String.valueOf(size));
        c1hq.put("exist_in_local_db", String.valueOf(LJIIL));
        c1hq.put("finish_load_local", String.valueOf(z));
        c1hq.put("receive_new_msg", String.valueOf(z2));
        c1hq.put("duration", String.valueOf(currentTimeMillis));
        onEventV3.LIZIZ("dm_dev_no_specific_message", c1hq);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
