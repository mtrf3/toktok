package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserHonor;
import java.util.List;

/* renamed from: X.Bfy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29378Bfy extends User {
    @Override // com.bytedance.android.live.base.model.user.User
    public final boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final AnchorInfo getAnchorInfo() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final /* bridge */ /* synthetic */ InterfaceC29384Bg4 getAnchorLevel() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final AnchorLevel getAnchorLevel() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final String getAutoGraph() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final ImageModel getAvatarLarge() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final ImageModel getAvatarMedium() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final ImageModel getAvatarThumb() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final String getBackgroundImgUrl() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final BorderInfo getBorder() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final long getCreateTime() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final long getFanTicketCount() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final FollowInfo getFollowInfo() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final long getId() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final int getLinkMicStats() {
        return 0;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final long getLiveRoomId() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final String getLogPb() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final ImageModel getMedal() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final long getModifyTime() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final List<ImageModel> getNewUserBadges() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final long getPayScores() {
        return 0L;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final String getRequestId() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final String getSecUid() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final int getSecret() {
        return 0;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final String getShareQrcodeUri() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final String getSpecialId() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final int getStatus() {
        return 0;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final List<User> getTopFans() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final int getTopVipNo() {
        return 0;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final UserAttr getUserAttr() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final List<ImageModel> getUserBadges() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final /* bridge */ /* synthetic */ InterfaceC29385Bg5 getUserHonor() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final UserHonor getUserHonor() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final String getVerifiedReason() {
        return null;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final boolean isEnableShowCommerceSale() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final boolean isFollowing() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final boolean isVerified() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final boolean isWithCommercePermission() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setAnchorInfo(AnchorInfo anchorInfo) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setFollowInfo(FollowInfo followInfo) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setFollowStatus(int i) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setLogPb(String str) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setModifyTime(long j) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setRequestId(String str) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setSecret(int i) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setShareQrcodeUri(String str) {
    }

    @Override // com.bytedance.android.live.base.model.user.User
    public final void setStatus(int i) {
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final void setUserAttr(UserAttr userAttr) {
    }

    @Override // com.bytedance.android.live.base.model.user.User, X.InterfaceC05190Ih
    public final User.OwnRoom getOwnRoom() {
        return new User.OwnRoom();
    }
}
