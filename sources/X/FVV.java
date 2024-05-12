package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FVV {
    public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public final boolean LIZ(FVU fvu) {
        if (this.LIZ.get(fvu.getName()) == null || !this.LIZ.get(fvu.getName()).booleanValue()) {
            this.LIZ.put(fvu.getName(), Boolean.TRUE);
            return true;
        }
        return false;
    }
}
