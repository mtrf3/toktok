package X;

import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q45 {
    public final C66393Q3x LIZ() {
        C66393Q3x c66393Q3x;
        C66393Q3x c66393Q3x2 = C66393Q3x.LJI;
        if (c66393Q3x2 == null) {
            synchronized (this) {
                c66393Q3x = C66393Q3x.LJI;
                if (c66393Q3x == null) {
                    C10760bY LIZ = C10760bY.LIZ(u.LIZJ());
                    o.LJIIIIZZ(LIZ, "getInstance(applicationContext)");
                    c66393Q3x = new C66393Q3x(LIZ, new Q4L());
                    C66393Q3x.LJI = c66393Q3x;
                }
            }
            return c66393Q3x;
        }
        return c66393Q3x2;
    }
}
