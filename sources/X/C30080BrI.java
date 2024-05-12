package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveClearScreenDrawOptSetting;

/* renamed from: X.BrI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30080BrI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30080BrI LJLIL = new C30080BrI();

    public C30080BrI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveClearScreenDrawOptSetting.class));
    }
}
