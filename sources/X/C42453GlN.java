package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;

/* renamed from: X.GlN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42453GlN {
    public static boolean LIZ(Activity activity, String str, boolean z, boolean z2) {
        if (activity == null) {
            return false;
        }
        if (z) {
            AVExternalServiceImpl.LIZ().asyncService(activity, "notification", new IDLCallbackS60S0100000_7(activity, 1));
            return true;
        }
        if (!z2 || TextUtils.isEmpty(str)) {
            return false;
        }
        new C44066HRe().LIZJ(activity, str, "notification");
        return true;
    }
}
