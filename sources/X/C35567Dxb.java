package X;

import com.ss.android.ugc.aweme.autocut.PreloadNLEConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Dxb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35567Dxb {
    public static final PreloadNLEConfig LIZ = new PreloadNLEConfig(false, 0, 3, null);

    public static final PreloadNLEConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PreloadNLEConfig preloadNLEConfig = LIZ;
        LJIIIZ.getClass();
        PreloadNLEConfig preloadNLEConfig2 = (PreloadNLEConfig) FFL.LJIJ(true, "autocut_selection_preload_NLE_config", 31744, PreloadNLEConfig.class, preloadNLEConfig);
        if (preloadNLEConfig2 != null) {
            preloadNLEConfig = preloadNLEConfig2;
        }
        o.LJIIIIZZ(preloadNLEConfig, "ABManager.getInstance().…LE::class.java) ?: CONFIG");
        return preloadNLEConfig;
    }
}
