package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.PjC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65250PjC {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65250PjC)) {
            return false;
        }
        C65250PjC c65250PjC = (C65250PjC) obj;
        return o.LJ(this.LIZ, c65250PjC.LIZ) && o.LJ(this.LIZIZ, c65250PjC.LIZIZ) && o.LJ(this.LIZJ, c65250PjC.LIZJ) && o.LJ(this.LIZLLL, c65250PjC.LIZLLL) && o.LJ(this.LJ, c65250PjC.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchPBConfigModel(channel=");
        LIZ.append(this.LIZ);
        LIZ.append(", dataMessageName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dataShrinkConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extraMessageName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extraShrinkConfig=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C65250PjC(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
