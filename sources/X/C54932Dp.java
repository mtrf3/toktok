package X;

import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyGridItemPlacementAnimator.kt", l = {439}, m = "invokeSuspend")
/* renamed from: X.2Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54932Dp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C11300cQ LJLILLLLZI;
    public final /* synthetic */ C1J4<C23450w1> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54932Dp(C11300cQ c11300cQ, C1J4<C23450w1> c1j4, InterfaceC67352kd<? super C54932Dp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c11300cQ;
        this.LJLJI = c1j4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54932Dp(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C0Q2 c0q2;
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
                if (((Boolean) this.LJLILLLLZI.LIZIZ.LIZLLL.getValue()).booleanValue()) {
                    c0q2 = this.LJLJI;
                    if (!(c0q2 instanceof C41391jr)) {
                        c0q2 = C11380cY.LIZ;
                    }
                } else {
                    c0q2 = this.LJLJI;
                }
                C11300cQ c11300cQ = this.LJLILLLLZI;
                C07070Pn<C23450w1, C1JN> c07070Pn = c11300cQ.LIZIZ;
                C23450w1 c23450w1 = new C23450w1(c11300cQ.LIZJ);
                this.LJLIL = 1;
                if (C07070Pn.LIZIZ(c07070Pn, c23450w1, c0q2, null, this, 12) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLILLLLZI.LIZLLL.setValue(Boolean.FALSE);
        } catch (CancellationException unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
