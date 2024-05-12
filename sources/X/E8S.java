package X;

import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class E8S {
    public static SharedPreferences LIZ() {
        return F9J.LIZIZ(EF7.LIZIZ(), 0, "video_view_count_sp");
    }

    public static SharedPreferences.Editor LIZIZ() {
        return LIZ().edit();
    }
}
