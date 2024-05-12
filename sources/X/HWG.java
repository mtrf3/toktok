package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HWG {
    public static void LIZ(Context context, HWH hwh) {
        hwh.setCancelable(false);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!V1B.LJJZZI(activity, true) || activity.isFinishing() || new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/music/ui/DoubleBallLoadingDialog", "show", hwh, new Object[0], "void", new C65300Pk0(false, "()V", "2349878303289576266")).LIZ) {
                return;
            }
            hwh.show();
        }
    }

    public static HWH LIZIZ(Context context, HWK cancelType, HWI hwi) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
        HWH hwh = new HWH(context, cancelType);
        hwh.LJLJLJ = hwi;
        LIZ(context, hwh);
        return hwh;
    }
}
