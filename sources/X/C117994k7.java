package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117994k7 {
    public final long LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC117794jn LIZLLL;
    public final EnumC117974k5 LJ;
    public final int LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117994k7)) {
            return false;
        }
        C117994k7 c117994k7 = (C117994k7) obj;
        return this.LIZ == c117994k7.LIZ && this.LIZIZ == c117994k7.LIZIZ && this.LIZJ == c117994k7.LIZJ && this.LIZLLL == c117994k7.LIZLLL && this.LJ == c117994k7.LJ && this.LJFF == c117994k7.LJFF && this.LJI == c117994k7.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LLJIJIL + i) * 31;
        boolean z2 = this.LIZJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        EnumC117794jn enumC117794jn = this.LIZLLL;
        return ((((this.LJ.hashCode() + ((i4 + (enumC117794jn == null ? 0 : enumC117794jn.hashCode())) * 31)) * 31) + this.LJFF) * 31) + (this.LJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMessageMonitorInitParams(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", isFastSend=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fromRecord=");
        LIZ.append(this.LIZJ);
        LIZ.append(", strategy=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mediaType=");
        LIZ.append(this.LJ);
        LIZ.append(", selectCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", isRetry=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public static C117994k7 LIZ(C117994k7 c117994k7, EnumC117794jn enumC117794jn) {
        long j = c117994k7.LIZ;
        boolean z = c117994k7.LIZIZ;
        boolean z2 = c117994k7.LIZJ;
        EnumC117974k5 mediaType = c117994k7.LJ;
        int i = c117994k7.LJFF;
        boolean z3 = c117994k7.LJI;
        c117994k7.getClass();
        o.LJIIIZ(mediaType, "mediaType");
        return new C117994k7(j, z, z2, enumC117794jn, mediaType, i, z3);
    }

    public /* synthetic */ C117994k7(long j, boolean z, boolean z2, EnumC117974k5 enumC117974k5, int i, boolean z3, int i2) {
        this(j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (EnumC117794jn) null, enumC117974k5, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3);
    }

    public C117994k7(long j, boolean z, boolean z2, EnumC117794jn enumC117794jn, EnumC117974k5 mediaType, int i, boolean z3) {
        o.LJIIIZ(mediaType, "mediaType");
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = enumC117794jn;
        this.LJ = mediaType;
        this.LJFF = i;
        this.LJI = z3;
    }
}
