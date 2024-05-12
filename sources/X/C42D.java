package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorEntry$tryShowTheIndicator$2", f = "UnreadIndicatorEntry.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.42D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42D extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C42C LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42D(C42C c42c, InterfaceC67352kd<? super C42D> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c42c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42D(this.LJLILLLLZI, interfaceC67352kd);
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
            C1047549f c1047549f = this.LJLILLLLZI.LIZJ;
            this.LJLIL = 1;
            obj = c1047549f.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try show result : ");
        LIZ.append(booleanValue);
        C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
