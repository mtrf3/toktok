package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHN implements OHO {
    @Override // X.OHO
    public final String LIZLLL() {
        return "android.permission.ACCESS_NOTIFICATION_POLICY";
    }

    @Override // X.OHO
    public final Intent LIZ(Context context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        return OHI.LIZJ(context);
    }

    @Override // X.OHO
    public final boolean LIZIZ(Activity context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        return OHI.LJFF(context);
    }

    @Override // X.OHO
    public final boolean LIZJ(Activity context) {
        o.LJIIIZ(context, "context");
        return OHP.LIZ(this, context);
    }
}
