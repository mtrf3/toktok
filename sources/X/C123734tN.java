package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123734tN {
    public static final C123714tL LIZ = new LinkedHashMap<String, Long>() { // from class: X.4tL
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public static final C123724tM LIZIZ = new LinkedHashMap<String, String>() { // from class: X.4tM
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public static long LIZJ = -1;
}
