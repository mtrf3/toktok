package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aYm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93928aYm {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC93929aYn LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93928aYm)) {
            return false;
        }
        C93928aYm c93928aYm = (C93928aYm) obj;
        return o.LJ(this.LIZ, c93928aYm.LIZ) && o.LJ(this.LIZIZ, c93928aYm.LIZIZ) && o.LJ(this.LIZJ, c93928aYm.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        EnumC93929aYn enumC93929aYn = this.LIZJ;
        return hashCode2 + (enumC93929aYn != null ? enumC93929aYn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterResult(mainPackagePath=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultModelPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93928aYm(String mainPackagePath, String defaultModelPath, EnumC93929aYn error) {
        o.LJIIIZ(mainPackagePath, "mainPackagePath");
        o.LJIIIZ(defaultModelPath, "defaultModelPath");
        o.LJIIIZ(error, "error");
        this.LIZ = mainPackagePath;
        this.LIZIZ = defaultModelPath;
        this.LIZJ = error;
    }
}
