package X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Poa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65584Poa<E> extends AbstractC65586Poc<E> {
    public Object[] LIZLLL;
    public int LJ;

    public C65584Poa() {
        super(4);
    }

    public AbstractC65583PoZ<E> LJFF() {
        AbstractC65583PoZ<E> construct;
        Object[] objArr;
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (this.LIZLLL != null && AbstractC65583PoZ.LJII(i) == this.LIZLLL.length) {
                    if (AbstractC65583PoZ.shouldTrim(this.LIZIZ, this.LIZ.length)) {
                        objArr = Arrays.copyOf(this.LIZ, this.LIZIZ);
                    } else {
                        objArr = this.LIZ;
                    }
                    construct = new C65585Pob<>(this.LJ, r8.length - 1, this.LIZIZ, objArr, this.LIZLLL);
                } else {
                    construct = AbstractC65583PoZ.construct(this.LIZIZ, this.LIZ);
                    this.LIZIZ = construct.size();
                }
                this.LIZJ = true;
                this.LIZLLL = null;
                return construct;
            }
            return AbstractC65583PoZ.of(this.LIZ[0]);
        }
        return AbstractC65583PoZ.of();
    }

    public C65584Poa(int i) {
        super(i);
        this.LIZLLL = new Object[AbstractC65583PoZ.LJII(i)];
    }

    public C65584Poa<E> LIZLLL(E e) {
        e.getClass();
        if (this.LIZLLL != null) {
            int LJII = AbstractC65583PoZ.LJII(this.LIZIZ);
            Object[] objArr = this.LIZLLL;
            if (LJII <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = e.hashCode();
                int LJIJJ = C1FP.LJIJJ(hashCode);
                while (true) {
                    int i = LJIJJ & length;
                    Object[] objArr2 = this.LIZLLL;
                    Object obj = objArr2[i];
                    if (obj == null) {
                        objArr2[i] = e;
                        this.LJ += hashCode;
                        LIZIZ(e);
                        break;
                    }
                    if (obj.equals(e)) {
                        break;
                    }
                    LJIJJ = i + 1;
                }
                return this;
            }
        }
        this.LIZLLL = null;
        LIZIZ(e);
        return this;
    }

    public C65584Poa<E> LJ(Iterator<? extends E> it) {
        it.getClass();
        while (it.hasNext()) {
            LIZLLL(it.next());
        }
        return this;
    }
}
