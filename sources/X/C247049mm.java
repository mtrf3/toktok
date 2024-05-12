package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.9mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247049mm {
    public static final /* synthetic */ int LIZ = 0;

    public static User LIZ(SearchSugEntity searchSugEntity, String str) {
        String username;
        String userNickname;
        o.LJIIIZ(searchSugEntity, "<this>");
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        MatchedFriendStruct matchedFriendStruct = null;
        if (sugExtraInfo == null) {
            return null;
        }
        User user = new User();
        user.setUid(sugExtraInfo.getUserId());
        user.setSecUid(sugExtraInfo.getSecUserId());
        if (C85990Xow.LJIIIZ()) {
            username = sugExtraInfo.getUserNickname();
        } else {
            username = sugExtraInfo.getUsername();
        }
        user.setUniqueId(username);
        if (C85990Xow.LJIIIZ()) {
            userNickname = sugExtraInfo.getUsername();
        } else {
            userNickname = sugExtraInfo.getUserNickname();
        }
        user.setNickname(userNickname);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(sugExtraInfo.getUserAvatarUri());
        urlModel.setUrlList(C47261Igj.LJJIJ(sugExtraInfo.getUserAvatarUri()));
        user.setAvatarMedium(urlModel);
        user.setPrivateAccount(sugExtraInfo.isPrivateAccount());
        user.setFollowStatus(sugExtraInfo.getFollowStatusFromApi());
        user.setFollowerStatus(sugExtraInfo.getFollowerStatus());
        user.setFollowerCount(sugExtraInfo.getFollowerCount());
        user.setAwemeCount(sugExtraInfo.getAwemeCount());
        String matchedFriendStruct2 = sugExtraInfo.getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            matchedFriendStruct = (MatchedFriendStruct) C75792yF.LIZ(matchedFriendStruct2, MatchedFriendStruct.class);
        }
        user.setMatchedFriendStruct(matchedFriendStruct);
        user.setStoryStatus(sugExtraInfo.getUserStoryStatus());
        user.setCanMessageFollowStatusList(sugExtraInfo.getCanMessageFollowStatusList());
        user.setRequestId(str);
        return user;
    }
}
