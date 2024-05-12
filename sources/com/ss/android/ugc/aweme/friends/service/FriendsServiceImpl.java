package com.ss.android.ugc.aweme.friends.service;

import X.A7G;
import X.AV1;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10K;
import X.C184077Kh;
import X.C188727au;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C239709aw;
import X.C246509lu;
import X.C2NU;
import X.C35397Dur;
import X.C42222Ghe;
import X.C45804HyK;
import X.C52635KlD;
import X.C53249Kv7;
import X.C56191M3n;
import X.C57126MbS;
import X.C57271Mdn;
import X.C57283Mdz;
import X.C57441MgX;
import X.C58096Mr6;
import X.C58098Mr8;
import X.C61210O0o;
import X.C62822Ol8;
import X.C63800P2e;
import X.C65352Pkq;
import X.C73454SsE;
import X.C73674Svm;
import X.C73969T1h;
import X.C77134UPa;
import X.C77177UQr;
import X.C78926UyI;
import X.C8W0;
import X.EF7;
import X.EFM;
import X.EnumC58085Mqv;
import X.EnumC72483ScZ;
import X.FFL;
import X.FMX;
import X.FWR;
import X.HG3;
import X.InterfaceC51691KQl;
import X.InterfaceC57395Mfn;
import X.InterfaceC57445Mgb;
import X.InterfaceC58008Mpg;
import X.InterfaceC65350Pko;
import X.InterfaceC85634XjC;
import X.LKA;
import X.M4C;
import X.Q7K;
import X.RBX;
import X.T16;
import X.UP4;
import X.UPC;
import X.UPG;
import X.UPK;
import X.UPZ;
import X.UQ2;
import X.UQ4;
import X.UQ5;
import X.UQA;
import X.UQB;
import X.UQC;
import X.UQF;
import X.UR7;
import X.URA;
import X.UUM;
import X.WM7;
import X.X1D;
import Y.AfS22S1000000_13;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.assem.MainPageFriendsAssem;
import com.ss.android.ugc.aweme.friends.lego.ContactsUploadRequest;
import com.ss.android.ugc.aweme.friends.lego.MafFollowBackBootRequest;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS1S2301000_13;
import kotlin.jvm.internal.AqS48S1000000_10;
import kotlin.jvm.internal.AqS4S2201000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FriendsServiceImpl implements IFriendsService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58098Mr8.LJLIL);

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final UQA LIZLLL() {
        return UQ2.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends UPC> LJIIJJI() {
        return ContactUFR.class;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIILIIL() {
        if (!((RBX) HG3.LJIILL()).isLogin() || UQB.LIZLLL()) {
            return;
        }
        int LIZIZ = Q7K.LIZIZ("obtain_friends_strategy_when_upgrading", 0);
        Keva keva = UQB.LIZIZ;
        if (!keva.getBoolean("key_new_version", false) || LIZIZ != 3) {
            return;
        }
        keva.storeInt("key_display_strategy", LIZIZ);
        SettingsManager.LIZLLL().getClass();
        keva.storeLong("key_rec_friends_frequency", SettingsManager.LJFF("obtain_friends_strategy_when_upgrading_frequency", 30L));
        boolean LJFF = UQB.LJFF();
        boolean LJ = UQB.LJ();
        keva.storeString("key_check_status", "value_check_start");
        if (!LJFF && !LJ) {
            UQB.LIZ.getClass();
            UQB.LIZ();
        }
        keva.storeString("key_check_status", "value_check_hasdata");
        if (!LJFF && !LJ) {
            return;
        }
        UQB.LIZ.getClass();
        UQB.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC85634XjC LJIJ() {
        return C56191M3n.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJ(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC65350Pko<? extends C8W0> LJJI() {
        return C65352Pkq.LIZ(MainPageFriendsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIFFI(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends UPC> LJJIJIIJI() {
        return UPG.class;
    }

    public static IFriendsService LJJJJ() {
        Object LIZ = C58096Mr6.LIZ(IFriendsService.class, false);
        if (LIZ != null) {
            return (IFriendsService) LIZ;
        }
        if (C58096Mr6.W0 == null) {
            synchronized (IFriendsService.class) {
                if (C58096Mr6.W0 == null) {
                    C58096Mr6.W0 = new FriendsServiceImpl();
                }
            }
        }
        return C58096Mr6.W0;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC57445Mgb LIZ() {
        return (C57441MgX) UQC.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LIZJ() {
        return UPZ.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJI() {
        if (((Number) C52635KlD.LIZ.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIILL() {
        C77134UPa.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        AbstractC73672Svk<BaseResponse> syncSocialRelationStatusInRx = C57126MbS.LIZ().syncSocialRelationStatusInRx(2, Boolean.TRUE, Boolean.FALSE, false);
        if (syncSocialRelationStatusInRx != null) {
            syncSocialRelationStatusInRx.LJIJJ(new AfS22S1000000_13(1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS22S1000000_13(2));
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIIZILJ() {
        C239709aw.LIZIZ(EnumC58085Mqv.UNKNOWN);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIJJ() {
        C53249Kv7.LIZ.getClass();
        if (((Number) C53249Kv7.LIZIZ.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final EFM LJJIII() {
        return new MafFollowBackBootRequest();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIJL() {
        return UPZ.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIJLIJ() {
        UQB.LIZ.getClass();
        if (((Boolean) C35397Dur.LIZIZ.getValue()).booleanValue()) {
            if (UQB.LIZLLL()) {
                return false;
            }
            Keva keva = UQB.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key_cache_ready_");
            LIZ.append(UQB.LIZIZ());
            if (!keva.getBoolean(X1D.LIZIZ(LIZ), false) || UQB.LJI() || keva.getInt("key_display_strategy", 0) != 3 || AV1.LJIIL() || !((RBX) HG3.LJIILL()).isLogin()) {
                return false;
            }
        } else {
            if (!((RBX) HG3.LJIILL()).isLogin() || AV1.LJIIL() || UQB.LIZLLL()) {
                return false;
            }
            Keva keva2 = UQB.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("key_cache_ready_");
            LIZ2.append(UQB.LIZIZ());
            if (!keva2.getBoolean(X1D.LIZIZ(LIZ2), false) || UQB.LJI() || keva2.getInt("key_display_strategy", 0) != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final ISocialFriendsService LJJIL() {
        return (SocialFriendsService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIZ() {
        if (Q7K.LIZIZ("hide_find_friends_entrance", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJJI() {
        Keva keva = UQB.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_rec_friends_has_shown_");
        UQB.LIZ.getClass();
        LIZ.append(UQB.LIZIZ());
        keva.storeBoolean(X1D.LIZIZ(LIZ), true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_cache_ready_");
        LIZ2.append(UQB.LIZIZ());
        keva.storeBoolean(X1D.LIZIZ(LIZ2), false);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final EFM LJJJIL() {
        return new ContactsUploadRequest();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC51691KQl getFollowPresenter() {
        return new C57283Mdz();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final M4C getRelationService() {
        return (C57271Mdn) UQC.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final long LJIIL() {
        FFL.LJIIIZ().getClass();
        return FFL.LJIILIIL(31744, 0L, "facebook_upload_interval") * 1000;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final UQ5 LJIIJ() {
        return C77134UPa.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC57395Mfn LJIILLIIL() {
        return UPZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return C61210O0o.LIZ.LIZ(activity, ContactFriendsPage.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJ(User user) {
        if (user != null && user.getFollowerCount() >= 1000 && (user == null || user.getMutualStruct() == null)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIIIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        FriendApi.LIZ.getClass();
        C57126MbS.LIZ().syncContactStatus(1, Boolean.TRUE, Boolean.FALSE).LJ(new UUM(enterFrom, ""), C10K.LJI, null);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final AbstractC73672Svk LJIILJJIL(String str) {
        String str2;
        Long l;
        C77134UPa c77134UPa = C77134UPa.LIZ;
        boolean LJIIJJI = c77134UPa.LJIIJJI();
        FriendApi.LIZ.getClass();
        FriendApi LIZ = C57126MbS.LIZ();
        if (LJIIJJI) {
            str2 = c77134UPa.LJI(str);
        } else {
            str2 = null;
        }
        if (LJIIJJI) {
            l = Long.valueOf(c77134UPa.LJIIJ(str));
        } else {
            l = null;
        }
        return LIZ.getSocialFriendsWithScene("facebook", str2, null, l, 20);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJII(boolean z) {
        List<SocialPlatformSetting> socialPlatformSettings = ((RBX) HG3.LJIILL()).getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    socialPlatformSetting.setSyncStatus(z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIJZLJL(boolean z) {
        AbstractC73672Svk<R> LJJIII;
        AbstractC73672Svk LJJIII2;
        UPZ.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        AbstractC73672Svk<BaseResponse> syncSocialRelationStatusInRx = C57126MbS.LIZ().syncSocialRelationStatusInRx(1, Boolean.TRUE, Boolean.FALSE, false);
        if (syncSocialRelationStatusInRx != null && (LJJIII = syncSocialRelationStatusInRx.LJIJJ(new UP4(z)).LJJIII(new A7G(z), false)) != 0 && (LJJIII2 = LJJIII.LJJIII(h.LJLILLLLZI, false)) != null) {
            C73454SsE LJJJ = LJJIII2.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
            C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
            LJJJ.LJJJLIIL(c42222Ghe, c42222Ghe);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final FWR LJJIIZI(ActivityC45651qj activityC45651qj) {
        return (SocialRecFriendsConditionViewModel) ViewModelProviders.of(activityC45651qj).get(SocialRecFriendsConditionViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIJ(boolean z) {
        if (!z) {
            return;
        }
        boolean z2 = false;
        if (C239709aw.LIZ().getBoolean("upload_status", false) || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        EF7.LIZIZ();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (!z2 || !UPZ.LIZ.LIZJ()) {
            return;
        }
        C10K.LIZJ(new Callable() { // from class: X.9XW
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object LJ;
                LJ = XKX.LJ(MBB.INSTANCE, new C237469Tq(null));
                if (((Boolean) LJ).booleanValue()) {
                    C239709aw.LIZ().storeBoolean("upload_status", true);
                }
                return C76800UCe.LIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final AbstractC73672Svk<ShortenUrlModel> shortenUrl(String url) {
        o.LJIIIZ(url, "url");
        FriendApi.LIZ.getClass();
        return C57126MbS.LIZ().shortenUrlRx(url);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJII(String str, Map map) {
        Integer LIZLLL;
        String LJIIIZ = UQ4.LJIIIZ(str);
        String LJIIJ = UQ4.LJIIJ(str);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_friends");
        c188727au.LJIIIZ("platform", str);
        c188727au.LJIIIZ("is_auth", CardStruct.IStatusCode.DEFAULT);
        c188727au.LJIIIZ("previous_page", "");
        c188727au.LJIIIZ("did_status", LJIIIZ);
        c188727au.LJIIIZ("uid_status", LJIIJ);
        if (map != null) {
            c188727au.LJIIIIZZ(map);
        }
        if (o.LJ(str, "facebook") && (LIZLLL = C77134UPa.LIZ.LIZLLL()) != null) {
            c188727au.LIZLLL(LIZLLL.intValue(), "server_fb_token");
        }
        FMX.LJIIL("authorize_card_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC58008Mpg LJIIIIZZ(LifecycleOwner lifecycleOwner, String str) {
        return (InterfaceC58008Mpg) new C214378bB(C65352Pkq.LIZ(FindFriendsPageVM.class), new AqS48S1000000_10(str, 0), C214528bQ.LJLIL, C78926UyI.LJJII(lifecycleOwner, false), C184077Kh.LJLIL, C63800P2e.INSTANCE, null, null).getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJI(String str, ActivityC45651qj activityC45651qj) {
        C77177UQr.LIZ.getClass();
        UQF LIZLLL = C77177UQr.LIZLLL(3);
        UR7 ur7 = UR7.POP_UP_TIME_TYPE;
        o.LJIIIZ(ur7, "<set-?>");
        LIZLLL.LJLJJI = ur7;
        if (LIZLLL.LJLIL || LIZLLL.LJLILLLLZI) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj);
            if (LJJIFFI != null) {
                PopupManager.LJIIL(new C246509lu(LJJIFFI, new AqS1S2301000_13(activityC45651qj, LIZLLL, str, 0)));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJJLI(ActivityC45651qj context, int i) {
        o.LJIIIZ(context, "context");
        C77177UQr.LIZ.getClass();
        UQF LIZLLL = C77177UQr.LIZLLL(4);
        UR7 ur7 = UR7.POP_UP_TIME_TYPE;
        o.LJIIIZ(ur7, "<set-?>");
        LIZLLL.LJLJJI = ur7;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        boolean z = false;
        if (curUser != null && curUser.getCompleteProfileGuideStrategy() == 5 && LIZLLL.LJLILLLLZI) {
            z = true;
        }
        LIZLLL.LJLILLLLZI = z;
        if (LIZLLL.LJLIL) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                PopupManager.LJIIL(new C246509lu(LJJIFFI, new AqS4S2201000_13(i, context, LIZLLL, 0)));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LJJIIJ(Context context, int i) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) FindFriendsPageActivity.class);
        intent.putExtra("previous_page", "push");
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIZ(String str, Map map) {
        Integer LIZLLL;
        String LJIIIZ = UQ4.LJIIIZ(str);
        String LJIIJ = UQ4.LJIIJ(str);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_friends");
        c188727au.LJIIIZ("platform", str);
        c188727au.LJIIIZ("previous_page", "");
        c188727au.LIZLLL(0, "is_auth");
        c188727au.LJIIIZ("did_status", LJIIIZ);
        c188727au.LJIIIZ("uid_status", LJIIJ);
        c188727au.LJIIIIZZ(map);
        if (o.LJ(str, "facebook") && (LIZLLL = C77134UPa.LIZ.LIZLLL()) != null) {
            c188727au.LIZLLL(LIZLLL.intValue(), "server_fb_token");
        }
        FMX.LJIIL("find_friends", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final UQF LJJIJIIJIL(int i, boolean z) {
        C77177UQr.LIZ.getClass();
        return C77177UQr.LJ(i, z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Fragment LJJJ(EnumC72483ScZ enumC72483ScZ, MufPageTrackInfo mufPageTrackInfo) {
        Bundle bundle = new Bundle();
        String json = GsonProtectorUtils.toJson(MufListPageFragment.LJZ, mufPageTrackInfo);
        bundle.putInt(WM7.SCENE_SERVICE, enumC72483ScZ.getValue());
        bundle.putString("track_info", json);
        MufListPageFragment mufListPageFragment = new MufListPageFragment();
        mufListPageFragment.setArguments(bundle);
        return mufListPageFragment;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final LKA LJJIJIL(Fragment fragment, HomePageDataViewModel homePageDataViewModel, AqS159S0100000_9 aqS159S0100000_9) {
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            return new UPK(fragment, (SocialRecFriendsConditionViewModel) ViewModelProviders.of(mo49getActivity).get(SocialRecFriendsConditionViewModel.class), homePageDataViewModel, aqS159S0100000_9);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJFF(Context context, String enterFrom, int i, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(context, "context");
        C77177UQr.LIZ.getClass();
        UQF LJ = C77177UQr.LJ(3, false);
        if (LJ.LJLIL || LJ.LJLILLLLZI) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                PopupManager.LJIIL(new C246509lu(LJJIFFI, new AqS4S2201000_13(i, context, LJ, enterFrom, enterMethod, 1)));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIL(int i, Context context, UQF popupConfig, URA ura, String str) {
        o.LJIIIZ(popupConfig, "popupConfig");
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            PopupManager.LJIIL(new C246509lu(LJJIFFI, new AqS1S2301000_13(i, context, popupConfig, ura, str, 1)));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
