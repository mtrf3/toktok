package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34291Wf extends AbstractC17560mW {
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34291Wf) && o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(((C34291Wf) obj).LIZJ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeVerticalTo(dy=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C34291Wf(float f) {
        super(false, false, 3);
        this.LIZJ = f;
    }
}
