package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;

/* renamed from: X.Ctg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32776Ctg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C32776Ctg LJLIL = new C32776Ctg();

    public C32776Ctg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveComboLargeClickableAreaSetting.class));
    }
}
