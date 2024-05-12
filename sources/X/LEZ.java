package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LEZ implements LLX {
    public static final LEZ LIZ = new LEZ();

    public static final int LIZLLL() {
        C52844Koa.LIZ.getClass();
        return ((Number) C52844Koa.LIZIZ.getValue()).intValue();
    }

    public static boolean LJFF() {
        if (C35686DzW.LIZ("ITabletNavRailHelper.isDeviceSupport")) {
            return false;
        }
        return LEP.LIZ(null);
    }

    @Override // X.LLX
    public final boolean LIZ() {
        if (!LJFF()) {
            return false;
        }
        return LEO.LIZLLL();
    }

    public final C90N LJ(View view) {
        if (LIZ()) {
            return new LFN(view);
        }
        return C53918LEc.LJLIL;
    }

    @Override // X.LLX
    public final boolean LIZIZ(Activity activity, Configuration configuration) {
        if (!LJFF()) {
            return false;
        }
        if (C54964Lhg.LIZ) {
            String str = null;
            if (C53946LFe.LIZJ(activity, null).LJFF) {
                StringBuilder LIZ2 = X1D.LIZ();
                if (activity != null) {
                    str = C16880lQ.LJLLJ(activity.getClass());
                }
                LIZ2.append(str);
                LIZ2.append(" useCommentSplit: true, r: is super device");
                LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ2));
                return true;
            }
        }
        if (!LF2.LIZIZ(activity)) {
            return false;
        }
        if (activity != null && (C78886Uxe.LJJIJIIJIL(activity) || C78886Uxe.LJJIJIL(activity))) {
            return false;
        }
        return LEO.LJ(activity, configuration);
    }

    public final C2LI LIZJ(int i, C62828OlE progressBar) {
        o.LJIIIZ(progressBar, "progressBar");
        if (LIZ()) {
            return new LFM(progressBar, i);
        }
        return C53918LEc.LJLIL;
    }
}
