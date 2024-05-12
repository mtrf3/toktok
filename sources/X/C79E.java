package X;

import android.util.LruCache;

/* renamed from: X.79E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79E extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, Boolean>> {
    public static final C79E LJLIL = new C79E();

    public C79E() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, Boolean> invoke() {
        return new LruCache<>(3);
    }
}
