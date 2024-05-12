package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232649Bc {
    public final EnumC2322699q LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232649Bc)) {
            return false;
        }
        C232649Bc c232649Bc = (C232649Bc) obj;
        return this.LIZ == c232649Bc.LIZ && o.LJ(this.LIZIZ, c232649Bc.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GenoBuilder(mode=");
        LIZ.append(this.LIZ);
        LIZ.append(", localFileDirPath=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C232649Bc(EnumC2322699q mode, String localFileDirPath) {
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(localFileDirPath, "localFileDirPath");
        this.LIZ = mode;
        this.LIZIZ = localFileDirPath;
    }
}
