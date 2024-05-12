package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class BN0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, float f) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = C15380j0.LIZ(f);
            layoutParams.width = C15380j0.LIZ(f);
            view.setLayoutParams(layoutParams);
        }
    }

    public static void LIZIZ(C47061t0 c47061t0, C47061t0 c47061t02) {
        int LJIIJJI;
        ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
        if (layoutParams != null) {
            LJIIJJI = layoutParams.width;
        } else {
            LJIIJJI = C87277YNd.LJIIJJI(60);
        }
        LIZ(c47061t02, ((LJIIJJI * 1.6f) / C16880lQ.LLLLL(C15380j0.LIZLLL()).getResources().getDisplayMetrics().density) + 0.5f);
    }
}
