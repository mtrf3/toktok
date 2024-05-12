package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ISf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46641ISf extends LinkedHashMap<String, List<C47450Ijm>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<C47450Ijm>> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
