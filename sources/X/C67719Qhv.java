package X;

import X.InterfaceC67808QjM;
import java.util.Arrays;

/* renamed from: X.Qhv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67719Qhv<O extends InterfaceC67808QjM> {
    public final int LIZ;
    public final C67718Qhu<O> LIZIZ;
    public final O LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67719Qhv)) {
            return false;
        }
        C67719Qhv c67719Qhv = (C67719Qhv) obj;
        if (!C64363PNv.LIZ(this.LIZIZ, c67719Qhv.LIZIZ) || !C64363PNv.LIZ(this.LIZJ, c67719Qhv.LIZJ) || !C64363PNv.LIZ(this.LIZLLL, c67719Qhv.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C67719Qhv(C67718Qhu<O> c67718Qhu, O o, String str) {
        this.LIZIZ = c67718Qhu;
        this.LIZJ = o;
        this.LIZLLL = str;
        this.LIZ = Arrays.hashCode(new Object[]{c67718Qhu, o, str});
    }
}
