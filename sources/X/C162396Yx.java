package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162396Yx {
    public final LruCache<String, Bitmap> LIZ;
    public final List<String> LIZIZ;
    public volatile boolean LIZJ;

    public C162396Yx() {
        this(1000);
    }

    public C162396Yx(int i) {
        this.LIZ = new LruCache<>(i);
        this.LIZIZ = new ArrayList();
        this.LIZJ = true;
    }

    public final Bitmap LIZ(String key) {
        o.LJIIIZ(key, "key");
        if (this.LIZJ) {
            return this.LIZ.get(key);
        }
        return null;
    }
}
