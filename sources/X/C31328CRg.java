package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.ReportHeightRatioSetting;

/* renamed from: X.CRg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31328CRg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31328CRg LJLIL = new C31328CRg();

    public C31328CRg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(ReportHeightRatioSetting.class));
    }
}
