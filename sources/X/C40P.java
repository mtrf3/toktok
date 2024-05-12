package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group.GroupChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group.GroupChatNoticeViewModel$refreshGroupBlockBanner$1", f = "GroupChatNoticeViewModel.kt", l = {68, 70}, m = "invokeSuspend")
/* renamed from: X.40P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40P extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ GroupChatNoticeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40P(boolean z, GroupChatNoticeViewModel groupChatNoticeViewModel, InterfaceC67352kd<? super C40P> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = groupChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40P(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI) {
                C1036745b c1036745b = this.LJLJI.LJLIL;
                C40Q c40q = new C40Q(null);
                this.LJLIL = 1;
                if (C1036745b.LJIIIZ(c1036745b, c40q, this, 1) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                C1036745b c1036745b2 = this.LJLJI.LJLIL;
                C41X c41x = C41X.BLOCK;
                this.LJLIL = 2;
                if (c1036745b2.LJFF(c41x, this) == enumC58928NAu) {
                    return enumC58928NAu;
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
