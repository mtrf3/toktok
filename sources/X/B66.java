package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.pullstream.SurfaceViewUnExpectedWHSetting;

/* loaded from: classes6.dex */
public final class B66 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B66 LJLIL = new B66();

    public B66() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(SurfaceViewUnExpectedWHSetting.class));
    }
}
