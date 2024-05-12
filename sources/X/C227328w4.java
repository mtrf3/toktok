package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227328w4 extends AbstractC238349Xa {
    public final String LIZIZ;
    public final User LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final java.util.Map<String, String> LJIILIIL;

    public C227328w4() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C227328w4)) {
            return false;
        }
        C227328w4 c227328w4 = (C227328w4) obj;
        return o.LJ(this.LIZIZ, c227328w4.LIZIZ) && o.LJ(this.LIZJ, c227328w4.LIZJ) && o.LJ(this.LIZLLL, c227328w4.LIZLLL) && o.LJ(this.LJ, c227328w4.LJ) && o.LJ(this.LJFF, c227328w4.LJFF) && o.LJ(this.LJI, c227328w4.LJI) && o.LJ(this.LJII, c227328w4.LJII) && o.LJ(this.LJIIIIZZ, c227328w4.LJIIIIZZ) && o.LJ(this.LJIIIZ, c227328w4.LJIIIZ) && o.LJ(this.LJIIJ, c227328w4.LJIIJ) && o.LJ(this.LJIIJJI, c227328w4.LJIIJJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = (this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31)) * 31;
        String str = this.LIZLLL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.LJI;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJII, (i4 + hashCode4) * 31, 31);
        java.util.Map<String, String> map = this.LJIIIIZZ;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i5 = (LJ + hashCode5) * 31;
        String str4 = this.LJIIIZ;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str5 = this.LJIIJ;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str6 = this.LJIIJJI;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnterProfileTracker(enterFrom=");
        sb.append(this.LIZIZ);
        sb.append(", user=");
        sb.append(this.LIZJ);
        sb.append(", enterMethod=");
        sb.append(this.LIZLLL);
        sb.append(", previousPage=");
        sb.append(this.LJ);
        sb.append(", homepageUid=");
        sb.append(this.LJFF);
        sb.append(", imprOrder=");
        sb.append(this.LJI);
        sb.append(", tabName=");
        sb.append(this.LJII);
        sb.append(", extra=");
        sb.append(this.LJIIIIZZ);
        sb.append(", searchKeyword=");
        sb.append(this.LJIIIZ);
        sb.append(", searchResultId=");
        sb.append(this.LJIIJ);
        sb.append(", searchId=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJIIL;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIILIIL;
    }

    public C227328w4(String enterFrom, User user, String str, String str2, String str3, Integer num, String tabName, java.util.Map map, String str4, String str5, String str6, int i) {
        String str7 = null;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        num = (i & 32) != 0 ? null : num;
        tabName = (i & 64) != 0 ? "" : tabName;
        map = (i & 128) != 0 ? null : map;
        str4 = (i & 256) != 0 ? null : str4;
        str5 = (i & 512) != 0 ? null : str5;
        str6 = (i & 1024) != 0 ? null : str6;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(tabName, "tabName");
        this.LIZIZ = enterFrom;
        this.LIZJ = user;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = num;
        this.LJII = tabName;
        this.LJIIIIZZ = map;
        this.LJIIIZ = str4;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
        this.LJIIL = "enter_personal_detail";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LJIIIZ("homepage_uid", str3);
        c188727au.LJFF(num, "impr_order");
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recType = matchedFriendStruct.getRecType();
            } else {
                recType = null;
            }
        }
        c188727au.LJIIIZ("rec_type", recType);
        c188727au.LJIIIZ("to_user_id", user.getUid());
        c188727au.LJIIIZ("req_id", user.getRequestId());
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                str7 = matchedFriendStruct2.getRelationType();
            }
        } else {
            str7 = friendTypeStr;
        }
        c188727au.LJIIIZ("relation_type", str7);
        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(user));
        c188727au.LJIIIZ("tab_name", tabName);
        if (C78685UuP.LJJJZ(str4)) {
            c188727au.LJI("search_keyword", str4);
        }
        if (C78685UuP.LJJJZ(str5)) {
            c188727au.LJI("search_result_id", str5);
        }
        if (C78685UuP.LJJJZ(str6)) {
            c188727au.LJI("search_id", str6);
        }
        C78866UxK.LJIILLIIL(c188727au, user);
        c188727au.LJIIIIZZ(map);
        java.util.Map<String, String> map2 = c188727au.LIZ;
        o.LJIIIIZZ(map2, "newBuilder()\n        .ap…extra)\n        .builder()");
        this.LJIILIIL = map2;
    }
}
