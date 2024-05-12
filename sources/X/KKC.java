package X;

import Y.AfS22S1100000_8;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchApiV2;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qnasearch.repo.QnaSearchRepository$fetchQuestions$2", f = "QnaSearchRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ KKL LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KKC(String str, KKL kkl, long j, InterfaceC67352kd<? super KKC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = kkl;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKC(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        QnaSearchApiV2.LIZ.getClass();
        C73454SsE LJJJ = ((QnaSearchApiV2) C36339ENz.LIZIZ.getValue()).fetchQnaSearchResults(this.LJLIL, "profile_qna", 2, null, null, this.LJLILLLLZI.LIZ.getHistoryList(), 1, "", "qna", 100).LJJL(T16.LIZ()).LJJJ(T16.LIZ());
        KKL kkl = this.LJLILLLLZI;
        String str = this.LJLIL;
        this.LJLILLLLZI.LJI.LIZ(LJJJ.LJJJLIIL(new KKB(kkl, str, this.LJLJI), new AfS22S1100000_8(str, kkl, 1)));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
