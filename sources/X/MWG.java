package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;

/* loaded from: classes10.dex */
public final class MWG extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, MW7>> {
    public static final MWG LJLIL = new MWG();

    public MWG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, MW7> invoke() {
        return new LruCache<>(NoticeVideoManager.LIZIZ().rollingCacheCount);
    }
}
