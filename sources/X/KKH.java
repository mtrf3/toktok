package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.mob.QnaMob$Companion$searchTrendingWordsClick$1", f = "QnaMob.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KKF LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KKH(KKF kkf, String str, String str2, InterfaceC67352kd<? super KKH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = kkf;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_position", "qa_personal_profile");
        c188727au.LJIIIZ("question_id", this.LJLIL.LIZLLL);
        c188727au.LJIIIZ("new_sug_session_id", this.LJLILLLLZI);
        c188727au.LJIIIZ("impr_id", this.LJLIL.LIZ);
        c188727au.LJIIIZ("words_source", "sug");
        c188727au.LJIIIZ("raw_query", this.LJLJI);
        c188727au.LJIIIZ("words_content", this.LJLIL.LIZJ);
        c188727au.LIZLLL(this.LJLIL.LIZIZ, "words_position");
        c188727au.LJIIIZ("group_id", this.LJLIL.LJ);
        FMX.LJIIL("trending_words_click", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
