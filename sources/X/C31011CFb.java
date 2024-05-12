package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptData;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting;

/* renamed from: X.CFb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31011CFb extends AbstractC65781Prl implements InterfaceC65784Pro<LiveRecyclerviewPerformanceOptData> {
    public static final C31011CFb LJLIL = new C31011CFb();

    public C31011CFb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptData] */
    @Override // X.InterfaceC65784Pro
    public final LiveRecyclerviewPerformanceOptData invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveRecyclerviewPerformanceOptSwitchSetting.class);
        if (valueSafely == 0) {
            return LiveRecyclerviewPerformanceOptSwitchSetting.DEFAULT;
        }
        return valueSafely;
    }
}
