package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UhQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77880UhQ {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77880UhQ)) {
            return false;
        }
        C77880UhQ c77880UhQ = (C77880UhQ) obj;
        return o.LJ(this.LIZ, c77880UhQ.LIZ) && o.LJ(this.LIZIZ, c77880UhQ.LIZIZ) && this.LIZJ == c77880UhQ.LIZJ && this.LIZLLL == c77880UhQ.LIZLLL && o.LJ(this.LJ, c77880UhQ.LJ) && this.LJFF == c77880UhQ.LJFF && this.LJI == c77880UhQ.LJI && this.LJII == c77880UhQ.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int LJ = (((C79062V1e.LJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, (i2 + i) * 31, 31), 31), 31) + this.LJFF) * 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return LJ + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SystemCalendarEvent(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", note=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", repeatFrequency=");
        LIZ.append(this.LJ);
        LIZ.append(", repeatInterval=");
        LIZ.append(this.LJFF);
        LIZ.append(", repeatCount=");
        LIZ.append(this.LJI);
        LIZ.append(", allDay=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C77880UhQ(String str, String str2, long j, long j2, String repeatFrequency, int i, int i2, boolean z) {
        o.LJIIIZ(repeatFrequency, "repeatFrequency");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = repeatFrequency;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z;
    }
}
