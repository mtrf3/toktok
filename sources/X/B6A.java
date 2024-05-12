package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveCardSmoothFrameSetting;

/* loaded from: classes6.dex */
public final class B6A extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B6A LJLIL = new B6A();

    public B6A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveCardSmoothFrameSetting.class));
    }
}
