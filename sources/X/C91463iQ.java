package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3iQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91463iQ implements InterfaceC91483iS {
    public final C98523to LIZ;
    public final String LIZIZ;
    public final C3Q9 LIZJ;
    public final Boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91463iQ)) {
            return false;
        }
        C91463iQ c91463iQ = (C91463iQ) obj;
        return o.LJ(this.LIZ, c91463iQ.LIZ) && o.LJ(this.LIZIZ, c91463iQ.LIZIZ) && o.LJ(this.LIZJ, c91463iQ.LIZJ) && o.LJ(this.LIZLLL, c91463iQ.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Boolean bool = this.LIZLLL;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC91483iS
    public final C98803uG LIZ() {
        String uid;
        boolean isBlock;
        String conversationId = this.LIZ.getConversationId();
        IMUser singleChatFromUser = this.LIZ.getSingleChatFromUser();
        String str = null;
        if (singleChatFromUser == null || (uid = singleChatFromUser.getUid()) == null) {
            return null;
        }
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            isBlock = bool.booleanValue();
        } else {
            isBlock = singleChatFromUser.isBlock();
        }
        C63120Opw LIZ = this.LIZJ.LIZ(conversationId);
        if (LIZ == null) {
            return null;
        }
        long conversationShortId = LIZ.getConversationShortId();
        UrlModel displayAvatar = singleChatFromUser.getDisplayAvatar();
        String nickName = singleChatFromUser.getNickName();
        int followingCount = singleChatFromUser.getFollowingCount();
        int followerCount = singleChatFromUser.getFollowerCount();
        int followStatus = singleChatFromUser.getFollowStatus();
        if (conversationId.length() == 0 || conversationShortId <= 0) {
            return null;
        }
        int chatType = this.LIZ.getChatType();
        String valueOf = String.valueOf(conversationShortId);
        C63088OpQ coreInfo = LIZ.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getName();
        }
        return new C98803uG(valueOf, uid, conversationId, C98793uF.LJFF(singleChatFromUser), Boolean.valueOf(isBlock), "im", chatType, str, 0, this.LIZ.isHighRiskConversation(), this.LIZ.isMediaMsgMasking(), nickName, displayAvatar, Integer.valueOf(followingCount), Integer.valueOf(followerCount), Integer.valueOf(followStatus), null, this.LIZIZ, 65792, null);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FromSingleSessionInfo(sessionInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", conversationListModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isUserBlocked=");
        return C78920UyC.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C91463iQ(C98523to sessionInfo, String str, C3Q9 conversationListModel, Boolean bool, int i) {
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            conversationListModel = C4WC.LIZIZ;
        }
        bool = (i & 8) != 0 ? null : bool;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(conversationListModel, "conversationListModel");
        this.LIZ = sessionInfo;
        this.LIZIZ = str;
        this.LIZJ = conversationListModel;
        this.LIZLLL = bool;
    }
}
