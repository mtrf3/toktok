package X;

import Y.ARunnableS17S0201000_14;
import android.app.Activity;
import android.app.Application;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vxe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81434Vxe {
    public static final VJH LIZ;

    static {
        Application application = C44172HVg.LIZ;
        C44172HVg.LJIIJ.getClass();
        LIZ = VJG.LIZ(application, "guide");
    }

    public static void LIZ(Activity activity, SmartImageView smartImageView) {
        int i = LIZ.LIZ.getInt("duet_layout_tool_bar_bubble_hint", 0);
        if (i >= 1 || smartImageView.getParent() == null || activity.isFinishing()) {
            return;
        }
        C139825eE c139825eE = new C139825eE(activity);
        c139825eE.LIZ.LIZIZ = smartImageView;
        c139825eE.LJIIJJI(R.string.f1h);
        c139825eE.LIZ.LJII = 5000L;
        c139825eE.LJI(WHL.START);
        smartImageView.postDelayed(new ARunnableS17S0201000_14(i, activity, c139825eE.LIZJ(), 17), 500L);
    }
}
