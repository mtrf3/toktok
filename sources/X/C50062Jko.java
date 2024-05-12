package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jko, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50062Jko {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final long LJII;
    public final EnumC50384Jq0 LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50062Jko)) {
            return false;
        }
        C50062Jko c50062Jko = (C50062Jko) obj;
        return o.LJ(this.LIZ, c50062Jko.LIZ) && o.LJ(this.LIZIZ, c50062Jko.LIZIZ) && o.LJ(this.LIZJ, c50062Jko.LIZJ) && o.LJ(this.LIZLLL, c50062Jko.LIZLLL) && o.LJ(this.LJ, c50062Jko.LJ) && o.LJ(this.LJFF, c50062Jko.LJFF) && this.LJI == c50062Jko.LJI && this.LJII == c50062Jko.LJII && this.LJIIIIZZ == c50062Jko.LJIIIIZZ && o.LJ(this.LJIIIZ, c50062Jko.LJIIIZ) && o.LJ(this.LJIIJ, c50062Jko.LJIIJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJII, JBR.LIZJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31), 31), 31), 31), 31), 31), 31);
        EnumC50384Jq0 enumC50384Jq0 = this.LJIIIIZZ;
        if (enumC50384Jq0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC50384Jq0.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        Integer num2 = this.LJIIIZ;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return this.LJIIJ.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchHorizontalParam(originType=");
        sb.append(this.LIZ);
        sb.append(", searchId=");
        sb.append(this.LIZIZ);
        sb.append(", query=");
        sb.append(this.LIZJ);
        sb.append(", backtrace=");
        sb.append(this.LIZLLL);
        sb.append(", logId=");
        sb.append(this.LJ);
        sb.append(", tokenType=");
        sb.append(this.LJFF);
        sb.append(", cursor=");
        sb.append(this.LJI);
        sb.append(", count=");
        sb.append(this.LJII);
        sb.append(", panelStateEvent=");
        sb.append(this.LJIIIIZZ);
        sb.append(", tabIndex=");
        sb.append(this.LJIIIZ);
        sb.append(", containerId=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    public C50062Jko(Integer num, String searchId, String query, String backtrace, String logId, String tokenType, long j, long j2, EnumC50384Jq0 enumC50384Jq0, Integer num2, String str, int i) {
        EnumC50384Jq0 enumC50384Jq02 = enumC50384Jq0;
        String containerId = str;
        num = (i & 1) != 0 ? null : num;
        enumC50384Jq02 = (i & 256) != 0 ? null : enumC50384Jq02;
        Integer num3 = (i & 512) == 0 ? num2 : null;
        containerId = (i & 1024) != 0 ? "" : containerId;
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(query, "query");
        o.LJIIIZ(backtrace, "backtrace");
        o.LJIIIZ(logId, "logId");
        o.LJIIIZ(tokenType, "tokenType");
        o.LJIIIZ(containerId, "containerId");
        this.LIZ = num;
        this.LIZIZ = searchId;
        this.LIZJ = query;
        this.LIZLLL = backtrace;
        this.LJ = logId;
        this.LJFF = tokenType;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = enumC50384Jq02;
        this.LJIIIZ = num3;
        this.LJIIJ = containerId;
    }
}
