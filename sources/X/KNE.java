package X;

import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class KNE implements C05U {
    public final /* synthetic */ KN9 LJLIL;

    @Override // X.C05U
    public final void LIZ() {
    }

    @Override // X.C05U
    public final void LIZJ() {
    }

    @Override // X.C05U
    public final void LIZLLL() {
    }

    public KNE(KN9 kn9) {
        this.LJLIL = kn9;
    }

    @Override // X.C05U
    public final void LIZIZ(int i) {
        C45601qe c45601qe = this.LJLIL.LLJJJ;
        int i2 = 0;
        if (c45601qe != null) {
            c45601qe.setInteractionEnabled(false);
        }
        if (i != R.id.kdy) {
            if (i == R.id.ke3) {
                i2 = 1;
            } else if (i == R.id.ke1) {
                i2 = 2;
            }
        }
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LJLIL.LLJJ;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.gv0(new C51597KMv(Integer.valueOf(i2)));
        }
    }
}
