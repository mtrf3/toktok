package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ISd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46639ISd extends LinkedHashMap<String, List<C87748YcC>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<C87748YcC>> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
