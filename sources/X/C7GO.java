package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.experiment.VideoViewerMaxFollowersConfig;

/* renamed from: X.7GO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GO extends AbstractC65781Prl implements InterfaceC65784Pro<VideoViewerMaxFollowersConfig> {
    public static final C7GO LJLIL = new C7GO();

    public C7GO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final VideoViewerMaxFollowersConfig invoke() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            VideoViewerMaxFollowersConfig videoViewerMaxFollowersConfig = C7GN.LIZ;
            VideoViewerMaxFollowersConfig videoViewerMaxFollowersConfig2 = (VideoViewerMaxFollowersConfig) LIZLLL.LJIIIIZZ("video_views_config", VideoViewerMaxFollowersConfig.class, videoViewerMaxFollowersConfig);
            if (videoViewerMaxFollowersConfig2 != null) {
                return videoViewerMaxFollowersConfig2;
            }
            return videoViewerMaxFollowersConfig;
        } catch (Throwable unused) {
            return C7GN.LIZ;
        }
    }
}
