package com.ss.android.ugc.aweme.services;

import X.AV1;
import X.AbstractC53764L8e;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass870;
import X.C118554l1;
import X.C30581Hy;
import X.C38333F2r;
import X.C40422Fti;
import X.C40423Ftj;
import X.C40883G2t;
import X.C53970LGc;
import X.C53990LGw;
import X.C57422MgE;
import X.C58096Mr6;
import X.C58725N2z;
import X.C62162OaU;
import X.C67630QgU;
import X.C68736QyK;
import X.C68737QyL;
import X.C73578SuE;
import X.C73969T1h;
import X.C76800UCe;
import X.C78741UvJ;
import X.C78939UyV;
import X.C86034Xpe;
import X.C88546Yp4;
import X.F30;
import X.InterfaceC54056LJk;
import X.InterfaceC56526MGk;
import X.InterfaceC57288Me4;
import X.InterfaceC57518Mhm;
import X.InterfaceC65052gv;
import X.InterfaceC66992k3;
import X.InterfaceC73573Su9;
import X.InterfaceC74235TBn;
import X.InterfaceC78487UrD;
import X.InterfaceC86003Zc;
import X.InterfaceC88472Yns;
import X.InterfaceC88475Ynv;
import X.KMV;
import X.M8X;
import X.MGW;
import X.T16;
import X.YG6;
import X.Z8A;
import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class ProfileDependentComponentImpl implements IProfileDependentComponentService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public boolean shouldDoCaptcha(Exception exc) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void showCaptchaDialog(FragmentManager fragmentManager, C38333F2r c38333F2r, InterfaceC57518Mhm interfaceC57518Mhm) {
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public YG6 adUtilsService() {
        return new AdUtilsServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public BridgeServiceImpl bridgeService() {
        return new BridgeServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public FavoritesMobUtilsServiceImpl favoritesMobUtilsService() {
        return new FavoritesMobUtilsServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public AbstractC53764L8e getDiscoverTabProtocol() {
        return new C53990LGw();
    }

    public InterfaceC74235TBn<C76800UCe> getNotificationManagerHandleSystemCamera() {
        return new ProfileDependentComponentImpl$notificationManagerHandleSystemCamera$1(C118554l1.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public AbstractC53764L8e getProfileTabProtocol() {
        return new C53970LGc();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public AbstractC73672Svk<Boolean> needShowDiskManagerGuideView() {
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$needShowDiskManagerGuideView$1
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<Boolean> it) {
                o.LJIIIZ(it, "it");
                try {
                    it.onNext(Boolean.valueOf(C86034Xpe.LIZIZ.needShowProfileGuideView()));
                    it.onComplete();
                } catch (Exception e) {
                    it.onError(e);
                }
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public boolean platformInfoManagerHasPlatformBinded() {
        C68736QyK c68736QyK = C68736QyK.LIZLLL;
        c68736QyK.getClass();
        c68736QyK.LIZIZ(C58725N2z.LIZ);
        C68737QyL[] c68737QyLArr = c68736QyK.LIZIZ;
        for (C68737QyL c68737QyL : c68737QyLArr) {
            if (c68737QyL.LIZJ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public boolean shouldUseRecyclerPartialUpdate() {
        return C88546Yp4.LIZIZ.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public boolean isEnableSettingDiskManager() {
        return C78939UyV.LJJIJ();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void logShowProfileDiskManagerGuideView() {
        C67630QgU.LIZ().storeBoolean("has_show_disk_manager_guide", true);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public InterfaceC88475Ynv<Activity, Fragment, Integer, String, String, C76800UCe> getStartCameraActivity() {
        return ProfileDependentComponentImpl$startCameraActivity$1.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    /* renamed from: getNotificationManagerHandleSystemCamera, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC88472Yns mo152getNotificationManagerHandleSystemCamera() {
        return (InterfaceC88472Yns) getNotificationManagerHandleSystemCamera();
    }

    public static IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IProfileDependentComponentService.class, z);
        if (LIZ != null) {
            return (IProfileDependentComponentService) LIZ;
        }
        return new ProfileDependentComponentImpl();
    }

    public void clearNinePatchBubbleState(Context context) {
        if (context == null) {
            return;
        }
        C40423Ftj c40423Ftj = C40422Fti.LIZ;
        c40423Ftj.getClass();
        c40423Ftj.LJ().storeBoolean("bubble_state", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public String hexDigest(String string) {
        o.LJIIIZ(string, "string");
        return C30581Hy.LJIILLIIL(string);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public boolean isDetailActivity(Activity activity) {
        return activity instanceof DetailActivity;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public boolean isUserProfileActivity(Activity activity) {
        if (activity instanceof KMV) {
            if (Z8A.LIZIZ.isUserProfileFragment(((KMV) activity).getRootFragment())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public InterfaceC54056LJk mainAnimViewModel(final ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return new InterfaceC54056LJk(activity) { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$mainAnimViewModel$1
            public final MainAnimViewModel mainAnimViewModel;

            @Override // X.InterfaceC54056LJk
            public MutableLiveData<Boolean> isUserProfileFragmentVisible2() {
                return this.mainAnimViewModel.LJLILLLLZI;
            }

            public final MainAnimViewModel getMainAnimViewModel() {
                return this.mainAnimViewModel;
            }

            {
                this.mainAnimViewModel = (MainAnimViewModel) ViewModelProviders.of(activity).get(MainAnimViewModel.class);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public boolean onAntiCrawlerEvent(String str) {
        if (str == null) {
            return false;
        }
        if (!s.LJJJLZIJ(str, "/aweme/v1/aweme/post/?", false) && !s.LJJJLZIJ(str, "/aweme/v1/aweme/favorite/?", false) && !s.LJJJLZIJ(str, "/aweme/v1/aweme/listcollection/?", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void startDiskManagerActivity(Context context) {
        o.LJIIIZ(context, "context");
        SmartRouter.buildRoute(context, "//setting/diskmanager").open();
    }

    public void openFestivalPageWithSchema(Context context, String linkUrl) {
        o.LJIIIZ(linkUrl, "linkUrl");
        M8X.LIZ(context, linkUrl);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public AbstractC73638SvC<BaseResponse> setPrivateSettingItem(final String field, final int i) {
        o.LJIIIZ(field, "field");
        return AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$setPrivateSettingItem$1
            @Override // X.InterfaceC66992k3
            public final void subscribe(InterfaceC65052gv<BaseResponse> it) {
                o.LJIIIZ(it, "it");
                ((C73578SuE) it).onSuccess(C86034Xpe.LIZIZ.setPushPrivateSettingItem(field, i));
            }
        }).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ());
    }

    public void startAdsAppActivity(Context context, String schema) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        C57422MgE.LIZIZ(context, schema, "", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void startDownloadControlSettingActivity(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//setting/download");
        buildRoute.withParam("enter_from", "personal_homepage");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        Z8A.LIZIZ.startHeaderDetailActivity(activity, bundle);
    }

    public void startQRCodeActivityV2(Context context, C62162OaU c62162OaU) {
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//qrcodev2");
        buildRoute.withParam("extra_params", c62162OaU);
        buildRoute.open();
    }

    public void activeTT(Context context, String targetPackage, String userId) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(targetPackage, "targetPackage");
        o.LJIIIZ(userId, "userId");
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, InterfaceC56526MGk onHasMoreListener, boolean z) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(onHasMoreListener, "onHasMoreListener");
        MGW.LIZ(recyclerView, onHasMoreListener, 10, z);
        return recyclerView;
    }

    /* renamed from: newLiveBlurProcessor, reason: merged with bridge method [inline-methods] */
    public C78741UvJ m153newLiveBlurProcessor(int i, float f, final InterfaceC78487UrD interfaceC78487UrD) {
        return new C78741UvJ(i, f, new AnonymousClass870(interfaceC78487UrD) { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$newLiveBlurProcessor$1
            public final /* synthetic */ InterfaceC78487UrD $listener;

            @Override // X.AnonymousClass870
            public final void processorFinish(Object obj) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void startHeaderDetailActivity(Activity activity, View preView, String str, User user) {
        String[] strArr;
        o.LJIIIZ(preView, "preView");
        o.LJIIIZ(user, "user");
        Z8A z8a = Z8A.LIZIZ;
        C40883G2t c40883G2t = new C40883G2t();
        ((Bundle) c40883G2t.LIZ).putParcelable("extra_zoom_info", ZoomAnimationUtils.LIZ(preView));
        c40883G2t.LIZJ("enable_edit_img", false);
        if (TextUtils.isEmpty(str)) {
            strArr = AV1.LJIIIZ(AV1.LJ(user));
        } else {
            strArr = new String[]{str};
        }
        ((BaseBundle) c40883G2t.LIZ).putStringArray("uri", strArr);
        c40883G2t.LIZJ("enable_download_img", true);
        ((Bundle) c40883G2t.LIZ).putSerializable("share_info", user);
        z8a.startHeaderDetailActivity(activity, (Bundle) c40883G2t.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void watchFromProfile(Context context, User user, boolean z, InterfaceC57288Me4 interfaceC57288Me4) {
        LiveOuterService.LJJJLL().LJIILL().LJIIL(context, user, z, null);
    }

    public void watchLiveMob(Context context, User user, String enterFrom, String enterMethod) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = enterFrom;
        roomsData.enterMethod = enterMethod;
        LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(context, user, enterRoomConfig);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        o.LJIIIZ(user, "user");
        Z8A.LIZIZ.startHeaderDetailActivity(activity, view, user, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        o.LJIIIZ(user, "user");
        Z8A.LIZIZ.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void watchFromProfile(Context context, User user, boolean z, InterfaceC57288Me4 interfaceC57288Me4, SlimRoom slimRoom) {
        LiveOuterService.LJJJLL().LJIILL().LJIIL(context, user, z, slimRoom);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public <T> T apiExecuteGetJSONObject(String url, Class<T> cls, String str, boolean z, String str2, Object obj) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(cls, "cls");
        return (T) Api.LIZLLL(0, url, cls, str, null, obj);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public <T> T apiExecuteGetJSONObject(int i, String url, Class<T> cls, String str, F30 headerGroup, boolean z, String str2) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(cls, "cls");
        o.LJIIIZ(headerGroup, "headerGroup");
        return (T) Api.LIZLLL(i, url, cls, str, headerGroup, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void gotoCropActivity(Fragment fragment, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(originalUrl, "originalUrl");
        Z8A.LIZIZ.gotoCrop(fragment, originalUrl, z, f, i, i2, i3, i4, i5, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public void gotoCropActivity(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        Z8A.LIZIZ.gotoCrop(activity, originalUrl, z, f, i, i2, i3, i4, i5, z2, bundle);
    }
}
