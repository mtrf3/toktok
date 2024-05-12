package X;

import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.util.SimplePollTaskManager$addTask$1", f = "SimplePollTaskManager.kt", l = {25}, m = "invokeSuspend")
/* renamed from: X.2nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69072nP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC69092nR LJLILLLLZI;
    public final /* synthetic */ C69082nQ LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69072nP(InterfaceC69092nR interfaceC69092nR, C69082nQ c69082nQ, InterfaceC67352kd<? super C69072nP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC69092nR;
        this.LJLJI = c69082nQ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69072nP(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i == 0 || i == 1) {
            C141335gf.LIZJ(obj);
            while (!this.LJLILLLLZI.LIZ()) {
                this.LJLILLLLZI.run();
                this.LJLIL = 1;
                if (C1JD.LIZJ(350L, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            ((ArrayList) this.LJLJI.LIZ).remove(this.LJLILLLLZI);
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
