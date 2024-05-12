package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.base.BridgeConfig;

/* renamed from: X.YaT, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87641YaT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87641YaT LJLIL = new C87641YaT();

    public C87641YaT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        BridgeConfig bridgeConfig = (BridgeConfig) SettingsManager.LIZLLL().LJIIIIZZ("hybrid_security_jsb_monitor_settings", BridgeConfig.class, C87642YaU.LIZIZ);
        if (bridgeConfig != null) {
            z = bridgeConfig.enable;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
