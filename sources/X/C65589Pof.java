package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.Pof, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65589Pof<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator<? super E> LJLIL;
    public final Object[] LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public Object readResolve() {
        C65588Poe c65588Poe = new C65588Poe(this.LJLIL);
        Object[] objArr = this.LJLILLLLZI;
        if (c65588Poe.LIZLLL != null) {
            for (Object obj : objArr) {
                c65588Poe.LIZLLL(obj);
            }
        } else {
            C77119UOl.LIZLLL(objArr.length, objArr);
            c65588Poe.LIZJ(c65588Poe.LIZIZ + objArr.length);
            System.arraycopy(objArr, 0, c65588Poe.LIZ, c65588Poe.LIZIZ, objArr.length);
            c65588Poe.LIZIZ += objArr.length;
        }
        return c65588Poe.LJFF();
    }

    public C65589Pof(Comparator<? super E> comparator, Object[] objArr) {
        this.LJLIL = comparator;
        this.LJLILLLLZI = objArr;
    }
}
