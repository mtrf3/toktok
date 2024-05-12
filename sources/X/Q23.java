package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class Q23 extends Q20 {
    public final Collection<String> LIZJ;

    public abstract boolean LJI(String str, String str2);

    public Q23(Collection<String> collection) {
        this.LIZJ = collection;
    }

    @Override // X.Q20
    public final boolean LIZIZ(C66343Q1z c66343Q1z) {
        if (super.LIZIZ(c66343Q1z) && c66343Q1z.LIZ(this).LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // X.Q20
    public final void LJ(C66343Q1z c66343Q1z, Q20 q20) {
        c66343Q1z.LIZ(this).LIZ = true;
        Q28 LIZ = c66343Q1z.LIZ(this);
        try {
            String str = (String) q20.LIZLLL(c66343Q1z);
            Iterator<String> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                if (LJI(str, it.next())) {
                    LIZ.LIZIZ = true;
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
