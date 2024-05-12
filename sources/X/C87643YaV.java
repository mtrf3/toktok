package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.base.BridgeConfig;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;

/* renamed from: X.YaV, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87643YaV extends AbstractC65781Prl implements InterfaceC65784Pro<C39491Feh> {
    public static final C87643YaV LJLIL = new C87643YaV();

    public C87643YaV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C39491Feh invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        NavigationConfig navigationConfig = C87645YaX.LIZ;
        NavigationConfig navigationConfig2 = (NavigationConfig) LIZLLL.LJIIIIZZ("hybrid_security_monitor_settings", NavigationConfig.class, navigationConfig);
        if (navigationConfig2 != null) {
            navigationConfig = navigationConfig2;
        }
        C87642YaU.LIZ.getClass();
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        BridgeConfig bridgeConfig = C87642YaU.LIZIZ;
        BridgeConfig bridgeConfig2 = (BridgeConfig) LIZLLL2.LJIIIIZZ("hybrid_security_jsb_monitor_settings", BridgeConfig.class, bridgeConfig);
        if (bridgeConfig2 != null) {
            bridgeConfig = bridgeConfig2;
        }
        return new C39491Feh(navigationConfig, bridgeConfig);
    }
}
