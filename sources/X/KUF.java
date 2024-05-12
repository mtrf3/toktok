package X;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KUF<T> {
    public final int LIZ;
    public final HashMap<String, KUG<T>> LIZIZ = new HashMap<>();
    public final KUG<T> LIZJ;
    public final KUG<T> LIZLLL;

    public KUF(int i) {
        this.LIZ = i;
        KUG<T> kug = new KUG<>(null, null);
        this.LIZJ = kug;
        KUG<T> kug2 = new KUG<>(null, null);
        this.LIZLLL = kug2;
        kug.LIZJ = kug2;
        kug2.LIZLLL = kug;
    }

    public final ArrayList<KUG<T>> LIZ(int i) {
        if (i >= this.LIZIZ.size()) {
            i = this.LIZIZ.size();
        }
        ArrayList<KUG<T>> arrayList = new ArrayList<>();
        KUG<T> kug = this.LIZLLL.LIZLLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (o.LJ(kug, this.LIZJ)) {
                return arrayList;
            }
            if (kug == null) {
                break;
            }
            arrayList.add(kug);
            kug = kug.LIZLLL;
        }
        return arrayList;
    }

    public final void LIZIZ(String key, T t) {
        KUG<T> kug;
        KUG<T> kug2;
        o.LJIIIZ(key, "key");
        if (this.LIZIZ.containsKey(key) && (kug2 = this.LIZIZ.get(key)) != null) {
            KUG<T> kug3 = kug2.LIZJ;
            KUG<T> kug4 = kug2.LIZLLL;
            if (kug3 != null && kug4 != null) {
                kug4.LIZJ = kug3;
                kug3.LIZLLL = kug4;
            }
        }
        KUG<T> kug5 = new KUG<>(key, t);
        KUG<T> kug6 = this.LIZLLL;
        KUG<T> kug7 = kug6.LIZLLL;
        if (kug7 != null) {
            kug7.LIZJ = kug5;
            kug5.LIZLLL = kug7;
            kug5.LIZJ = kug6;
            kug6.LIZLLL = kug5;
        }
        this.LIZIZ.put(key, kug5);
        if (this.LIZIZ.size() <= this.LIZ || (kug = this.LIZJ.LIZJ) == null) {
            return;
        }
        KUG<T> kug8 = kug.LIZJ;
        KUG<T> kug9 = kug.LIZLLL;
        if (kug8 != null && kug9 != null) {
            kug9.LIZJ = kug8;
            kug8.LIZLLL = kug9;
        }
        C65777Prh.LIZJ(this.LIZIZ).remove(kug.LIZ);
    }
}
