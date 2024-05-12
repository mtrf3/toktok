package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;

/* renamed from: X.Bwm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30420Bwm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30420Bwm LJLIL = new C30420Bwm();

    public C30420Bwm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(BeautyPanelMemoryOptSetting.class));
    }
}
