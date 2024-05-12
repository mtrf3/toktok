package X;

import androidx.work.CoroutineWorker;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.2DL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CoroutineWorker LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DL(CoroutineWorker coroutineWorker, InterfaceC67352kd<? super C2DL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = coroutineWorker;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2DL(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                CoroutineWorker coroutineWorker = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = coroutineWorker.LJII();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLILLLLZI.LJLJL.LJIIIIZZ((C0CS) obj);
        } catch (Throwable th) {
            this.LJLILLLLZI.LJLJL.LJIIIZ(th);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
