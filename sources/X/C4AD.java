package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;

/* renamed from: X.4AD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AD {
    public static final void LIZ(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        C4AE c4ae = C4AE.LIZ;
        c4ae.getClass();
        String[] LIZ = C4AE.LIZ();
        if (LIZ == null || LIZ.length == 0) {
            SmartRouter.buildRoute(context, str).open();
            return;
        }
        try {
            String LIZJ = C4AE.LIZJ(c4ae, str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(LIZJ));
            C16880lQ.LIZJ(context, intent);
        } catch (Exception unused) {
        }
    }
}
