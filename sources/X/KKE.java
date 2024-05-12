package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.mob.QnaMob$Companion$searchTrendingShow$1", f = "QnaMob.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ KKF LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KKE(String str, KKF kkf, String str2, int i, InterfaceC67352kd<? super KKE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = kkf;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKE(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_position", "qa_personal_profile");
        c188727au.LJIIIZ("new_sug_session_id", this.LJLIL);
        KKF kkf = this.LJLILLLLZI;
        if (kkf != null) {
            str = kkf.LIZ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("impr_id", str);
        c188727au.LJIIIZ("words_source", "sug");
        c188727au.LJIIIZ("raw_query", this.LJLJI);
        c188727au.LIZLLL(this.LJLJJI, "words_num ");
        FMX.LJIIL("trending_show", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
