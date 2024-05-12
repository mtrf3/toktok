package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel$invalidateNotice$1", f = "SingleChatNoticeViewModel.kt", l = {UserLevelGeckoUpdateSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.415, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass415 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SingleChatNoticeViewModel LJLILLLLZI;
    public final /* synthetic */ C41X LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass415(SingleChatNoticeViewModel singleChatNoticeViewModel, C41X c41x, InterfaceC67352kd<? super AnonymousClass415> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = singleChatNoticeViewModel;
        this.LJLJI = c41x;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass415(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            AnonymousClass416 anonymousClass416 = new AnonymousClass416(this.LJLJI, null);
            this.LJLIL = 1;
            if (C1036745b.LJIIIZ(c1036745b, anonymousClass416, this, 1) == enumC58928NAu) {
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
