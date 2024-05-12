package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LWk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54394LWk {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final List<Long> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54394LWk)) {
            return false;
        }
        C54394LWk c54394LWk = (C54394LWk) obj;
        return this.LIZ == c54394LWk.LIZ && this.LIZIZ == c54394LWk.LIZIZ && this.LIZJ == c54394LWk.LIZJ && o.LJ(this.LIZLLL, c54394LWk.LIZLLL) && o.LJ(this.LJ, c54394LWk.LJ) && o.LJ(this.LJFF, c54394LWk.LJFF) && o.LJ(this.LJI, c54394LWk.LJI) && o.LJ(this.LJII, c54394LWk.LJII) && o.LJ(this.LJIIIIZZ, c54394LWk.LJIIIIZZ) && this.LJIIIZ == c54394LWk.LJIIIZ && o.LJ(this.LJIIJ, c54394LWk.LJIIJ);
    }

    public final String toString() {
        return "FollowFeedParam(listQueryType=" + this.LIZ + ", pullType=" + this.LIZIZ + ", followFeedStyle=" + this.LIZJ + ", impressionIds=" + this.LIZLLL + ", lastFeedsId=" + this.LJ + ", liveTagShow=" + this.LJFF + ", insertAwemeId=" + this.LJI + ", pushAids=" + this.LJII + ", pushParams=" + this.LJIIIIZZ + ", refreshAfterVcdAuthorize=" + this.LJIIIZ + ", insertRoomIds=" + this.LJIIJ + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int LJ = C79062V1e.LJ(this.LIZLLL, ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31, 31);
        String str = this.LJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Integer num = this.LJFF;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LJII;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.LJIIIIZZ;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.LJIIIZ) * 31;
        List<Long> list = this.LJIIJ;
        if (list != null) {
            i = list.hashCode();
        }
        return i6 + i;
    }

    public C54394LWk(int i, int i2, int i3, String impressionIds, String str, Integer num, String str2, String str3, String str4, C61878OQg c61878OQg) {
        o.LJIIIZ(impressionIds, "impressionIds");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = impressionIds;
        this.LJ = str;
        this.LJFF = num;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = 0;
        this.LJIIJ = c61878OQg;
    }
}
