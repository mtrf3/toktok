package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIM {
    public Long LIZ;
    public String LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public Long LJFF;
    public boolean LJI;

    public MIM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MIM)) {
            return false;
        }
        MIM mim = (MIM) obj;
        return o.LJ(this.LIZ, mim.LIZ) && o.LJ(this.LIZIZ, mim.LIZIZ) && this.LIZJ == mim.LIZJ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        return C16880lQ.LLJIJIL(this.LIZJ) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionDetailTimeTracker(mEntranceTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", mAwemeId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mTimePausedInDetailActivity=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public MIM(int i) {
        this.LIZ = null;
        this.LIZIZ = "";
        this.LIZJ = 0L;
        this.LIZLLL = true;
    }
}
