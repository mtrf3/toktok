package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleSwitchPageSetting;

/* renamed from: X.Mx3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58465Mx3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58465Mx3 LJLIL = new C58465Mx3();

    public C58465Mx3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBubbleSwitchPageSetting.class));
    }
}
