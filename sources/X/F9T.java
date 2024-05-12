package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class F9T {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        SharedPreferences LIZIZ;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (context != null && (LIZIZ = F9J.LIZIZ(context, 0, "LeakDetectorSp")) != null && (edit = LIZIZ.edit()) != null && (putString = edit.putString("ld_memory_peak_dump_file", str)) != null) {
            putString.commit();
        }
    }

    public static void LIZIZ(Context context, String str) {
        SharedPreferences LIZIZ;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (context != null && (LIZIZ = F9J.LIZIZ(context, 0, "LeakDetectorSp")) != null && (edit = LIZIZ.edit()) != null && (putString = edit.putString("ld_oom_dump_file", str)) != null) {
            putString.commit();
        }
    }
}
