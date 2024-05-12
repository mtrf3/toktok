package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.WidgetSlowFuncOptSetting;

/* renamed from: X.C5n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30763C5n extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30763C5n LJLIL = new C30763C5n();

    public C30763C5n() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(WidgetSlowFuncOptSetting.class));
    }
}
