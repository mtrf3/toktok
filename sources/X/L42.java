package X;

import com.ss.android.ugc.aweme.dsp.experiment.MusicDspExpConfig;

/* loaded from: classes10.dex */
public final class L42 extends AbstractC65781Prl implements InterfaceC65784Pro<MusicDspExpConfig> {
    public static final L42 LJLIL = new L42();

    public L42() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.dsp.experiment.MusicDspExpConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MusicDspExpConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        MusicDspExpConfig musicDspExpConfig = L41.LIZIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "music_dsp_strategy", 31744, MusicDspExpConfig.class, musicDspExpConfig);
        if (LJIJ == 0) {
            return new MusicDspExpConfig(0, 0, false, false, 0, 31, null);
        }
        return LJIJ;
    }
}
