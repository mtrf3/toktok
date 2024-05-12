package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.6ZS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZS {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();

    public static final boolean LIZ(View view) {
        return LIZIZ(view, 1200L);
    }

    public static boolean LIZIZ(View view, long j) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = LIZ;
        Long l = weakHashMap.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            weakHashMap.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            return true;
        }
        weakHashMap.put(view, Long.valueOf(nanoTime));
        return false;
    }
}
