package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.subscription.ShowSubscribeSetting;

/* renamed from: X.MxI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58480MxI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58480MxI LJLIL = new C58480MxI();

    public C58480MxI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(ShowSubscribeSetting.class));
    }
}
