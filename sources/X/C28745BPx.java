package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.AudioFocusControllerAsyncOptSetting;

/* renamed from: X.BPx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28745BPx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28745BPx LJLIL = new C28745BPx();

    public C28745BPx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(AudioFocusControllerAsyncOptSetting.class));
    }
}
