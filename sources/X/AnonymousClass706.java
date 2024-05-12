package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.706, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass706 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Aweme LIZLLL;
    public final String LJ;
    public final Boolean LJFF;
    public final String LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final java.util.Map<String, Object> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass706)) {
            return false;
        }
        AnonymousClass706 anonymousClass706 = (AnonymousClass706) obj;
        return o.LJ(this.LIZ, anonymousClass706.LIZ) && o.LJ(this.LIZIZ, anonymousClass706.LIZIZ) && o.LJ(this.LIZJ, anonymousClass706.LIZJ) && o.LJ(this.LIZLLL, anonymousClass706.LIZLLL) && o.LJ(this.LJ, anonymousClass706.LJ) && o.LJ(this.LJFF, anonymousClass706.LJFF) && o.LJ(this.LJI, anonymousClass706.LJI) && o.LJ(this.LJII, anonymousClass706.LJII) && o.LJ(this.LJIIIIZZ, anonymousClass706.LJIIIIZZ) && o.LJ(this.LJIIIZ, anonymousClass706.LJIIIZ) && o.LJ(this.LJIIJ, anonymousClass706.LJIIJ);
    }

    public final String toString() {
        return "LikeMobParams(enterFrom=" + this.LIZ + ", enterMethod=" + this.LIZIZ + ", eventType=" + this.LIZJ + ", aweme=" + this.LIZLLL + ", pageType=" + this.LJ + ", isHotPlayer=" + this.LJFF + ", lastGroupId=" + this.LJI + ", isOthersVideo=" + this.LJII + ", newsId=" + this.LJIIIIZZ + ", videoFrom=" + this.LJIIIZ + ", additionalParams=" + this.LJIIJ + ')';
    }

    public AnonymousClass706() {
        this("", "", "", null, "", null, "", null, "", "", null);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Aweme aweme = this.LIZLLL;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LJ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.LJFF;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.LJII;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str3 = this.LJIIIIZZ;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str4 = this.LJIIIZ;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        java.util.Map<String, Object> map = this.LJIIJ;
        if (map != null) {
            i = map.hashCode();
        }
        return i8 + i;
    }

    public AnonymousClass706(String str, String str2, String str3, Aweme aweme, String str4, Boolean bool, String str5, Integer num, String str6, String str7, java.util.Map<String, Object> map) {
        HH1.LIZ(str, "enterFrom", str2, "enterMethod", str3, "eventType");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = aweme;
        this.LJ = str4;
        this.LJFF = bool;
        this.LJI = str5;
        this.LJII = num;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = map;
    }
}
