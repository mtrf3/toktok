package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHJ implements OHO {
    @Override // X.OHO
    public final String LIZLLL() {
        return "android.permission.SYSTEM_ALERT_WINDOW";
    }

    @Override // X.OHO
    public final Intent LIZ(Context context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        if (OHI.LIZLLL()) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            if (Build.VERSION.SDK_INT < 30) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("package:");
                LIZ.append(context.getPackageName());
                intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
            }
            if (OHI.LIZ(context, intent)) {
                return intent;
            }
        }
        return OHI.LIZIZ(context);
    }

    @Override // X.OHO
    public final boolean LIZIZ(Activity context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        if (OHI.LIZLLL()) {
            return Settings.canDrawOverlays(context);
        }
        return true;
    }

    @Override // X.OHO
    public final boolean LIZJ(Activity context) {
        o.LJIIIZ(context, "context");
        return OHP.LIZ(this, context);
    }
}
