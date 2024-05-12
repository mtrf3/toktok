package X;

import com.ss.android.ugc.aweme.dsp.experiment.DspClipConfig;

/* loaded from: classes16.dex */
public final class YBN extends AbstractC65781Prl implements InterfaceC65784Pro<DspClipConfig> {
    public static final YBN LJLIL = new YBN();

    public YBN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.dsp.experiment.DspClipConfig] */
    @Override // X.InterfaceC65784Pro
    public final DspClipConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        DspClipConfig dspClipConfig = YBM.LIZIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "music_dsp_clip_song_audition", 31744, DspClipConfig.class, dspClipConfig);
        if (LJIJ == 0) {
            return new DspClipConfig();
        }
        return LJIJ;
    }
}
