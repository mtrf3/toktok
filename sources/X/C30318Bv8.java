package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetSlardarSetting;

/* renamed from: X.Bv8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30318Bv8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30318Bv8 LJLIL = new C30318Bv8();

    public C30318Bv8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveWidgetSlardarSetting.class));
    }
}
