package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetPoolSize;

/* renamed from: X.BrL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30083BrL extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30083BrL LJLIL = new C30083BrL();

    public C30083BrL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveRecycleWidgetPoolSize.class));
    }
}
