package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* renamed from: X.El2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37336El2 extends LruCache<String, Bitmap> {
    public C37336El2() {
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
