package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.ZfL, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90491ZfL {
    public static SharedPreferences LIZ;

    public static SharedPreferences LIZ(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (LIZ == null) {
                LIZ = (SharedPreferences) C90543ZgB.LIZ(new CallableC90490ZfK(context));
            }
            sharedPreferences = LIZ;
        }
        return sharedPreferences;
    }
}
