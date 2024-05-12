package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$addTaskAndTrigger$1", f = "ChatNoticeFlowEngine.kt", l = {79}, m = "invokeSuspend")
/* renamed from: X.43q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1033043q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1036745b LJLILLLLZI;
    public final /* synthetic */ C1023940d LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1033043q(C1036745b c1036745b, C1023940d c1023940d, InterfaceC67352kd<? super C1033043q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1036745b;
        this.LJLJI = c1023940d;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1033043q(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C1023940d c1023940d = this.LJLJI;
            this.LJLIL = 1;
            if (c1036745b.LIZ(c1023940d, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
