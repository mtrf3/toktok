package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveP0WidgetsBlockList;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public final class B7M extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<String>> {
    public static final B7M LJLIL = new B7M();

    public B7M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<String> invoke() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : SettingsManager.INSTANCE.getStringArrayValue(LiveP0WidgetsBlockList.class)) {
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }
}
