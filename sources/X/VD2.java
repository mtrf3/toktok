package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class VD2 extends LinkedHashMap<String, C79352VCi> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C79352VCi> entry) {
        if (size() > 20) {
            return true;
        }
        return false;
    }
}
