package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* renamed from: X.Ihv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47335Ihv {
    public static C47421IjJ LIZ() {
        return new C47421IjJ(((IVideoPreloadConfigInjectWrapper) InjectedConfigManager.getConfig(IVideoPreloadConfigInjectWrapper.class)).wrap((IVideoPreloadConfig) InjectedConfigManager.getConfig(IVideoPreloadConfig.class)));
    }
}
