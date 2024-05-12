package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSThrowExceptionSettings;

/* renamed from: X.CKl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31151CKl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31151CKl LJLIL = new C31151CKl();

    public C31151CKl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveTTLSThrowExceptionSettings.class));
    }
}
