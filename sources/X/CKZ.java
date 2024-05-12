package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSGpuTurboSettings;

/* loaded from: classes6.dex */
public final class CKZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CKZ LJLIL = new CKZ();

    public CKZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveTTLSGpuTurboSettings.class));
    }
}
