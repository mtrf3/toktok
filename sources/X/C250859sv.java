package X;

import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250859sv {
    public final long LIZ;
    public final Long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final List<String> LJFF;
    public Integer LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C250859sv)) {
            return false;
        }
        C250859sv c250859sv = (C250859sv) obj;
        return this.LIZ == c250859sv.LIZ && o.LJ(this.LIZIZ, c250859sv.LIZIZ) && o.LJ(this.LIZJ, c250859sv.LIZJ) && o.LJ(this.LIZLLL, c250859sv.LIZLLL) && this.LJ == c250859sv.LJ && o.LJ(this.LJFF, c250859sv.LJFF) && o.LJ(this.LJI, c250859sv.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        Long l = this.LIZIZ;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, (LLJIJIL + hashCode) * 31, 31), 31), 31);
        List<String> list = this.LJFF;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        Integer num = this.LJI;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchUserSugRequest(mentionType=");
        LIZ.append(this.LIZ);
        LIZ.append(", awemeID=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", keyword=");
        LIZ.append(this.LIZJ);
        LIZ.append(", source=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", count=");
        LIZ.append(this.LJ);
        LIZ.append(", uidFilterList=");
        LIZ.append(this.LJFF);
        LIZ.append(", isNonPersonalizedSearch=");
        return s0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C250859sv(long j, Long l, String keyword, String source, long j2, List<String> list, Integer num) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(source, "source");
        this.LIZ = j;
        this.LIZIZ = l;
        this.LIZJ = keyword;
        this.LIZLLL = source;
        this.LJ = j2;
        this.LJFF = list;
        this.LJI = num;
    }
}
