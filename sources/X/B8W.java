package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMockCurTime;

/* loaded from: classes6.dex */
public final class B8W extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final B8W LJLIL = new B8W();

    public B8W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(LiveMockCurTime.class));
    }
}
