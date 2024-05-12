package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig;

/* renamed from: X.5tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149595tz {
    public static final AutoMusicRecommendConfig LIZ = new AutoMusicRecommendConfig(null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, false, false, 15, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C149605u0.LJLIL);

    public static final boolean LIZ() {
        C62822Ol8 c62822Ol8 = LIZIZ;
        if ((((AutoMusicRecommendConfig) c62822Ol8.getValue()).originRecordEnabled || ((AutoMusicRecommendConfig) c62822Ol8.getValue()).originUploadEnabled) && !((RBY) HG3.LJIILL()).isChildrenMode() && ((RBX) HG3.LJIILL()).getCurUser().getAccountType() != 3) {
            return true;
        }
        return false;
    }
}
