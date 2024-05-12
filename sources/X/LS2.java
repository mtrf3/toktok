package X;

import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.SlidingGestureHintConfig;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LS2 implements LZP {
    public final /* synthetic */ EdgeSlideGuideAssem LIZIZ;

    public static final Keva LJIIIIZZ() {
        LZP.LIZ.getClass();
        Keva repo = Keva.getRepo("edge_slide_guide");
        o.LJIIIIZZ(repo, "getRepo(ISlideOperator.KEVA_REPO_NAME)");
        return repo;
    }

    @Override // X.LZP
    public final boolean LIZJ() {
        EdgeSlideGuideAssem edgeSlideGuideAssem = this.LIZIZ;
        if (edgeSlideGuideAssem.L3(edgeSlideGuideAssem.LJZL)) {
            EdgeSlideGuideAssem edgeSlideGuideAssem2 = this.LIZIZ;
            if (edgeSlideGuideAssem2.M3(edgeSlideGuideAssem2.LL)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.LZP
    public final int LIZLLL() {
        TuxTextView tuxTextView = this.LIZIZ.LJZ;
        if (tuxTextView != null && C26338AVi.LIZLLL(tuxTextView)) {
            return R.string.rea;
        }
        return R.string.re_;
    }

    @Override // X.LZP
    public final int LJ() {
        Integer num = ((SlidingGestureHintConfig) LS5.LIZIZ.getValue()).hintShowCount;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.LZP
    public final void LIZ() {
        LJIIIIZZ().storeBoolean("has_shown_first_guide", true);
    }

    @Override // X.LZP
    public final boolean LIZIZ() {
        return LJIIIIZZ().getBoolean("has_shown_first_guide", false);
    }

    @Override // X.LZP
    public final int LJFF() {
        return LJIIIIZZ().getInt("text_guide_show_count", 0);
    }

    @Override // X.LZP
    public final int LJII() {
        return LIZLLL();
    }

    public LS2(EdgeSlideGuideAssem edgeSlideGuideAssem) {
        this.LIZIZ = edgeSlideGuideAssem;
    }

    @Override // X.LZP
    public final void LJI(int i) {
        LJIIIIZZ().storeInt("text_guide_show_count", i);
    }
}
