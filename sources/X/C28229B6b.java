package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.SmoothEnterOptSetting;

/* renamed from: X.B6b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28229B6b extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28229B6b LJLIL = new C28229B6b();

    public C28229B6b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(SmoothEnterOptSetting.class));
    }
}
