package X;

import com.ss.android.ugc.aweme.audiomode.fullepisodev2.experiment.FullEpisodeConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IOP extends AbstractC65781Prl implements InterfaceC65784Pro<FullEpisodeConfig> {
    public static final IOP LJLIL = new IOP();

    public IOP() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final FullEpisodeConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        FullEpisodeConfig fullEpisodeConfig = IOO.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "podcast_full_episode_config", 31744, FullEpisodeConfig.class, fullEpisodeConfig);
        if (LJIJ != 0) {
            fullEpisodeConfig = LJIJ;
        }
        o.LJIIIIZZ(fullEpisodeConfig, "ABManager.getInstance().…ch::class.java) ?: CONFIG");
        return fullEpisodeConfig;
    }
}
