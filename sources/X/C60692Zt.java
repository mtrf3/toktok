package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60692Zt {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public final int hashCode() {
        int i;
        String str = this.LIZ;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RxTaskInfo{name=");
        LIZ.append(this.LIZ);
        LIZ.append(", strategy=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", priority=");
        LIZ.append(this.LIZJ);
        LIZ.append(", time=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public C60692Zt() {
    }

    public C60692Zt(C56182Ik c56182Ik) {
        this.LIZ = c56182Ik.LIZ;
        this.LIZIZ = c56182Ik.LIZIZ;
        this.LIZJ = c56182Ik.LIZJ;
        this.LIZLLL = c56182Ik.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C60692Zt.class, obj.getClass())) {
            return false;
        }
        C60692Zt c60692Zt = (C60692Zt) obj;
        if (this.LIZJ != c60692Zt.LIZJ) {
            return false;
        }
        return o.LJ(this.LIZ, c60692Zt.LIZ);
    }
}
