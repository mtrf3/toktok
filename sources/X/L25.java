package X;

import com.ss.android.ugc.aweme.story.experiment.PreloadConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L25 extends AbstractC65781Prl implements InterfaceC65784Pro<PreloadConfig> {
    public static final L25 LJLIL = new L25();

    public L25() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PreloadConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PreloadConfig preloadConfig = L26.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "social_story_avatar_detail_preload", 31744, PreloadConfig.class, preloadConfig);
        if (LJIJ != 0) {
            preloadConfig = LJIJ;
        }
        o.LJIIIIZZ(preloadConfig, "ABManager.getInstance().…p::class.java) ?: DEFAULT");
        return preloadConfig;
    }
}
