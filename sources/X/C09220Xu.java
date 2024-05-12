package X;

import com.benchmark.IBTCHConfiguration;
import com.benchmark.inject.InjectABMockConfig;
import com.bytedance.ies.abmock.debugtool.mock.MockComponentRegister;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;

/* renamed from: X.0Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09220Xu {
    public static volatile boolean LIZ;
    public static C264211y LIZIZ;

    public static boolean LIZ() {
        C264211y c264211y;
        if (!LIZ) {
            synchronized (C09220Xu.class) {
                IBTCHConfiguration createIBTCHConfigurationbyMonsterPlugin = BTCHConfigurationImpl.createIBTCHConfigurationbyMonsterPlugin(false);
                if (createIBTCHConfigurationbyMonsterPlugin != null) {
                    c264211y = createIBTCHConfigurationbyMonsterPlugin.getByteBenchConfig();
                } else {
                    c264211y = null;
                }
                if (!LIZ && c264211y != null) {
                    LIZIZ = c264211y;
                    if (c264211y.LJIILIIL) {
                        InjectABMockConfig injectABMockConfig = new InjectABMockConfig();
                        C70657RoD.LIZIZ = injectABMockConfig;
                        C70657RoD.LIZ = new C40627Fx1();
                        MockComponentRegister.registerComponent(injectABMockConfig);
                    }
                    LIZ = true;
                }
            }
        }
        return LIZ;
    }
}
