package X;

import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import yq4.a;

/* loaded from: classes10.dex */
public final class L72 implements Runnable {
    public static final L72 LJLIL = new L72();

    public static void LIZ() {
        boolean z;
        try {
            if (!C40471FuV.LIZ()) {
                StringBuilder sb = new StringBuilder("value is null: ");
                if (C53765L8f.LJIIIZ() == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                sb.append(", isTopTabInvalid: ");
                sb.append(C53765L8f.LJIILLIIL());
                sb.append(", isBottomTabInvalid: ");
                sb.append(C53765L8f.LJIIJ());
                sb.append(", isSlideConfigInvalid: ");
                sb.append(C53765L8f.LJIILL());
                sb.append(", mall value is: ");
                sb.append(((Number) C53112Ksu.LIZ.getValue()).intValue());
                sb.append(", isDuoService: ");
                sb.append(MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ()));
                sb.append(", ab value: ");
                FFL.LJIIIZ().getClass();
                sb.append(FFL.LJIIJ(31744, 0, "feed_tab_platform_enable", true));
                sb.append(", shouldShowMallTab: ");
                sb.append(C40471FuV.LIZIZ());
                sb.append(", is restrict mode: ");
                sb.append(a.LJIILL().LJIJ());
                C36922EeM.LIZLLL(4, "TabMovingExpReporter", sb.toString());
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
