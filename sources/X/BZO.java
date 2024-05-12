package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.drawer.DrawerMaxSlideControlSetting;

/* loaded from: classes6.dex */
public final class BZO extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final BZO LJLIL = new BZO();

    public BZO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf(SettingsManager.INSTANCE.getFloatValue(DrawerMaxSlideControlSetting.class));
    }
}
