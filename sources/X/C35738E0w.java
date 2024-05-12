package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35738E0w extends LinkedHashMap<String, C46650ISo> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C46650ISo> entry) {
        if (size() > 20) {
            return true;
        }
        return false;
    }
}
