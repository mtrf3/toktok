package X;

import androidx.work.CoroutineWorker;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
/* renamed from: X.29e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C537829e extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C1NI LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C1NI<C0VT> LJLJI;
    public final /* synthetic */ CoroutineWorker LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537829e(C1NI<C0VT> c1ni, CoroutineWorker coroutineWorker, InterfaceC67352kd<? super C537829e> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c1ni;
        this.LJLJJI = coroutineWorker;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C537829e(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C1NI c1ni = this.LJLIL;
                C141335gf.LIZJ(obj);
                c1ni.LJLILLLLZI.LJIIIIZZ(obj);
                return C76800UCe.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C141335gf.LIZJ(obj);
        C1NI<C0VT> c1ni2 = this.LJLJI;
        CoroutineWorker coroutineWorker = this.LJLJJI;
        this.LJLIL = c1ni2;
        this.LJLILLLLZI = 1;
        coroutineWorker.getClass();
        throw new IllegalStateException("Not implemented");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
