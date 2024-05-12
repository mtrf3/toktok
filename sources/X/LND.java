package X;

import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LND implements C0C3 {
    public final Fragment LJLIL;
    public final LinearLayout LJLILLLLZI;
    public TuxTextView LJLJI;
    public SlideGuideViewModel LJLJJI;
    public C54140LMq LJLJJL;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void LIZ() {
        if (this.LJLIL.mo49getActivity() == null && this.LJLJJI == null) {
            this.LJLILLLLZI.post(new ARunnableS45S0100000_9(this, 181));
            return;
        }
        ActivityC45651qj requireActivity = this.LJLIL.requireActivity();
        o.LJIIIIZZ(requireActivity, "mainFragment.requireActivity()");
        SlideGuideViewModel LIZ = C54133LMj.LIZ(requireActivity);
        LIZ.LJLJLJ.observe(this.LJLIL, new AObserverS73S0200000_9(this, LIZ, 6));
        LIZ.LJLJJLL.observe(this.LJLIL, new AObserverS77S0100000_9(this, 88));
        this.LJLJJI = LIZ;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        SlideGuideViewModel slideGuideViewModel = this.LJLJJI;
        if (slideGuideViewModel != null) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                slideGuideViewModel.LJLLL = true;
                return;
            }
            slideGuideViewModel.LJLLL = false;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        SlideGuideViewModel slideGuideViewModel = this.LJLJJI;
        if (slideGuideViewModel != null && i >= 0 && i < ((ArrayList) slideGuideViewModel.LJLLLLLL).size()) {
            String str = (String) ListProtector.get(slideGuideViewModel.LJLLLLLL, i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("observe ");
            LIZ.append(str);
            LIZ.append(" show!");
            C221018lt.LJFF("SlideGuide", X1D.LIZIZ(LIZ));
            slideGuideViewModel.LJLL = str;
            XKQ xkq = slideGuideViewModel.LJLLI;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            XKQ xkq2 = slideGuideViewModel.LJLLILLLL;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            slideGuideViewModel.setVisible(false);
            if (!slideGuideViewModel.LJLZ.contains(str)) {
                return;
            }
            if (o.LJ(str, "Following") && slideGuideViewModel.LJLLLL == null) {
                slideGuideViewModel.LJLLLL = Boolean.valueOf(slideGuideViewModel.LJLLL);
            }
            if (!slideGuideViewModel.LJLLL) {
                return;
            }
            slideGuideViewModel.LJLLL = false;
            slideGuideViewModel.iv0(500L, str);
        }
    }

    public LND(Fragment mainFragment, LinearLayout linearLayout) {
        o.LJIIIZ(mainFragment, "mainFragment");
        this.LJLIL = mainFragment;
        this.LJLILLLLZI = linearLayout;
    }
}
