package X;

import com.ss.android.ugc.aweme.bullet.utils.CCAnchorLandingPagePreloadVideo;
import com.ss.android.ugc.aweme.bullet.utils.PreloadVideoConfigSize;

/* loaded from: classes15.dex */
public final class VFE extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final VFE LJLIL = new VFE();

    public VFE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        PreloadVideoConfigSize preloadVideoConfigSize;
        CCAnchorLandingPagePreloadVideo LIZ = VFG.LIZ();
        if (LIZ != null && (preloadVideoConfigSize = LIZ.preloadSize) != null) {
            j = preloadVideoConfigSize.lowLevel;
        } else {
            j = 204800;
        }
        return Long.valueOf(j);
    }
}
