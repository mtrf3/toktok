package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel$triggerBannersOnBlockStatusChanged$1", f = "SingleChatNoticeViewModel.kt", l = {92, 94}, m = "invokeSuspend")
/* renamed from: X.40w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1025840w extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ SingleChatNoticeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025840w(boolean z, SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC67352kd<? super C1025840w> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = singleChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1025840w(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    if (((C99033ud) this.LJLJI.LJLJJL.getValue()).isStrangerChat() && !this.LJLJI.getState().LJLIL) {
                        this.LJLJI.LJLIL.LIZLLL(C41X.STRANGER_CHAT);
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
            return C76800UCe.LIZ;
        }
        C141335gf.LIZJ(obj);
        if (this.LJLILLLLZI) {
            C1036745b c1036745b = this.LJLJI.LJLIL;
            C41X c41x = C41X.BLOCK;
            this.LJLIL = 1;
            if (c1036745b.LJFF(c41x, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        C1036745b c1036745b2 = this.LJLJI.LJLIL;
        C1025940x c1025940x = new C1025940x(null);
        this.LJLIL = 2;
        if (C1036745b.LJIIIZ(c1036745b2, c1025940x, this, 1) == enumC58928NAu) {
            return enumC58928NAu;
        }
        if (((C99033ud) this.LJLJI.LJLJJL.getValue()).isStrangerChat()) {
            this.LJLJI.LJLIL.LIZLLL(C41X.STRANGER_CHAT);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
