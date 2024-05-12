package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.List;

/* renamed from: X.0Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC05190Ih {
    boolean childrenManagerForbidWalletFunctions();

    AnchorInfo getAnchorInfo();

    InterfaceC29384Bg4 getAnchorLevel();

    AuthenticationInfo getAuthenticationInfo();

    String getAutoGraph();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getBackgroundImgUrl();

    long getCreateTime();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    long getId();

    long getLiveRoomId();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    User.OwnRoom getOwnRoom();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    int getStatus();

    List<User> getTopFans();

    int getTopVipNo();

    UserAttr getUserAttr();

    List<ImageModel> getUserBadges();

    InterfaceC29385Bg5 getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isVerified();

    void setUserAttr(UserAttr userAttr);
}
