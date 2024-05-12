package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NO7 {
    public static NWF LIZ(Activity activity) {
        NWF nwf;
        FrameLayout LIZIZ = LIZIZ(activity);
        if (LIZIZ != null) {
            nwf = (NWF) LIZIZ.findViewById(R.id.tl);
        } else {
            nwf = null;
        }
        if (!(nwf instanceof NWF)) {
            return null;
        }
        return nwf;
    }

    public static FrameLayout LIZIZ(Activity activity) {
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.tr);
        if (viewStub == null) {
            return (FrameLayout) activity.findViewById(R.id.tq);
        }
        viewStub.setLayoutResource(R.layout.c7t);
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }
}
