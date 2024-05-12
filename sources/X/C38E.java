package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.storage.model.UserData;
import kotlin.jvm.internal.o;

/* renamed from: X.38E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38E {
    public static final MatchedFriendStruct LIZJ(C789537z c789537z) {
        MutualStruct mutualStruct;
        C789537z LIZ = c789537z.LIZ();
        ExternalRecommendReasonStruct externalRecommendReasonStruct = null;
        if (LIZ == null) {
            return null;
        }
        String str = LIZ.LIZJ;
        String str2 = LIZ.LIZIZ;
        String str3 = LIZ.LIZLLL;
        String str4 = LIZ.LJFF;
        if (str4 != null) {
            mutualStruct = (MutualStruct) C75792yF.LIZ(str4, MutualStruct.class);
        } else {
            mutualStruct = null;
        }
        String str5 = LIZ.LJ;
        String str6 = LIZ.LJI;
        if (str6 != null) {
            externalRecommendReasonStruct = (ExternalRecommendReasonStruct) C75792yF.LIZ(str6, ExternalRecommendReasonStruct.class);
        }
        return new MatchedFriendStruct(str, str2, str3, mutualStruct, str5, externalRecommendReasonStruct, null, Boolean.TRUE, null, null, null, null, 3904, null);
    }

    public static final C787637g LIZ(UserData userData, long j) {
        String str;
        Integer num;
        o.LJIIIZ(userData, "<this>");
        String str2 = userData.uid;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = userData.nickname;
        boolean z = true;
        if (!o.LJ(userData.isPrivateAccount, Boolean.TRUE) && ((num = userData.isSecret) == null || num.intValue() != 1)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String str4 = userData.LIZ;
        C789537z c789537z = null;
        if (str4 == null) {
            m mVar = userData.avatar168;
            if (mVar != null) {
                str4 = mVar.toString();
            } else {
                str4 = null;
            }
        }
        m mVar2 = userData.avatar300;
        if (mVar2 != null) {
            str = mVar2.toString();
        } else {
            str = null;
        }
        C789337x LIZ = new C789337x(str2, j, str3, valueOf, str4, str).LIZ();
        C789437y LIZ2 = new C789437y(str2, userData.followStatus, userData.followerStatus, userData.isBlock, j).LIZ();
        MatchedFriendStruct matchedFriendStruct = userData.matchedFriendStruct;
        if (matchedFriendStruct != null) {
            c789537z = LIZIZ(matchedFriendStruct, str2, j);
        }
        return new C787637g(str2, LIZ, c789537z, LIZ2);
    }

    public static final C789537z LIZIZ(MatchedFriendStruct matchedFriendStruct, String str, long j) {
        String str2;
        String recommendReason = matchedFriendStruct.getRecommendReason();
        String recType = matchedFriendStruct.getRecType();
        if (recType == null) {
            recType = "";
        }
        String relationType = matchedFriendStruct.getRelationType();
        String socialInfo = matchedFriendStruct.getSocialInfo();
        MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
        String str3 = null;
        if (mMutualStruct != null) {
            str2 = C75792yF.LIZJ(mMutualStruct);
        } else {
            str2 = null;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct = matchedFriendStruct.getExternalRecommendReasonStruct();
        if (externalRecommendReasonStruct != null) {
            str3 = C75792yF.LIZJ(externalRecommendReasonStruct);
        }
        return new C789537z(str, recType, j, recommendReason, relationType, socialInfo, str2, str3).LIZ();
    }
}
