package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dz5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35659Dz5 extends LinkedHashMap<String, java.util.Map<String, Long>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, java.util.Map<String, Long>> entry) {
        if (size() > 3) {
            return true;
        }
        return false;
    }
}
