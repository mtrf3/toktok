package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ML5 {
    public long LIZ;
    public long LIZIZ;
    public final C213748aA LIZJ;
    public long LIZLLL;
    public long LJ;
    public ML6<Integer> LJFF;
    public long LJI;
    public long LJII;

    public ML5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ML5)) {
            return false;
        }
        ML5 ml5 = (ML5) obj;
        return this.LIZ == ml5.LIZ && this.LIZIZ == ml5.LIZIZ && o.LJ(this.LIZJ, ml5.LIZJ) && this.LIZLLL == ml5.LIZLLL && this.LJ == ml5.LJ && o.LJ(this.LJFF, ml5.LJFF) && this.LJI == ml5.LJI && this.LJII == ml5.LJII;
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, (this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31)) * 31, 31), 31);
        ML6<Integer> ml6 = this.LJFF;
        if (ml6 == null) {
            hashCode = 0;
        } else {
            hashCode = ml6.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJII) + JBR.LIZJ(this.LJI, (LIZJ + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MetaData(clickTs=");
        LIZ.append(this.LIZ);
        LIZ.append(", fragConstructorTs=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lifecycleTracker=");
        LIZ.append(this.LIZJ);
        LIZ.append(", noticeReqTs=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", noticeRespTs=");
        LIZ.append(this.LJ);
        LIZ.append(", noticeResp=");
        LIZ.append(this.LJFF);
        LIZ.append(", adapterSetDataTs=");
        LIZ.append(this.LJI);
        LIZ.append(", renderedTs=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ ML5(int i) {
        this(0L, 0L, new C213748aA(), 0L, 0L, null, 0L, 0L);
    }

    public ML5(long j, long j2, C213748aA lifecycleTracker, long j3, long j4, ML6<Integer> ml6, long j5, long j6) {
        o.LJIIIZ(lifecycleTracker, "lifecycleTracker");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = lifecycleTracker;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = ml6;
        this.LJI = j5;
        this.LJII = j6;
    }
}
