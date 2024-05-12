package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35736E0u extends LinkedHashMap<String, HashMap<String, Object>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, HashMap<String, Object>> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
