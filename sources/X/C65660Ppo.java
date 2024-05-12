package X;

/* renamed from: X.Ppo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65660Ppo<E> extends AbstractC65654Ppi<E> {
    public static final C65660Ppo<Object> LJLJL = new C65660Ppo<>(new C65656Ppk());
    public final transient C65656Ppk<E> LJLJJI;
    public final transient int LJLJJL;
    public transient C65675Pq3 LJLJJLL;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return false;
    }

    @Override // X.AbstractC65654Ppi, X.InterfaceC65672Pq0
    public final AbstractC65583PoZ<E> elementSet() {
        C65675Pq3 c65675Pq3 = this.LJLJJLL;
        if (c65675Pq3 == null) {
            C65675Pq3 c65675Pq32 = new C65675Pq3(this);
            this.LJLJJLL = c65675Pq32;
            return c65675Pq32;
        }
        return c65675Pq3;
    }

    @Override // X.AbstractC65654Ppi, X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65662Ppq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public final int size() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC65654Ppi, X.InterfaceC65672Pq0
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return elementSet();
    }

    public C65660Ppo(C65656Ppk<E> c65656Ppk) {
        this.LJLJJI = c65656Ppk;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = c65656Ppk.LIZJ;
            if (i < i2) {
                C76917UGr.LJFF(i, i2);
                j += c65656Ppk.LIZIZ[i];
                i++;
            } else {
                this.LJLJJL = C65713Pqf.LIZ(j);
                return;
            }
        }
    }

    @Override // X.AbstractC65654Ppi
    public final InterfaceC65712Pqe<E> LJIIIIZZ(int i) {
        C65656Ppk<E> c65656Ppk = this.LJLJJI;
        C76917UGr.LJFF(i, c65656Ppk.LIZJ);
        return new C65676Pq4(c65656Ppk, i);
    }

    @Override // X.AbstractC65654Ppi, X.InterfaceC65672Pq0
    public final int count(Object obj) {
        C65656Ppk<E> c65656Ppk = this.LJLJJI;
        int LIZIZ = c65656Ppk.LIZIZ(obj);
        if (LIZIZ == -1) {
            return 0;
        }
        return c65656Ppk.LIZIZ[LIZIZ];
    }
}
