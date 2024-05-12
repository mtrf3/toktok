package X;

import Y.ARunnableS9S0000100_8;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.IFz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46323IFz {
    public static final void LIZJ() {
        IG0.LIZJ = null;
        if (IG0.LIZIZ && !IG0.LIZ) {
            IG0.LIZ = true;
            IG0.LJIIIIZZ.postDelayed(IG0.LJIIJ, 1000L);
        }
        IG0.LIZ();
    }

    public static final void LIZ() {
        if (IG0.LIZ) {
            IG0.LIZ = false;
            IG0.LJIIIIZZ.removeCallbacks(IG0.LJIIJ);
        }
        IG0.LIZIZ();
        C37179EiV.LJFF.post(new ARunnableS9S0000100_8(IG0.LJ, 0));
        IG0.LIZ();
    }

    public static final void LIZLLL() {
        if (IG0.LIZIZ && !IG0.LIZ) {
            IG0.LIZ = true;
            IG0.LJIIIIZZ.postDelayed(IG0.LJIIJ, 1000L);
        }
        IG0.LIZ();
    }

    public static final void LIZIZ(Aweme aweme) {
        IG0.LIZJ = aweme;
        IG0.LIZ();
    }
}
