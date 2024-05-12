package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NU0 {
    public static void LIZ(ActivityC45651qj activityC45651qj) {
        NWF LIZIZ;
        C59501NWv c59501NWv;
        NWF LIZIZ2 = LIZIZ(activityC45651qj);
        if (LIZIZ2 != null && LIZIZ2.LJIIJJI() && (LIZIZ = LIZIZ(activityC45651qj)) != null && LIZIZ.LJIIJJI() && (c59501NWv = (C59501NWv) LIZIZ.LIZ(R.id.hx7)) != null) {
            c59501NWv.LJIJJLI();
        }
    }

    public static NWF LIZIZ(ActivityC45651qj activityC45651qj) {
        NWF nwf;
        FrameLayout LIZJ = LIZJ(activityC45651qj);
        if (LIZJ != null) {
            nwf = (NWF) LIZJ.findViewById(R.id.ri);
        } else {
            nwf = null;
        }
        if (!(nwf instanceof NWF)) {
            return null;
        }
        return nwf;
    }

    public static FrameLayout LIZJ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) activityC45651qj.findViewById(R.id.rh);
        if (viewStub == null || viewStub.getParent() == null) {
            if (activityC45651qj == null) {
                return null;
            }
            return (FrameLayout) activityC45651qj.findViewById(R.id.rg);
        }
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }
}
