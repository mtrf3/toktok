package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.Go3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42619Go3 extends LruCache<String, Bitmap> {
    public C42619Go3(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        return bitmap2.getHeight() * bitmap2.getRowBytes();
    }
}
