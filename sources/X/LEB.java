package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LEB implements LL9 {
    public static final LEB LIZ = new LEB();
    public static final int LIZIZ = C7MY.LIZIZ(56);
    public static final int LIZJ = C7MY.LIZIZ(100);
    public static int LIZLLL = 1;
    public static int LJ = 1;
    public static boolean LJFF = true;

    public static int LIZJ() {
        int i = LIZLLL;
        if (C40471FuV.LIZ()) {
            if (i <= 1) {
                return LIZIZ;
            }
            O6R.LJJIIZ(C32151Nz.LJIIZILJ(108));
            return LIZJ;
        }
        return LJ();
    }

    public static int LIZLLL() {
        int i = LJ;
        if (C40471FuV.LIZ()) {
            if (i <= 1) {
                return LIZIZ;
            }
            O6R.LJJIIZ(C32151Nz.LJIIZILJ(108));
            return LIZJ;
        }
        return LJ();
    }

    public static int LJ() {
        if (C53302Kvy.LIZ()) {
            return C7MY.LIZIZ(52);
        }
        if (C51645KOr.LIZIZ.LJIIIZ() || ECommerceMallService.v3().Q1()) {
            return C7MY.LIZIZ(56);
        }
        if (((Number) C52679Klv.LIZ.getValue()).intValue() == 1) {
            return C7MY.LIZIZ(56);
        }
        return C7MY.LIZIZ(60);
    }

    @Override // X.LL9
    public final boolean LIZ() {
        return LJFF;
    }

    public static float LIZIZ(Context context, boolean z) {
        SpecialTopicEntry specialTopicEntry;
        float f;
        o.LJIIIZ(context, "context");
        if (C53302Kvy.LIZ()) {
            return KL2.LIZJ(context, 52.0f);
        }
        try {
            FFL.LJIIIZ().getClass();
            specialTopicEntry = (SpecialTopicEntry) FFL.LJIILLIIL(SpecialTopicEntry.class, "special_event_entrypoint", true);
        } catch (Throwable unused) {
            specialTopicEntry = null;
        }
        float LIZJ2 = KL2.LIZJ(context, 20.0f);
        if (specialTopicEntry != null && specialTopicEntry.getEnable() && specialTopicEntry.getLandingRoute().length() > 0 && specialTopicEntry.getIconUrl().length() > 0 && (!AV1.LJIIJJI() || specialTopicEntry.getChildViewable())) {
            if (z) {
                f = KL2.LIZJ(context, 56.0f);
            } else {
                f = KL2.LIZJ(context, 40.0f);
            }
        } else {
            f = 0.0f;
        }
        return LIZJ2 + f;
    }
}
