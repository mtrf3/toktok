package X;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: X.Ftx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40437Ftx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity, JJ4 jj4, String str, String str2) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        activity.runOnUiThread(new RunnableC40435Ftv(activity, jj4, str, str2));
    }
}
