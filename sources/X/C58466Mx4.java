package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleWarmStarupSetting;

/* renamed from: X.Mx4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58466Mx4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58466Mx4 LJLIL = new C58466Mx4();

    public C58466Mx4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBubbleWarmStarupSetting.class));
    }
}
