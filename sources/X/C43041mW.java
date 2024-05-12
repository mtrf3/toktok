package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1mW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43041mW extends QZV {
    public static final /* synthetic */ int LJ = 0;
    public final float LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final int hashCode() {
        return (((C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stroke(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", miter=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cap=");
        LIZ.append((Object) C11880dM.LIZ(this.LIZJ));
        LIZ.append(", join=");
        LIZ.append((Object) C11920dQ.LIZ(this.LIZLLL));
        LIZ.append(", pathEffect=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43041mW)) {
            return false;
        }
        C43041mW c43041mW = (C43041mW) obj;
        if (this.LIZ != c43041mW.LIZ || this.LIZIZ != c43041mW.LIZIZ || this.LIZJ != c43041mW.LIZJ || this.LIZLLL != c43041mW.LIZLLL) {
            return false;
        }
        c43041mW.getClass();
        if (o.LJ(null, null)) {
            return true;
        }
        return false;
    }

    public C43041mW(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
