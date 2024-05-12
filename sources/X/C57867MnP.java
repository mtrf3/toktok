package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MnP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57867MnP {
    public int LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public int LIZLLL;
    public AbstractC57896Mns LJ;
    public boolean LJFF;

    public C57867MnP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57867MnP)) {
            return false;
        }
        C57867MnP c57867MnP = (C57867MnP) obj;
        return this.LIZ == c57867MnP.LIZ && o.LJ(this.LIZIZ, c57867MnP.LIZIZ) && o.LJ(this.LIZJ, c57867MnP.LIZJ) && this.LIZLLL == c57867MnP.LIZLLL && o.LJ(this.LJ, c57867MnP.LJ) && this.LJFF == c57867MnP.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int hashCode2 = (this.LJ.hashCode() + ((((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LIZLLL) * 31)) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ListConfig(listVariant=");
        LIZ.append(this.LIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZJ);
        LIZ.append(", loadMorePreloadCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", authCardStrategy=");
        LIZ.append(this.LJ);
        LIZ.append(", forceRecMore=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ C57867MnP(int i) {
        this(401, null, null, -1, new C57873MnV(), false);
    }

    public C57867MnP(int i, Integer num, Integer num2, int i2, AbstractC57896Mns authCardStrategy, boolean z) {
        o.LJIIIZ(authCardStrategy, "authCardStrategy");
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = i2;
        this.LJ = authCardStrategy;
        this.LJFF = z;
    }
}
