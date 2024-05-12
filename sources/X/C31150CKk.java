package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDebugLogEnableSettings;

/* renamed from: X.CKk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31150CKk extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31150CKk LJLIL = new C31150CKk();

    public C31150CKk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveTTLSDebugLogEnableSettings.class));
    }
}
