package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EAd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35979EAd<K, V> {
    public final java.util.Map<K, V> LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public int LJ;

    public final synchronized void LIZ() {
        LJI(-1);
    }

    public final synchronized java.util.Map<K, V> LIZJ() {
        return this.LIZ;
    }

    public final synchronized int LJFF() {
        return this.LIZIZ;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.LIZLLL;
        int i3 = this.LJ + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return C16880lQ.LLLZ("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(i)});
    }

    public C35979EAd(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized V LIZIZ(K k) {
        if (k != null) {
            V v = this.LIZ.get(k);
            if (v != null) {
                this.LIZLLL++;
                return v;
            }
            this.LJ++;
            return null;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized V LJ(K k) {
        V remove;
        if (k != null) {
            remove = this.LIZ.remove(k);
            if (remove != null) {
                this.LIZIZ--;
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return remove;
    }

    public final void LJI(int i) {
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
        LIZ.append(C35979EAd.class.getName());
        LIZ.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final synchronized V LIZLLL(K k, V v) {
        V put;
        if (k != null && v != null) {
            this.LIZIZ++;
            put = this.LIZ.put(k, v);
            if (put != null) {
                this.LIZIZ--;
            }
            LJI(this.LIZJ);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
        return put;
    }
}
