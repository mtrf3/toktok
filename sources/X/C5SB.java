package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5SB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SB {
    public final String LIZ;
    public final EnumC123874tb LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5SB)) {
            return false;
        }
        C5SB c5sb = (C5SB) obj;
        return o.LJ(this.LIZ, c5sb.LIZ) && this.LIZIZ == c5sb.LIZIZ && this.LIZJ == c5sb.LIZJ && Float.compare(this.LIZLLL, c5sb.LIZLLL) == 0 && this.LJ == c5sb.LJ && this.LJFF == c5sb.LJFF;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJFF) + JBR.LIZJ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, JBR.LIZJ(this.LIZJ, (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateSegment(path=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZJ);
        LIZ.append(", speed=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", start=");
        LIZ.append(this.LJ);
        LIZ.append(", end=");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C5SB(String path, EnumC123874tb type, long j, float f, long j2, long j3) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(type, "type");
        this.LIZ = path;
        this.LIZIZ = type;
        this.LIZJ = j;
        this.LIZLLL = f;
        this.LJ = j2;
        this.LJFF = j3;
    }
}
