package com.ss.android.ugc.aweme.feed.model;

import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InteractionTagInfoKt {
    public static final MutualUser toMutualUser(InteractionTagUserInfo interactionTagUserInfo) {
        o.LJIIIZ(interactionTagUserInfo, "<this>");
        String uid = interactionTagUserInfo.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        String nickname = interactionTagUserInfo.getNickname();
        if (nickname != null) {
            str = nickname;
        }
        return new MutualUser(uid, str, interactionTagUserInfo.getAvatarThumb(), interactionTagUserInfo.getAvatarThumb(), null, 16, null);
    }

    public static final User toUser(InteractionTagUserInfo interactionTagUserInfo) {
        o.LJIIIZ(interactionTagUserInfo, "<this>");
        User user = new User();
        user.setUid(interactionTagUserInfo.getUid());
        user.setUniqueId(interactionTagUserInfo.getUniqueId());
        user.setNickname(interactionTagUserInfo.getNickname());
        user.setAvatarThumb(interactionTagUserInfo.getAvatarThumb());
        user.setFollowStatus(interactionTagUserInfo.getFollowStatus());
        user.setFollowerStatus(interactionTagUserInfo.getFollowerStatus());
        boolean z = true;
        if (interactionTagUserInfo.isPrivateAccount() != 1) {
            z = false;
        }
        user.setPrivateAccount(z);
        user.setCustomVerify(interactionTagUserInfo.getCustomVerify());
        user.setEnterpriseVerifyReason(interactionTagUserInfo.getEnterpriseVerifyReason());
        user.setTaggedIsBA(interactionTagUserInfo.isBusinessAccount());
        user.setTaggedBAInvitationStatus(interactionTagUserInfo.getInvitationStatus());
        return user;
    }
}
