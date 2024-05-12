package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.78y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811278y {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final java.util.Set<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811278y)) {
            return false;
        }
        C1811278y c1811278y = (C1811278y) obj;
        return o.LJ(this.LIZ, c1811278y.LIZ) && o.LJ(this.LIZIZ, c1811278y.LIZIZ) && o.LJ(this.LIZJ, c1811278y.LIZJ) && this.LIZLLL == c1811278y.LIZLLL && o.LJ(this.LJ, c1811278y.LJ) && o.LJ(this.LJFF, c1811278y.LJFF) && o.LJ(this.LJI, c1811278y.LJI);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL) * 31;
        String str3 = this.LJ;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJFF;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        java.util.Set<String> set = this.LJI;
        return hashCode5 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentAndLikeBubbleMobEventParam(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", groupId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", followStatus=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", storyType=");
        LIZ.append(this.LJ);
        LIZ.append(", pageType=");
        LIZ.append(this.LJFF);
        LIZ.append(", reportShowSet=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C1811278y(Aweme aweme, String str, String str2, int i, String str3, Integer num, java.util.Set<String> set) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = set;
    }
}
