package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.TTLSThreadPrioritySettings;
import java.util.Map;

/* loaded from: classes6.dex */
public final class B7H extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Integer>> {
    public static final B7H LJLIL = new B7H();

    public B7H() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Integer> invoke() {
        java.util.Map<String, Integer> map = TTLSThreadPrioritySettings.DEFAULT;
        java.util.Map map2 = (java.util.Map) SettingsManager.INSTANCE.getValueSafely(TTLSThreadPrioritySettings.class);
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                map.put(entry.getKey(), Integer.valueOf((int) ((Number) entry.getValue()).doubleValue()));
            }
        }
        return map;
    }
}
