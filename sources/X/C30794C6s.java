package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveFasterReleaseMsgsLowHeatSettingSetting;

/* renamed from: X.C6s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30794C6s extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30794C6s LJLIL = new C30794C6s();

    public C30794C6s() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveFasterReleaseMsgsLowHeatSettingSetting.class));
    }
}
