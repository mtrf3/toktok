package X;

import Y.ARunnableS20S0200000_1;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity$updateCurrentAction$1", f = "MessageRequestsActivity.kt", l = {433}, m = "invokeSuspend")
/* renamed from: X.4Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109744Sk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MessageRequestsActivity LJLILLLLZI;
    public final /* synthetic */ EnumC109754Sl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109744Sk(MessageRequestsActivity messageRequestsActivity, EnumC109754Sl enumC109754Sl, InterfaceC67352kd<? super C109744Sk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = messageRequestsActivity;
        this.LJLJI = enumC109754Sl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C109744Sk(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (C1JD.LIZJ(500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        MessageRequestsActivity messageRequestsActivity = this.LJLILLLLZI;
        messageRequestsActivity.runOnUiThread(new ARunnableS20S0200000_1(messageRequestsActivity, this.LJLJI, 56));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
