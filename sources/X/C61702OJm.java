package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: X.OJm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61702OJm {
    public static final Pattern LJIIIZ = PatternProtector.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern LJIIJ = PatternProtector.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern LJIIJJI = PatternProtector.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern LJIIL = PatternProtector.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZIZ, C79062V1e.LJ(this.LIZ, 527, 31), 31), 31), 31);
        long j = this.LIZJ;
        return ((((((((LJ + ((int) (j ^ (j >>> 32)))) * 31) + (!this.LJFF ? 1 : 0)) * 31) + (!this.LJI ? 1 : 0)) * 31) + (!this.LJII ? 1 : 0)) * 31) + (!this.LJIIIIZZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append('=');
        sb.append(this.LIZIZ);
        if (this.LJII) {
            if (this.LIZJ == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C61704OJo.LIZ.get().format(new Date(this.LIZJ)));
            }
        }
        if (!this.LJIIIIZZ) {
            sb.append("; domain=");
            sb.append(this.LIZLLL);
        }
        sb.append("; path=");
        sb.append(this.LJ);
        if (this.LJFF) {
            sb.append("; secure");
        }
        if (this.LJI) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C61702OJm)) {
            return false;
        }
        C61702OJm c61702OJm = (C61702OJm) obj;
        if (!c61702OJm.LIZ.equals(this.LIZ) || !c61702OJm.LIZIZ.equals(this.LIZIZ) || !c61702OJm.LIZLLL.equals(this.LIZLLL) || !c61702OJm.LJ.equals(this.LJ) || c61702OJm.LIZJ != this.LIZJ || c61702OJm.LJFF != this.LJFF || c61702OJm.LJI != this.LJI || c61702OJm.LJII != this.LJII || c61702OJm.LJIIIIZZ != this.LJIIIIZZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0175, code lost:
    
        if (X.PVA.LJIILLIIL.matcher(r2).matches() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2 != (-1)) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r2 != (-1)) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c2, code lost:
    
        if (r14 <= 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C61702OJm LIZIZ(X.C64626PXy r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61702OJm.LIZIZ(X.PXy, java.lang.String):X.OJm");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZJ(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61702OJm.LIZJ(int, java.lang.String):long");
    }

    public static int LIZ(int i, int i2, String str, boolean z) {
        boolean z2;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' ? !(charAt >= 127 || (charAt >= '0' && (charAt <= '9' || (charAt < 'a' ? !(charAt < 'A' ? charAt != ':' : charAt > 'Z') : charAt <= 'z')))) : charAt == '\t') {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public C61702OJm(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z;
        this.LJI = z2;
        this.LJIIIIZZ = z3;
        this.LJII = z4;
    }
}
