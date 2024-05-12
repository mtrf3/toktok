package X;

import android.util.LruCache;

/* loaded from: classes8.dex */
public final class I94 extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, HNQ>> {
    public static final I94 LJLIL = new I94();

    public I94() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, HNQ> invoke() {
        return new LruCache<>(10);
    }
}
