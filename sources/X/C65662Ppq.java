package X;

import java.io.Serializable;

/* renamed from: X.Ppq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65662Ppq implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] LJLIL;
    public final int[] LJLILLLLZI;

    public Object readResolve() {
        C65655Ppj c65655Ppj = new C65655Ppj(this.LJLIL.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.LJLIL;
            if (i < objArr.length) {
                c65655Ppj.LJ(this.LJLILLLLZI[i], objArr[i]);
                i++;
            } else {
                return c65655Ppj.LJFF();
            }
        }
    }

    public C65662Ppq(InterfaceC65672Pq0<?> interfaceC65672Pq0) {
        int size = interfaceC65672Pq0.entrySet().size();
        this.LJLIL = new Object[size];
        this.LJLILLLLZI = new int[size];
        int i = 0;
        for (InterfaceC65712Pqe<?> interfaceC65712Pqe : interfaceC65672Pq0.entrySet()) {
            this.LJLIL[i] = interfaceC65712Pqe.LIZLLL();
            this.LJLILLLLZI[i] = interfaceC65712Pqe.getCount();
            i++;
        }
    }
}
