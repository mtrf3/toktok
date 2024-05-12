package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91453iP implements InterfaceC91483iS {
    public final C109544Rq LIZ;
    public final String LIZIZ;
    public final C3Q9 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91453iP)) {
            return false;
        }
        C91453iP c91453iP = (C91453iP) obj;
        return o.LJ(this.LIZ, c91453iP.LIZ) && o.LJ(this.LIZIZ, c91453iP.LIZIZ) && o.LJ(this.LIZJ, c91453iP.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FromMessage(message=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", conversationListModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC91483iS
    public final C98803uG LIZ() {
        String uid;
        boolean z;
        String str;
        String conversationId = this.LIZ.getConversationId();
        String valueOf = String.valueOf(this.LIZ.getConversationShortId());
        IMUser LJFF = C80533Eb.LJFF(String.valueOf(this.LIZ.getSender()), this.LIZ.getSecSender());
        String str2 = null;
        if (LJFF == null || (uid = LJFF.getUid()) == null) {
            return null;
        }
        boolean isBlock = LJFF.isBlock();
        C63120Opw LIZ = this.LIZJ.LIZ(conversationId);
        if (LIZ == null) {
            return null;
        }
        int i = 0;
        if (this.LIZ.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        UrlModel displayAvatar = LJFF.getDisplayAvatar();
        String nickName = LJFF.getNickName();
        int followingCount = LJFF.getFollowingCount();
        int followerCount = LJFF.getFollowerCount();
        int followStatus = LJFF.getFollowStatus();
        if (z) {
            i = 3;
            valueOf = String.valueOf(C98793uF.LIZJ());
        } else if (C79004UzY.LJJIJIL(LIZ)) {
            i = 1;
        }
        C63088OpQ coreInfo = LIZ.getCoreInfo();
        if (coreInfo != null) {
            str2 = coreInfo.getName();
        }
        String LJFF2 = C98793uF.LJFF(LJFF);
        if (z) {
            str = "im_group_chat";
        } else {
            str = "im";
        }
        String str3 = this.LIZIZ;
        o.LJIIIIZZ(conversationId, "conversationId");
        return new C98803uG(valueOf, uid, conversationId, LJFF2, Boolean.valueOf(isBlock), str, i, str2, 0, false, false, nickName, displayAvatar, Integer.valueOf(followingCount), Integer.valueOf(followerCount), Integer.valueOf(followStatus), null, str3, 67328, null);
    }

    public C91453iP(C109544Rq message, String str, int i) {
        C4WC conversationListModel = null;
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            conversationListModel = C4WC.LIZIZ;
        }
        o.LJIIIZ(message, "message");
        o.LJIIIZ(conversationListModel, "conversationListModel");
        this.LIZ = message;
        this.LIZIZ = str;
        this.LIZJ = conversationListModel;
    }
}
