package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237149Sk {
    public static String LIZ(Activity activity, int i) {
        String string;
        for (EnumC237169Sm enumC237169Sm : EnumC237169Sm.values()) {
            if (enumC237169Sm.getCount() == i) {
                if (activity == null || (string = activity.getString(R.string.j9l)) == null) {
                    return "";
                }
                return Q8U.LIZIZ(new Object[]{Integer.valueOf(enumC237169Sm.getCount())}, 1, string, "format(this, *args)");
            }
        }
        return "";
    }
}
