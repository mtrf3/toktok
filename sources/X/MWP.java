package X;

import android.util.LruCache;

/* loaded from: classes10.dex */
public final class MWP extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, Integer>> {
    public static final MWP LJLIL = new MWP();

    public MWP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, Integer> invoke() {
        return new LruCache<>(50);
    }
}
