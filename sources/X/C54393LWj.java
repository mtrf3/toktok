package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LWj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54393LWj {
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
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54393LWj)) {
            return false;
        }
        C54393LWj c54393LWj = (C54393LWj) obj;
        return this.LIZ == c54393LWj.LIZ && this.LIZIZ == c54393LWj.LIZIZ && this.LIZJ == c54393LWj.LIZJ && o.LJ(this.LIZLLL, c54393LWj.LIZLLL) && o.LJ(this.LJ, c54393LWj.LJ) && o.LJ(this.LJFF, c54393LWj.LJFF) && o.LJ(this.LJI, c54393LWj.LJI) && o.LJ(this.LJII, c54393LWj.LJII) && o.LJ(this.LJIIIIZZ, c54393LWj.LJIIIIZZ) && this.LJIIIZ == c54393LWj.LJIIIZ && o.LJ(this.LJIIJ, c54393LWj.LJIIJ) && o.LJ(this.LJIIJJI, c54393LWj.LJIIJJI) && this.LJIIL == c54393LWj.LJIIL && this.LJIILIIL == c54393LWj.LJIILIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
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
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str5 = this.LJIIJJI;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i8 = (i7 + i) * 31;
        boolean z = this.LJIIL;
        int i9 = 1;
        int i10 = z;
        if (z != 0) {
            i10 = 1;
        }
        int i11 = (i8 + i10) * 31;
        if (!this.LJIILIIL) {
            i9 = 0;
        }
        return i11 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsFeedParam(listQueryType=");
        sb.append(this.LIZ);
        sb.append(", pullType=");
        sb.append(this.LIZIZ);
        sb.append(", followFeedStyle=");
        sb.append(this.LIZJ);
        sb.append(", impressionIds=");
        sb.append(this.LIZLLL);
        sb.append(", lastFeedsId=");
        sb.append(this.LJ);
        sb.append(", liveTagShow=");
        sb.append(this.LJFF);
        sb.append(", insertAwemeId=");
        sb.append(this.LJI);
        sb.append(", pushAids=");
        sb.append(this.LJII);
        sb.append(", pushParams=");
        sb.append(this.LJIIIIZZ);
        sb.append(", refreshAfterVcdAuthorize=");
        sb.append(this.LJIIIZ);
        sb.append(", insertRoomIds=");
        sb.append(this.LJIIJ);
        sb.append(", insertRelations=");
        sb.append(this.LJIIJJI);
        sb.append(", insertAsc=");
        sb.append(this.LJIIL);
        sb.append(", forceNotUseCache=");
        return C08880Wm.LIZJ(sb, this.LJIILIIL, ')');
    }

    public C54393LWj(int i, int i2, int i3, String impressionIds, String str, Integer num, String str2, String str3, String str4, C61878OQg c61878OQg, String str5, boolean z, boolean z2) {
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
        this.LJIIJJI = str5;
        this.LJIIL = z;
        this.LJIILIIL = z2;
    }
}
