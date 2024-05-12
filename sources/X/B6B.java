package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.RankRequestOptSetting;

/* loaded from: classes6.dex */
public final class B6B extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B6B LJLIL = new B6B();

    public B6B() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(RankRequestOptSetting.class));
    }
}
