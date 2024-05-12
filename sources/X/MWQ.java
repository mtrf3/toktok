package X;

import android.util.LruCache;

/* loaded from: classes10.dex */
public final class MWQ extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, MW7>> {
    public static final MWQ LJLIL = new MWQ();

    public MWQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, MW7> invoke() {
        return new LruCache<>(12);
    }
}
