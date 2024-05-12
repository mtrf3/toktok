package com.bytedance.ies.ugc.aweme.smartanchor_declaration;

import X.C40194Fq2;
import X.C40342FsQ;
import X.C40343FsR;
import X.C51556KLg;
import X.C58096Mr6;
import X.C60103NiN;
import X.InterfaceC54858Lfy;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.app.services.LauncherService;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.ChatSetRouter;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingRouter;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.dsp.subscribe.schema.MusicBrandIconSchemaInterceptor;
import com.ss.android.ugc.aweme.dsp.subscribe.schema.MusicLoadingInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.EcUgDeeplinkService;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.friendstab.router.FriendsFeedRouterInterceptor;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.EcommerceInfluencerServiceImpl;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptor;
import com.ss.android.ugc.aweme.music.MusicThirdPartyInterceptor;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.poi.map.PoiMapPageInterceptor;
import com.ss.android.ugc.aweme.poi.search.PoiSearchPageInterceptor;
import com.ss.android.ugc.aweme.poi.thirdparty.PoiThirdPartyInterceptor;
import com.ss.android.ugc.aweme.route.NowRouterInterceptor;
import com.ss.android.ugc.aweme.route.NowShootRouterInterceptor;
import com.ss.android.ugc.aweme.router.AccountInterceptor;
import com.ss.android.ugc.aweme.router.AdditionalActionInterceptor;
import com.ss.android.ugc.aweme.router.ChallengeUrlInterceptor;
import com.ss.android.ugc.aweme.router.DraftRouterInterceptor;
import com.ss.android.ugc.aweme.router.FeedbackSubmitInterceptor;
import com.ss.android.ugc.aweme.router.LoginRouterInterceptor;
import com.ss.android.ugc.aweme.router.MixDetailInterceptor;
import com.ss.android.ugc.aweme.router.OpenChatExtInterceptor;
import com.ss.android.ugc.aweme.router.RecordPermissionInterceptor;
import com.ss.android.ugc.aweme.router.RecordPermissionInterceptorNew;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import com.ss.android.ugc.aweme.router.UrlPathParamsInterceptor;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.SearchInterceptor;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchThirdPartyInterceptor;
import com.ss.android.ugc.aweme.service.AnalyticsDetailService;
import com.ss.android.ugc.aweme.service.IAnalyticsDetailService;
import com.ss.android.ugc.aweme.service.PaidContentServiceImpl;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class RouterAnchorPoint implements InterfaceC54858Lfy {
    public static InterfaceC54858Lfy getPoint() {
        return new RouterAnchorPoint();
    }

    @Override // X.InterfaceC54858Lfy
    public void run(Object obj) {
        IAnalyticsDetailService analyticsDetailService;
        List<IInterceptor> LIZIZ;
        List<IInterceptor> LIZIZ2;
        SmartRouter.addInterceptor(new FamilyPairingRouter());
        SmartRouter.addInterceptor(new ChatSetRouter());
        SmartRouter.addInterceptor(new MusicLoadingInterceptor());
        SmartRouter.addInterceptor(new MusicBrandIconSchemaInterceptor());
        SmartRouter.addInterceptor(new TEARouterInterceptor());
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        C40194Fq2 c40194Fq2 = new C40194Fq2();
        c40342FsQ.getClass();
        C40343FsR.LIZLLL.add(c40194Fq2);
        C40342FsQ.LJI(new C60103NiN());
        SmartRouter.addInterceptor(new MusicThirdPartyInterceptor());
        SmartRouter.addInterceptor(new PoiThirdPartyInterceptor());
        SmartRouter.addInterceptor(new PoiSearchPageInterceptor());
        SmartRouter.addInterceptor(new PoiMapPageInterceptor());
        SmartRouter.addInterceptor(new UrlPathParamsInterceptor());
        SmartRouter.addInterceptor(new DraftRouterInterceptor());
        SmartRouter.addInterceptor(new MixDetailInterceptor());
        SmartRouter.addInterceptor(new AccountInterceptor());
        System.out.println("Cofig will add challenge");
        SmartRouter.addInterceptor(new ChallengeUrlInterceptor());
        IEcSchemaService LIZJ = EcSchemaService.LIZJ();
        if (LIZJ != null && (LIZIZ2 = LIZJ.LIZIZ()) != null) {
            Iterator<IInterceptor> it = LIZIZ2.iterator();
            while (it.hasNext()) {
                SmartRouter.addInterceptor(it.next());
            }
        }
        Iterator<IInterceptor> it2 = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getEComPipeRouterInterceptors().iterator();
        while (it2.hasNext()) {
            SmartRouter.addInterceptor(it2.next());
        }
        SmartRouter.addInterceptor(new FriendsFeedRouterInterceptor());
        SmartRouter.addInterceptor(new NowRouterInterceptor());
        SmartRouter.addInterceptor(new NowShootRouterInterceptor());
        SmartRouter.addInterceptor(FavoriteServiceImpl.LJIJJLI().LIZLLL());
        SmartRouter.addInterceptor(LauncherService.LIZLLL().LIZ());
        SmartRouter.addInterceptor(new UrlPathParamsInterceptor());
        SmartRouter.addInterceptor(new RecordPermissionInterceptor());
        SmartRouter.addInterceptor(new RecordPermissionInterceptorNew());
        SmartRouter.addInterceptor(new UploadActionInterceptor());
        SmartRouter.addInterceptor(new DraftRouterInterceptor());
        SmartRouter.addInterceptor(new OpenChatExtInterceptor());
        SmartRouter.addInterceptor(new LoginRouterInterceptor());
        SmartRouter.addInterceptor(new AdditionalActionInterceptor());
        SmartRouter.addInterceptor(DonationServiceImpl.LJI().LIZJ());
        SmartRouter.addInterceptor(new FeedbackSubmitInterceptor());
        SmartRouter.addInterceptor(IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJI());
        Iterator<IInterceptor> it3 = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getECommerceRouterInterceptors().iterator();
        while (it3.hasNext()) {
            SmartRouter.addInterceptor(it3.next());
        }
        IEcUgDeeplinkService LIZJ2 = EcUgDeeplinkService.LIZJ();
        if (LIZJ2 != null && (LIZIZ = LIZJ2.LIZIZ()) != null) {
            Iterator<IInterceptor> it4 = LIZIZ.iterator();
            while (it4.hasNext()) {
                SmartRouter.addInterceptor(it4.next());
            }
        }
        Iterator<IInterceptor> it5 = ECommerceMallService.v3().LJJL().iterator();
        while (it5.hasNext()) {
            SmartRouter.addInterceptor(it5.next());
        }
        IECMallService LIZJ3 = FashionMallService.LIZJ();
        o.LJIIIIZZ(LIZJ3, "get().getService(IECMallService::class.java)");
        Iterator<IInterceptor> it6 = LIZJ3.LJJL().iterator();
        while (it6.hasNext()) {
            SmartRouter.addInterceptor(it6.next());
        }
        Iterator<IInterceptor> it7 = EcomSearchServiceImpl.LJJJJZI().LJJIJL().iterator();
        while (it7.hasNext()) {
            SmartRouter.addInterceptor(it7.next());
        }
        Iterator<IInterceptor> it8 = EcommerceInfluencerServiceImpl.LJ().LIZ().iterator();
        while (it8.hasNext()) {
            SmartRouter.addInterceptor(it8.next());
        }
        Iterator<IInterceptor> it9 = AppUpdateService.LIZLLL().LIZ().iterator();
        while (it9.hasNext()) {
            SmartRouter.addInterceptor(it9.next());
        }
        SmartRouter.addInterceptor(AVExternalServiceImpl.LIZ().routerService().openEditPageRouter());
        SmartRouter.addInterceptor(AVExternalServiceImpl.LIZ().routerService().openTextEditRouter());
        C51556KLg.LIZ.getClass();
        SmartRouter.addInterceptor(C51556KLg.LIZ().LJIIJ());
        SmartRouter.addInterceptor(PaidContentServiceImpl.LJIIIZ().LJIIIIZZ());
        SmartRouter.addInterceptor(AddYoursServiceImpl.LJIJ().LJI());
        Object LIZ = C58096Mr6.LIZ(IAnalyticsDetailService.class, false);
        if (LIZ != null) {
            analyticsDetailService = (IAnalyticsDetailService) LIZ;
        } else {
            analyticsDetailService = new AnalyticsDetailService();
        }
        SmartRouter.addInterceptor(analyticsDetailService.LIZJ());
        SmartRouter.addInterceptor(new SearchInterceptor());
        SmartRouter.addInterceptor(new SearchThirdPartyInterceptor());
    }
}
