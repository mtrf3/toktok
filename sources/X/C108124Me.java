package X;

import android.util.LruCache;

/* renamed from: X.4Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108124Me extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, C108144Mg>> {
    public static final C108124Me LJLIL = new C108124Me();

    public C108124Me() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, C108144Mg> invoke() {
        return new LruCache<>(30);
    }
}
