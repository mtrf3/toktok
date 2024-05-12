package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.0dK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11860dK {
    public static C11890dN LIZIZ(long j) {
        return LIZ(5, j);
    }

    public static C11890dN LIZ(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = C11700d4.LIZ(j, i);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(C78897Uxp.LJJJZ(j), C44384HbQ.LLILZ(i));
        }
        return new C11890dN(porterDuffColorFilter);
    }
}
