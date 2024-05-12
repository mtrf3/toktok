package X;

import Y.ARunnableS20S0200000_1;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity$initTitleAndTabs$1$onTabUnselected$1", f = "MessageRequestsActivity.kt", l = {256}, m = "invokeSuspend")
/* renamed from: X.4Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109704Sg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MessageRequestsActivity LJLILLLLZI;
    public final /* synthetic */ C78856UxA LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109704Sg(MessageRequestsActivity messageRequestsActivity, C78856UxA c78856UxA, InterfaceC67352kd<? super C109704Sg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = messageRequestsActivity;
        this.LJLJI = c78856UxA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C109704Sg(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(200L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        MessageRequestsActivity messageRequestsActivity = this.LJLILLLLZI;
        messageRequestsActivity.runOnUiThread(new ARunnableS20S0200000_1(this.LJLJI, messageRequestsActivity, 17));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
