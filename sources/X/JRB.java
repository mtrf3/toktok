package X;

import Y.ARunnableS27S0200000_8;
import Y.IDCListenerS148S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS97S0300000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes9.dex */
public final class JRB extends AbstractC49114JPi implements JJK {
    public static final /* synthetic */ int LLF = 0;
    public final C62822Ol8 LJLLILLLL;
    public JRG LJLLJ;
    public JRE LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C49160JRc LJLLLLLL;
    public final C49153JQv LJLZ;
    public View LJZ;
    public int LJZI;
    public String LJZL;
    public final AqS158S0100000_8 LL;
    public final JRH LLD;

    @Override // X.JJK
    public final void LIZIZ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
    }

    @Override // X.JJK
    public final void LIZJ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
    }

    @Override // X.AbstractC49114JPi
    public final RecyclerView LJIIJJI() {
        return (RecyclerView) this.LJLLILLLL.getValue();
    }

    @Override // X.AbstractC49114JPi
    /* renamed from: LJIJ, reason: merged with bridge method [inline-methods] */
    public final JR1 LJIIL() {
        return (JR1) this.LJLLLL.getValue();
    }

    public final void LJIILLIIL(boolean z) {
        C80001VaX c80001VaX = this.LJLIL.LJLJJL;
        if (c80001VaX != null) {
            if (z) {
                c80001VaX.setOnScrollToEndListener(this.LL);
                c80001VaX.setOnScrollThresholdHitListener(this.LLD);
                c80001VaX.setEnable(true);
                c80001VaX.setOnNestedScrollAcceptedListener(JRD.LJLIL);
                return;
            }
            c80001VaX.setOnScrollToEndListener(null);
            c80001VaX.setOnScrollThresholdHitListener(null);
            c80001VaX.setEnable(false);
            c80001VaX.setOnNestedScrollAcceptedListener(null);
        }
    }

    public final int LJIIZILJ(String str) {
        JRE jre;
        JSE jse;
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        if (str == null || (jre = this.LJLLL) == null || (jse = jre.LIZ) == null || (dynamicPatch = jse.LIZ) == null || (awemeList = dynamicPatch.getAwemeList()) == null) {
            return -1;
        }
        int size = awemeList.size();
        for (int i = 0; i < size; i++) {
            if (o.LJ(((Aweme) ListProtector.get(awemeList, i)).getAid(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final void LJIJI(JRE jre) {
        C49177JRt c49177JRt;
        C49177JRt c49177JRt2;
        this.LJLLL = jre;
        this.LJLLLLLL.LJLJJL = jre;
        JR2 jr2 = LJIIL().LJLLL;
        if (jr2 != null) {
            if (jre != null) {
                c49177JRt = jre.LIZIZ;
            } else {
                c49177JRt = null;
            }
            jr2.LJII = c49177JRt;
        }
        JRG jrg = this.LJLLJ;
        if (jrg != null) {
            LJIIJJI().LJJLL(jrg);
        }
        JRE jre2 = this.LJLLL;
        if (jre2 != null && (c49177JRt2 = jre2.LIZIZ) != null) {
            JRG jrg2 = new JRG(c49177JRt2);
            this.LJLLJ = jrg2;
            LJIIJJI().LJIIJJI(jrg2);
        }
    }

    @Override // X.AbstractC49114JPi
    public final void onVideoEvent(C50420Jqa event) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        int LJIIZILJ;
        o.LJIIIZ(event, "event");
        if (!C16330kX.LIZIZ(this.LJLIL.itemView)) {
            return;
        }
        boolean z = C46447IKt.LJLJLJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feedType is");
        LIZ.append(event.LJLJLJ);
        LIZ.append(" and event type is: ");
        LIZ.append(event.LJLJJL);
        X1D.LIZIZ(LIZ);
        int i = event.LJLJLJ;
        if (i != 73 && i != 71 && i != 74) {
            return;
        }
        if (C52411Khb.LIZ() && 21 == event.LJLIL && !z) {
            Object obj = event.LJLILLLLZI;
            if ((obj instanceof Aweme) && (aweme4 = (Aweme) obj) != null && (LJIIZILJ = LJIIZILJ(aweme4.getAid())) != -1) {
                LJIIJ().LJFF(LJIIZILJ, 0);
                return;
            }
        }
        if (C50524JsG.LIZ() && o.LJ(this.LJZL, "tt_search_trending")) {
            Object obj2 = event.LJLILLLLZI;
            if ((obj2 instanceof Aweme) && (aweme3 = (Aweme) obj2) != null && !o.LJ(aweme3.getSearchFeedType(), "SearchHotSpot")) {
                return;
            }
        }
        int i2 = event.LJLIL;
        if (i2 != 13) {
            if (i2 != 21) {
                if (i2 != 66) {
                    return;
                }
                Object obj3 = event.LJLILLLLZI;
                if (!(obj3 instanceof Aweme) || (aweme2 = (Aweme) obj3) == null) {
                    return;
                }
                C55457Lpd.LJLLI = -1;
                if ((event.LJLJJLL <= 0 && !C50620Jto.LIZ()) || C78949Uyf.LJJIFFI(aweme2)) {
                    return;
                }
                if (C50989Jzl.LJI(LJIIIIZZ())) {
                    LJIJJ(aweme2, !event.LJLL, event.LJLJJLL, event.LJLJLLL);
                }
                if ((C50524JsG.LIZ() && o.LJ(aweme2.getSearchFeedType(), "SearchHotSpot") && JHI.LIZ().LIZ == null) || z || !C46442IKo.LIZIZ()) {
                    return;
                }
                LJIIJJI().addOnLayoutChangeListener(new IDCListenerS148S0200000_8(this, aweme2, 2));
                return;
            }
            if (z) {
                return;
            }
            LJIIIZ();
            C49621Jdh.LIZ(null);
            Object obj4 = event.LJLILLLLZI;
            if (!(obj4 instanceof Aweme) || (aweme = (Aweme) obj4) == null) {
                return;
            }
            int LJIIZILJ2 = LJIIZILJ(aweme.getAid());
            if ((LJIIZILJ2 < 0 && (LJIIZILJ2 = LJIIZILJ(this.LJLJJLL)) < 0) || !event.LJLLI) {
                return;
            }
            if (event.LJLJLJ == 76 && !o.LJ(aweme.getSearchFeedType(), "search_separate_tab_lynx")) {
                return;
            }
            LJIIJ().LJFF(LJIIZILJ2, 0);
            return;
        }
        Object obj5 = event.LJLILLLLZI;
        o.LJII(obj5, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj5;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (Aweme aweme5 : this.LJLLLLLL.LJZ()) {
            if (o.LJ(aweme5.getAid(), str)) {
                Bundle bundle = event.LJLJI;
                if (bundle == null) {
                    return;
                }
                int i3 = bundle.getInt("user_digged");
                aweme5.setUserDigg(i3);
                if (aweme5.getStatistics() == null) {
                    return;
                }
                AwemeStatistics statistics = aweme5.getStatistics();
                o.LJI(statistics);
                long diggCount = statistics.getDiggCount();
                if (i3 == 1) {
                    aweme5.getStatistics().setDiggCount(diggCount + 1);
                } else {
                    aweme5.getStatistics().setDiggCount(diggCount - 1);
                }
            }
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onVideoStickEvent(IN8 event) {
        int i;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLJJL;
        Activity LJIILL = C78949Uyf.LJIILL(LJIIIIZZ());
        if (LJIILL != null) {
            i = LJIILL.hashCode();
        } else {
            i = 0;
        }
        if (i2 != i) {
            return;
        }
        EventBus.LIZJ().LJIILLIIL(event);
        Aweme aweme2 = event.LJLIL;
        String str = null;
        if ((aweme2 instanceof Aweme) && aweme2 != null && C50524JsG.LIZ()) {
            if (event.LJLJJI != 71 && o.LJ(aweme2.getSearchFeedType(), "SearchHotSpot")) {
                LJIIIZ();
                C49621Jdh.LIZ(null);
                C76732zl c76732zl = new C76732zl();
                int LJIIZILJ = LJIIZILJ(aweme2.getAid());
                c76732zl.element = LJIIZILJ;
                if (LJIIZILJ < 0) {
                    int LJIIZILJ2 = LJIIZILJ(this.LJLJJLL);
                    c76732zl.element = LJIIZILJ2;
                    if (LJIIZILJ2 < 0) {
                        return;
                    }
                }
                LJIIJ().LJFF(c76732zl.element, 0);
                C55457Lpd.LJLLI = -1;
                if (event.LJLJI > 0 || C50620Jto.LIZ()) {
                    LJIJJ(aweme2, !event.LJLILLLLZI, event.LJLJI, event.LJLJJLL);
                }
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS27S0200000_8(this, c76732zl, 88), 500L);
            }
            if (!o.LJ(aweme2.getSearchFeedType(), "SearchHotSpot")) {
                List<? extends Aweme> list = this.LJLLLLLL.LJLLILLLL;
                if (list != null && (aweme = (Aweme) ListProtector.get(list, 0)) != null) {
                    str = aweme.getSearchFeedType();
                }
                if (o.LJ(str, "SearchHotSpot")) {
                    LJIIJ().LJFF(0, 0);
                }
            }
        }
    }

    public JRB(JTI jti, JIB jib, JGU jgu) {
        super(jti, jib, jgu);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(jti, 656));
        this.LJLLLL = C221108m2.LIZIZ(new AqS97S0300000_8(this, jgu, jib, 6));
        Context context = jti.itemView.getContext();
        o.LJIIIIZZ(context, "viewHolder.itemView.context");
        C49160JRc c49160JRc = new C49160JRc(context, this, LJIIL().LIZ(), LJIIL().LIZIZ(), LJIIJJI(), this.LJLLL);
        this.LJLLLLLL = c49160JRc;
        this.LJLZ = LJIIL().LIZIZ();
        this.LJZL = "";
        LJIIL().LJLJL = c49160JRc;
        LJIILLIIL(true);
        C80001VaX c80001VaX = jti.LJLJJL;
        if (c80001VaX != null) {
            c80001VaX.setOnScrollChangeListener(new JRC(this));
        }
        this.LL = new AqS158S0100000_8(this, 657);
        this.LLD = JRH.LJLIL;
    }

    public final void LJIJJ(Aweme aweme, boolean z, long j, long j2) {
        int i;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchVideoForLynx_");
        Activity LJIJJ = C45804HyK.LJIJJ(LJIIIIZZ());
        if (LJIJJ != null) {
            i = LJIJJ.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        String shareId = C48880JGi.LIZ(X1D.LIZIZ(LIZ), aweme.getAid());
        if (C50524JsG.LIZ() && o.LJ(aweme.getSearchFeedType(), "SearchHotSpot") && JHI.LIZ().LIZ == null) {
            o.LJIIIIZZ(shareId, "shareId");
            JGY jgy = JGX.LIZ;
            C48880JGi LIZ2 = jgy.LIZ(shareId);
            if (LIZ2 == null) {
                LIZ2 = new C48880JGi(new OUP(), shareId);
            }
            C48893JGv.LJI();
            C48893JGv.LJ = System.currentTimeMillis();
            C48893JGv.LJI = true;
            LIZ2.LIZJ = j;
            LIZ2.LJI = (int) j2;
            LIZ2.LJ = JHI.LIZ().LJIILJJIL;
            JHI.LIZ().LJIILJJIL = -1;
            if (z) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            LIZ2.LIZ = i2;
            ((HashMap) jgy.LIZ).put(shareId, LIZ2);
            return;
        }
        o.LJIIIIZZ(shareId, "shareId");
        C48892JGu.LIZIZ(aweme, z, shareId, j, j2);
    }
}
