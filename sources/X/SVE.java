package X;

import com.ss.android.ugc.aweme.dsp.experiment.TTMUGAFConfig;

/* loaded from: classes13.dex */
public final class SVE extends AbstractC65781Prl implements InterfaceC65784Pro<TTMUGAFConfig> {
    public static final SVE LJLIL = new SVE();

    public SVE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.dsp.experiment.TTMUGAFConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final TTMUGAFConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        TTMUGAFConfig tTMUGAFConfig = SVD.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "music_dsp_af_s2s", 31744, TTMUGAFConfig.class, tTMUGAFConfig);
        if (LJIJ == 0) {
            return new TTMUGAFConfig(0, 0, 0, 7, null);
        }
        return LJIJ;
    }
}
