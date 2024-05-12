package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GkN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42391GkN {
    public static NWF LIZ(Activity activity) {
        NWF nwf = (NWF) LIZIZ(activity).findViewById(R.id.tl);
        if (nwf instanceof NWF) {
            return nwf;
        }
        return null;
    }

    public static FrameLayout LIZIZ(Activity activity) {
        FrameLayout frameLayout;
        View findViewById;
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.ro);
        if (viewStub == null) {
            frameLayout = (FrameLayout) activity.findViewById(R.id.rn);
        } else {
            viewStub.setLayoutResource(R.layout.azj);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            frameLayout = (FrameLayout) inflate;
        }
        if (frameLayout == null) {
            ViewStub viewStub2 = (ViewStub) activity.findViewById(R.id.qo);
            if (viewStub2 == null) {
                frameLayout = (FrameLayout) activity.findViewById(R.id.qn);
            } else {
                viewStub2.setLayoutResource(R.layout.fv);
                View inflate2 = viewStub2.inflate();
                o.LJII(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
                frameLayout = (FrameLayout) inflate2;
            }
            if (frameLayout == null && ((findViewById = activity.findViewById(R.id.k8p)) == null || (frameLayout = (FrameLayout) findViewById.findViewById(R.id.u2)) == null)) {
                View inflate3 = View.inflate(activity, R.layout.g4, null);
                o.LJII(inflate3, "null cannot be cast to non-null type android.widget.FrameLayout");
                frameLayout = (FrameLayout) inflate3;
                View findViewById2 = activity.findViewById(R.id.k8p);
                if (findViewById2 != null && (activity instanceof SparkActivity) && findViewById2.getHeight() > C60996Nwm.LJ(activity) - C63081OpJ.LJJJJLI(activity)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C60996Nwm.LJIIIIZZ(activity), C60996Nwm.LJ(activity) - C63081OpJ.LJJJJLI(activity));
                    marginLayoutParams.topMargin = C63081OpJ.LJJJJLI(activity);
                    frameLayout.setLayoutParams(marginLayoutParams);
                }
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.k8p);
                if (viewGroup != null) {
                    viewGroup.addView(frameLayout);
                }
            }
        }
        return frameLayout;
    }
}
