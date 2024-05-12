package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: X.76D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C76D {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("homepage_hot", "homepage_follow", "homepage_friends", "others_homepage");

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C76F LIZ(com.ss.android.ugc.aweme.profile.model.User r2, java.lang.String r3) {
        /*
            boolean r0 = X.C175306uM.LIZIZ
            if (r0 == 0) goto Lc
            java.util.List<java.lang.String> r0 = X.C76D.LIZ
            boolean r0 = X.ORZ.LJLJJI(r3, r0)
            if (r0 != 0) goto Lf
        Lc:
            X.76F r0 = X.C76F.DEFAULT
        Le:
            return r0
        Lf:
            if (r2 == 0) goto L2f
            int r1 = r2.getFollowStatus()
            X.MgR r0 = X.EnumC57435MgR.FOLLOWED
            int r0 = r0.getValue()
            if (r1 != r0) goto L20
            X.76F r0 = X.C76F.FOLLOW
            goto Le
        L20:
            int r1 = r2.getFollowStatus()
            X.MgR r0 = X.EnumC57435MgR.FOLLOW_MUTUAL
            int r0 = r0.getValue()
            if (r1 != r0) goto L31
            X.76F r0 = X.C76F.MUTUAL_FOLLOW
            goto Le
        L2f:
            r0 = 0
            goto L3b
        L31:
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r2.getMatchedFriendStruct()
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.getRecType()
        L3b:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L44
            X.76F r0 = X.C76F.MATCHED_FRIEND
            goto Le
        L44:
            X.76F r0 = X.C76F.NO_RELATION
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76D.LIZ(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):X.76F");
    }

    public static final void LIZIZ(User user, String str, String str2) {
        if (user == null || str == null || str2 == null) {
            return;
        }
        if (user.getMatchedFriendStruct() == null) {
            user.setMatchedFriendStruct(new MatchedFriendStruct(null, str, str2, null, null, null, null, null, null, null, null, null, 4089, null));
            return;
        }
        String recType = user.getMatchedFriendStruct().getRecType();
        if (recType != null && recType.length() != 0) {
            return;
        }
        user.getMatchedFriendStruct().setRecType(str);
        user.getMatchedFriendStruct().setRelationType(str2);
    }
}
