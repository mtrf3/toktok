package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecyclePublicScreenWidgetSetting;

/* renamed from: X.Bss, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30178Bss extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30178Bss LJLIL = new C30178Bss();

    public C30178Bss() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(EnableRecyclePublicScreenWidgetSetting.class));
    }
}
