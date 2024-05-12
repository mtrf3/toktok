package X;

import android.util.LruCache;
import ujb.o;

/* renamed from: X.7dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190317dT {
    public static final LruCache<String, String> LIZ = new LruCache<>(3);

    public static String LIZ(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return null;
        }
        return LIZ.get(str);
    }
}
