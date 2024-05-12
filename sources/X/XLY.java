package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XLY {
    public static final XLY LIZ = new XLY();
    public static final LruCache<String, Bitmap> LIZIZ = new LruCache<>(200);

    public static Bitmap LIZ(String key) {
        o.LJIIIZ(key, "key");
        return LIZIZ.get(key);
    }

    public final synchronized void LIZIZ(Bitmap bitmap, String key) {
        o.LJIIIZ(key, "key");
        LIZIZ.put(key, bitmap);
    }
}
