package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleGetSettingAvoidSwitchTab;

/* renamed from: X.Mx2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58464Mx2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58464Mx2 LJLIL = new C58464Mx2();

    public C58464Mx2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBubbleGetSettingAvoidSwitchTab.class));
    }
}
