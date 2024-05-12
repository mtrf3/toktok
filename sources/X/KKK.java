package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qnasearch.repo.QnaSearchRepository$delaySend$job$1$1", f = "QnaSearchRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KKL LJLIL;
    public final /* synthetic */ C74100T6i<OSZ<List<KKM>, String>> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KKK(KKL kkl, C74100T6i<? extends OSZ<? extends List<KKM>, String>> c74100T6i, InterfaceC67352kd<? super KKK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = kkl;
        this.LJLILLLLZI = c74100T6i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKK(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZIZ.setValue(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
