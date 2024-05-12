package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHP {
    public static boolean LIZ(OHO oho, Activity context) {
        o.LJIIIZ(context, "context");
        if (context.checkSelfPermission(oho.LIZLLL()) == -1 && !context.shouldShowRequestPermissionRationale(oho.LIZLLL())) {
            return true;
        }
        return false;
    }
}
