package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomLruCacheSetting;
import java.util.concurrent.Callable;

/* renamed from: X.RyM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC71286RyM<V> implements Callable {
    public static final CallableC71286RyM<V> LJLIL = new CallableC71286RyM<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object LIZ;
        try {
            C72818Shy.LIZLLL("ec_set_first_screen_image", new C61832OOm());
            EcomLruCacheSetting.LIZ.getClass();
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            EcomLruCacheSetting.EcomLruCacheSettingConfig ecomLruCacheSettingConfig = EcomLruCacheSetting.LIZIZ;
            EcomLruCacheSetting.EcomLruCacheSettingConfig ecomLruCacheSettingConfig2 = (EcomLruCacheSetting.EcomLruCacheSettingConfig) LIZLLL.LJIIIIZZ("ecom_lru_cache_setting", EcomLruCacheSetting.EcomLruCacheSettingConfig.class, ecomLruCacheSettingConfig);
            if (ecomLruCacheSettingConfig2 != null) {
                ecomLruCacheSettingConfig = ecomLruCacheSettingConfig2;
            }
            for (EcomLruCacheSetting.EcomLruCacheScene ecomLruCacheScene : ecomLruCacheSettingConfig.getScenes()) {
                String scene = ecomLruCacheScene.getScene();
                if (scene != null) {
                    int maxSize = ecomLruCacheScene.getMaxSize();
                    boolean persistence = ecomLruCacheScene.getPersistence();
                    C71284RyK.LIZ.put(scene, new C71285RyL(maxSize, ecomLruCacheScene.getTimeout(), scene, persistence, ecomLruCacheScene.getImmediate()));
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m6boximpl(LIZ);
    }
}
