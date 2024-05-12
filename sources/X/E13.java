package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class E13<K, V> extends LinkedHashMap<K, V> {
    public static final long serialVersionUID = 3805937866184666407L;
    public final int LJLIL;

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LJLIL) {
            return true;
        }
        return false;
    }

    public E13(int i, int i2) {
        this(i, i2, false);
    }

    public E13(int i, int i2, boolean z) {
        super(i2, 0.75f, true);
        this.LJLIL = i;
        if (i > 0) {
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
