package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qnasearch.repo.QnaSearchRepository$fetchQuestions$2$obv$1$1", f = "QnaSearchRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KKL LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ List<KKM> LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KKI(KKL kkl, String str, List<KKM> list, long j, InterfaceC67352kd<? super KKI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = kkl;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJII.put(this.LJLILLLLZI, this.LJLJI);
        if (this.LJLJJI == this.LJLIL.LJFF) {
            this.LJLIL.LIZ(new C74100T6i<>(new OSZ(this.LJLJI, this.LJLILLLLZI)));
        }
        return C76800UCe.LIZ;
    }
}
