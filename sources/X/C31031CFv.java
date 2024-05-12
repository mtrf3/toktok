package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveOpenStreamerGpuSetting;

/* renamed from: X.CFv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31031CFv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31031CFv LJLIL = new C31031CFv();

    public C31031CFv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveOpenStreamerGpuSetting.class));
    }
}
