package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zyo, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91698Zyo {
    public final AbstractC91689Zyf<Object> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Object LIZLLL;

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZJ ? 1 : 0)) * 31;
        Object obj = this.LIZLLL;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C91698Zyo.class, obj.getClass())) {
            return false;
        }
        C91698Zyo c91698Zyo = (C91698Zyo) obj;
        if (this.LIZIZ != c91698Zyo.LIZIZ || this.LIZJ != c91698Zyo.LIZJ || !o.LJ(this.LIZ, c91698Zyo.LIZ)) {
            return false;
        }
        Object obj2 = this.LIZLLL;
        if (obj2 != null) {
            return o.LJ(obj2, c91698Zyo.LIZLLL);
        }
        if (c91698Zyo.LIZLLL == null) {
            return true;
        }
        return false;
    }

    public C91698Zyo(AbstractC91689Zyf abstractC91689Zyf, Object obj, boolean z) {
        if (!z || obj != null) {
            this.LIZ = abstractC91689Zyf;
            this.LIZIZ = false;
            this.LIZLLL = obj;
            this.LIZJ = z;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Argument with type ");
        LIZ.append(abstractC91689Zyf.LIZIZ());
        LIZ.append(" has null value but is not nullable.");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
