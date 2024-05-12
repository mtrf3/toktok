package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$triggerPermissionReminderDialogTask$1", f = "CommonChatNoticeViewModel.kt", l = {151}, m = "invokeSuspend")
/* renamed from: X.41a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1026241a extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CommonChatNoticeViewModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1026241a(CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, String str, InterfaceC67352kd<? super C1026241a> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = commonChatNoticeViewModel;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1026241a(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            C1036745b c1036745b = this.LJLILLLLZI.LJLIL;
            AnonymousClass434 anonymousClass434 = new AnonymousClass434(this.LJLJJI, this.LJLJI);
            this.LJLIL = 1;
            if (c1036745b.LJ(anonymousClass434, this) == enumC58928NAu) {
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
