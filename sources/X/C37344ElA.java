package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* renamed from: X.ElA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37344ElA extends LruCache<String, Bitmap> {
    public C37344ElA() {
        super(52428800);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String key, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(bitmap2, "bitmap");
        return bitmap2.getByteCount();
    }
}
