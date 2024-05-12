package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;

/* renamed from: X.7bK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188987bK extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, C2UV>> {
    public static final C188987bK LJLIL = new C188987bK();

    public C188987bK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, C2UV> invoke() {
        int i;
        if (((int) PoiEnableExperiment.LIZ().poiAwemeCacheCount) == 0) {
            i = 15;
        } else {
            i = (int) PoiEnableExperiment.LIZ().poiAwemeCacheCount;
        }
        return new LruCache<>(i);
    }
}
