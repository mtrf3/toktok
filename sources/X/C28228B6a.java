package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboMovingUpAnimSetting;

/* renamed from: X.B6a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28228B6a extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28228B6a LJLIL = new C28228B6a();

    public C28228B6a() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveComboMovingUpAnimSetting.class));
    }
}
