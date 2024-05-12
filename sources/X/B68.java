package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;

/* loaded from: classes6.dex */
public final class B68 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B68 LJLIL = new B68();

    public B68() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePreloadInteractionLayerSetting.class));
    }
}
