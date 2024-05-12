package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGpuOptSetting;

/* renamed from: X.CFu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31030CFu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31030CFu LJLIL = new C31030CFu();

    public C31030CFu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGpuOptSetting.class));
    }
}
