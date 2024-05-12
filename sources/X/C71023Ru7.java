package X;

import android.util.LruCache;

/* renamed from: X.Ru7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71023Ru7 {
    public static final LruCache<String, C71022Ru6> LIZ = new LruCache<>(2);

    public static boolean LIZ(String str, boolean z) {
        Boolean bool;
        C71022Ru6 c71022Ru6 = LIZ.get(str);
        if (c71022Ru6 != null && (bool = c71022Ru6.LIZIZ) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static boolean LIZIZ(String str, boolean z) {
        Boolean bool;
        C71022Ru6 c71022Ru6 = LIZ.get(str);
        if (c71022Ru6 != null && (bool = c71022Ru6.LIZLLL) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static boolean LIZJ(String str, boolean z) {
        Boolean bool;
        C71022Ru6 c71022Ru6 = LIZ.get(str);
        if (c71022Ru6 != null && (bool = c71022Ru6.LIZJ) != null) {
            return bool.booleanValue();
        }
        return z;
    }
}
