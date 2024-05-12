package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {150}, m = "invokeSuspend")
/* renamed from: X.2Cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54752Cx extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C31881My LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54752Cx(C31881My c31881My, InterfaceC88471Ynr<? super C0UY, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C54752Cx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c31881My;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54752Cx c54752Cx = new C54752Cx(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c54752Cx.LJLILLLLZI = obj;
        return c54752Cx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                Object obj2 = this.LJLILLLLZI;
                this.LJLJI.LIZLLL.setValue(Boolean.TRUE);
                InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJJI;
                this.LJLIL = 1;
                if (interfaceC88471Ynr.invoke(obj2, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLJI.LIZLLL.setValue(Boolean.FALSE);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLJI.LIZLLL.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UY c0uy, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uy, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
