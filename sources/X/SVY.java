package X;

import com.ss.android.ugc.aweme.music.ab.MusicCollectUiStyleConfig;

/* loaded from: classes13.dex */
public final class SVY extends AbstractC65781Prl implements InterfaceC65784Pro<MusicCollectUiStyleConfig> {
    public static final SVY LJLIL = new SVY();

    public SVY() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.music.ab.MusicCollectUiStyleConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MusicCollectUiStyleConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        MusicCollectUiStyleConfig musicCollectUiStyleConfig = SVX.LIZIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "music_collect_ui_style_exp", 31744, MusicCollectUiStyleConfig.class, musicCollectUiStyleConfig);
        if (LJIJ == 0) {
            return new MusicCollectUiStyleConfig(false, false, false, 7, null);
        }
        return LJIJ;
    }
}
