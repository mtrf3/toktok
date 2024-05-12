package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42366Gjy extends AbstractC42369Gk1 {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final String LIZLLL;

    public C42366Gjy() {
        this(0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42366Gjy)) {
            return false;
        }
        C42366Gjy c42366Gjy = (C42366Gjy) obj;
        return this.LIZ == c42366Gjy.LIZ && this.LIZIZ == c42366Gjy.LIZIZ && Float.compare(this.LIZJ, c42366Gjy.LIZJ) == 0 && o.LJ(this.LIZLLL, c42366Gjy.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.LIZJ, ((this.LIZ * 31) + this.LIZIZ) * 31, 31);
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CloudCompileError(error=");
        LIZ.append(this.LIZ);
        LIZ.append(", ext=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", f=");
        LIZ.append(this.LIZJ);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C42366Gjy(int i, int i2) {
        this((i2 & 1) != 0 ? -1 : i, 0, 0.0f, null);
    }

    public C42366Gjy(int i, int i2, float f, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = str;
    }
}
