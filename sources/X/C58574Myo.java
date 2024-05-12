package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;

/* renamed from: X.Myo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58574Myo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58574Myo LJLIL = new C58574Myo();

    public C58574Myo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveAlphaGroupAnimOptSetting.class));
    }
}
