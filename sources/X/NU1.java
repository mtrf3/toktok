package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NU1 {
    public static NWF LIZ(ActivityC45651qj activityC45651qj) {
        NWF nwf;
        FrameLayout LIZIZ = LIZIZ(activityC45651qj);
        if (LIZIZ != null) {
            nwf = (NWF) LIZIZ.findViewById(R.id.rj);
        } else {
            nwf = null;
        }
        if (!(nwf instanceof NWF)) {
            return null;
        }
        return nwf;
    }

    public static FrameLayout LIZIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) activityC45651qj.findViewById(R.id.t4);
        if (viewStub == null || viewStub.getParent() == null) {
            if (activityC45651qj == null) {
                return null;
            }
            return (FrameLayout) activityC45651qj.findViewById(R.id.t3);
        }
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }
}
