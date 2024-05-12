package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.TtLiveBackgroundSetting;

/* renamed from: X.BxT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30463BxT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30463BxT LJLIL = new C30463BxT();

    public C30463BxT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(TtLiveBackgroundSetting.class));
    }
}
