package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.E0s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35734E0s extends LinkedHashMap<String, List<Long>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
        if (size() > 50) {
            return true;
        }
        return false;
    }
}
