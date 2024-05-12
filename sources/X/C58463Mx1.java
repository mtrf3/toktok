package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.FollowingBubbleSettingOptSetting;

/* renamed from: X.Mx1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58463Mx1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58463Mx1 LJLIL = new C58463Mx1();

    public C58463Mx1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(FollowingBubbleSettingOptSetting.class));
    }
}
