package X;

import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54942Dq extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C1QP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54942Dq(C1QP c1qp, int i, int i2, InterfaceC67352kd<? super C54942Dq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c1qp;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54942Dq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C1QP c1qp = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        C11390cZ c11390cZ = c1qp.LIZ;
        c11390cZ.LIZ(i, i2);
        c11390cZ.LIZLLL = null;
        C11370cX c11370cX = (C11370cX) c1qp.LJIILLIIL.getValue();
        if (c11370cX != null) {
            ((LinkedHashMap) c11370cX.LIZJ).clear();
            c11370cX.LIZLLL = C113554cx.LJJJLIIL();
            c11370cX.LJ = -1;
            c11370cX.LJFF = 0;
            c11370cX.LJI = -1;
            c11370cX.LJII = 0;
        }
        AnonymousClass160 anonymousClass160 = (AnonymousClass160) c1qp.LJIIL.getValue();
        if (anonymousClass160 != null) {
            anonymousClass160.LJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UY c0uy, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uy, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
