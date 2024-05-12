package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$triggerScene$1", f = "ChatNoticeFlowEngine.kt", l = {162}, m = "invokeSuspend")
/* renamed from: X.45e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037045e extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1036745b LJLILLLLZI;
    public final /* synthetic */ C45Q LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037045e(C1036745b c1036745b, C45Q c45q, InterfaceC67352kd<? super C1037045e> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1036745b;
        this.LJLJI = c45q;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1037045e(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C1036745b c1036745b = this.LJLILLLLZI;
            C45Q c45q = this.LJLJI;
            this.LJLIL = 1;
            if (c1036745b.LJIILL(c45q, this) == enumC58928NAu) {
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
