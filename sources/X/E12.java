package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class E12<K, V> extends LinkedHashMap<K, V> {
    public final int LJLIL;

    public E12(int i) {
        super(i, 1.0f, true);
        this.LJLIL = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.LJLIL) {
            return true;
        }
        return false;
    }
}
