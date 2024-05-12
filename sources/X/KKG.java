package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.mob.QnaMob$Companion$searchTrendingWordsShow$1", f = "QnaMob.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<KKM> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KKG(String str, String str2, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKG(this.LJLILLLLZI, this.LJLJI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        C141335gf.LIZJ(obj);
        List<KKM> list = this.LJLIL;
        String str4 = this.LJLILLLLZI;
        String str5 = this.LJLJI;
        for (KKM kkm : list) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("search_position", "qa_personal_profile");
            KKF kkf = kkm.LJFF;
            String str6 = null;
            if (kkf != null) {
                str = kkf.LIZLLL;
            } else {
                str = null;
            }
            c188727au.LJIIIZ("question_id", str);
            c188727au.LJIIIZ("new_sug_session_id", str4);
            KKF kkf2 = kkm.LJFF;
            if (kkf2 != null) {
                str2 = kkf2.LIZ;
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("impr_id", str2);
            c188727au.LJIIIZ("words_source", "sug");
            c188727au.LJIIIZ("raw_query", str5);
            KKF kkf3 = kkm.LJFF;
            if (kkf3 != null) {
                str3 = kkf3.LIZJ;
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("words_content", str3);
            KKF kkf4 = kkm.LJFF;
            if (kkf4 != null) {
                num = new Integer(kkf4.LIZIZ);
            } else {
                num = null;
            }
            c188727au.LJFF(num, "words_position");
            KKF kkf5 = kkm.LJFF;
            if (kkf5 != null) {
                str6 = kkf5.LJ;
            }
            c188727au.LJIIIZ("group_id", str6);
            FMX.LJIIL("trending_words_show", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
