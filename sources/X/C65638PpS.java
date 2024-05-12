package X;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PpS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65638PpS<K, V> extends AbstractC65505PnJ<K, V> {
    public final K LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C65658Ppm LJLJI;

    public final void LIZ() {
        int i = this.LJLILLLLZI;
        if (i != -1) {
            C65658Ppm c65658Ppm = this.LJLJI;
            if (i < c65658Ppm.LJLJLJ && C78886Uxe.LJIIIIZZ(this.LJLIL, c65658Ppm.LJLJI[i])) {
                return;
            }
        }
        this.LJLILLLLZI = this.LJLJI.LJ(this.LJLIL);
    }

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final V getValue() {
        LIZ();
        int i = this.LJLILLLLZI;
        if (i == -1) {
            return null;
        }
        return (V) this.LJLJI.LJLJJI[i];
    }

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final K getKey() {
        return this.LJLIL;
    }

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final V setValue(V v) {
        LIZ();
        int i = this.LJLILLLLZI;
        if (i == -1) {
            this.LJLJI.put(this.LJLIL, v);
            return null;
        }
        Object[] objArr = this.LJLJI.LJLJJI;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }

    public C65638PpS(C65658Ppm c65658Ppm, int i) {
        this.LJLJI = c65658Ppm;
        this.LJLIL = (K) c65658Ppm.LJLJI[i];
        this.LJLILLLLZI = i;
    }
}
