package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.livesdk.chatroom.model.interact.TopHostInfo;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.InviteTopHostInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.AuthenticationInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.im.JoinGroupBizContent;
import webcast.im.JoinGroupMessageExtra;

/* renamed from: X.TsH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76005TsH {
    public static final /* synthetic */ int LIZ = 0;

    public static MHJoinBizContent LIZ(LinkerInviteContent linkerInviteContent) {
        int i;
        InviterRivalExtra inviterRivalExtra;
        List<InviterRivalExtra> list;
        MHJoinBizContent mHJoinBizContent = new MHJoinBizContent();
        if (linkerInviteContent == null) {
            return mHJoinBizContent;
        }
        mHJoinBizContent.fromRoomAgeRestricted = linkerInviteContent.fromRoomAgeRestricted;
        mHJoinBizContent.fromTag = linkerInviteContent.tag;
        mHJoinBizContent.LIZ = linkerInviteContent.linkerInviteMsgExtra.topicInfo;
        mHJoinBizContent.dialog = linkerInviteContent.dialogInfo;
        mHJoinBizContent.punishInfo = linkerInviteContent.punishEventInfo;
        mHJoinBizContent.abTestSetting = linkerInviteContent.abTestSetting;
        JoinGroupMessageExtra joinGroupMessageExtra = new JoinGroupMessageExtra();
        LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra;
        if (linkerInviteMessageExtra != null) {
            i = linkerInviteMessageExtra.inviteType;
        } else {
            i = 0;
        }
        joinGroupMessageExtra.sourceType = i;
        if (linkerInviteMessageExtra != null) {
            inviterRivalExtra = linkerInviteMessageExtra.inviterRivalExtra;
        } else {
            inviterRivalExtra = null;
        }
        joinGroupMessageExtra.extra = LIZLLL(linkerInviteContent, inviterRivalExtra);
        ArrayList arrayList = new ArrayList();
        LinkerInviteMessageExtra linkerInviteMessageExtra2 = linkerInviteContent.linkerInviteMsgExtra;
        if (linkerInviteMessageExtra2 != null && (list = linkerInviteMessageExtra2.otherRivalExtra) != null) {
            Iterator<InviterRivalExtra> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(LIZLLL(linkerInviteContent, it.next()));
            }
        }
        joinGroupMessageExtra.otherUsers = arrayList;
        mHJoinBizContent.bizExtra = joinGroupMessageExtra;
        return mHJoinBizContent;
    }

    public static MHJoinBizContent LIZIZ(JoinGroupBizContent joinGroupBizContent) {
        MHJoinBizContent mHJoinBizContent = new MHJoinBizContent();
        if (joinGroupBizContent == null) {
            return mHJoinBizContent;
        }
        mHJoinBizContent.fromRoomAgeRestricted = joinGroupBizContent.fromRoomAgeRestricted;
        mHJoinBizContent.fromTag = joinGroupBizContent.fromTag;
        mHJoinBizContent.dialog = joinGroupBizContent.dialog;
        mHJoinBizContent.punishInfo = joinGroupBizContent.punishInfo;
        mHJoinBizContent.bizExtra = joinGroupBizContent.joinGroupMsgExtra;
        mHJoinBizContent.LIZ = joinGroupBizContent.topicInfo;
        return mHJoinBizContent;
    }

    public static InviterRivalExtra LIZJ(JoinGroupMessageExtra.RivalExtra rivalExtra) {
        long j;
        ImageModel imageModel;
        String str;
        boolean z;
        InviterRivalExtra inviterRivalExtra = new InviterRivalExtra();
        long j2 = 0;
        if (rivalExtra != null) {
            j = rivalExtra.userCount;
        } else {
            j = 0;
        }
        inviterRivalExtra.userCount = (int) j;
        String str2 = null;
        if (rivalExtra != null) {
            imageModel = rivalExtra.avatarThumb;
        } else {
            imageModel = null;
        }
        inviterRivalExtra.avatarThumb = imageModel;
        if (rivalExtra != null) {
            str = rivalExtra.displayId;
        } else {
            str = null;
        }
        inviterRivalExtra.displayId = str;
        if (rivalExtra != null) {
            str2 = rivalExtra.nickname;
        }
        inviterRivalExtra.nickname = str2;
        if (rivalExtra != null) {
            j2 = rivalExtra.followStatus;
        }
        inviterRivalExtra.followStatus = j2;
        if (rivalExtra != null) {
            z = rivalExtra.isBestTeammate;
        } else {
            z = false;
        }
        inviterRivalExtra.isBestTeammate = z;
        return inviterRivalExtra;
    }

    public static JoinGroupMessageExtra.RivalExtra LIZLLL(LinkerInviteContent inviteContent, InviterRivalExtra inviterRivalExtra) {
        int i;
        ImageModel imageModel;
        String str;
        String str2;
        String str3;
        ImageModel imageModel2;
        String str4;
        long j;
        long j2;
        Long l;
        String str5;
        AuthenticationInfo authenticationInfo;
        AuthenticationInfo authenticationInfo2;
        AuthenticationInfo authenticationInfo3;
        o.LJIIIZ(inviteContent, "inviteContent");
        JoinGroupMessageExtra.RivalExtra rivalExtra = new JoinGroupMessageExtra.RivalExtra();
        boolean z = false;
        if (inviterRivalExtra != null) {
            i = inviterRivalExtra.userCount;
        } else {
            i = 0;
        }
        rivalExtra.userCount = i;
        Hashtag hashtag = null;
        if (inviterRivalExtra != null) {
            imageModel = inviterRivalExtra.avatarThumb;
        } else {
            imageModel = null;
        }
        rivalExtra.avatarThumb = imageModel;
        if (inviterRivalExtra != null) {
            str = inviterRivalExtra.displayId;
        } else {
            str = null;
        }
        String str6 = "";
        if (str == null) {
            str = "";
        }
        rivalExtra.displayId = str;
        JoinGroupMessageExtra.RivalExtra.AuthenticationInfo authenticationInfo4 = new JoinGroupMessageExtra.RivalExtra.AuthenticationInfo();
        if (inviterRivalExtra == null || (authenticationInfo3 = inviterRivalExtra.authenticationInfo) == null || (str2 = authenticationInfo3.custom_verify) == null) {
            str2 = "";
        }
        authenticationInfo4.customVerify = str2;
        if (inviterRivalExtra == null || (authenticationInfo2 = inviterRivalExtra.authenticationInfo) == null || (str3 = authenticationInfo2.enterpriseVerifyReason) == null) {
            str3 = "";
        }
        authenticationInfo4.enterpriseVerifyReason = str3;
        if (inviterRivalExtra != null && (authenticationInfo = inviterRivalExtra.authenticationInfo) != null) {
            imageModel2 = authenticationInfo.authenticationBadge;
        } else {
            imageModel2 = null;
        }
        authenticationInfo4.authenticationBadge = imageModel2;
        rivalExtra.authenticationInfo = authenticationInfo4;
        if (inviterRivalExtra == null || (str4 = inviterRivalExtra.nickname) == null) {
            str4 = "";
        }
        rivalExtra.nickname = str4;
        if (inviterRivalExtra != null) {
            j = inviterRivalExtra.followStatus;
        } else {
            j = -1;
        }
        rivalExtra.followStatus = j;
        if (inviterRivalExtra != null) {
            hashtag = inviterRivalExtra.mHashtag;
        }
        rivalExtra.hashtag = hashtag;
        TopHostInfo topHostInfo = new TopHostInfo();
        InviteTopHostInfo inviteTopHostInfo = inviteContent.fromTopHostInfo;
        if (inviteTopHostInfo != null && (str5 = inviteTopHostInfo.rankType) != null) {
            str6 = str5;
        }
        topHostInfo.rankType = str6;
        if (inviteTopHostInfo == null || (l = inviteTopHostInfo.topIndex) == null) {
            j2 = 0;
        } else {
            j2 = l.longValue();
        }
        topHostInfo.topIndex = j2;
        rivalExtra.topHostInfo = topHostInfo;
        rivalExtra.userId = inviteContent.fromUserId;
        if (inviterRivalExtra != null) {
            z = inviterRivalExtra.isBestTeammate;
        }
        rivalExtra.isBestTeammate = z;
        return rivalExtra;
    }
}
