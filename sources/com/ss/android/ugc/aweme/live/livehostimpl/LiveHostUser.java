package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AV1;
import X.ActivityC45651qj;
import X.C28443BEh;
import X.C29360Bfg;
import X.C29372Bfs;
import X.C29374Bfu;
import X.C2U8;
import X.C44;
import X.C56331M8x;
import X.C78989UzJ;
import X.C78990UzK;
import X.C78993UzN;
import X.C79057V0z;
import X.C85990Xow;
import X.CZL;
import X.HG3;
import X.InterfaceC05190Ih;
import X.InterfaceC29249Bdt;
import X.InterfaceC29373Bft;
import X.InterfaceC29386Bg6;
import X.InterfaceC29387Bg7;
import X.InterfaceC78482Ur8;
import X.InterfaceC78991UzL;
import X.InterfaceC78992UzM;
import X.InterfaceC78995UzP;
import X.J9P;
import X.JJ4;
import X.LEA;
import Y.IDeS358S0100000_13;
import Y.IDxS306S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCacheUserSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.BindService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes14.dex */
public class LiveHostUser implements IHostUser {
    public C78989UzJ LJLIL;
    public CZL LJLILLLLZI;

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final List<C28443BEh> getAllFriends() {
        List<IMUser> allFriends = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().getAllFriends();
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : allFriends) {
            if (!IMUser.isInvalidUser(iMUser.getUid())) {
                arrayList.add(new C28443BEh(Long.valueOf(CastLongProtector.parseLong(iMUser.getUid())), iMUser.getSecUid(), iMUser.getNickName(), iMUser.getUniqueId(), new ImageModel(iMUser.getAvatarThumb().getUri(), iMUser.getAvatarThumb().getUrlList())));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final InterfaceC05190Ih getCurUser() {
        return C79057V0z.LJJJJZI(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final long getCurUserId() {
        return CastLongProtector.parseLong(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getEmail() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null) {
            return "";
        }
        return currentUser.getEmail();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean interceptOperation(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isLogin() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C78993UzN.LIZIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void dismissCaptcha() {
        SecApiImpl.LIZ().dismissCaptcha();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getCurrentRegionCode() {
        return C85990Xow.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isDeleteByAgeGate() {
        return AV1.LJIIL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isMinorMode() {
        return AV1.LJIIJJI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isNeedProtectMinor() {
        return a.LJIILL().LJIJ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isNewUser() {
        return AccountService.LJIJ().LJFF().isNewUser();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void cacheUserBeforeEnterProfile(com.bytedance.android.live.base.model.user.User user) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!LiveCacheUserSetting.get() || user == null) {
            return;
        }
        User user2 = new User();
        user2.setUid(user.getIdStr());
        user2.setSecUid(user.getSecUid());
        user2.setUniqueId(user.getDisplayId());
        user2.setNickname(user.getNickName());
        user2.setAvatarThumb(C79057V0z.LJJIIZ(user.getAvatarThumb()));
        user2.setAvatarMedium(C79057V0z.LJJIIZ(user.getAvatarMedium()));
        user2.setAvatarLarger(C79057V0z.LJJIIZ(user.getAvatarLarge()));
        user2.setSignature(user.getAutoGraph());
        FollowInfo followInfo = user.getFollowInfo();
        boolean z = true;
        if (followInfo != null) {
            int followStatus = (int) followInfo.getFollowStatus();
            if (followStatus != 1) {
                i2 = 2;
                if (followStatus != 2) {
                    if (followStatus != 3) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
                i3 = 1;
                i4 = (int) followInfo.getFollowingCount();
                i = (int) followInfo.getFollowerCount();
            } else {
                i2 = 1;
            }
            i3 = 0;
            i4 = (int) followInfo.getFollowingCount();
            i = (int) followInfo.getFollowerCount();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        user2.setFollowStatus(i2);
        user2.setFollowerStatus(i3);
        user2.setFollowerCount(i4);
        user2.setFollowingCount(i);
        if (user.getSecret() != 1) {
            z = false;
        }
        user2.setSecret(z);
        IUserProfilePreload LJIIIIZZ = UserProfilePreloadHelper.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        LJIIIIZZ.LIZJ(user2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void observeAccountChange(final InterfaceC29249Bdt interfaceC29249Bdt) {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.CJs
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                InterfaceC29249Bdt interfaceC29249Bdt2 = InterfaceC29249Bdt.this;
                if (z) {
                    interfaceC29249Bdt2.LIZ();
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerCurrentUserUpdateListener(InterfaceC78995UzP interfaceC78995UzP) {
        if (this.LJLIL == null) {
            this.LJLIL = new C78989UzJ();
        }
        C78989UzJ c78989UzJ = this.LJLIL;
        c78989UzJ.LIZ = interfaceC78995UzP;
        synchronized (c78989UzJ) {
            if (!EventBus.LIZJ().LJI(c78989UzJ)) {
                EventBus.LIZJ().LJIILJJIL(c78989UzJ);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerFollowStatusListener(InterfaceC29386Bg6 interfaceC29386Bg6) {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new CZL();
        }
        CZL czl = this.LJLILLLLZI;
        czl.LIZ = interfaceC29386Bg6;
        synchronized (czl) {
            if (!EventBus.LIZJ().LJI(czl)) {
                EventBus.LIZJ().LJIILJJIL(czl);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void reportData(String str) {
        SecApiImpl.LIZ().reportData(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void event(String str, String str2) {
        RuntimeBehaviorServiceImpl.LJ().event(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final Map<String, String> frameSign(String str, int i) {
        return SecApiImpl.LIZ().frameSign(str, i);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getTTDisPlayName(String str, String str2) {
        return C56331M8x.LIZJ(str2, str, false, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void onFollowStatusChanged(int i, long j) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = String.valueOf(j);
        followStatus.followStatus = i;
        C2U8.LIZ(new FollowStatusEvent(followStatus));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void requestLivePermission(C44 c44, String str) {
        LiveOuterService.LJJJLL().LJJI().LIZJ(c44, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void popCaptchaV2(Activity activity, String str, InterfaceC78991UzL interfaceC78991UzL) {
        SecApiImpl.LIZ().popCaptchaV2(activity, str, new C78990UzK(interfaceC78991UzL));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC78482Ur8 interfaceC78482Ur8) {
        LiveOuterService.LJJJLL().jumpLiveSquareWithLogin(context, str, str2, interfaceC78482Ur8);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unFollowWithConfirm(Activity activity, int i, long j, InterfaceC29373Bft interfaceC29373Bft) {
        C29372Bfs c29372Bfs = (C29372Bfs) interfaceC29373Bft;
        C29374Bfu c29374Bfu = c29372Bfs.LIZLLL;
        long j2 = c29372Bfs.LIZ.LIZ;
        C29360Bfg c29360Bfg = c29372Bfs.LIZIZ;
        c29374Bfu.LJII(0, j2, c29360Bfg.LIZLLL, c29360Bfg.LJFF, c29360Bfg.LJ, c29360Bfg.LJI, false).LIZ(new IDxS306S0100000_5(c29372Bfs, 3));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void bindMobile(Activity activity, String str, String str2, Bundle bundle, InterfaceC78992UzM interfaceC78992UzM) {
        BindService.createIBindServicebyMonsterPlugin(false).bindMobile(activity, str, str2, bundle, new IDeS358S0100000_13(interfaceC78992UzM, 1));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void login(ActivityC45651qj activityC45651qj, final InterfaceC29387Bg7 interfaceC29387Bg7, String str, String str2, int i, String str3, String str4, String str5) {
        J9P.LIZIZ(activityC45651qj, str4, "live_room", null, new JJ4() { // from class: X.CJo
            @Override // X.JJ4
            public final /* synthetic */ void LIZIZ() {
            }

            @Override // X.JJ4
            public final void LIZ() {
                InterfaceC29387Bg7 interfaceC29387Bg72 = InterfaceC29387Bg7.this;
                com.bytedance.android.live.base.model.user.User LJJJJZI = C79057V0z.LJJJJZI(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
                C29382Bg2 c29382Bg2 = (C29382Bg2) interfaceC29387Bg72;
                C29374Bfu c29374Bfu = c29382Bg2.LIZ;
                if (c29374Bfu.LJIIIZ != null) {
                    c29374Bfu.LIZIZ = LJJJJZI;
                    c29374Bfu.LJIL("UserCenter_loginCallback").LIZ(new C29375Bfv(c29382Bg2, LJJJJZI));
                }
            }
        });
    }
}
