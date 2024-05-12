package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelMapping;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelSetting;

/* renamed from: X.BwR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30399BwR extends AbstractC65781Prl implements InterfaceC65784Pro<BroadcastOverallScoreLevelMapping> {
    public static final C30399BwR LJLIL = new C30399BwR();

    public C30399BwR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelMapping] */
    @Override // X.InterfaceC65784Pro
    public final BroadcastOverallScoreLevelMapping invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(BroadcastOverallScoreLevelSetting.class);
        if (valueSafely == 0) {
            return BroadcastOverallScoreLevelSetting.DEFAULT;
        }
        return valueSafely;
    }
}
