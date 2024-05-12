package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveDrawOptSetting;

/* renamed from: X.C9x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30877C9x extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30877C9x LJLIL = new C30877C9x();

    public C30877C9x() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveDrawOptSetting.class));
    }
}
