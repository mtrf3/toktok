package X;

import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.CYr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31521CYr {
    public C31526CYw LIZ;
    public String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final RankAnimationInfo LJFF;
    public final long LJI;

    public final int hashCode() {
        int i;
        int hashCode = this.LIZ.LIZ.hashCode() * 31;
        C31526CYw c31526CYw = this.LIZ;
        int LJ = C79062V1e.LJ(this.LIZIZ, (((hashCode + c31526CYw.LIZIZ.type) * 31) + c31526CYw.LIZLLL.type) * 31, 31);
        RankAnimationInfo rankAnimationInfo = this.LJFF;
        if (rankAnimationInfo != null) {
            i = Integer.valueOf(rankAnimationInfo.type).hashCode();
        } else {
            i = 0;
        }
        return LJ + i;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C31521CYr c31521CYr = (C31521CYr) obj;
        C31526CYw c31526CYw = this.LIZ;
        EnumC31514CYk enumC31514CYk = c31526CYw.LIZ;
        C31526CYw c31526CYw2 = c31521CYr.LIZ;
        if (enumC31514CYk == c31526CYw2.LIZ && o.LJ(c31526CYw.LIZIZ, c31526CYw2.LIZIZ) && o.LJ(this.LIZ.LIZLLL, c31521CYr.LIZ.LIZLLL) && o.LJ(this.LIZIZ, c31521CYr.LIZIZ)) {
            RankAnimationInfo rankAnimationInfo = this.LJFF;
            Integer num2 = null;
            if (rankAnimationInfo != null) {
                num = Integer.valueOf(rankAnimationInfo.type);
            } else {
                num = null;
            }
            RankAnimationInfo rankAnimationInfo2 = c31521CYr.LJFF;
            if (rankAnimationInfo2 != null) {
                num2 = Integer.valueOf(rankAnimationInfo2.type);
            }
            if (o.LJ(num, num2)) {
                return true;
            }
        }
        return false;
    }

    public C31521CYr(C31526CYw rankTypeAll, String text, long j, boolean z, boolean z2, RankAnimationInfo rankAnimationInfo) {
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        o.LJIIIZ(text, "text");
        this.LIZ = rankTypeAll;
        this.LIZIZ = text;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = rankAnimationInfo;
        this.LJI = System.currentTimeMillis();
    }
}
