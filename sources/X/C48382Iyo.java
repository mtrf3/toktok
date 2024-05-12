package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: X.Iyo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48382Iyo extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Aweme, Integer>> {
    public static final C48382Iyo LJLIL = new C48382Iyo();

    public C48382Iyo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Aweme, Integer> invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "feed_ad_async_log", true, false);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (z) {
            return Collections.synchronizedMap(new WeakHashMap());
        }
        return new WeakHashMap();
    }
}
