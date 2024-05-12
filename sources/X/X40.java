package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public final class X40<K, T> extends LinkedHashMap<K, T> {
    public int LJLIL;

    public X40() {
        this(4, 4);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, T> entry) {
        if (size() > this.LJLIL) {
            return true;
        }
        return false;
    }

    public void setMaxSize(int i) {
        this.LJLIL = i;
    }

    public X40(int i, int i2) {
        this(i, i2, true);
    }

    public X40(int i, int i2, boolean z) {
        super(i, 0.75f, z);
        setMaxSize(i2);
    }
}
