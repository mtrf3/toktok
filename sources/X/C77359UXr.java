package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlSetting;

/* renamed from: X.UXr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77359UXr extends AbstractC65781Prl implements InterfaceC65784Pro<LiveSheetDemoLynxUrlConfig> {
    public static final C77359UXr LJLIL = new C77359UXr();

    public C77359UXr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlConfig] */
    @Override // X.InterfaceC65784Pro
    public final LiveSheetDemoLynxUrlConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveSheetDemoLynxUrlSetting.class);
        if (valueSafely == 0) {
            return LiveSheetDemoLynxUrlSetting.DEFAULT;
        }
        return valueSafely;
    }
}
