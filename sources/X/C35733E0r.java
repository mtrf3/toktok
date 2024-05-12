package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35733E0r extends LinkedHashMap<String, C46267IDv> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C46267IDv> entry) {
        if (size() > 50) {
            return true;
        }
        return false;
    }
}
