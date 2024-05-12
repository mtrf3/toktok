package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugApi;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.K9w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51260K9w implements KCM {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC70422pa LJLILLLLZI;
    public final KCK LJLJI;
    public final ConcurrentHashMap<String, EcSearchSugResponse> LJLJJI;
    public long LJLJJL;
    public final Deque<KBZ> LJLJJLL;

    public final void LJJJIL(EcSearchSugResponse ecSearchSugResponse, boolean z) {
        C3A5.LIZ.LJFF(ecSearchSugResponse.requestId, ecSearchSugResponse.logPb);
        if (KD5.LJLILLLLZI.LJJII()) {
            ConcurrentHashMap<String, EcSearchSugResponse> concurrentHashMap = this.LJLJJI;
            String str = ecSearchSugResponse.LJLJI;
            o.LJIIIIZZ(str, "response.keyword");
            concurrentHashMap.put(str, ecSearchSugResponse);
        }
        String str2 = ecSearchSugResponse.LJLJI;
        o.LJIIIIZZ(str2, "response.keyword");
        KAD.LIZIZ(str2);
        this.LJLJI.LIZIZ(ecSearchSugResponse, z);
    }

    public final void LJJJLL(C51259K9v c51259K9v, KBZ kbz) {
        String str;
        C50433Jqn searchCommonModel;
        ISearchMiddleForECService LJJJJLI = SearchMiddleForEcService.LJJJJLI();
        String str2 = c51259K9v.LIZ;
        String str3 = c51259K9v.LIZIZ;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(activityC45651qj);
        if (LJII == null || (searchCommonModel = LJII.getSearchCommonModel()) == null || (str = searchCommonModel.getEnterFrom()) == null) {
            str = "";
        }
        this.LJLJI.LIZ(str2);
        if (!kbz.LIZJ) {
            K4I LIZ = K4O.LIZ(str2);
            LIZ.getClass();
            K4I k4i = K4K.LIZ;
            if (!o.LJ(LIZ, k4i)) {
                LIZ.LIZJ = System.currentTimeMillis();
            }
            C51246K9i.LIZJ(LJJJJLI, this.LJLIL);
            KCM.LJJIL.getClass();
            long j = KCN.LIZJ;
            long j2 = KCN.LIZIZ;
            if (j > j2) {
                j2 = KCN.LIZJ;
            }
            KCN.LIZIZ = j2;
            String str4 = c51259K9v.LIZJ;
            String LIZ2 = KAB.LIZIZ.LIZ().LIZ();
            Integer num = c51259K9v.LJ;
            String LIZIZ = K4W.LIZIZ();
            Integer num2 = c51259K9v.LJI;
            Long valueOf = Long.valueOf(KCN.LIZIZ);
            String str5 = C51307KBr.LIZ;
            String str6 = c51259K9v.LJIIJJI;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = c51259K9v.LJIIL;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = c51259K9v.LJIILIIL;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c51259K9v.LJIILJJIL;
            if (str9 == null) {
                str9 = "";
            }
            C76L<EcSearchSugResponse> LIZ3 = EcSearchSugApi.LIZ(new C51259K9v(str2, str3, str4, LIZ2, num, LIZIZ, num2, valueOf, str, 0, str5, str6, str7, str8, str9));
            KCN.LIZIZ++;
            K4W.LIZLLL = str2;
            kbz.LIZIZ = LIZ3;
            EcSearchSugResponse ecSearchSugResponse = LIZ3.get();
            if (!kbz.LIZJ) {
                ecSearchSugResponse.LJLILLLLZI = str3;
                ecSearchSugResponse.LJLJI = str2;
                ecSearchSugResponse.LJLJJI = kbz;
                if (!o.LJ(LIZ, k4i)) {
                    LIZ.LIZLLL = System.currentTimeMillis();
                }
                if (!o.LJ(LIZ, k4i)) {
                    LIZ.LJ = ecSearchSugResponse;
                }
                while (!this.LJLJJLL.isEmpty()) {
                    KBZ kbz2 = (KBZ) ((LinkedList) this.LJLJJLL).pollFirst();
                    if (kbz2.LIZ < kbz.LIZ) {
                        kbz.LIZJ = true;
                        C76L<EcSearchSugResponse> c76l = kbz.LIZIZ;
                        if (c76l != null) {
                            c76l.cancel(true);
                        }
                    }
                    if (kbz2.LIZ == kbz.LIZ) {
                        ecSearchSugResponse.LJLJJI = null;
                    }
                }
                LJJJIL(ecSearchSugResponse, false);
                return;
            }
            throw new CancellationException();
        }
        throw new CancellationException();
    }

    public C51260K9w(ActivityC45651qj activityC45651qj, InterfaceC70422pa viewModelScope, KA0 ka0) {
        o.LJIIIZ(viewModelScope, "viewModelScope");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = viewModelScope;
        this.LJLJI = ka0;
        new Handler(C16880lQ.LLJJJJ());
        this.LJLJJI = new ConcurrentHashMap<>();
        this.LJLJJLL = new LinkedList();
    }
}
