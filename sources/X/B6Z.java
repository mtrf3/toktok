package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.banner.EffectMemoryPositionOptSetting;

/* loaded from: classes6.dex */
public final class B6Z extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B6Z LJLIL = new B6Z();

    public B6Z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(EffectMemoryPositionOptSetting.class));
    }
}
