package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.XdI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85268XdI {
    public final double LIZ;
    public final double LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final long LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final String LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final long LJIJ;
    public final long LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;

    public C85268XdI() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0L, null, null, 0L, 0L, false, 0L, 0L, null, null, 4194303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85268XdI)) {
            return false;
        }
        C85268XdI c85268XdI = (C85268XdI) obj;
        return Double.compare(this.LIZ, c85268XdI.LIZ) == 0 && Double.compare(this.LIZIZ, c85268XdI.LIZIZ) == 0 && o.LJ(this.LIZJ, c85268XdI.LIZJ) && this.LIZLLL == c85268XdI.LIZLLL && o.LJ(this.LJ, c85268XdI.LJ) && o.LJ(this.LJFF, c85268XdI.LJFF) && o.LJ(this.LJI, c85268XdI.LJI) && o.LJ(this.LJII, c85268XdI.LJII) && o.LJ(this.LJIIIIZZ, c85268XdI.LJIIIIZZ) && o.LJ(this.LJIIIZ, c85268XdI.LJIIIZ) && o.LJ(this.LJIIJ, c85268XdI.LJIIJ) && o.LJ(this.LJIIJJI, c85268XdI.LJIIJJI) && this.LJIIL == c85268XdI.LJIIL && this.LJIILIIL == c85268XdI.LJIILIIL && this.LJIILJJIL == c85268XdI.LJIILJJIL && o.LJ(this.LJIILL, c85268XdI.LJIILL) && this.LJIILLIIL == c85268XdI.LJIILLIIL && this.LJIIZILJ == c85268XdI.LJIIZILJ && this.LJIJ == c85268XdI.LJIJ && this.LJIJI == c85268XdI.LJIJI && o.LJ(this.LJIJJ, c85268XdI.LJIJJ) && o.LJ(this.LJIJJLI, c85268XdI.LJIJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int LIZIZ = C1JX.LIZIZ(this.LIZIZ, C16880lQ.LLJI(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, (LIZIZ + hashCode) * 31, 31);
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.LJI;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.LJII;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.LJIIIIZZ;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.LJIIIZ;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str8 = this.LJIIJ;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str9 = this.LJIIJJI;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.LJIILJJIL, JBR.LIZJ(this.LJIILIIL, JBR.LIZJ(this.LJIIL, (i8 + hashCode9) * 31, 31), 31), 31);
        String str10 = this.LJIILL;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i9 = (LIZJ2 + hashCode10) * 31;
        boolean z = this.LJIILLIIL;
        int i10 = 1;
        int i11 = z;
        if (z != 0) {
            i11 = 1;
        }
        int i12 = (i9 + i11) * 31;
        if (!this.LJIIZILJ) {
            i10 = 0;
        }
        int LIZJ3 = JBR.LIZJ(this.LJIJI, JBR.LIZJ(this.LJIJ, (i12 + i10) * 31, 31), 31);
        String str11 = this.LJIJJ;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i13 = (LIZJ3 + hashCode11) * 31;
        String str12 = this.LJIJJLI;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiSearchQuery(longitude=");
        sb.append(this.LIZ);
        sb.append(", latitude=");
        sb.append(this.LIZIZ);
        sb.append(", coordinateSystem=");
        sb.append(this.LIZJ);
        sb.append(", radius=");
        sb.append(this.LIZLLL);
        sb.append(", keywords=");
        sb.append(this.LJ);
        sb.append(", scenario=");
        sb.append(this.LJFF);
        sb.append(", poiId=");
        sb.append(this.LJI);
        sb.append(", region=");
        sb.append(this.LJII);
        sb.append(", language=");
        sb.append(this.LJIIIIZZ);
        sb.append(", city=");
        sb.append(this.LJIIIZ);
        sb.append(", types=");
        sb.append(this.LJIIJ);
        sb.append(", rankBy=");
        sb.append(this.LJIIJJI);
        sb.append(", offset=");
        sb.append(this.LJIIL);
        sb.append(", page=");
        sb.append(this.LJIILIIL);
        sb.append(", timeStamp=");
        sb.append(this.LJIILJJIL);
        sb.append(", extra=");
        sb.append(this.LJIILL);
        sb.append(", locationAllowed=");
        sb.append(this.LJIILLIIL);
        sb.append(", locationInstalled=");
        sb.append(this.LJIIZILJ);
        sb.append(", locationPrecise=");
        sb.append(this.LJIJ);
        sb.append(", sessionId=");
        sb.append(this.LJIJI);
        sb.append(", awemeId=");
        sb.append(this.LJIJJ);
        sb.append(", enterFrom=");
        return C07670Rv.LIZIZ(sb, this.LJIJJLI, ')');
    }

    public C85268XdI(double d, double d2, long j, String str, String str2, long j2, long j3, boolean z, long j4, long j5, String str3, String str4, int i) {
        double d3 = d;
        long j6 = j3;
        long j7 = j2;
        String str5 = str2;
        long j8 = j;
        String str6 = str;
        String str7 = str4;
        String str8 = str3;
        long j9 = j5;
        boolean z2 = z;
        long j10 = j4;
        int i2 = i & 1;
        double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        d3 = i2 != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d3;
        d4 = (i & 2) == 0 ? d2 : d4;
        j8 = (i & 8) != 0 ? 0L : j8;
        str6 = (i & 16) != 0 ? null : str6;
        str5 = (i & 32) != 0 ? null : str5;
        j7 = (i & 4096) != 0 ? 0L : j7;
        j6 = (i & FileUtils.BUFFER_SIZE) != 0 ? 0L : j6;
        z2 = (65536 & i) != 0 ? false : z2;
        j10 = (i & 262144) != 0 ? 0L : j10;
        j9 = (i & 524288) != 0 ? 0L : j9;
        str8 = (i & 1048576) != 0 ? null : str8;
        str7 = (i & 2097152) != 0 ? null : str7;
        this.LIZ = d3;
        this.LIZIZ = d4;
        this.LIZJ = null;
        this.LIZLLL = j8;
        this.LJ = str6;
        this.LJFF = str5;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = j7;
        this.LJIILIIL = j6;
        this.LJIILJJIL = 0L;
        this.LJIILL = null;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = false;
        this.LJIJ = j10;
        this.LJIJI = j9;
        this.LJIJJ = str8;
        this.LJIJJLI = str7;
    }
}
