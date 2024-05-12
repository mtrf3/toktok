package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$invalidateCurrentTask$1", f = "ChatNoticeFlowEngine.kt", l = {112}, m = "invokeSuspend")
/* renamed from: X.448, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass448 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1036745b LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass448(C1036745b c1036745b, boolean z, InterfaceC88471Ynr<? super C1023940d, ? super InterfaceC67352kd<? super Boolean>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super AnonymousClass448> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1036745b;
        this.LJLJI = z;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass448(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            boolean z = this.LJLJI;
            InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> interfaceC88471Ynr = this.LJLJJI;
            this.LJLIL = 1;
            if (c1036745b.LJIIIIZZ(z, interfaceC88471Ynr, this) == enumC58928NAu) {
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
