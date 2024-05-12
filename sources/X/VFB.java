package X;

import com.ss.android.ugc.aweme.bullet.utils.CCAnchorLandingPagePreloadVideo;
import com.ss.android.ugc.aweme.bullet.utils.PreloadVideoConfigAndroidScore;

/* loaded from: classes15.dex */
public final class VFB extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final VFB LJLIL = new VFB();

    public VFB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore;
        CCAnchorLandingPagePreloadVideo LIZ = VFG.LIZ();
        if (LIZ != null && (preloadVideoConfigAndroidScore = LIZ.androidScore) != null) {
            f = preloadVideoConfigAndroidScore.highLevel;
        } else {
            f = 8.0f;
        }
        return Float.valueOf(f);
    }
}
