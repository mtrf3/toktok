package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.UPJ;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InteractionTagUserInfo implements Serializable {

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    @InterfaceC65349Pkn("follower_status")
    public int followerStatus;

    @InterfaceC65349Pkn("interest_level")
    public int interestLevel;

    @InterfaceC65349Pkn("invitation_status")
    public int invitationStatus;

    @InterfaceC65349Pkn("is_business_account")
    public boolean isBusinessAccount;

    @InterfaceC65349Pkn("is_private_account")
    public int isPrivateAccount;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("uid")
    public String uid;

    @InterfaceC65349Pkn("unique_id")
    public String uniqueId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InteractionTagUserInfo() {
        /*
            r15 = this;
            r1 = 0
            r5 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r5
            r8 = r1
            r9 = r1
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo.<init>():void");
    }

    public static /* synthetic */ InteractionTagUserInfo copy$default(InteractionTagUserInfo interactionTagUserInfo, String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4, boolean z, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = interactionTagUserInfo.uid;
        }
        if ((i6 & 2) != 0) {
            str2 = interactionTagUserInfo.uniqueId;
        }
        if ((i6 & 4) != 0) {
            str3 = interactionTagUserInfo.nickname;
        }
        if ((i6 & 8) != 0) {
            urlModel = interactionTagUserInfo.avatarThumb;
        }
        if ((i6 & 16) != 0) {
            i = interactionTagUserInfo.followStatus;
        }
        if ((i6 & 32) != 0) {
            i2 = interactionTagUserInfo.followerStatus;
        }
        if ((i6 & 64) != 0) {
            i3 = interactionTagUserInfo.isPrivateAccount;
        }
        if ((i6 & 128) != 0) {
            str4 = interactionTagUserInfo.customVerify;
        }
        if ((i6 & 256) != 0) {
            str5 = interactionTagUserInfo.enterpriseVerifyReason;
        }
        if ((i6 & 512) != 0) {
            i4 = interactionTagUserInfo.interestLevel;
        }
        if ((i6 & 1024) != 0) {
            z = interactionTagUserInfo.isBusinessAccount;
        }
        if ((i6 & 2048) != 0) {
            i5 = interactionTagUserInfo.invitationStatus;
        }
        return interactionTagUserInfo.copy(str, str2, str3, urlModel, i, i2, i3, str4, str5, i4, z, i5);
    }

    public final InteractionTagUserInfo copy(String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4, boolean z, int i5) {
        return new InteractionTagUserInfo(str, str2, str3, urlModel, i, i2, i3, str4, str5, i4, z, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionTagUserInfo)) {
            return false;
        }
        InteractionTagUserInfo interactionTagUserInfo = (InteractionTagUserInfo) obj;
        return o.LJ(this.uid, interactionTagUserInfo.uid) && o.LJ(this.uniqueId, interactionTagUserInfo.uniqueId) && o.LJ(this.nickname, interactionTagUserInfo.nickname) && o.LJ(this.avatarThumb, interactionTagUserInfo.avatarThumb) && this.followStatus == interactionTagUserInfo.followStatus && this.followerStatus == interactionTagUserInfo.followerStatus && this.isPrivateAccount == interactionTagUserInfo.isPrivateAccount && o.LJ(this.customVerify, interactionTagUserInfo.customVerify) && o.LJ(this.enterpriseVerifyReason, interactionTagUserInfo.enterpriseVerifyReason) && this.interestLevel == interactionTagUserInfo.interestLevel && this.isBusinessAccount == interactionTagUserInfo.isBusinessAccount && this.invitationStatus == interactionTagUserInfo.invitationStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uniqueId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.avatarThumb;
        int hashCode4 = (((((((hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.followStatus) * 31) + this.followerStatus) * 31) + this.isPrivateAccount) * 31;
        String str4 = this.customVerify;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.enterpriseVerifyReason;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.interestLevel) * 31;
        boolean z = this.isBusinessAccount;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + this.invitationStatus;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InteractionTagUserInfo(uid=");
        sb.append(this.uid);
        sb.append(", uniqueId=");
        sb.append(this.uniqueId);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", avatarThumb=");
        sb.append(this.avatarThumb);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", followerStatus=");
        sb.append(this.followerStatus);
        sb.append(", isPrivateAccount=");
        sb.append(this.isPrivateAccount);
        sb.append(", customVerify=");
        sb.append(this.customVerify);
        sb.append(", enterpriseVerifyReason=");
        sb.append(this.enterpriseVerifyReason);
        sb.append(", interestLevel=");
        sb.append(this.interestLevel);
        sb.append(", isBusinessAccount=");
        sb.append(this.isBusinessAccount);
        sb.append(", invitationStatus=");
        return UPJ.LIZLLL(sb, this.invitationStatus, ')');
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final int getInterestLevel() {
        return this.interestLevel;
    }

    public final int getInvitationStatus() {
        return this.invitationStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final boolean isBusinessAccount() {
        return this.isBusinessAccount;
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setBusinessAccount(boolean z) {
        this.isBusinessAccount = z;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setInterestLevel(int i) {
        this.interestLevel = i;
    }

    public final void setInvitationStatus(int i) {
        this.invitationStatus = i;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setPrivateAccount(int i) {
        this.isPrivateAccount = i;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public InteractionTagUserInfo(String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4, boolean z, int i5) {
        this.uid = str;
        this.uniqueId = str2;
        this.nickname = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
        this.followerStatus = i2;
        this.isPrivateAccount = i3;
        this.customVerify = str4;
        this.enterpriseVerifyReason = str5;
        this.interestLevel = i4;
        this.isBusinessAccount = z;
        this.invitationStatus = i5;
    }

    public /* synthetic */ InteractionTagUserInfo(String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4, boolean z, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? null : urlModel, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? "" : str4, (i6 & 256) == 0 ? str5 : "", (i6 & 512) != 0 ? 0 : i4, (i6 & 1024) != 0 ? false : z, (i6 & 2048) == 0 ? i5 : 0);
    }
}
