package X;

import defpackage.b0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2lL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67792lL {
    public static final /* synthetic */ int LIZLLL = 0;
    public final long LIZ;
    public final int LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67792lL)) {
            return false;
        }
        C67792lL c67792lL = (C67792lL) obj;
        return this.LIZ == c67792lL.LIZ && this.LIZIZ == c67792lL.LIZIZ;
    }

    public final int hashCode() {
        return (C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiggSnapshot(diggCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", userDigg=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final long LIZ(int i) {
        if (i == 1 && this.LIZIZ == 1) {
            return this.LIZ;
        }
        if (i == 1) {
            if (this.LIZIZ != 1) {
                return this.LIZ + 1;
            }
        } else if (i != 1) {
            if (this.LIZIZ == 1) {
                return this.LIZ - 1;
            }
            if (i != 1 && this.LIZIZ != 1) {
                return this.LIZ;
            }
        }
        return this.LIZ;
    }

    public C67792lL(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
