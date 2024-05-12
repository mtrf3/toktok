package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableRecycleWidgetV4;

/* renamed from: X.BrM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30084BrM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30084BrM LJLIL = new C30084BrM();

    public C30084BrM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveEnableRecycleWidgetV4.class));
    }
}
