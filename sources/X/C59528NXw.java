package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NXw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59528NXw {
    public static C59518NXm LIZ(Activity activity) {
        C59518NXm c59518NXm;
        FrameLayout LIZIZ = LIZIZ(activity);
        if (LIZIZ != null) {
            c59518NXm = (C59518NXm) LIZIZ.findViewById(R.id.bq6);
        } else {
            c59518NXm = null;
        }
        if (!(c59518NXm instanceof C59518NXm)) {
            return null;
        }
        return c59518NXm;
    }

    public static FrameLayout LIZIZ(Activity activity) {
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.bq3);
        if (viewStub == null) {
            return (FrameLayout) activity.findViewById(R.id.bq2);
        }
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }
}
