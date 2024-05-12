package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerParamsSettings;

/* loaded from: classes6.dex */
public final class BFQ extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends java.util.Map<String, ? extends Object>>> {
    public static final BFQ LJLIL = new BFQ();

    public BFQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends java.util.Map<String, ? extends Object>> invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveClientTriggerParamsSettings.class);
        if (valueSafely == 0) {
            return LiveClientTriggerParamsSettings.DEFAULT;
        }
        return valueSafely;
    }
}
