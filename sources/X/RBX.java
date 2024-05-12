package X;

import Y.ACallableS109S0100000_6;
import Y.ACallableS9S1000000_11;
import Y.AfS53S0100000_1;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class RBX implements IAccountUserService {
    public volatile boolean LIZ;

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void fetchLoginHistoryState(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final int getCurrentLoginHistoryState() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean loginHistoryLegacyEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateLoginHistoryState(LifecycleOwner lifecycleOwner, int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void accountUserClear() {
        C68542QvC.LIZ.getClass();
        QXB qxb = C68542QvC.LIZIZ;
        o.LJI(qxb);
        C10K.LIZJ(new ACallableS109S0100000_6(qxb, 14));
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final List<String> allUidList() {
        RBW.LJLLI.getClass();
        return UserStore.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void forceSave() {
        RBW.LJLLI.getClass();
        synchronized (UserStore.LIZIZ) {
            Iterator it = ((ArrayList) UserStore.LJII()).iterator();
            while (it.hasNext()) {
                RB3 rb3 = (RB3) it.next();
                rb3.LIZIZ().LIZIZ();
                rb3.LIZ().LIZIZ();
                rb3.LIZJ().LIZIZ();
            }
            UserStore.LJ.putString("current_foreground_uid", UserStore.LIZLLL()).apply();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean getAuthGoods() {
        if (((RBW.LJLLI.LIZIZ().getAuthorityStatus() >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getAvatarUrl() {
        String str;
        SignificantUserInfo LJIIJ = RBW.LJIIJ(RBW.LJLLI.LIZJ());
        if (LJIIJ == null || (str = LJIIJ.avatarUrl) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getCurSecUserId() {
        RBW rbw = RBW.LJLLI;
        String secUid = rbw.LIZIZ().getSecUid();
        if (TextUtils.isEmpty(secUid)) {
            UserStore.AccountUser LIZ = UserStore.LIZ(rbw.LIZJ());
            if (LIZ != null && !TextUtils.isEmpty(LIZ.secUid)) {
                return LIZ.secUid;
            }
            return "";
        }
        return secUid;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final User getCurUser() {
        return RBW.LJLLI.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getCurUserId() {
        RBW.LJLJLJ.getClass();
        return RBW.LJLLI.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getLastRecordedSecUid() {
        boolean z;
        String string;
        RBW.LJLLI.getClass();
        synchronized (UserStore.class) {
            if (UserStore.LJIIJ.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                string = Keva.getRepo("keva_aweme_account_user").getString("last_recorded_sec_uid", "");
                o.LJIIIIZZ(string, "getRepo(AWEME_USER_KEVA_…_RECORDED_IN_SEC_UID, \"\")");
            } else {
                string = UserStore.LJIIJ;
            }
            UserStore.LJIIJ = string;
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getLastUid() {
        boolean z;
        RBW rbw = RBW.LJLLI;
        String str = rbw.LJLJL;
        if (str == null) {
            synchronized (UserStore.LIZ) {
                boolean z2 = true;
                if (UserStore.LJIIIZ.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    SharedPreferences sharedPreferences = UserStore.LIZLLL;
                    String string = sharedPreferences.getString("latest_logged_in_uid_list", "");
                    o.LJI(string);
                    if (string.length() <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        str = sharedPreferences.getString("latest_logged_in_uid_list", CardStruct.IStatusCode.DEFAULT);
                        o.LJI(str);
                    } else {
                        str = sharedPreferences.getString("last_uid", "");
                        o.LJI(str);
                    }
                } else {
                    str = UserStore.LJIIIZ;
                }
                UserStore.LJIIIZ = str;
            }
        }
        rbw.LJIIIZ(str);
        String str2 = rbw.LJLJL;
        o.LJI(str2);
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getNickName() {
        String str;
        SignificantUserInfo LJIIJ = RBW.LJIIJ(RBW.LJLLI.LIZJ());
        if (LJIIJ == null || (str = LJIIJ.nickname) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getPhoneCountryCode() {
        String str;
        UserStore.AccountUser LIZ = UserStore.LIZ(RBW.LJLLI.LIZJ());
        if (LIZ == null || (str = LIZ.countryCode) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getSessionKey() {
        String str;
        UserStore.AccountUser LIZ = UserStore.LIZ(RBW.LJLLI.LIZJ());
        if (LIZ == null || (str = LIZ.session) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final int getUidContactPermissionCount() {
        return C33673DJl.LIZ.count();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean hasCommerceVideoRights() {
        return RBW.LJLLI.LIZIZ().isWithItemCommerceEntry();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean hasCurUserSetPassword() {
        Keva repo = Keva.getRepo("password_status");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(RBW.LJLLI.LIZJ());
        LIZ.append("_password_set_status");
        return repo.getBoolean(X1D.LIZIZ(LIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean hasUpdated() {
        return RBW.LJLLI.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void init() {
        if (!this.LIZ) {
            QXB qxb = new QXB();
            C68542QvC.LIZ.getClass();
            C68542QvC.LIZIZ = qxb;
            InterfaceC252619vl interfaceC252619vl = C58725N2z.LIZJ;
            if (interfaceC252619vl != null) {
                addUserChangeListener(interfaceC252619vl);
                this.LIZ = true;
            } else {
                o.LJIJI("sAccountUserChangeListener");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isLogin() {
        return RBW.LJLLI.LJI();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isOldUser() {
        if (RBW.LJLLI.LIZIZ().getCreateTime() < 1506787200) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isOnCommerceWhiteList() {
        return RBW.LJLLI.LIZIZ().isWithCommerceEntry();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void logoutAllBackgroundUser() {
        RBW rbw = RBW.LJLLI;
        rbw.getClass();
        List LIZIZ = UserStore.LIZIZ();
        if (LIZIZ.size() < 2) {
            return;
        }
        String LIZJ = rbw.LIZJ();
        int size = LIZIZ.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            String str = (String) ListProtector.get(LIZIZ, size);
            if (!TextUtils.equals(str, LIZJ)) {
                long currentTimeMillis = System.currentTimeMillis();
                LoginMethodService LJIIIZ = AccountService.LJIJ().LJIIIZ();
                LJIIIZ.updateMethodInfo("update_expire_time", str, Long.valueOf(currentTimeMillis));
                LJIIIZ.updateMethodInfo("update_last_active_time", str, Long.valueOf(currentTimeMillis));
                LJIIIZ.updateMethodInfo("update_significan_user_info", str, findSignificanUserInfo(str));
                C16880lQ.LJLIIIL(RBW.LJLLI, str);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void refreshPassportUserInfo() {
        if (RBW.LJLLI.LJI()) {
            init();
        }
        ((QTW) QTW.LIZIZ(C58725N2z.LIZ())).LJIIIIZZ(new QXG());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean shouldRefresh() {
        RBW rbw = RBW.LJLLI;
        if (rbw.LJLIL && (rbw.LJLILLLLZI < 0 || System.currentTimeMillis() - rbw.LJLILLLLZI < 180000)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateFbExpireTime() {
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setFbExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void checkIn() {
        String str;
        init();
        RBW rbw = RBW.LJLLI;
        rbw.getClass();
        WeakHandler weakHandler = rbw.LJLJI;
        if (rbw.LJFF()) {
            str = RBW.LJLL;
        } else {
            str = RBW.LJLJLLL;
        }
        FGR.LIZIZ().LIZ(weakHandler, new ACallableS9S1000000_11(str, 1), 113);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isNewUser() {
        init();
        C68542QvC.LIZ.getClass();
        QXB qxb = C68542QvC.LIZIZ;
        o.LJI(qxb);
        return qxb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void queryUser() {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.getClass();
        FGR.LIZIZ().LIZ(rbw.LJLJI, new QX6(((IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class)).selfUserApi()), 112);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final UserPermissionData.UserPermissionInfo queryUserPermission() {
        init();
        RBW.LJLLI.getClass();
        C38281F0r c38281F0r = new C38281F0r(((IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class)).userPermissionApi());
        c38281F0r.LIZLLL("request_types", UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString());
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        String LJ = ((NetworkProxyAccount) qqc).LJ(c38281F0r.LJ());
        QQC qqc2 = C68542QvC.LIZJ;
        o.LJI(qqc2);
        Object fromJson = GsonProtectorUtils.fromJson(((NetworkProxyAccount) qqc2).LJIIJJI(), LJ, (Class<Object>) UserPermissionData.UserPermissionInfo.class);
        o.LJIIIIZZ(fromJson, "networkProxy!!.gson.from…rmissionInfo::class.java)");
        return (UserPermissionData.UserPermissionInfo) fromJson;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void removeCurVerification() {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LJLIL = true;
        rbw.LIZIZ().setCustomVerify("");
        rbw.LIZIZ().setEnterpriseVerifyReason("");
        UserStore.LJIIJJI(rbw.LIZIZ());
        C68542QvC c68542QvC = C68542QvC.LIZ;
        User LIZIZ = rbw.LIZIZ();
        c68542QvC.getClass();
        C68542QvC.LIZIZ(4, null, LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateTwExpireTime() {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setTwExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateYoutubeExpireTime() {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setYoutubeExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void addUserChangeListener(InterfaceC252619vl listener) {
        o.LJIIIZ(listener, "listener");
        C68542QvC.LIZ.getClass();
        C68542QvC.LIZ(listener);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final SignificantUserInfo findSignificanUserInfo(String str) {
        RBW rbw = RBW.LJLLI;
        o.LJI(str);
        rbw.getClass();
        return RBW.LJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final FollowerDetail getCurUserFollowDetail(String str) {
        RBW rbw = RBW.LJLLI;
        if (rbw.LIZIZ().getFollowerDetailList() != null) {
            for (FollowerDetail followerDetail : rbw.LIZIZ().getFollowerDetailList()) {
                if (TextUtils.equals(followerDetail.getPackageName(), str)) {
                    return followerDetail;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void getSetPasswordStatus(C2YO c2yo) {
        AbstractC73745Swv<R> LIZJ;
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        if (qqc != null && (LIZJ = ((NetworkProxyAccount) qqc).LIZLLL("/passport/password/has_set/", null).LIZJ(V2B.LJLJI)) != 0) {
            LIZJ.LJIILJJIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIJ(new AfS53S0100000_1(c2yo, 54), new AfS53S0100000_1(c2yo, 55));
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isMe(String str) {
        return C38354F3m.LIZJ(str, RBW.LJLLI.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isNullUid(String str) {
        RBW.LJLLI.getClass();
        return UserStore.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isUserEmpty(User user) {
        RBW.LJLLI.getClass();
        if (user == null || user.getUid() == null || user.getAvatarLarger() == null || user.getAvatarMedium() == null || user.getAvatarThumb() == null || user.getShortId() == null || user.getNickname() == null || user.getUniqueId() == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void queryUser(Handler handler) {
        init();
        RBW.LJLLI.getClass();
        FGR.LIZIZ().LIZ(handler, new QX6(((IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class)).selfUserApi()), 112);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void queryUserSync(User user) {
        init();
        RBW.LJLLI.LJIIL(user);
        C68542QvC.LIZ.getClass();
        C68542QvC.LIZIZ(10, null, user);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void removeUserChangeListener(InterfaceC252619vl listener) {
        o.LJIIIZ(listener, "listener");
        C68542QvC.LIZ.getClass();
        synchronized (C68542QvC.class) {
            ((LinkedList) C68542QvC.LIZLLL).remove(listener);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void setCurUser(User user) {
        o.LJIIIZ(user, "user");
        init();
        RBW rbw = RBW.LJLLI;
        rbw.getClass();
        if (!TextUtils.isEmpty(user.getUid())) {
            rbw.LJLJJL = user;
            rbw.LJLJJI = user.getUid();
            rbw.LJLJJLL = null;
            UserStore.LJIIJJI(user);
            rbw.LJLIL = true;
            rbw.LJLILLLLZI = -1L;
            rbw.LJIIIZ(user.getUid());
            String secUid = user.getSecUid();
            o.LJIIIIZZ(secUid, "value.secUid");
            UserStore.LJIIJ(secUid);
            rbw.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void setWithCommerceNewbieTask(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setWithCommerceNewbieTask(z);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void storeUidContactPermisioned(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurAdAuthorization(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setAdAuthorization(z);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurAllowStatus(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setAllowStatus(i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurAwemeCount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setAwemeCount(Math.max(0, rbw.LIZIZ().getAwemeCount() + i));
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurCanChangeSchoolInfo(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setCanModifySchoolInfo(z);
        rbw.LJLIL = true;
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurCover(List<? extends UrlModel> list) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setCoverUrls(list);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurFavoritingCount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setFavoritingCount(rbw.LIZIZ().getFavoritingCount() + i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurFollowerCount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setFollowerCount(rbw.LIZIZ().getFollowerCount() + i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurFollowingCount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setFollowingCount(Math.max(0, rbw.LIZIZ().getFollowingCount() + i));
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurFriendsCount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setFriendCount(rbw.LIZIZ().getFriendCount() + i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurHideFollowingFollowerList(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setHideFollowingFollowerList(i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurHideSearch(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setHideSearch(z);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurNickname(String str) {
        init();
        RBW rbw = RBW.LJLLI;
        if (!TextUtils.equals(rbw.LIZIZ().getNickname(), str)) {
            rbw.LIZIZ().setNickname(str);
            rbw.LJLIL = true;
            UserStore.LJIIJJI(rbw.LIZIZ());
            C68542QvC c68542QvC = C68542QvC.LIZ;
            User LIZIZ = rbw.LIZIZ();
            c68542QvC.getClass();
            C68542QvC.LIZIZ(6, null, LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurProfileBadge(ProfileBadgeStruct profileBadgeStruct) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setProfileBadgeStruct(profileBadgeStruct);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurRepostCount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setRepostCount(Math.max(0, rbw.LIZIZ().getRepostCount() + i));
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurSecret(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        if (rbw.LIZIZ().isSecret() != z) {
            rbw.LIZIZ().setSecret(z);
            rbw.LJLIL = true;
            UserStore.LJIIJJI(rbw.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurSignature(String str) {
        init();
        RBW rbw = RBW.LJLLI;
        if (!TextUtils.equals(rbw.LIZIZ().getSignature(), str)) {
            rbw.LIZIZ().setSignature(str);
            rbw.LJLIL = true;
            UserStore.LJIIJJI(rbw.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurSupportedNgo(ProfileNgoStruct profileNgoStruct) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setProfileNgoStruct(profileNgoStruct);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurUser(User user) {
        init();
        RBW.LJLLI.LJIIL(user);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurUserId(String str) {
        init();
        RBW rbw = RBW.LJLLI;
        if (!TextUtils.equals(rbw.LIZIZ().getUniqueId(), str)) {
            rbw.LIZIZ().setUniqueId(str);
            rbw.LJLIL = true;
            UserStore.LJIIJJI(rbw.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurVideoCover(VideoCover videoCover) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setVideoCover(videoCover);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateHasFacebookToken(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setHasFacebookToken(z);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateHasTwitterToken(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setHasTwitterToken(z);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateHasYoutubeToken(boolean z) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setHasYoutubeToken(z);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateInsId(String str) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setInsId(str);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateLeaveTime(long j) {
        init();
        RBW rbw = RBW.LJLLI;
        long j2 = rbw.LJLILLLLZI;
        if (j2 != -1) {
            j = j2;
        }
        rbw.LJLILLLLZI = j;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateNotifyPrivateAccount(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setNotifyPrivateAccount(i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateShieldCommentNotice(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setShieldCommentNotice(i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateShieldDiggNotice(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setShieldDiggNotice(i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateShieldFollowNotice(int i) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setShieldFollowNotice(i);
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateUserInfo(QTZ qtz) {
        init();
        C68542QvC.LIZ.getClass();
        C68542QvC.LIZLLL(qtz, "service update user info");
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void delete(String str, String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        init();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C67737QiD.LIZ);
        LIZ.append("|delete:");
        LIZ.append(enterMethod);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIZ(LIZIZ, "<set-?>");
        C67737QiD.LIZ = LIZIZ;
        C16880lQ.LJLIIIL(RBW.LJLLI, str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final User queryUser(String str, boolean z) {
        init();
        RBW.LJLLI.getClass();
        if (str == null || str.length() == 0) {
            str = ((IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class)).selfUserApi();
        }
        return QX5.LIZ(str, z);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final UserPermissionData.UserPermissionInfo queryUserPermission(String region, String requestType) {
        o.LJIIIZ(region, "region");
        o.LJIIIZ(requestType, "requestType");
        init();
        RBW.LJLLI.getClass();
        C38281F0r c38281F0r = new C38281F0r(((IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class)).userPermissionApi());
        c38281F0r.LIZLLL("request_types", requestType);
        c38281F0r.LIZLLL("user_region", region);
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        String LJ = ((NetworkProxyAccount) qqc).LJ(c38281F0r.LJ());
        QQC qqc2 = C68542QvC.LIZJ;
        o.LJI(qqc2);
        Object fromJson = GsonProtectorUtils.fromJson(((NetworkProxyAccount) qqc2).LJIIJJI(), LJ, (Class<Object>) UserPermissionData.UserPermissionInfo.class);
        o.LJIIIIZZ(fromJson, "networkProxy!!.gson.from…rmissionInfo::class.java)");
        return (UserPermissionData.UserPermissionInfo) fromJson;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void registerNotice(String phone, int i) {
        o.LJIIIZ(phone, "phone");
        init();
        RBW rbw = RBW.LJLLI;
        rbw.getClass();
        FGR.LIZIZ().LIZ(rbw.LJLJI, new QX7(phone, i), 114);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void removeVerification(Handler handler, String id) {
        o.LJIIIZ(id, "id");
        init();
        RBW.LJLLI.getClass();
        FGR.LIZIZ().LIZ(handler, new ACallableS9S1000000_11(id, 2), 128);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateSchool(Handler handler, java.util.Map<String, String> info) {
        o.LJIIIZ(info, "info");
        init();
        RBW.LJLLI.getClass();
        QX9.LIZIZ(handler, info, 8);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateUserInfo(Handler handler, java.util.Map<String, String> info) {
        o.LJIIIZ(info, "info");
        init();
        RBW.LJLLI.getClass();
        QX9.LIZIZ(handler, info, 112);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateAllowStatus(Handler handler, int i, int i2) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "allow_status", String.valueOf(i), i2, 5, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateAvatarUri(Handler handler, String str, int i) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "avatar_uri", str, i, 4, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.getClass();
        if (urlModel == null || urlModel2 == null || urlModel3 == null) {
            return;
        }
        User LIZIZ = rbw.LIZIZ();
        if (LIZIZ.getAvatarThumb() != null && LIZIZ.getAvatarMedium() != null && LIZIZ.getAvatarLarger() != null && (TextUtils.equals(LIZIZ.getAvatarThumb().getUri(), urlModel.getUri()) || TextUtils.equals(LIZIZ.getAvatarMedium().getUri(), urlModel2.getUri()) || TextUtils.equals(LIZIZ.getAvatarLarger().getUri(), urlModel3.getUri()))) {
            return;
        }
        LIZIZ.setAvatarThumb(urlModel);
        LIZIZ.setAvatarMedium(urlModel2);
        LIZIZ.setAvatarLarger(urlModel3);
        UserStore.LJIIJJI(LIZIZ);
        C68542QvC.LIZ.getClass();
        C68542QvC.LIZIZ(7, null, LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateId(Handler handler, String str, int i) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "unique_id", str, i, 116, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateInsId(Handler handler, String str, int i) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "ins_id", str, i, 6, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateLanguage(Handler handler, String str, int i) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "language_change", str, i, 124, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateProfileWidgetId(Handler handler, Long l, int i) {
        long longValue = l.longValue();
        init();
        RBW.LJLLI.getClass();
        QX9.LIZIZ(handler, C113554cx.LJJJLZIJ(new OSZ("badge_info", "1"), new OSZ("profile_badge_id", String.valueOf(longValue)), new OSZ("page_from", String.valueOf(i))), 13);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateProfileWidgetShouldShow(Handler handler, boolean z, int i) {
        String str;
        init();
        RBW.LJLLI.getClass();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        QX9.LIZ(handler, "badge_info", str, i, 13, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateSecret(Handler handler, boolean z, int i) {
        updateSecret(handler, z, i, false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateSignature(Handler handler, String str, int i) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "signature", str, i, 2, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateSupportedNgo(Handler handler, int i, int i2) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZ(handler, "supporting_ngo_id", String.valueOf(i), i2, 12, false, 96);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCoverUri(Handler handler, String uri, int i, int i2) {
        o.LJIIIZ(uri, "uri");
        init();
        RBW.LJLLI.getClass();
        QX9.LIZIZ(handler, C113554cx.LJJJLZIJ(new OSZ("cover_uri", uri), new OSZ("cover_source", String.valueOf(i)), new OSZ("page_from", String.valueOf(i2))), 10);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateNickName(Handler handler, String str, int i, String str2) {
        init();
        RBW.LJLLI.getClass();
        FGR.LIZIZ().LIZ(handler, new QXA(i, "nickname", false, str, str2), 0);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateNickNameWithSupplementray(Handler handler, String nickName, List<String> images, int i) {
        o.LJIIIZ(nickName, "nickName");
        init();
        RBW rbw = RBW.LJLLI;
        if (images == null) {
            images = C61878OQg.INSTANCE;
        }
        rbw.getClass();
        o.LJIIIZ(images, "images");
        List LJLL = ORZ.LJLL(images);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        QX9.LIZIZ(handler, C113554cx.LJJJLZIJ(new OSZ("nickname", nickName), new OSZ("supplementary_img_uri", ORZ.LLD(arrayList, ",", null, null, null, 62)), new OSZ("page_from", String.valueOf(i))), 0);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateSecret(Handler handler, boolean z, int i, boolean z2) {
        String str;
        init();
        RBW.LJLLI.getClass();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        QX9.LIZ(handler, "secret", str, i, 122, z2, 64);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateSupportedNgoPercent(Handler handler, String orgId, String orgType, int i) {
        o.LJIIIZ(orgId, "orgId");
        o.LJIIIZ(orgType, "orgType");
        init();
        RBW.LJLLI.getClass();
        QX9.LIZIZ(handler, C113554cx.LJJJLZIJ(new OSZ("organization_id", orgId), new OSZ("organization_type", orgType), new OSZ("page_from", String.valueOf(i))), 12);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void uploadCover(Handler handler, String str, int i, String str2) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZJ(handler, str, i, str2, null, 126);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2) {
        init();
        RBW rbw = RBW.LJLLI;
        rbw.LIZIZ().setEducation(i);
        rbw.LIZIZ().setSchoolInfoShowRange(i2);
        rbw.LJLIL = true;
        UserStore.LJIIJJI(rbw.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void updateVideoCoverUri(Handler handler, String videoId, String awemeId, int i, int i2) {
        o.LJIIIZ(videoId, "videoId");
        o.LJIIIZ(awemeId, "awemeId");
        init();
        RBW.LJLLI.getClass();
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("cover_video_id", videoId), new OSZ("cover_video_offset", String.valueOf(i)), new OSZ("page_from", String.valueOf(i2)));
        if (!TextUtils.isEmpty(awemeId)) {
            LJJLIIIIJ.put("cover_item_id", awemeId);
        }
        QX9.LIZIZ(handler, LJJLIIIIJ, 11);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void uploadAvatar(Handler handler, String str, int i, String str2, List<? extends C66619QCp> list) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZJ(handler, str, i, str2, list, 111);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZJ(handler, str, i, str2, C47261Igj.LJJIJ(new C66619QCp("source", str3)), 125);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void uploadVideoAvatar(Handler handler, String str, int i, String str2, List<? extends C66619QCp> list) {
        init();
        RBW.LJLLI.getClass();
        QX9.LIZJ(handler, str, i, str2, list, 121);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void uploadAvatar(Handler handler, String str, int i, String str2, List<? extends C66619QCp> list, String str3) {
        init();
        RBW.LJLLI.getClass();
        FGR.LIZIZ().LIZ(handler, new QX4(i, str, str2, str3, list), 111);
    }
}
