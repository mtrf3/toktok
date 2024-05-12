package X;

import kotlin.jvm.internal.o;

/* renamed from: X.00z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C006900z {
    public final C29602Bja LIZ;
    public final C29602Bja LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C006900z)) {
            return false;
        }
        C006900z c006900z = (C006900z) obj;
        return o.LJ(this.LIZ, c006900z.LIZ) && o.LJ(this.LIZIZ, c006900z.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C29602Bja c29602Bja = this.LIZIZ;
        return hashCode + (c29602Bja == null ? 0 : c29602Bja.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogStatus(liveDialogStatus=");
        LIZ.append(this.LIZ);
        LIZ.append(", currentShowDialog=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C006900z(C29602Bja liveDialogStatus, C29602Bja c29602Bja) {
        o.LJIIIZ(liveDialogStatus, "liveDialogStatus");
        this.LIZ = liveDialogStatus;
        this.LIZIZ = c29602Bja;
    }
}
