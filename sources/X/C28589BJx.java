package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;

/* renamed from: X.BJx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28589BJx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28589BJx LJLIL = new C28589BJx();

    public C28589BJx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(HandlerThreadOptSetting.class));
    }
}
