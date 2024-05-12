package com.ss.android.ugc.aweme;

import X.C2YO;
import X.C66619QCp;
import X.C76800UCe;
import X.EFM;
import X.InterfaceC252619vl;
import X.InterfaceC26190APq;
import X.InterfaceC88472Yns;
import X.QTZ;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IAccountUserService {
    void accountUserClear();

    void addUserChangeListener(InterfaceC252619vl interfaceC252619vl);

    List<String> allUidList();

    void checkIn();

    void clear(String str);

    void delete(String str, String str2);

    void fetchLoginHistoryState(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns);

    EFM fetchUserInfoRequest();

    SignificantUserInfo findSignificanUserInfo(String str);

    void forceSave();

    boolean getAuthGoods();

    String getAvatarUrl();

    String getCurSecUserId();

    User getCurUser();

    FollowerDetail getCurUserFollowDetail(String str);

    String getCurUserId();

    int getCurrentLoginHistoryState();

    String getLastRecordedSecUid();

    String getLastUid();

    String getNickName();

    String getPhoneCountryCode();

    String getSessionKey();

    void getSetPasswordStatus(C2YO c2yo);

    int getUidContactPermissionCount();

    boolean hasCommerceVideoRights();

    boolean hasCurUserSetPassword();

    boolean hasUpdated();

    void init();

    boolean isChildrenMode();

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMe(String str);

    boolean isNewUser();

    boolean isNullUid(String str);

    boolean isOldUser();

    boolean isOnCommerceWhiteList();

    boolean isUidContactPermisioned();

    boolean isUserEmpty(User user);

    boolean loginHistoryLegacyEnabled();

    void logoutAllBackgroundUser();

    User queryUser(String str, boolean z);

    void queryUser();

    void queryUser(Handler handler);

    UserPermissionData.UserPermissionInfo queryUserPermission();

    UserPermissionData.UserPermissionInfo queryUserPermission(String str, String str2);

    void queryUserSync(User user);

    void queryVerifyStatus(InterfaceC26190APq interfaceC26190APq, boolean z);

    void refreshPassportUserInfo();

    void registerNotice(String str, int i);

    void removeCurVerification();

    void removeUserChangeListener(InterfaceC252619vl interfaceC252619vl);

    void removeVerification(Handler handler, String str);

    void setCurUser(User user);

    void setWithCommerceNewbieTask(boolean z);

    boolean shouldRefresh();

    void storeUidContactPermisioned(boolean z);

    void updateAllowStatus(Handler handler, int i, int i2);

    void updateAvatarUri(Handler handler, String str, int i);

    void updateCoverUri(Handler handler, String str, int i, int i2);

    void updateCurAdAuthorization(boolean z);

    void updateCurAllowStatus(int i);

    void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3);

    void updateCurAwemeCount(int i);

    void updateCurCanChangeSchoolInfo(boolean z);

    void updateCurCover(List<UrlModel> list);

    void updateCurFavoritingCount(int i);

    void updateCurFollowerCount(int i);

    void updateCurFollowingCount(int i);

    void updateCurFriendsCount(int i);

    void updateCurHideFollowingFollowerList(int i);

    void updateCurHideSearch(boolean z);

    void updateCurNickname(String str);

    void updateCurProfileBadge(ProfileBadgeStruct profileBadgeStruct);

    void updateCurRepostCount(int i);

    void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2);

    void updateCurSecret(boolean z);

    void updateCurSignature(String str);

    void updateCurSupportedNgo(ProfileNgoStruct profileNgoStruct);

    void updateCurUser(User user);

    void updateCurUserId(String str);

    void updateCurVideoCover(VideoCover videoCover);

    void updateFbExpireTime();

    void updateHasFacebookToken(boolean z);

    void updateHasTwitterToken(boolean z);

    void updateHasYoutubeToken(boolean z);

    void updateId(Handler handler, String str, int i);

    void updateInsId(Handler handler, String str, int i);

    void updateInsId(String str);

    void updateLanguage(Handler handler, String str, int i);

    void updateLeaveTime(long j);

    void updateLoginHistoryState(LifecycleOwner lifecycleOwner, int i, InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns);

    void updateNickName(Handler handler, String str, int i, String str2);

    void updateNickNameWithSupplementray(Handler handler, String str, List<String> list, int i);

    void updateNotifyPrivateAccount(int i);

    void updateProfileWidgetId(Handler handler, Long l, int i);

    void updateProfileWidgetShouldShow(Handler handler, boolean z, int i);

    void updateSchool(Handler handler, Map<String, String> map);

    void updateSecret(Handler handler, boolean z, int i);

    void updateSecret(Handler handler, boolean z, int i, boolean z2);

    void updateShieldCommentNotice(int i);

    void updateShieldDiggNotice(int i);

    void updateShieldFollowNotice(int i);

    void updateSignature(Handler handler, String str, int i);

    void updateSupportedNgo(Handler handler, int i, int i2);

    void updateSupportedNgoPercent(Handler handler, String str, String str2, int i);

    void updateTwExpireTime();

    void updateUserInfo(QTZ qtz);

    void updateUserInfo(Handler handler, Map<String, String> map);

    void updateVideoCoverUri(Handler handler, String str, String str2, int i, int i2);

    void updateYoutubeExpireTime();

    void uploadAvatar(Handler handler, String str, int i, String str2, List<C66619QCp> list);

    void uploadAvatar(Handler handler, String str, int i, String str2, List<C66619QCp> list, String str3);

    void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3);

    void uploadCover(Handler handler, String str, int i, String str2);

    void uploadVideoAvatar(Handler handler, String str, int i, String str2, List<C66619QCp> list);
}
