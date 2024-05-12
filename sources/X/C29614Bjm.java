package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;

/* renamed from: X.Bjm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29614Bjm {
    public static final LruCache<Class, String> LIZ = new LruCache<>(100);
    public static SparseArray<String> LIZIZ;
    public static java.util.Set<Integer> LIZJ;

    public static String LIZ(Class cls) {
        LruCache<Class, String> lruCache = LIZ;
        String str = lruCache.get(cls);
        if (TextUtils.isEmpty(str)) {
            str = C16880lQ.LJLLJ(cls);
            if (TextUtils.isEmpty(str)) {
                str = "Anonymous";
            }
            lruCache.put(cls, str);
        }
        return str;
    }
}
