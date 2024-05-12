package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate$onSubmitListComplete$1", f = "UnreadIndicatorDelegate.kt", l = {117}, m = "invokeSuspend")
/* renamed from: X.49i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047849i extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1047549f LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047849i(C1047549f c1047549f, InterfaceC67352kd<? super C1047849i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1047549f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1047849i(this.LJLILLLLZI, interfaceC67352kd);
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
            long j = c1047549f.LJLLL;
            long j2 = c1047549f.LJLLLL;
            long j3 = c1047549f.LJZ;
            this.LJLIL = 1;
            if (c1047549f.LIZ(j, j2, j3, this) == enumC58928NAu) {
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
