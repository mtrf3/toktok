package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08890Wn {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final long LJI;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BgEffectLogBean(effectId=");
        LIZ.append(this.LIZ);
        LIZ.append(", resourceId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effectName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", imprPosition=");
        LIZ.append(this.LJ);
        LIZ.append(", subType=");
        LIZ.append(this.LJFF);
        LIZ.append(", startTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C08890Wn) && this.LIZ == ((C08890Wn) obj).LIZ) {
            return true;
        }
        return false;
    }

    public C08890Wn(long j, String resourceId, String str, String str2, String str3, long j2) {
        long LIZ = C30725C4b.LIZ();
        o.LJIIIZ(resourceId, "resourceId");
        this.LIZ = j;
        this.LIZIZ = resourceId;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = j2;
        this.LJI = LIZ;
    }
}
