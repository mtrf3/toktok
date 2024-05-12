package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ISh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46643ISh extends LinkedHashMap<String, List<C47462Ijy>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<C47462Ijy>> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
