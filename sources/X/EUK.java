package X;

import android.graphics.LinearGradient;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EUK extends LruCache<String, LinearGradient> {
    @Override // android.util.LruCache
    public final LinearGradient create(String key) {
        o.LJIIIZ(key, "key");
        return null;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, String key, LinearGradient oldValue, LinearGradient linearGradient) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(oldValue, "oldValue");
    }

    @Override // android.util.LruCache
    public final int sizeOf(String key, LinearGradient value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return 1;
    }

    public EUK() {
        super(50);
    }
}
