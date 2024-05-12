package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E1j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35751E1j<K, V> extends LinkedHashMap<K, V> {
    public final int LJLIL;

    public C35751E1j(int i) {
        super(i);
        this.LJLIL = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LJLIL) {
            return true;
        }
        return false;
    }
}
