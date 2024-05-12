package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Q1y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66342Q1y extends Q20 {
    public final String LIZJ;
    public final HashMap<Object, Q20> LIZLLL = new HashMap<>();
    public boolean LJ = false;
    public boolean LJFF = false;

    public C66342Q1y(String str) {
        this.LIZJ = str;
    }

    @Override // X.Q20
    public final void LIZJ(C66343Q1z c66343Q1z) {
        if (!LIZIZ(c66343Q1z)) {
            return;
        }
        Object obj = c66343Q1z.LIZ.get(this.LIZJ);
        if (this.LJ) {
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Q20 q20 = this.LIZLLL.get(it.next());
                    if (q20 != null) {
                        q20.LJ(c66343Q1z, this);
                        q20.LIZJ(c66343Q1z);
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    Q20 q202 = this.LIZLLL.get(obj2);
                    if (q202 != null) {
                        q202.LJ(c66343Q1z, this);
                        q202.LIZJ(c66343Q1z);
                    }
                }
            }
        } else {
            Q20 q203 = this.LIZLLL.get(obj);
            if (q203 != null) {
                q203.LJ(c66343Q1z, this);
                q203.LIZJ(c66343Q1z);
            }
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                super.LIZJ(c66343Q1z);
                return;
            }
            return;
        }
        super.LIZJ(c66343Q1z);
    }

    @Override // X.Q20
    public final Object LIZLLL(C66343Q1z c66343Q1z) {
        if (this.LJFF) {
            return c66343Q1z.LJFF.getValue(this.LIZJ);
        }
        return c66343Q1z.LIZ.get(this.LIZJ);
    }

    public final void LJI(Object obj, Q20 q20) {
        this.LIZLLL.put(obj, q20);
    }
}
