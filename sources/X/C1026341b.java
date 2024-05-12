package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$triggerTopMessageBanner$1", f = "CommonChatNoticeViewModel.kt", l = {207, 209}, m = "invokeSuspend")
/* renamed from: X.41b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1026341b extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ CommonChatNoticeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026341b(C109544Rq c109544Rq, CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C1026341b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1026341b(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (!o.LJ(this.LJLILLLLZI.getConversationId(), ((C99033ud) this.LJLJI.LJLJJI.getValue()).getConversationId())) {
                return C76800UCe.LIZ;
            }
            CommonChatNoticeViewModel commonChatNoticeViewModel = this.LJLJI;
            C109544Rq c109544Rq = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = XKX.LJI(commonChatNoticeViewModel.LJLILLLLZI, new C44J(c109544Rq, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SystemContent systemContent = (SystemContent) obj;
        if (systemContent == null) {
            return C76800UCe.LIZ;
        }
        if (C78685UuP.LJJJZ(systemContent.getTips())) {
            C1036745b c1036745b = this.LJLJI.LJLIL;
            new Integer(1022);
            C43E c43e = new C43E(systemContent, null);
            this.LJLIL = 2;
            if (c1036745b.LJ(c43e, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
