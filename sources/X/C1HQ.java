package X;

import X.C0M9;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.1HQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HQ<K, V> extends C0MA<K, V> implements java.util.Map<K, V> {
    public C1HP LJLJLJ;

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new C1HP(this);
        }
        C1HP c1hp = this.LJLJLJ;
        if (c1hp.LIZ == null) {
            c1hp.LIZ = new C0M9.b();
        }
        return c1hp.LIZ;
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new C1HP(this);
        }
        C1HP c1hp = this.LJLJLJ;
        if (c1hp.LIZIZ == null) {
            c1hp.LIZIZ = new C0M9.c();
        }
        return c1hp.LIZIZ;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new C1HP(this);
        }
        C1HP c1hp = this.LJLJLJ;
        if (c1hp.LIZJ == null) {
            c1hp.LIZJ = new C0M9.e();
        }
        return c1hp.LIZJ;
    }

    public C1HQ() {
    }

    public C1HQ(C1HQ c1hq) {
        if (c1hq != null) {
            int i = c1hq.LJLJI;
            LIZIZ(this.LJLJI + i);
            if (this.LJLJI == 0) {
                if (i > 0) {
                    System.arraycopy(c1hq.LJLIL, 0, this.LJLIL, 0, i);
                    System.arraycopy(c1hq.LJLILLLLZI, 0, this.LJLILLLLZI, 0, i << 1);
                    this.LJLJI = i;
                    return;
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                put(c1hq.LJIIIIZZ(i2), c1hq.LJIIJJI(i2));
            }
        }
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        LIZIZ(map.size() + this.LJLJI);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public C1HQ(int i) {
        super(i);
    }
}
