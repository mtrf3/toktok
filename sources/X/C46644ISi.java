package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ISi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46644ISi extends LinkedHashMap<String, List<C87748YcC>> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<C87748YcC>> entry) {
        if (size() > 15) {
            return true;
        }
        return false;
    }
}
