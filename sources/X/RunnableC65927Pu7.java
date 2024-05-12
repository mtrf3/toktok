package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.ShutdownConfig;
import com.bytedance.helios.network.NetworkComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC65927Pu7 implements Runnable {
    public static final RunnableC65927Pu7 LJLIL = new RunnableC65927Pu7();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        ShutdownConfig shutdownConfig;
        NetworkConfig networkConfig;
        try {
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            if (networkComponent.getCommonProxy() != null) {
                C66226Pyw commonProxy = networkComponent.getCommonProxy();
                o.LJI(commonProxy);
                SettingsModel settings = networkComponent.getSettings();
                if (settings == null || (networkConfig = settings.networkConfig) == null || (shutdownConfig = networkConfig.shutdownConfig) == null) {
                    shutdownConfig = new ShutdownConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, false, false, false, 2047, null);
                }
                C65921Pu1.LIZIZ(commonProxy, shutdownConfig);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
