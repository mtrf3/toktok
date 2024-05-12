package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67832lP {
    public final String LIZ;
    public final java.util.Map<String, String> LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + C79062V1e.LJ(this.LIZ, 899, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" authParams=");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C67832lP) {
            C67832lP c67832lP = (C67832lP) obj;
            if (c67832lP.LIZ.equals(this.LIZ) && c67832lP.LIZIZ.equals(this.LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    public C67832lP(String str, java.util.Map<String, String> map) {
        String lowerCase;
        if (map != null) {
            this.LIZ = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null) {
                    lowerCase = null;
                } else {
                    lowerCase = entry.getKey().toLowerCase(Locale.US);
                }
                linkedHashMap.put(lowerCase, entry.getValue());
            }
            this.LIZIZ = Collections.unmodifiableMap(linkedHashMap);
            return;
        }
        throw new NullPointerException("authParams == null");
    }
}
