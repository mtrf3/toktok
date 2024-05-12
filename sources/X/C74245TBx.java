package X;

import android.text.StaticLayout;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* renamed from: X.TBx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74245TBx extends LruCache<String, StaticLayout> {
    @Override // android.util.LruCache
    public final StaticLayout create(String key) {
        o.LJIIIZ(key, "key");
        return null;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, String key, StaticLayout oldValue, StaticLayout staticLayout) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(oldValue, "oldValue");
    }

    @Override // android.util.LruCache
    public final int sizeOf(String key, StaticLayout value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return 1;
    }

    public C74245TBx() {
        super(50);
    }
}
