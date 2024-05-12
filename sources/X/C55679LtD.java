package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: X.LtD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55679LtD extends FWI {
    public C55679LtD() {
        super(0);
    }

    @Override // X.FWI
    public final C36821Ecj<Long> LIZIZ() {
        return SharePrefCache.inst().getLastFeedTime();
    }
}
