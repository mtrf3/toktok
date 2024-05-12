package X;

import java.util.Arrays;

/* renamed from: X.Pq7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65679Pq7<K, V> extends C65658Ppm<K, V> {
    public transient long[] LJLLILLLL;
    public transient int LJLLJ;
    public transient int LJLLL;
    public final boolean LJLLLL;

    public C65679Pq7() {
        this(3);
    }

    @Override // X.C65658Ppm, java.util.AbstractMap, java.util.Map
    public final void clear() {
        super.clear();
        this.LJLLJ = -2;
        this.LJLLL = -2;
    }

    @Override // X.C65658Ppm
    public final int LIZJ() {
        return this.LJLLJ;
    }

    public C65679Pq7(int i) {
        super(i);
        this.LJLLLL = false;
    }

    @Override // X.C65658Ppm
    public final void LIZ(int i) {
        if (this.LJLLLL) {
            long j = this.LJLLILLLL[i];
            LJIILIIL((int) (j >>> 32), (int) j);
            LJIILIIL(this.LJLLL, i);
            LJIILIIL(i, -2);
            this.LJLJJLL++;
        }
    }

    @Override // X.C65658Ppm
    public final int LIZLLL(int i) {
        return (int) this.LJLLILLLL[i];
    }

    @Override // X.C65658Ppm
    public final void LJI(int i) {
        super.LJI(i);
        this.LJLLJ = -2;
        this.LJLLL = -2;
        long[] jArr = new long[i];
        this.LJLLILLLL = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // X.C65658Ppm
    public final void LJIIIIZZ(int i) {
        int i2 = this.LJLJLJ - 1;
        long j = this.LJLLILLLL[i];
        LJIILIIL((int) (j >>> 32), (int) j);
        if (i < i2) {
            LJIILIIL((int) (this.LJLLILLLL[i2] >>> 32), i);
            LJIILIIL(i, (int) this.LJLLILLLL[i2]);
        }
        super.LJIIIIZZ(i);
    }

    @Override // X.C65658Ppm
    public final void LJIIL(int i) {
        super.LJIIL(i);
        this.LJLLILLLL = Arrays.copyOf(this.LJLLILLLL, i);
    }

    @Override // X.C65658Ppm
    public final int LIZIZ(int i, int i2) {
        if (i >= this.LJLJLJ) {
            return i2;
        }
        return i;
    }

    public final void LJIILIIL(int i, int i2) {
        if (i == -2) {
            this.LJLLJ = i2;
        } else {
            long[] jArr = this.LJLLILLLL;
            jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
        }
        if (i2 == -2) {
            this.LJLLL = i;
        } else {
            long[] jArr2 = this.LJLLILLLL;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (i << 32);
        }
    }

    @Override // X.C65658Ppm
    public final void LJII(int i, int i2, Object obj, Object obj2) {
        super.LJII(i, i2, obj, obj2);
        LJIILIIL(this.LJLLL, i);
        LJIILIIL(i, -2);
    }
}
