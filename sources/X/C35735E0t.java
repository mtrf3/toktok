package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35735E0t extends LinkedHashMap<String, Boolean> {
    public final int LJLIL;

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
        if (size() > this.LJLIL) {
            return true;
        }
        return false;
    }

    public C35735E0t(FPA fpa, int i) {
        super(i, 0.75f, true);
        this.LJLIL = i;
    }
}
