package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227368w8 extends AbstractC238349Xa {
    public final String LIZIZ;
    public final User LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final java.util.Map<String, String> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C227368w8)) {
            return false;
        }
        C227368w8 c227368w8 = (C227368w8) obj;
        return o.LJ(this.LIZIZ, c227368w8.LIZIZ) && o.LJ(this.LIZJ, c227368w8.LIZJ) && o.LJ(this.LIZLLL, c227368w8.LIZLLL) && o.LJ(this.LJ, c227368w8.LJ) && o.LJ(this.LJFF, c227368w8.LJFF) && o.LJ(this.LJI, c227368w8.LJI) && this.LJII == c227368w8.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31)) * 31;
        String str = this.LIZLLL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJI;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowRecUserCellTracker(enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", user=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJ);
        LIZ.append(", homepageUid=");
        LIZ.append(this.LJFF);
        LIZ.append(", imprOrder=");
        LIZ.append(this.LJI);
        LIZ.append(", isRelatedRec=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIIIZ;
    }

    public C227368w8(String enterFrom, User user, String str, String str2, String str3, Integer num, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZIZ = enterFrom;
        this.LIZJ = user;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = num;
        this.LJII = z;
        this.LJIIIIZZ = "show_recommend_user_cell";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LJIIIZ("homepage_uid", str3);
        c188727au.LJFF(num, "impr_order");
        c188727au.LJIIIZ("rec_uid", user.getUid());
        String friendTypeStr = user.getFriendTypeStr();
        String str4 = null;
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                friendTypeStr = matchedFriendStruct.getRelationType();
            } else {
                friendTypeStr = null;
            }
        }
        c188727au.LJIIIZ("relation_type", friendTypeStr);
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                str4 = matchedFriendStruct2.getRecType();
            }
        } else {
            str4 = recType;
        }
        c188727au.LJIIIZ("rec_type", str4);
        c188727au.LJIIIZ("req_id", user.getRequestId());
        c188727au.LJIIIZ("is_related_rec", AbstractC238349Xa.LIZJ(z));
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…Mob())\n        .builder()");
        this.LJIIIZ = map;
    }

    public /* synthetic */ C227368w8(String str, User user, String str2, String str3, String str4, Integer num, int i) {
        this(str, user, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? num : null, false);
    }
}
