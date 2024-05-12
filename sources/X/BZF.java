package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDirtyLensDetectionSetting;

/* loaded from: classes6.dex */
public final class BZF extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final BZF LJLIL = new BZF();

    public BZF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveDirtyLensDetectionSetting.class));
    }
}
