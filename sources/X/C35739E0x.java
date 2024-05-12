package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35739E0x extends LinkedHashMap<String, C47282Ih4> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C47282Ih4> entry) {
        if (size() > 32) {
            return true;
        }
        return false;
    }
}
