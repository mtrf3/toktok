package X;

/* renamed from: X.Ppj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65655Ppj<E> extends AbstractC65535Pnn<E> {
    public C65656Ppk<E> LIZ;
    public boolean LIZIZ;

    public AbstractC65654Ppi<E> LJFF() {
        if (this.LIZ.LIZJ == 0) {
            return AbstractC65654Ppi.of();
        }
        this.LIZIZ = true;
        return new C65660Ppo(this.LIZ);
    }

    public C65655Ppj(int i) {
        this.LIZ = new C65656Ppk<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ AbstractC65535Pnn LIZIZ(Object obj) {
        LIZJ(obj);
        return this;
    }

    public C65655Ppj<E> LIZJ(E e) {
        LJ(1, e);
        return this;
    }

    public C65655Ppj<E> LIZLLL(E... eArr) {
        for (E e : eArr) {
            LIZIZ(e);
        }
        return this;
    }

    public C65655Ppj LJ(int i, Object obj) {
        if (i == 0) {
            return this;
        }
        if (this.LIZIZ) {
            this.LIZ = new C65656Ppk<>(this.LIZ);
        }
        int i2 = 0;
        this.LIZIZ = false;
        obj.getClass();
        C65656Ppk<E> c65656Ppk = this.LIZ;
        int LIZIZ = c65656Ppk.LIZIZ(obj);
        if (LIZIZ != -1) {
            i2 = c65656Ppk.LIZIZ[LIZIZ];
        }
        c65656Ppk.LIZLLL(i2 + i, obj);
        return this;
    }
}
