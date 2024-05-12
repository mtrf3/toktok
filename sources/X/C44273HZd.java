package X;

import android.app.Activity;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: X.HZd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44273HZd {
    public static final WeakHashMap<Activity, HashSet<String>> LIZ = new WeakHashMap<>();

    public static void LIZ(Activity activity, String str) {
        WeakHashMap<Activity, HashSet<String>> weakHashMap = LIZ;
        if (weakHashMap.get(activity) == null || !weakHashMap.get(activity).contains(str)) {
            HashSet<String> hashSet = weakHashMap.get(activity);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                weakHashMap.put(activity, hashSet);
            }
            hashSet.add(str);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
    }

    public static void LIZIZ(Activity activity, String str) {
        LIZ.get(activity).remove(str);
    }
}
