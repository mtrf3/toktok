package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate$initParamAndCheckShow$2$unreadIndicatorParameter$1", f = "UnreadIndicatorDelegate.kt", l = {150}, m = "invokeSuspend")
/* renamed from: X.49h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047749h extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C32M>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1047549f LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047749h(C1047549f c1047549f, InterfaceC67352kd<? super C1047749h> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1047549f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1047749h(this.LJLILLLLZI, interfaceC67352kd);
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
            C1047549f c1047549f = this.LJLILLLLZI;
            InterfaceC1047349d interfaceC1047349d = c1047549f.LJLJJLL;
            String conversationId = c1047549f.LJLJJI.getConversationId();
            this.LJLIL = 1;
            obj = interfaceC1047349d.LIZJ(conversationId, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C32M> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
