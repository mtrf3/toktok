package com.ss.android.ugc.profile.platform.business.navbar.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* loaded from: classes5.dex */
public final class NavBarMoreData extends BizBaseData {

    @InterfaceC65349Pkn("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @InterfaceC65349Pkn("cert_info")
    public CertInfo certInfo;

    @InterfaceC65349Pkn("follower_count")
    public Integer followerCount;

    @InterfaceC65349Pkn("following_count")
    public Integer followingCount;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("share_profile_toast")
    public String shareProfileToast;

    @InterfaceC65349Pkn("signature")
    public String signature;

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final CertInfo getCertInfo() {
        return this.certInfo;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final String getShareProfileToast() {
        return this.shareProfileToast;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public final void setCertInfo(CertInfo certInfo) {
        this.certInfo = certInfo;
    }

    public final void setFollowerCount(Integer num) {
        this.followerCount = num;
    }

    public final void setFollowingCount(Integer num) {
        this.followingCount = num;
    }

    public final void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public final void setShareProfileToast(String str) {
        this.shareProfileToast = str;
    }

    public final void setSignature(String str) {
        this.signature = str;
    }
}
