package Y;

import X.C04330Ez;
import X.C46278IEg;
import X.C58655N0h;
import X.C58704N2e;
import X.C58784N5g;
import X.C61491OBj;
import X.C63081OpJ;
import X.C73340SqO;
import X.N7D;
import X.NPC;
import X.NQ1;
import X.OJY;
import X.OXB;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class ARunnableS2S0102000_10 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS2S0102000_10 aRunnableS2S0102000_10) {
        NQ1 nq1 = (NQ1) aRunnableS2S0102000_10.l0;
        int i = aRunnableS2S0102000_10.i1;
        int i2 = aRunnableS2S0102000_10.i2;
        int i3 = 0;
        if (C63081OpJ.LJJLIIIJJI(nq1.LJLLLL) && !nq1.LJIILIIL()) {
            nq1.setLabelVisibility(0);
            nq1.LIZIZ(nq1, new ARunnableS2S0102000_10(i, nq1, i2, 1), true);
        }
        C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
        View view = nq1.LJLIL;
        LJIJJLI.getClass();
        C61491OBj.LJJZ(view, 0, 300, true);
        DataCenter dataCenter = nq1.LLFFF;
        if (dataCenter != null) {
            View view2 = nq1.LJLIL;
            if (view2 != null) {
                i3 = view2.getHeight();
            }
            dataCenter.jv0(Integer.valueOf(i3), "ad_bottom_label_show");
        }
    }

    public static final void run$1(ARunnableS2S0102000_10 aRunnableS2S0102000_10) {
        NQ1 nq1 = (NQ1) aRunnableS2S0102000_10.l0;
        int i = aRunnableS2S0102000_10.i1;
        int i2 = aRunnableS2S0102000_10.i2;
        if (nq1.LJLLLL == null) {
            return;
        }
        OJY LJIL = C73340SqO.LJIL();
        Context context = nq1.LJLLILLLL;
        Aweme aweme = nq1.LJLLLL;
        LJIL.getClass();
        OJY.LJI(context, aweme);
        C58704N2e.LIZLLL("draw_ad", "button_show", nq1.LJLLLL.getAwemeRawAd()).LJII();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", nq1.LJLLLL.getAwemeRawAd());
        LIZLLL.LIZJ("button", "refer");
        LIZLLL.LIZIZ(0, "is_lynx");
        LIZLLL.LIZIZ(2, "button_type");
        LIZLLL.LJII();
        if (!nq1.LJIIJJI()) {
            nq1.LJIIIIZZ(1300L);
        }
        if (i == 1) {
            nq1.LJIIIZ(nq1.getShowSeconds(), i2, 1, 1);
        } else {
            if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() == null) {
                return;
            }
            nq1.LJIIIZ(nq1.getShowSeconds(), nq1.getShowSeconds(), 1, 0);
        }
    }

    public static final void run$2(ARunnableS2S0102000_10 aRunnableS2S0102000_10) {
        int LIZIZ;
        NQ1 nq1 = (NQ1) aRunnableS2S0102000_10.l0;
        int i = aRunnableS2S0102000_10.i1;
        int i2 = aRunnableS2S0102000_10.i2;
        if (nq1.LJIIJJI() && !nq1.LJFF()) {
            if (C63081OpJ.LLIIIL(nq1.LJLLLL)) {
                LIZIZ = C04330Ez.LIZIZ(nq1.getContext(), R.color.c7);
            } else if (C63081OpJ.LJLJJLL(nq1.LJLLLL)) {
                LIZIZ = NPC.LIZLLL(nq1.LJLLILLLL, nq1.LJLLLL);
            } else {
                LIZIZ = NPC.LIZIZ(nq1.LJLLILLLL, nq1.LJLLLL);
            }
            nq1.LJIIJ(LIZIZ, 300);
            nq1.LJLILLLLZI = true;
            if (C46278IEg.LIZ()) {
                N7D LIZJ = C58784N5g.LIZIZ.LIZJ(nq1.LJLLLL);
                if (LIZJ != null) {
                    LIZJ.is0(3);
                }
            } else {
                SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIILIIL(3, nq1.LJLLLL);
            }
            if (i == 1) {
                nq1.LJIIIZ(nq1.getColorChangeSeconds(), i2, 2, 1);
            } else {
                if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() == null) {
                    return;
                }
                nq1.LJIIIZ(nq1.getColorChangeSeconds(), nq1.getColorChangeSeconds(), 2, 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Yns, X.Prl] */
    public static final void run$3(ARunnableS2S0102000_10 aRunnableS2S0102000_10) {
        boolean LIZ;
        try {
            int i = aRunnableS2S0102000_10.i1;
            OXB oxb = (OXB) aRunnableS2S0102000_10.l0;
            if (i == oxb.LJLILLLLZI) {
                oxb.notifyDataSetChanged();
            } else {
                oxb.notifyItemChanged(aRunnableS2S0102000_10.i2);
            }
            OXB oxb2 = (OXB) aRunnableS2S0102000_10.l0;
            ?? r1 = oxb2.LJLLJ;
            if (r1 != 0) {
                r1.invoke(oxb2.LJLJLLL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0102000_10(int i, Object obj, int i2, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.l0 = obj;
        this.i2 = i2;
    }
}
