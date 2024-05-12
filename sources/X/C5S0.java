package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.5S0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S0 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean LIZIZ(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            }
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        if (((Activity) context).isDestroyed()) {
            return false;
        }
        return !r3.isFinishing();
    }
}
