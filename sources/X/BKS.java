package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveSurfaceNewVersionSetting;

/* loaded from: classes6.dex */
public final class BKS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BKS LJLIL = new BKS();

    public BKS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveSurfaceNewVersionSetting.class));
    }
}
