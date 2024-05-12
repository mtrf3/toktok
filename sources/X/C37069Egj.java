package X;

import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.o;

/* renamed from: X.Egj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37069Egj extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final Integer LJIIIIZZ;
    public final Long LJIIIZ;
    public final Throwable LJIIJ;
    public final String LJIIJJI;
    public final java.util.Map<String, String> LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37069Egj)) {
            return false;
        }
        C37069Egj c37069Egj = (C37069Egj) obj;
        return o.LJ(this.LIZIZ, c37069Egj.LIZIZ) && o.LJ(this.LIZJ, c37069Egj.LIZJ) && o.LJ(this.LIZLLL, c37069Egj.LIZLLL) && this.LJ == c37069Egj.LJ && this.LJFF == c37069Egj.LJFF && this.LJI == c37069Egj.LJI && this.LJII == c37069Egj.LJII && o.LJ(this.LJIIIIZZ, c37069Egj.LJIIIIZZ) && o.LJ(this.LJIIIZ, c37069Egj.LJIIIZ) && o.LJ(this.LJIIJ, c37069Egj.LJIIJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LJII, JBR.LIZJ(this.LJI, (((C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, this.LIZIZ.hashCode() * 31, 31), 31) + this.LJ) * 31) + this.LJFF) * 31, 31), 31);
        Integer num = this.LJIIIIZZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Long l = this.LJIIIZ;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.LJIIJ;
        if (th != null) {
            i = th.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserCardRefreshTrack(enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sceneType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", refreshSize=");
        LIZ.append(this.LJ);
        LIZ.append(", mafCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", totalCost=");
        LIZ.append(this.LJI);
        LIZ.append(", apiCost=");
        LIZ.append(this.LJII);
        LIZ.append(", netStatus=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", constructCost=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", netError=");
        return C169696lJ.LIZLLL(LIZ, this.LJIIJ, ')', LIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIIL;
    }

    public C37069Egj(String str, String str2, String str3, int i, int i2, long j, long j2, Integer num, Long l, Throwable th) {
        String str4;
        long j3 = j;
        long j4 = j2;
        HH1.LIZ(str, "enterFrom", str2, "enterMethod", str3, "sceneType");
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = j3;
        this.LJII = j4;
        this.LJIIIIZZ = num;
        this.LJIIIZ = l;
        this.LJIIJ = th;
        this.LJIIJJI = "rec_user_refresh_pref";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("scene_type", str3);
        c188727au.LIZLLL(i, "count");
        c188727au.LIZLLL(i2, "maf_count");
        c188727au.LJ((0 > j3 || j3 >= 600001) ? -1L : j3, "cost");
        c188727au.LJ((0 > j4 || j4 >= 600001) ? -1L : j4, "api_cost");
        if (th != null) {
            if (th instanceof C38333F2r) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Server, code: ");
                C38333F2r c38333F2r = (C38333F2r) th;
                LIZ.append(c38333F2r.getErrorCode());
                LIZ.append(", msg: ");
                LIZ.append(c38333F2r.getErrorMsg());
                str4 = X1D.LIZIZ(LIZ);
            } else if (th instanceof C38305F1p) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Local, code: ");
                LIZ2.append(((C38306F1q) th).getErrorCode());
                str4 = X1D.LIZIZ(LIZ2);
            } else if (th instanceof C64698PaI) {
                str4 = "NetworkNotAvail";
            } else if (th instanceof C64802Pby) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("HttpResponseException, code: ");
                LIZ3.append(((C64802Pby) th).getStatusCode());
                str4 = X1D.LIZIZ(LIZ3);
            } else if (th instanceof C38299F1j) {
                str4 = "CdnCacheVerifyException";
            } else if (th instanceof C64801Pbx) {
                str4 = "ClientProtocolException";
            } else if (th instanceof C64800Pbw) {
                str4 = "OtherTTNException";
            } else if (th instanceof TimeoutException) {
                str4 = "TimeoutException";
            } else {
                str4 = "unknown error";
            }
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("net_error", str4);
        c188727au.LJIIIZ("is_valid", AbstractC238349Xa.LIZJ(true));
        c188727au.LJFF(num, "net_status");
        c188727au.LJFF(l, "construct_cost");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…tCost)\n        .builder()");
        this.LJIIL = map;
    }
}
