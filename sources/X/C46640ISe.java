package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ISe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46640ISe extends LinkedHashMap<String, C87748YcC> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C87748YcC> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
