package X;

import com.ss.android.ugc.aweme.video.preload.experiment.VideoCoverPreloadConfig;

/* loaded from: classes9.dex */
public final class IH3 extends AbstractC65781Prl implements InterfaceC65784Pro<VideoCoverPreloadConfig> {
    public static final IH3 LJLIL = new IH3();

    public IH3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final VideoCoverPreloadConfig invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            VideoCoverPreloadConfig videoCoverPreloadConfig = IH2.LIZ;
            LJIIIZ.getClass();
            VideoCoverPreloadConfig videoCoverPreloadConfig2 = (VideoCoverPreloadConfig) FFL.LJIJ(true, "video_cover_preload_config", 31744, VideoCoverPreloadConfig.class, videoCoverPreloadConfig);
            if (videoCoverPreloadConfig2 != null) {
                return videoCoverPreloadConfig2;
            }
        } catch (Throwable unused) {
        }
        return new VideoCoverPreloadConfig(false, false, false, 0, 15, null);
    }
}
