package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveReusePlayerStopSetting;

/* loaded from: classes6.dex */
public final class BQB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BQB LJLIL = new BQB();

    public BQB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveReusePlayerStopSetting.class));
    }
}
