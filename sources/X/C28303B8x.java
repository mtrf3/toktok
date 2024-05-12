package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV3Setting;

/* renamed from: X.B8x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28303B8x extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28303B8x LJLIL = new C28303B8x();

    public C28303B8x() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleWidgetV3Setting.class));
    }
}
