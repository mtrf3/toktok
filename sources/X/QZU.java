package X;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes12.dex */
public class QZU<T> {
    public final java.util.Set<Class<? super T>> LIZ;
    public final java.util.Set<QZW> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public InterfaceC67209QZh<T> LJ;
    public final java.util.Set<Class<?>> LJFF;

    public final QZT<T> LIZIZ() {
        if (this.LJ != null) {
            return new QZT<>(new HashSet(this.LIZ), new HashSet(this.LIZIZ), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void LIZ(QZW qzw) {
        if (!((HashSet) this.LIZ).contains(qzw.LIZ)) {
            ((HashSet) this.LIZIZ).add(qzw);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public QZU(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.LIZ = hashSet;
        this.LIZIZ = new HashSet();
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJFF = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            C78555UsJ.LJI(cls2, "Null interface");
        }
        Collections.addAll(this.LIZ, clsArr);
    }
}
