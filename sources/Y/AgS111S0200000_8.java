package Y;

import X.C10I;
import X.C10K;
import X.C49567Jcp;
import X.C49914JiQ;
import X.C49915JiR;
import X.C49918JiU;
import X.C49920JiW;
import X.C49921JiX;
import X.C49922JiY;
import X.C49923JiZ;
import X.C49936Jim;
import X.C49950Jj0;
import X.C50139Jm3;
import X.C50356JpY;
import X.C50605JtZ;
import X.C76800UCe;
import X.InterfaceC50355JpX;
import X.InterfaceC88472Yns;
import X.QDX;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.repo.SearchEffectListResponse;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.viewmodel.SearchEffectListViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AgS111S0200000_8 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS111S0200000_8 agS111S0200000_8, C10K c10k) {
        int i;
        String str;
        int i2;
        String str2;
        List<SearchMixFeed> list;
        List<SearchMixFeed> list2;
        C49920JiW LJ = C49921JiX.LJ(((C49915JiR) agS111S0200000_8.l0).LJLIL);
        LJ.LJI();
        C49923JiZ LIZLLL = C49922JiY.LIZLLL(((C49915JiR) agS111S0200000_8.l0).LJLIL);
        LIZLLL.LIZJ();
        C50139Jm3.LIZ(C50605JtZ.LJIIJJI());
        if (((C10K) agS111S0200000_8.l1).LJIILJJIL()) {
            Exception LJIIJ = ((C10K) agS111S0200000_8.l1).LJIIJ();
            LJ.LJIIJJI(1);
            String message = LJIIJ.getMessage();
            if (!o.LJ(LJ, C49567Jcp.LIZ)) {
                LJ.LJIJJ = message;
            }
            LIZLLL.LJI(1);
            String message2 = LJIIJ.getMessage();
            if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
                LIZLLL.LJIIL = message2;
            }
            C49950Jj0.LIZLLL(new AqS174S0100000_8(LJIIJ, 105));
        } else if (((C10K) agS111S0200000_8.l1).LJIIL()) {
            LJ.LJIIJJI(2);
            LJ.LIZLLL();
            LIZLLL.LJI(2);
            LIZLLL.LIZIZ();
        } else {
            SearchMixFeedList searchMixFeedList = (SearchMixFeedList) ((C10K) agS111S0200000_8.l1).LJIIJJI();
            if (searchMixFeedList != null && (list2 = searchMixFeedList.mItems) != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            LJ.LIZJ(i);
            if (searchMixFeedList != null) {
                str = searchMixFeedList.getRequestId();
            } else {
                str = null;
            }
            LJ.LJFF(str);
            LJ.LJIIJ(searchMixFeedList);
            LJ.LJIIJJI(0);
            if (searchMixFeedList != null && (list = searchMixFeedList.mItems) != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            C49923JiZ c49923JiZ = C49936Jim.LIZ;
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJII = i2;
            }
            if (searchMixFeedList != null) {
                str2 = searchMixFeedList.getRequestId();
            } else {
                str2 = null;
            }
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJIIJ = str2;
            }
            Integer valueOf = Integer.valueOf(searchMixFeedList.cursor);
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJIJJLI = valueOf;
            }
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJI = searchMixFeedList;
            }
            LIZLLL.LJI(0);
        }
        if (((C49915JiR) agS111S0200000_8.l0).LLIILZL) {
            return null;
        }
        return c10k;
    }

    public static final Object then$1(AgS111S0200000_8 agS111S0200000_8, C10K c10k) {
        try {
            m mVar = (m) c10k.LJIIJJI();
            m LJJIJIL = mVar.LJJIJIL("data");
            if (LJJIJIL == null) {
                mVar.LJJIJ("code").LJIILJJIL();
                Iterator it = ((ArrayList) ((C50356JpY) agS111S0200000_8.l0).LIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC50355JpX) it.next()).cT();
                }
            } else {
                C50356JpY c50356JpY = (C50356JpY) agS111S0200000_8.l0;
                c50356JpY.LJ = GsonProtectorUtils.toJson(c50356JpY.LIZIZ, (j) LJJIJIL);
                C50356JpY c50356JpY2 = (C50356JpY) agS111S0200000_8.l0;
                ((C50356JpY) agS111S0200000_8.l0).LIZIZ((Fragment) agS111S0200000_8.l1, LJJIJIL, (FeelgoodSurveyModel) GsonProtectorUtils.fromJson(c50356JpY2.LIZIZ, c50356JpY2.LJ, FeelgoodSurveyModel.class));
            }
        } catch (ClassCastException | IllegalStateException unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS111S0200000_8 agS111S0200000_8, C10K c10k) {
        if (c10k.LJIILIIL() && c10k.LJIIJJI() != null) {
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            SearchEffectListResponse searchEffectListResponse = (SearchEffectListResponse) LJIIJJI;
            if (searchEffectListResponse.status_code == 0) {
                ((SearchEffectListViewModel) agS111S0200000_8.l0).LJLIL.setValue(searchEffectListResponse.propsList);
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) agS111S0200000_8.l1;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(searchEffectListResponse);
                }
            } else {
                ((SearchEffectListViewModel) agS111S0200000_8.l0).LJLIL.setValue(null);
            }
        } else {
            ((SearchEffectListViewModel) agS111S0200000_8.l0).LJLIL.setValue(null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$3(Y.AgS111S0200000_8 r9, X.C10K r10) {
        /*
            boolean r0 = X.C82544WaS.LJ(r10)
            if (r0 == 0) goto L98
            java.lang.Object r0 = r10.LJIIJJI()
            X.OSZ r0 = (X.OSZ) r0
            java.lang.Object r0 = r0.getFirst()
            com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList r0 = (com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList) r0
            java.util.List r0 = r0.LJI()
            r1 = 1
            if (r0 == 0) goto L98
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L98
            java.lang.Object r0 = r10.LJIIJJI()
            X.OSZ r0 = (X.OSZ) r0
            java.lang.Object r7 = r0.getFirst()
            com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList r7 = (com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList) r7
            java.lang.Object r0 = r10.LJIIJJI()
            X.OSZ r0 = (X.OSZ) r0
            java.lang.Object r8 = r0.getSecond()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r6 = r9.l0
            X.JkK r6 = (X.C50032JkK) r6
            java.util.Iterator r5 = r8.iterator()
        L48:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r0 = r4.getAid()
            if (r0 == 0) goto L48
            X.JkO r2 = r6.LJ
            if (r2 == 0) goto L48
            java.lang.String r1 = r4.getAid()
            java.lang.String r0 = "aweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r2.ab(r1)
            if (r0 != 0) goto L48
            r3.add(r4)
            goto L48
        L71:
            java.lang.Object r0 = r9.l0
            X.JkK r0 = (X.C50032JkK) r0
            X.JkO r1 = r0.LJ
            if (r1 == 0) goto L7e
            boolean r0 = r7.hasMore
            r1.hb(r7, r8, r0)
        L7e:
            java.lang.Object r1 = r9.l0
            X.JkK r1 = (X.C50032JkK) r1
            boolean r0 = r7.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LJFF = r0
            java.lang.Object r1 = r9.l1
            X.JkP r1 = (X.InterfaceC50037JkP) r1
            java.lang.Object r0 = r9.l0
            X.JkK r0 = (X.C50032JkK) r0
            X.Uqu r0 = r0.LJI
            r1.LIZ(r3, r0)
            goto Leb
        L98:
            java.lang.Exception r3 = r10.LJIIJ()
            boolean r0 = r3 instanceof X.C38333F2r
            r2 = 0
            if (r0 == 0) goto Lf2
            X.F2r r3 = (X.C38333F2r) r3
        La3:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onTryLoadMore fail, code: "
            r1.append(r0)
            if (r3 == 0) goto Lf0
            int r0 = r3.getErrorCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lb6:
            r1.append(r0)
            java.lang.String r0 = ", msg: "
            r1.append(r0)
            if (r3 == 0) goto Lc4
            java.lang.String r2 = r3.getErrorMsg()
        Lc4:
            r1.append(r2)
            java.lang.String r0 = ", exception: "
            r1.append(r0)
            java.lang.Exception r0 = r10.LJIIJ()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            java.lang.Object r2 = r9.l1
            X.JkP r2 = (X.InterfaceC50037JkP) r2
            if (r3 == 0) goto Lee
            int r1 = r3.getErrorCode()
            java.lang.String r0 = r3.getErrorMsg()
            if (r0 != 0) goto Le8
        Le6:
            java.lang.String r0 = ""
        Le8:
            r2.onFail(r1, r0)
        Leb:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lee:
            r1 = -1
            goto Le6
        Lf0:
            r0 = r2
            goto Lb6
        Lf2:
            r3 = r2
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS111S0200000_8.then$3(Y.AgS111S0200000_8, X.10K):java.lang.Object");
    }

    public static final Object then$4(AgS111S0200000_8 agS111S0200000_8, C10K c10k) {
        C49914JiQ c49914JiQ = (C49914JiQ) agS111S0200000_8.l0;
        C49915JiR c49915JiR = (C49915JiR) agS111S0200000_8.l1;
        c49914JiQ.LLIIIL.clearCache();
        c49914JiQ.LLIIIZ = System.currentTimeMillis();
        QDX qdx = (QDX) c10k.LJIIJJI();
        if (qdx != null) {
            qdx.LIZIZ(new C49918JiU(c49914JiQ, c49915JiR, c10k));
        }
        return c10k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS111S0200000_8(Object obj, SearchEffectListViewModel searchEffectListViewModel, InterfaceC88472Yns<? super SearchEffectListResponse, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = searchEffectListViewModel;
    }
}
