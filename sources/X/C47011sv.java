package X;

import com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig;
import com.bytedance.android.live.broadcast.setting.MobileGameFeedbackAnalyseInfo;
import com.bytedance.android.live_settings.SettingsManager;

/* renamed from: X.1sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47011sv extends AbstractC65781Prl implements InterfaceC65784Pro<MobileGameBroadcastFeedbackConfig> {
    public static final C47011sv LJLIL = new C47011sv();

    public C47011sv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig] */
    @Override // X.InterfaceC65784Pro
    public final MobileGameBroadcastFeedbackConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(MobileGameFeedbackAnalyseInfo.class);
        if (valueSafely == 0) {
            return MobileGameFeedbackAnalyseInfo.DEFAULT;
        }
        return valueSafely;
    }
}
