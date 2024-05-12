package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHM implements OHO {
    @Override // X.OHO
    public final String LIZLLL() {
        return "android.permission.ACCEPT_HANDOVER";
    }

    @Override // X.OHO
    public final Intent LIZ(Context context) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // X.OHO
    public final boolean LIZIZ(Activity context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 28 && C04330Ez.LIZ(context, "android.permission.ACCEPT_HANDOVER") == 0) {
            return true;
        }
        return false;
    }

    @Override // X.OHO
    public final boolean LIZJ(Activity context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return OHP.LIZ(this, context);
    }
}
