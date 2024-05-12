package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class EYS<T> {
    public final String LIZ;
    public final double LIZIZ;
    public final EJU<T>[] LIZJ;
    public final String LIZLLL;
    public final String[] LJ;
    public final List<Pair<String, Float>> LJFF = new ArrayList();

    public EYS(String str, double d, String str2, String[] strArr, EJU<T>... ejuArr) {
        this.LIZ = str;
        this.LIZIZ = d;
        this.LIZLLL = str2;
        this.LJ = strArr;
        this.LIZJ = ejuArr;
        for (EJU<T> eju : ejuArr) {
            ((ArrayList) this.LJFF).add(new Pair(eju.LIZ, Double.valueOf(eju.LIZIZ)));
        }
    }
}
