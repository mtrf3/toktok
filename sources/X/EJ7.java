package X;

import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EJ7 extends AbstractC65781Prl implements InterfaceC65784Pro<HashSet<String>> {
    public static final EJ7 LJLIL = new EJ7();

    public EJ7() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final HashSet<String> invoke() {
        HashSet<String> hashSet = new HashSet<>();
        java.util.Map<String, ConfigItem> map = KUZ.LIZ;
        o.LJFF(map, "map");
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            Object key = entry.getKey();
            if (((ConfigItem) entry.getValue()).isLaunch) {
                hashSet.add(key);
            }
        }
        java.util.Map<String, ConfigItem> map2 = KUZ.LIZIZ;
        o.LJFF(map2, "map");
        for (Map.Entry entry2 : ((HashMap) map2).entrySet()) {
            Object key2 = entry2.getKey();
            if (((ConfigItem) entry2.getValue()).isLaunch) {
                hashSet.add(key2);
            }
        }
        return hashSet;
    }
}
