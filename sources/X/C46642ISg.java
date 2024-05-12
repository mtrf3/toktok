package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ISg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46642ISg extends LinkedHashMap<String, C47470Ik6> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C47470Ik6> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
