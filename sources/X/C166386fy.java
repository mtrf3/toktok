package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.6fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166386fy {
    public int LIZ;
    public int LIZIZ;
    public double LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public C166386fy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C166386fy)) {
            return false;
        }
        C166386fy c166386fy = (C166386fy) obj;
        return this.LIZ == c166386fy.LIZ && this.LIZIZ == c166386fy.LIZIZ && Double.compare(this.LIZJ, c166386fy.LIZJ) == 0 && this.LIZLLL == c166386fy.LIZLLL && this.LJ == c166386fy.LJ && this.LJFF == c166386fy.LJFF && this.LJI == c166386fy.LJI && o.LJ(this.LJII, c166386fy.LJII) && o.LJ(this.LJIIIIZZ, c166386fy.LJIIIIZZ) && o.LJ(this.LJIIIZ, c166386fy.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = (C1JX.LIZIZ(this.LIZJ, ((this.LIZ * 31) + this.LIZIZ) * 31, 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.LJFF) {
            i = 0;
        }
        int LJ = C79062V1e.LJ(this.LJII, (((i3 + i) * 31) + this.LJI) * 31, 31);
        String str = this.LJIIIIZZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJIIIZ.hashCode() + ((LJ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobParams(cacheHitNum=");
        LIZ.append(this.LIZ);
        LIZ.append(", totalNum=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hitRate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", maxFileLength=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasOrigin=");
        LIZ.append(this.LJ);
        LIZ.append(", hasDub=");
        LIZ.append(this.LJFF);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJI);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LJII);
        LIZ.append(", errorDownloadUrl=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C166386fy(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZLLL = 0;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = 0;
        this.LJII = "";
        this.LJIIIIZZ = null;
        this.LJIIIZ = "";
    }
}
