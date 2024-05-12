package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5DY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DY {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        int hashCode = this.LIZJ.hashCode() + (this.LIZIZ * 31);
        if (!AnonymousClass504.LIZIZ) {
            return (hashCode * 31) + this.LIZ.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheKey(path=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fileId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5DY)) {
            return false;
        }
        if (!AnonymousClass504.LIZIZ && !o.LJ(this.LIZ, ((C5DY) obj).LIZ)) {
            return false;
        }
        C5DY c5dy = (C5DY) obj;
        if (this.LIZIZ == c5dy.LIZIZ && o.LJ(this.LIZJ, c5dy.LIZJ)) {
            return true;
        }
        return false;
    }

    public C5DY(String path, int i, String fileId) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fileId, "fileId");
        this.LIZ = path;
        this.LIZIZ = i;
        this.LIZJ = fileId;
    }
}
