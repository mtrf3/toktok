package com.ss.android.ugc.aweme.qna.model;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Qna {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeCoverList;

    @InterfaceC65349Pkn("invite_share_info")
    public final ShareInfo inviteShareInfo;

    @InterfaceC65349Pkn("owner_id")
    public final String ownerId;

    @InterfaceC65349Pkn("qa_id")
    public final long questionId;

    @InterfaceC65349Pkn("title")
    public final String questionName;

    @InterfaceC65349Pkn("share_info")
    public final ShareInfo shareInfo;

    @InterfaceC65349Pkn("video_count")
    public final int userCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qna)) {
            return false;
        }
        Qna qna = (Qna) obj;
        return o.LJ(this.ownerId, qna.ownerId) && this.questionId == qna.questionId && o.LJ(this.questionName, qna.questionName) && this.userCount == qna.userCount && o.LJ(this.shareInfo, qna.shareInfo) && o.LJ(this.inviteShareInfo, qna.inviteShareInfo) && o.LJ(this.awemeCoverList, qna.awemeCoverList);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.questionName, JBR.LIZJ(this.questionId, this.ownerId.hashCode() * 31, 31), 31) + this.userCount) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int i = 0;
        if (shareInfo == null) {
            hashCode = 0;
        } else {
            hashCode = shareInfo.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        ShareInfo shareInfo2 = this.inviteShareInfo;
        if (shareInfo2 != null) {
            i = shareInfo2.hashCode();
        }
        return this.awemeCoverList.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Qna(ownerId=");
        LIZ.append(this.ownerId);
        LIZ.append(", questionId=");
        LIZ.append(this.questionId);
        LIZ.append(", questionName=");
        LIZ.append(this.questionName);
        LIZ.append(", userCount=");
        LIZ.append(this.userCount);
        LIZ.append(", shareInfo=");
        LIZ.append(this.shareInfo);
        LIZ.append(", inviteShareInfo=");
        LIZ.append(this.inviteShareInfo);
        LIZ.append(", awemeCoverList=");
        return C1NE.LIZIZ(LIZ, this.awemeCoverList, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Qna(String ownerId, long j, String questionName, int i, ShareInfo shareInfo, ShareInfo shareInfo2, List<? extends Aweme> awemeCoverList) {
        o.LJIIIZ(ownerId, "ownerId");
        o.LJIIIZ(questionName, "questionName");
        o.LJIIIZ(awemeCoverList, "awemeCoverList");
        this.ownerId = ownerId;
        this.questionId = j;
        this.questionName = questionName;
        this.userCount = i;
        this.shareInfo = shareInfo;
        this.inviteShareInfo = shareInfo2;
        this.awemeCoverList = awemeCoverList;
    }
}
