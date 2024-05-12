package X;

import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class E7F {
    public volatile String LIZ;
    public volatile EAB LIZIZ;
    public final FHP LIZLLL;
    public final String LJ = "__extra_exposed_vids";
    public final EAB LIZJ = new EAB(new E7G(this, "__extra_exposed_vids"));

    public final EAB LIZ() {
        FH1.LJI.getClass();
        String LJFF = FH1.LJFF();
        if (!o.LJ(this.LIZ, LJFF)) {
            this.LIZ = LJFF;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('{');
            LIZ.append(this.LJ);
            LIZ.append("}_{");
            this.LIZIZ = new EAB(new E7G(this, q.LIZIZ(LIZ, this.LIZ, '}', LIZ)));
        }
        return this.LIZIZ;
    }

    public E7F(FHP fhp) {
        this.LIZLLL = fhp;
    }

    public static List LIZIZ(String str) {
        ArrayList arrayList = null;
        if (str != null && str.length() > 0) {
            List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
            arrayList = new ArrayList();
            for (Object obj : LJLJJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
