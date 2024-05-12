package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FirstScreenOptSwitcher;

/* loaded from: classes6.dex */
public final class B6H extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B6H LJLIL = new B6H();

    public B6H() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (SettingsManager.INSTANCE.getBooleanValue(EnableEnterRoomOptReuseRoomPlayerSetting.class) && FirstScreenOptSwitcher.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
