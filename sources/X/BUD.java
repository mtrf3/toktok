package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerEdgeSetting;

/* loaded from: classes6.dex */
public final class BUD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BUD LJLIL = new BUD();

    public BUD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveDrawerEdgeSetting.class));
    }
}
