package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35737E0v extends LinkedHashMap<String, C79373VDd> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C79373VDd> entry) {
        if (size() > 20) {
            return true;
        }
        return false;
    }
}
