package X;

import com.ss.android.vesdk.VEUserConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.5MJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MJ {
    public final EnumC62052c5 LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final VEUserConfig LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5MJ)) {
            return false;
        }
        C5MJ c5mj = (C5MJ) obj;
        return o.LJ(this.LIZ, c5mj.LIZ) && o.LJ(this.LIZIZ, c5mj.LIZIZ) && this.LIZJ == c5mj.LIZJ && o.LJ(this.LIZLLL, c5mj.LIZLLL) && this.LJ == c5mj.LJ && this.LJFF == c5mj.LJFF && this.LJI == c5mj.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        EnumC62052c5 enumC62052c5 = this.LIZ;
        int hashCode = (enumC62052c5 != null ? enumC62052c5.hashCode() : 0) * 31;
        String str = this.LIZIZ;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.LIZJ;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        VEUserConfig vEUserConfig = this.LIZLLL;
        int hashCode3 = (i + (vEUserConfig != null ? vEUserConfig.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z2 = this.LJFF;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        return ((i3 + i4) * 31) + (this.LJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Params(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", workSpace=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", handler=");
        LIZ.append(this.LIZJ);
        LIZ.append(", veUserConfig=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", useVEPubic=");
        LIZ.append(this.LJ);
        LIZ.append(", useGlobalEffect=");
        LIZ.append(this.LJFF);
        LIZ.append(", enableVEOperationEvent=");
        return C19U.LIZ(LIZ, this.LJI, ")", LIZ);
    }

    public C5MJ(EnumC62052c5 type, String workSpace, long j, VEUserConfig vEUserConfig, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(workSpace, "workSpace");
        this.LIZ = type;
        this.LIZIZ = workSpace;
        this.LIZJ = j;
        this.LIZLLL = vEUserConfig;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
