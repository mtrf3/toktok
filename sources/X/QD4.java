package X;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes12.dex */
public final class QD4 {
    public final Method LIZ;
    public final ThreadMode LIZIZ;
    public final Class<?> LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public String LJFF;

    public final synchronized void LIZ() {
        if (this.LJFF == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.LIZ.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.LIZ.getName());
            sb.append('(');
            sb.append(this.LIZJ.getName());
            this.LJFF = sb.toString();
        }
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QD4) {
            LIZ();
            QD4 qd4 = (QD4) obj;
            qd4.LIZ();
            return this.LJFF.equals(qd4.LJFF);
        }
        return false;
    }

    public QD4(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.LIZ = method;
        this.LIZIZ = threadMode;
        this.LIZJ = cls;
        this.LIZLLL = i;
        this.LJ = z;
    }
}
