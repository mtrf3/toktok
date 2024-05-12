package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EAa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35976EAa<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public final int LIZJ;

    public final synchronized void LIZ() {
        LIZJ(-1);
    }

    public final synchronized String toString() {
        return C16880lQ.LLLZ("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), 0, 0, 0});
    }

    public C35976EAa(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void LIZJ(int i) {
        Map.Entry<K, V> next;
        while (this.LIZIZ > i && !this.LIZ.isEmpty() && (next = this.LIZ.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.LIZ.remove(key);
            this.LIZIZ--;
        }
        if (this.LIZIZ >= 0 && (!this.LIZ.isEmpty() || this.LIZIZ == 0)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C35976EAa.class.getName());
        LIZ.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final synchronized void LIZIZ(Object obj, C36915EeF c36915EeF) {
        if (obj != null) {
            this.LIZIZ++;
            if (this.LIZ.put(obj, c36915EeF) != null) {
                this.LIZIZ--;
            }
            LIZJ(this.LIZJ);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
    }
}
