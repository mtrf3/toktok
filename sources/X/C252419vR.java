package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.9vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252419vR {
    public final boolean LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final boolean LJFF = true;
    public final float LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final float LJIIIZ;
    public final int LJIIJ;
    public final long LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C252419vR)) {
            return false;
        }
        C252419vR c252419vR = (C252419vR) obj;
        return this.LIZ == c252419vR.LIZ && o.LJ(this.LIZIZ, c252419vR.LIZIZ) && o.LJ(this.LIZJ, c252419vR.LIZJ) && this.LIZLLL == c252419vR.LIZLLL && o.LJ(this.LJ, c252419vR.LJ) && this.LJFF == c252419vR.LJFF && Float.compare(this.LJI, c252419vR.LJI) == 0 && this.LJII == c252419vR.LJII && this.LJIIIIZZ == c252419vR.LJIIIIZZ && Float.compare(this.LJIIIZ, c252419vR.LJIIIZ) == 0 && this.LJIIJ == c252419vR.LJIIJ && this.LJIIJJI == c252419vR.LJIIJJI;
    }

    public final String toString() {
        return "ClearModeMobModel(hadEnter4OneSecond=" + this.LIZ + ", lastAweme=" + this.LIZIZ + ", enterFrom=" + this.LIZJ + ", duration=" + this.LIZLLL + ", exitMethod=" + this.LJ + ", isClearModeEnable=" + this.LJFF + ", lastEnterPct=" + this.LJI + ", lastEnterPlayTimes=" + this.LJII + ", enterTime=" + this.LJIIIIZZ + ", lastExitPct=" + this.LJIIIZ + ", lastExitPlayTimes=" + this.LJIIJ + ", exitTime=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        Aweme aweme = this.LIZIZ;
        int i3 = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str = this.LIZJ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, (i4 + hashCode2) * 31, 31);
        String str2 = this.LJ;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i5 = (LIZJ + i3) * 31;
        if (!this.LJFF) {
            i = 0;
        }
        return C16880lQ.LLJIJIL(this.LJIIJJI) + ((C47959Irz.LIZIZ(this.LJIIIZ, JBR.LIZJ(this.LJIIIIZZ, (C47959Irz.LIZIZ(this.LJI, (i5 + i) * 31, 31) + this.LJII) * 31, 31), 31) + this.LJIIJ) * 31);
    }

    public C252419vR(boolean z, Aweme aweme, String str, long j, String str2, float f, int i, long j2, float f2, int i2, long j3) {
        this.LIZ = z;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJI = f;
        this.LJII = i;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = f2;
        this.LJIIJ = i2;
        this.LJIIJJI = j3;
    }
}
