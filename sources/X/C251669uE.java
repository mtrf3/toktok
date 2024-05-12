package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.9uE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251669uE {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();

    public static boolean LIZ(View view, long j) {
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
