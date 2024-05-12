package X;

import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* loaded from: classes9.dex */
public final class IUB {
    public ISimPlayerConfig LIZ;

    public static IPlayerExperiment LIZIZ() {
        return (IPlayerExperiment) InjectedConfigManager.getConfig(IPlayerExperiment.class);
    }

    public final ISimPlayerConfig LIZ() {
        if (this.LIZ == null) {
            this.LIZ = ((ISimPlayerConfigInjectWrapper) InjectedConfigManager.getConfig(ISimPlayerConfigInjectWrapper.class)).wrap((ISimPlayerConfig) InjectedConfigManager.getConfig(ISimPlayerConfig.class));
        }
        return this.LIZ;
    }
}
