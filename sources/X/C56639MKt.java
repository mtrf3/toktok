package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MKt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56639MKt {
    public long LIZ;
    public long LIZIZ;
    public final C213748aA LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public final long LJII;
    public long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public long LJIIJJI;

    public C56639MKt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56639MKt)) {
            return false;
        }
        C56639MKt c56639MKt = (C56639MKt) obj;
        return this.LIZ == c56639MKt.LIZ && this.LIZIZ == c56639MKt.LIZIZ && o.LJ(this.LIZJ, c56639MKt.LIZJ) && this.LIZLLL == c56639MKt.LIZLLL && this.LJ == c56639MKt.LJ && this.LJFF == c56639MKt.LJFF && this.LJI == c56639MKt.LJI && this.LJII == c56639MKt.LJII && this.LJIIIIZZ == c56639MKt.LJIIIIZZ && this.LJIIIZ == c56639MKt.LJIIIZ && this.LJIIJ == c56639MKt.LJIIJ && this.LJIIJJI == c56639MKt.LJIIJJI;
    }

    public final String toString() {
        return "MetaData(clickTs=" + this.LIZ + ", fragConstructorTs=" + this.LIZIZ + ", lifecycleTracker=" + this.LIZJ + ", imReqTs=" + this.LIZLLL + ", imRespTs=" + this.LJ + ", multiReqTs=" + this.LJFF + ", multiRespTs=" + this.LJI + ", recommendReqTs=" + this.LJII + ", recommendRespTs=" + this.LJIIIIZZ + ", contactReqTs=" + this.LJIIIZ + ", contactRespTs=" + this.LJIIJ + ", endTs=" + this.LJIIJJI + ')';
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJIIJJI) + JBR.LIZJ(this.LJIIJ, JBR.LIZJ(this.LJIIIZ, JBR.LIZJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, (this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public /* synthetic */ C56639MKt(int i) {
        this(0L, 0L, new C213748aA(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
    }

    public C56639MKt(long j, long j2, C213748aA lifecycleTracker, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        o.LJIIIZ(lifecycleTracker, "lifecycleTracker");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = lifecycleTracker;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = j5;
        this.LJI = j6;
        this.LJII = j7;
        this.LJIIIIZZ = j8;
        this.LJIIIZ = j9;
        this.LJIIJ = j10;
        this.LJIIJJI = j11;
    }
}
