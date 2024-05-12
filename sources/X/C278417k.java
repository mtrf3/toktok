package X;

import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.17k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C278417k<K, V> implements InterfaceC006000q<K, V> {
    public final C006300t LIZ;
    public final int LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC006000q
    public final AbstractC73672Svk LIZIZ(FeedDataKey feedDataKey) {
        return null;
    }

    public final synchronized void LIZJ() {
        LIZLLL(-1);
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        C006300t c006300t = this.LIZ;
        if (c006300t != null) {
            for (Map.Entry<K, V> entry : c006300t.entrySet()) {
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        sb.append("maxMemory=");
        sb.append(this.LIZIZ);
        sb.append(",");
        sb.append("memorySize=");
        sb.append(this.LIZJ);
        return sb.toString();
    }

    public C278417k() {
        this(8);
    }

    public C278417k(final int i) {
        if (i > 0) {
            try {
                this.LIZ = new LinkedHashMap<K, V>(i) { // from class: X.00t
                    public final int LJLIL;

                    {
                        super(i, 0.75f, true);
                        this.LJLIL = i;
                    }

                    @Override // java.util.LinkedHashMap
                    public final boolean removeEldestEntry(Map.Entry entry) {
                        if (size() > this.LJLIL) {
                            return true;
                        }
                        return false;
                    }
                };
                this.LIZIZ = i;
                return;
            } catch (OutOfMemoryError unused) {
                final int i2 = 10;
                this.LIZ = new LinkedHashMap<K, V>(i2) { // from class: X.00t
                    public final int LJLIL;

                    {
                        super(i2, 0.75f, true);
                        this.LJLIL = i2;
                    }

                    @Override // java.util.LinkedHashMap
                    public final boolean removeEldestEntry(Map.Entry entry) {
                        if (size() > this.LJLIL) {
                            return true;
                        }
                        return false;
                    }
                };
                this.LIZIZ = 10;
                return;
            }
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    @Override // X.InterfaceC006000q
    public final void LIZ(K k) {
        synchronized (this) {
            C006300t c006300t = this.LIZ;
            if (c006300t != null && c006300t.remove(k) != null) {
                this.LIZJ--;
            }
        }
    }

    public final void LIZLLL(int i) {
        C006300t c006300t;
        while (this.LIZJ > i && (c006300t = this.LIZ) != null && !c006300t.isEmpty()) {
            if (this.LIZJ >= 0 && (!isEmpty() || this.LIZJ == 0)) {
                Map.Entry<K, V> next = entrySet().iterator().next();
                remove(next.getKey());
                int i2 = this.LIZJ;
                next.getValue();
                this.LIZJ = i2 - 1;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C278417k.class.getName());
                LIZ.append(".getValueSize() is reporting inconsistent results");
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // X.InterfaceC006000q
    public final V get(K k) {
        V v;
        synchronized (this) {
            C006300t c006300t = this.LIZ;
            if (c006300t != null) {
                v = c006300t.get(k);
            } else {
                v = null;
            }
            if (v == null) {
                return null;
            }
            return v;
        }
    }

    @Override // X.InterfaceC006000q
    public final void put(K k, V v) {
        V v2;
        synchronized (this) {
            C006300t c006300t = this.LIZ;
            if (c006300t != null) {
                v2 = c006300t.put(k, v);
            } else {
                v2 = null;
            }
            int i = this.LIZJ + 1;
            this.LIZJ = i;
            if (v2 != null) {
                this.LIZJ = i - 1;
            }
            LIZLLL(this.LIZIZ);
        }
    }
}
