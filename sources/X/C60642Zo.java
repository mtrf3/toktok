package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomImageHandlerOptConfig;
import java.util.List;

/* renamed from: X.2Zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60642Zo {
    public static final C60642Zo LIZ = new C60642Zo();
    public static final EcomImageHandlerOptConfig LIZIZ;
    public static final java.util.Set<String> LIZJ;

    static {
        java.util.Set<String> set;
        EcomImageHandlerOptConfig ecomImageHandlerOptConfig = new EcomImageHandlerOptConfig(false, false, null, null, 15, null);
        FFL.LJIIIZ().getClass();
        EcomImageHandlerOptConfig ecomImageHandlerOptConfig2 = (EcomImageHandlerOptConfig) FFL.LJIJ(true, "ecom_image_handler_opt_config", 31744, EcomImageHandlerOptConfig.class, ecomImageHandlerOptConfig);
        if (ecomImageHandlerOptConfig2 != null) {
            ecomImageHandlerOptConfig = ecomImageHandlerOptConfig2;
        }
        LIZIZ = ecomImageHandlerOptConfig;
        List<String> scenes = ecomImageHandlerOptConfig.getScenes();
        if (scenes == null || (set = ORZ.LLJJ(scenes)) == null) {
            set = OQY.INSTANCE;
        }
        LIZJ = set;
    }
}
