package X;

import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54882Dk extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C32541Pm LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54882Dk(C32541Pm c32541Pm, int i, int i2, InterfaceC67352kd<? super C54882Dk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32541Pm;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54882Dk(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C32541Pm c32541Pm = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        C10250aj c10250aj = c32541Pm.LIZ;
        c10250aj.LIZ(i, i2);
        c10250aj.LIZLLL = null;
        C10240ai c10240ai = (C10240ai) c32541Pm.LJIILIIL.getValue();
        if (c10240ai != null) {
            ((LinkedHashMap) c10240ai.LIZJ).clear();
            c10240ai.LIZLLL = C113554cx.LJJJLIIL();
            c10240ai.LJ = -1;
            c10240ai.LJFF = 0;
            c10240ai.LJI = -1;
            c10240ai.LJII = 0;
        }
        AnonymousClass160 anonymousClass160 = (AnonymousClass160) c32541Pm.LJIIJ.getValue();
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
