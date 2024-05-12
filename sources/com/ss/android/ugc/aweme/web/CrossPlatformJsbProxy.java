package com.ss.android.ugc.aweme.web;

import X.C113554cx;
import X.C31889CfN;
import X.C31924Cfw;
import X.C31926Cfy;
import X.C37848EtI;
import X.C37852EtM;
import X.C37936Eui;
import X.C38036EwK;
import X.C38037EwL;
import X.C38049EwX;
import X.C38150EyA;
import X.C38274F0k;
import X.C38285F0v;
import X.C38292F1c;
import X.C38962FQw;
import X.C40259Fr5;
import X.C40266FrC;
import X.C40267FrD;
import X.C40269FrF;
import X.C40272FrI;
import X.C40289FrZ;
import X.C40496Fuu;
import X.C55374LoI;
import X.C58096Mr6;
import X.C58149Mrx;
import X.C60737Nsb;
import X.C68322mC;
import X.C77577UcX;
import X.C77593Ucn;
import X.C77868UhE;
import X.C86266XtO;
import X.C86290Xtm;
import X.C86291Xtn;
import X.C86393XvR;
import X.EZ7;
import X.EnumC37847EtH;
import X.F0E;
import X.F15;
import X.F1G;
import X.F1N;
import X.F1X;
import X.F1Y;
import X.F2E;
import X.F71;
import X.HG3;
import X.InterfaceC37790EsM;
import X.InterfaceC38012Evw;
import X.InterfaceC38277F0n;
import X.InterfaceC40275FrL;
import X.InterfaceC40311Frv;
import X.R55;
import X.Z9N;
import android.content.Context;
import com.bytedance.android.live.walletnew.jsb.ChargeMethodNew;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.discover.ui.GetABTest;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.AppInfoMethod;
import com.ss.android.ugc.aweme.fe.method.BdturingMethod;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.fe.method.CloseMethod;
import com.ss.android.ugc.aweme.fe.method.ClosePopUpWebPageMethod;
import com.ss.android.ugc.aweme.fe.method.DarkModeMethod;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod;
import com.ss.android.ugc.aweme.fe.method.GetContainerIdMethod;
import com.ss.android.ugc.aweme.fe.method.GetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.GetSettingsMethod;
import com.ss.android.ugc.aweme.fe.method.GetWebViewInfo;
import com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.HasFeedbackMethod;
import com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod;
import com.ss.android.ugc.aweme.fe.method.LaunchChatMethod;
import com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod;
import com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod;
import com.ss.android.ugc.aweme.fe.method.LoadGeckoResourcesMethod;
import com.ss.android.ugc.aweme.fe.method.LoginMethod;
import com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod;
import com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod;
import com.ss.android.ugc.aweme.fe.method.OpenAdLandPageLinksMethod;
import com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod;
import com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod;
import com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod;
import com.ss.android.ugc.aweme.fe.method.OpenConversationMethod;
import com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod;
import com.ss.android.ugc.aweme.fe.method.OpenPDFMethod;
import com.ss.android.ugc.aweme.fe.method.OpenRechargePanel;
import com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod;
import com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod;
import com.ss.android.ugc.aweme.fe.method.PushOperationMethod;
import com.ss.android.ugc.aweme.fe.method.RoutePopMethod;
import com.ss.android.ugc.aweme.fe.method.RoutePushMethod;
import com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogV3Method;
import com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod;
import com.ss.android.ugc.aweme.fe.method.ShareMethod;
import com.ss.android.ugc.aweme.fe.method.ShowToastMethod;
import com.ss.android.ugc.aweme.fe.method.UserInfoMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod;
import com.ss.android.ugc.aweme.fe.method.incentive.AppsFlyerAttributionMethod;
import com.ss.android.ugc.aweme.fe.method.incentive.CheckCalendarExistMethod;
import com.ss.android.ugc.aweme.fe.method.incentive.CreateCalendarEventMethod;
import com.ss.android.ugc.aweme.fe.method.incentive.SpecActFollowMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.jsb.LiveMethod;
import com.ss.android.ugc.aweme.service.IPitayaOfflineService;
import com.ss.android.ugc.aweme.services.RnAndH5Service;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod;
import com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod;
import com.ss.android.ugc.aweme.web.jsbridge.EditPageMethod;
import com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod;
import com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CrossPlatformJsbProxy implements ICrossPlatformJsbProxy {
    public static ICrossPlatformJsbProxy LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICrossPlatformJsbProxy.class, false);
        if (LIZ != null) {
            return (ICrossPlatformJsbProxy) LIZ;
        }
        if (C58096Mr6.d8 == null) {
            synchronized (ICrossPlatformJsbProxy.class) {
                if (C58096Mr6.d8 == null) {
                    C58096Mr6.d8 = new CrossPlatformJsbProxy();
                }
            }
        }
        return C58096Mr6.d8;
    }

    @Override // com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy
    public final Map LIZIZ(Context context, C60737Nsb c60737Nsb) {
        C38049EwX c38049EwX;
        Map LJJJLIIL;
        C38150EyA c38150EyA = (C38150EyA) c60737Nsb.LIZIZ(C38150EyA.class);
        C38150EyA c38150EyA2 = (C38150EyA) c60737Nsb.LIZIZ(C38150EyA.class);
        if (c38150EyA2 != null) {
            c38049EwX = c38150EyA2.LJ;
        } else {
            c38049EwX = null;
        }
        F0E f0e = (F0E) c60737Nsb.LIZIZ(F0E.class);
        InterfaceC40275FrL interfaceC40275FrL = (InterfaceC40275FrL) c60737Nsb.LIZIZ(InterfaceC40275FrL.class);
        InterfaceC38277F0n interfaceC38277F0n = (InterfaceC38277F0n) c60737Nsb.LIZIZ(InterfaceC38277F0n.class);
        F1G f1g = (F1G) c60737Nsb.LIZIZ(F1G.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c38150EyA != null && c38049EwX != null && interfaceC40275FrL != null && interfaceC38277F0n != null && f1g != null) {
            C40266FrC.LJFF(c60737Nsb, c38150EyA, context, new C38037EwL(c60737Nsb), new F1X(linkedHashMap, c38049EwX));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C55374LoI c55374LoI = C55374LoI.LIZIZ;
            linkedHashMap2.put(c55374LoI.LJFF(), c55374LoI.LJI());
            linkedHashMap.putAll(linkedHashMap2);
            linkedHashMap.putAll(C40266FrC.LIZLLL(c38150EyA, f0e, context, interfaceC38277F0n));
            linkedHashMap.putAll(C40266FrC.LIZJ(c38150EyA, context, interfaceC40275FrL, f1g));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            OpenConversationMethod openConversationMethod = new OpenConversationMethod(c38150EyA.LJ);
            openConversationMethod.attach(new WeakReference<>(context));
            o.LJIIIIZZ(openConversationMethod, "OpenConversationMethod(d…ce(context)\n            )");
            linkedHashMap3.put("openConversation", openConversationMethod);
            linkedHashMap.putAll(linkedHashMap3);
            linkedHashMap.putAll(C40266FrC.LIZIZ(c38150EyA, context));
            linkedHashMap.putAll(C40266FrC.LIZ(c38150EyA, context));
            C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if (LJJIJIL != null) {
                Map<String, InterfaceC38012Evw> liveWalletJSB = LJJIJIL.getLiveWalletJSB(new WeakReference<>(context), c38150EyA.LJ);
                o.LJIIIIZZ(liveWalletJSB, "live as ILiveService).ge…sBridge\n                )");
                linkedHashMap4.putAll(liveWalletJSB);
            }
            linkedHashMap.putAll(linkedHashMap4);
            RnAndH5Service LJIIJJI = HG3.LJIIJJI();
            WeakReference<Context> weakReference = new WeakReference<>(context);
            C38049EwX c38049EwX2 = c38150EyA.LJ;
            o.LJI(c38049EwX2);
            Map<String, InterfaceC38012Evw> javaMethods = LJIIJJI.getJavaMethods(weakReference, c38049EwX2);
            if (javaMethods == null) {
                javaMethods = C113554cx.LJJJLIIL();
            }
            linkedHashMap.putAll(javaMethods);
            linkedHashMap.putAll(C40266FrC.LJ(c38150EyA, context, f0e));
            IPitayaOfflineService iPitayaOfflineService = (IPitayaOfflineService) ServiceManager.get().getService(IPitayaOfflineService.class);
            if (iPitayaOfflineService == null || (LJJJLIIL = iPitayaOfflineService.LIZIZ()) == null) {
                LJJJLIIL = C113554cx.LJJJLIIL();
            }
            linkedHashMap.putAll(LJJJLIIL);
            linkedHashMap.putAll(Z9N.LIZIZ.LIZ.getJSMethods(c38150EyA, new WeakReference<>(context)));
            Map<String, InterfaceC38012Evw> LIZIZ = ECommerceHybridServiceImpl.LJIIIIZZ().LIZIZ(c38150EyA, new WeakReference<>(context));
            if (LIZIZ == null) {
                LIZIZ = C113554cx.LJJJLIIL();
            }
            linkedHashMap.putAll(LIZIZ);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy
    public final Object LIZ(Context context, C60737Nsb hybridContext, String name) {
        C38049EwX c38049EwX;
        T t;
        o.LJIIIZ(hybridContext, "hybridContext");
        o.LJIIIZ(name, "name");
        InterfaceC38012Evw interfaceC38012Evw = null;
        if (!(hybridContext instanceof SparkContext)) {
            return null;
        }
        SparkContext sparkContext = (SparkContext) hybridContext;
        C38150EyA c38150EyA = (C38150EyA) sparkContext.LIZIZ(C38150EyA.class);
        if (c38150EyA != null) {
            c38049EwX = c38150EyA.LJ;
        } else {
            c38049EwX = null;
        }
        F0E f0e = (F0E) sparkContext.LIZIZ(F0E.class);
        InterfaceC40275FrL interfaceC40275FrL = (InterfaceC40275FrL) sparkContext.LIZIZ(InterfaceC40275FrL.class);
        InterfaceC38277F0n interfaceC38277F0n = (InterfaceC38277F0n) sparkContext.LIZIZ(InterfaceC38277F0n.class);
        F1G f1g = (F1G) sparkContext.LIZIZ(F1G.class);
        C68322mC c68322mC = new C68322mC();
        WeakReference<Context> weakReference = new WeakReference<>(context);
        JsAppDownloadMethod jsAppDownloadMethod = new JsAppDownloadMethod(c38049EwX);
        jsAppDownloadMethod.attach(weakReference);
        if (c38150EyA != null && c38049EwX != null && interfaceC40275FrL != null && interfaceC38277F0n != null && f1g != null) {
            if (C86291Xtn.LJIIL == null || !F2E.LIZ.get()) {
                C86290Xtm.LIZ();
                F2E.LIZ();
                C37936Eui.LJII.put("cross_platform_x_bridge_register", "true");
            }
            EnumC37847EtH enumC37847EtH = EnumC37847EtH.ALL;
            Class LIZ = C37848EtI.LIZ(enumC37847EtH, name, "DEFAULT");
            if (LIZ != null || (LIZ = C37848EtI.LIZ(enumC37847EtH, name, "Spark")) != null) {
                C38036EwK c38036EwK = new C38036EwK(sparkContext);
                F1Y f1y = new F1Y(c68322mC, c38049EwX);
                C31926Cfy c31926Cfy = new C31926Cfy();
                c31926Cfy.LIZJ(C38049EwX.class, c38150EyA.LJ);
                c31926Cfy.LIZJ(Context.class, context);
                c31926Cfy.LIZIZ(InterfaceC40311Frv.class, new C31924Cfw(c38036EwK));
                c31926Cfy.LIZIZ(InterfaceC37790EsM.class, new C31924Cfw(new C40272FrI(sparkContext)));
                sparkContext.LJII(C31926Cfy.class, c31926Cfy);
                C31889CfN c31889CfN = new C31889CfN();
                c31889CfN.LIZ(name, new C37852EtM(c31926Cfy, LIZ));
                F15 f15 = (F15) C37848EtI.LIZJ(F15.class);
                if (f15 != null) {
                    f15.LIZJ(f1y, c31889CfN);
                }
                return c68322mC.element;
            }
            C55374LoI c55374LoI = C55374LoI.LIZIZ;
            if (o.LJ(name, c55374LoI.LJFF())) {
                t = c55374LoI.LJI();
            } else if (o.LJ(name, "sendLog")) {
                SendLogMethod sendLogMethod = new SendLogMethod(c38049EwX, interfaceC38277F0n);
                sendLogMethod.attach(weakReference);
                t = sendLogMethod;
            } else if (o.LJ(name, "close")) {
                CloseMethod closeMethod = new CloseMethod(c38049EwX);
                closeMethod.attach(weakReference);
                t = closeMethod;
            } else if (o.LJ(name, "userInfo")) {
                UserInfoMethod userInfoMethod = new UserInfoMethod(c38049EwX);
                userInfoMethod.attach(weakReference);
                t = userInfoMethod;
            } else if (o.LJ(name, "darkMode")) {
                DarkModeMethod darkModeMethod = new DarkModeMethod(c38049EwX);
                darkModeMethod.attach(weakReference);
                t = darkModeMethod;
            } else if (o.LJ(name, "sendLogV3")) {
                SendLogV3Method sendLogV3Method = new SendLogV3Method(c38049EwX);
                sendLogV3Method.attach(weakReference);
                t = sendLogV3Method;
            } else if (o.LJ(name, "openSchema")) {
                OpenSchemaMethod openSchemaMethod = new OpenSchemaMethod(c38049EwX);
                openSchemaMethod.attach(weakReference);
                t = openSchemaMethod;
            } else if (o.LJ(name, "x.openPDF")) {
                OpenPDFMethod openPDFMethod = new OpenPDFMethod(c38049EwX);
                openPDFMethod.attach(weakReference);
                t = openPDFMethod;
            } else {
                ShareH5Service.LIZ.getClass();
                C58149Mrx.LIZ().LJII();
                if (o.LJ(name, "share")) {
                    ShareMethod LJIJI = C58149Mrx.LIZ().LJIJI(c38049EwX);
                    LJIJI.attach(weakReference);
                    t = LJIJI;
                } else {
                    C58149Mrx.LIZ().LJIILLIIL();
                    if (o.LJ(name, "shareLiveEvent")) {
                        ShareLiveEventMethod LJIIZILJ = C58149Mrx.LIZ().LJIIZILJ(c38049EwX);
                        LJIIZILJ.attach(weakReference);
                        t = LJIIZILJ;
                    } else {
                        C58149Mrx.LIZ().LJFF();
                        if (o.LJ(name, "pushOperation")) {
                            PushOperationMethod LJJII = C58149Mrx.LIZ().LJJII(c38049EwX);
                            LJJII.attach(weakReference);
                            t = LJJII;
                        } else if (o.LJ(name, "showToast")) {
                            ShowToastMethod showToastMethod = new ShowToastMethod(c38049EwX);
                            showToastMethod.attach(weakReference);
                            t = showToastMethod;
                        } else if (o.LJ(name, "openBrowser")) {
                            OpenBrowserMethod openBrowserMethod = new OpenBrowserMethod(c38049EwX);
                            openBrowserMethod.attach(weakReference);
                            t = openBrowserMethod;
                        } else if (o.LJ(name, "appInfo")) {
                            AppInfoMethod appInfoMethod = new AppInfoMethod(c38049EwX);
                            appInfoMethod.attach(weakReference);
                            t = appInfoMethod;
                        } else if (o.LJ(name, "routePush")) {
                            RoutePushMethod routePushMethod = new RoutePushMethod(c38049EwX);
                            routePushMethod.attach(f0e);
                            t = routePushMethod;
                        } else if (o.LJ(name, "open_short_video")) {
                            OpenShortVideoMethod openShortVideoMethod = new OpenShortVideoMethod(c38049EwX);
                            openShortVideoMethod.attach(weakReference);
                            t = openShortVideoMethod;
                        } else if (o.LJ(name, "openFeedsFlow")) {
                            OpenFeedsFlowMethod openFeedsFlowMethod = new OpenFeedsFlowMethod(c38049EwX);
                            openFeedsFlowMethod.attach(weakReference);
                            t = openFeedsFlowMethod;
                        } else if (o.LJ(name, "openAwemeDetail")) {
                            OpenAwemeDetailMethod openAwemeDetailMethod = new OpenAwemeDetailMethod(c38049EwX);
                            openAwemeDetailMethod.attach(weakReference);
                            t = openAwemeDetailMethod;
                        } else if (o.LJ(name, "loadFeeds")) {
                            LoadFeedsMethod loadFeedsMethod = new LoadFeedsMethod(c38049EwX);
                            loadFeedsMethod.attach(weakReference);
                            t = loadFeedsMethod;
                        } else if (o.LJ(name, "loadFeedsFlow")) {
                            LoadFeedsFlowMethod loadFeedsFlowMethod = new LoadFeedsFlowMethod(c38049EwX);
                            loadFeedsFlowMethod.attach(weakReference);
                            t = loadFeedsFlowMethod;
                        } else if (o.LJ(name, "downloadMedia")) {
                            DownloadFileMethod downloadFileMethod = new DownloadFileMethod(c38049EwX);
                            downloadFileMethod.attach(weakReference);
                            t = downloadFileMethod;
                        } else if (o.LJ(name, "routePop")) {
                            RoutePopMethod routePopMethod = new RoutePopMethod(c38049EwX);
                            routePopMethod.attach(f0e);
                            t = routePopMethod;
                        } else if (o.LJ(name, "getContainerId")) {
                            GetContainerIdMethod getContainerIdMethod = new GetContainerIdMethod(c38049EwX);
                            getContainerIdMethod.attach(f0e);
                            t = getContainerIdMethod;
                        } else if (o.LJ(name, "openAdLandPageLinks")) {
                            OpenAdLandPageLinksMethod openAdLandPageLinksMethod = new OpenAdLandPageLinksMethod(c38049EwX);
                            openAdLandPageLinksMethod.attach(f0e);
                            t = openAdLandPageLinksMethod;
                        } else if (o.LJ(name, "closePopUpWebPage")) {
                            ClosePopUpWebPageMethod closePopUpWebPageMethod = new ClosePopUpWebPageMethod(c38049EwX);
                            closePopUpWebPageMethod.attach(f0e);
                            t = closePopUpWebPageMethod;
                        } else if (o.LJ(name, "loadGeckoResources")) {
                            LoadGeckoResourcesMethod loadGeckoResourcesMethod = new LoadGeckoResourcesMethod(c38049EwX);
                            loadGeckoResourcesMethod.attach(f0e);
                            t = loadGeckoResourcesMethod;
                        } else if (o.LJ(name, "calendarOperation")) {
                            OpenCalendarMethod openCalendarMethod = new OpenCalendarMethod(c38049EwX);
                            openCalendarMethod.attach(weakReference);
                            t = openCalendarMethod;
                        } else if (o.LJ(name, "popTuringVerifyView")) {
                            BdturingMethod bdturingMethod = new BdturingMethod(c38049EwX);
                            bdturingMethod.attach(weakReference);
                            t = bdturingMethod;
                        } else if (o.LJ(name, "isAppInstalled")) {
                            t = new F71(weakReference);
                        } else if (o.LJ(name, "copyToClipboard")) {
                            t = new C38274F0k();
                        } else if (o.LJ(name, "login")) {
                            LoginMethod loginMethod = new LoginMethod(c38049EwX, false);
                            loginMethod.attach(weakReference);
                            t = loginMethod;
                        } else if (o.LJ(name, "loginWithPlatform")) {
                            LoginMethod loginMethod2 = new LoginMethod(c38049EwX, true);
                            loginMethod2.attach(weakReference);
                            t = loginMethod2;
                        } else if (o.LJ(name, "apiParam")) {
                            t = new EZ7();
                        } else if (o.LJ(name, "openAweme")) {
                            t = new C38292F1c(weakReference, c38049EwX);
                        } else if (o.LJ(name, "openRecord")) {
                            t = new C38285F0v(weakReference);
                        } else if (o.LJ(name, "enterUserFeed")) {
                            EnterUserPostFeedsMethod enterUserPostFeedsMethod = new EnterUserPostFeedsMethod(c38049EwX);
                            enterUserPostFeedsMethod.attach(weakReference);
                            t = enterUserPostFeedsMethod;
                        } else if (o.LJ(name, "noticePermission")) {
                            NoticePermissionMethod noticePermissionMethod = new NoticePermissionMethod(c38049EwX);
                            noticePermissionMethod.attach(weakReference);
                            t = noticePermissionMethod;
                        } else if (o.LJ(name, "openSysDialog")) {
                            t = new C77868UhE(weakReference, c38049EwX);
                        } else if (o.LJ(name, "uploadFile")) {
                            t = new H5UploadFileMethod(weakReference, c38049EwX);
                        } else {
                            t = jsAppDownloadMethod;
                            if (!o.LJ(name, "subscribe_app_ad")) {
                                t = jsAppDownloadMethod;
                                if (!o.LJ(name, "unsubscribe_app_ad")) {
                                    t = jsAppDownloadMethod;
                                    if (!o.LJ(name, "cancel_download_app_ad")) {
                                        t = jsAppDownloadMethod;
                                        if (!o.LJ(name, "download_order")) {
                                            t = jsAppDownloadMethod;
                                            if (!o.LJ(name, "ad_download_list")) {
                                                t = jsAppDownloadMethod;
                                                if (!o.LJ(name, "get_download_pause_task")) {
                                                    t = jsAppDownloadMethod;
                                                    if (!o.LJ(name, "get_downloading_task")) {
                                                        t = jsAppDownloadMethod;
                                                        if (!o.LJ(name, "get_install_status")) {
                                                            if (o.LJ(name, "accountLogout")) {
                                                                t = new C40267FrD();
                                                            } else if (o.LJ(name, "launchChat")) {
                                                                LaunchChatMethod launchChatMethod = new LaunchChatMethod();
                                                                launchChatMethod.attach(weakReference);
                                                                t = launchChatMethod;
                                                            } else if (o.LJ(name, "getThirdLoginToken")) {
                                                                OpenThirdLoginVerifyMethod openThirdLoginVerifyMethod = new OpenThirdLoginVerifyMethod(c38049EwX);
                                                                openThirdLoginVerifyMethod.attach(weakReference);
                                                                t = openThirdLoginVerifyMethod;
                                                            } else if (o.LJ(name, "scan")) {
                                                                t = new C38962FQw(weakReference);
                                                            } else if (o.LJ(name, "broadcast")) {
                                                                BroadcastMethod broadcastMethod = new BroadcastMethod(c38049EwX);
                                                                broadcastMethod.attach(weakReference);
                                                                t = broadcastMethod;
                                                            } else if (o.LJ(name, "openLiveRoom")) {
                                                                t = new LiveMethod(weakReference, c38049EwX);
                                                            } else if (o.LJ(name, "setNativeItem")) {
                                                                t = new SetNativeItemMethod(c38049EwX);
                                                            } else if (o.LJ(name, "getNativeItem")) {
                                                                t = new GetNativeItemMethod(c38049EwX);
                                                            } else if (o.LJ(name, "getABTestParams")) {
                                                                t = new GetABTest(c38150EyA.LIZ, c38049EwX);
                                                            } else if (o.LJ(name, "getSettings")) {
                                                                t = new GetSettingsMethod(c38049EwX);
                                                            } else if (o.LJ(name, "captureWebView")) {
                                                                t = new R55(weakReference, c38049EwX);
                                                            } else if (o.LJ(name, "isAppInstall")) {
                                                                t = new IsAppInstalledMethod(c38049EwX);
                                                            } else if (o.LJ(name, "appSetting")) {
                                                                t = new C40259Fr5(c38049EwX);
                                                            } else if (o.LJ(name, "closeKrCopyright")) {
                                                                t = new C40269FrF();
                                                            } else if (o.LJ(name, "uploadALog")) {
                                                                t = new FeedbackUploadALog(c38049EwX);
                                                            } else if (o.LJ(name, "monitorLog")) {
                                                                t = new MonitorLogMethod();
                                                            } else if (o.LJ(name, "fileSelection")) {
                                                                t = new C86266XtO(weakReference, c38049EwX);
                                                            } else if (o.LJ(name, "onBackPressed")) {
                                                                OnBackPressedMethod onBackPressedMethod = new OnBackPressedMethod(c38049EwX);
                                                                onBackPressedMethod.attach(weakReference);
                                                                t = onBackPressedMethod;
                                                            } else if (o.LJ(name, "choosePhoneArea")) {
                                                                OpenPhoneAreaMethod openPhoneAreaMethod = new OpenPhoneAreaMethod(c38049EwX);
                                                                openPhoneAreaMethod.attach(weakReference);
                                                                t = openPhoneAreaMethod;
                                                            } else if (o.LJ(name, "syncSpecActFollowStatus")) {
                                                                SpecActFollowMethod specActFollowMethod = new SpecActFollowMethod(c38049EwX);
                                                                specActFollowMethod.attach(weakReference);
                                                                t = specActFollowMethod;
                                                            } else if (o.LJ(name, "hasFeedback")) {
                                                                HasFeedbackMethod hasFeedbackMethod = new HasFeedbackMethod(c38049EwX);
                                                                hasFeedbackMethod.attach(weakReference);
                                                                t = hasFeedbackMethod;
                                                            } else if (o.LJ(name, "appsflyer_attribution")) {
                                                                AppsFlyerAttributionMethod appsFlyerAttributionMethod = new AppsFlyerAttributionMethod(c38049EwX);
                                                                appsFlyerAttributionMethod.attach(weakReference);
                                                                t = appsFlyerAttributionMethod;
                                                            } else if (o.LJ(name, "createCalendarEvent")) {
                                                                CreateCalendarEventMethod createCalendarEventMethod = new CreateCalendarEventMethod(c38049EwX);
                                                                createCalendarEventMethod.attach(weakReference);
                                                                t = createCalendarEventMethod;
                                                            } else if (o.LJ(name, "isCalendarEventExist")) {
                                                                CheckCalendarExistMethod checkCalendarExistMethod = new CheckCalendarExistMethod(c38049EwX);
                                                                checkCalendarExistMethod.attach(weakReference);
                                                                t = checkCalendarExistMethod;
                                                            } else if (o.LJ(name, "sendAnalyticsEvent")) {
                                                                SendAnalyticsEventMethod sendAnalyticsEventMethod = new SendAnalyticsEventMethod(c38049EwX);
                                                                sendAnalyticsEventMethod.attach(weakReference);
                                                                t = sendAnalyticsEventMethod;
                                                            } else if (o.LJ(name, "openVideoEdit")) {
                                                                EditPageMethod editPageMethod = new EditPageMethod(c38049EwX);
                                                                editPageMethod.attach(weakReference);
                                                                t = editPageMethod;
                                                            } else if (o.LJ(name, "fetch")) {
                                                                t = new F1N(c38049EwX, f1g);
                                                            } else if (o.LJ(name, "setTitle")) {
                                                                RefreshNavTitleMethod refreshNavTitleMethod = new RefreshNavTitleMethod(interfaceC40275FrL);
                                                                refreshNavTitleMethod.attach(weakReference);
                                                                t = refreshNavTitleMethod;
                                                            } else if (o.LJ(name, "openConversation")) {
                                                                OpenConversationMethod openConversationMethod = new OpenConversationMethod(c38150EyA.LJ);
                                                                openConversationMethod.attach(weakReference);
                                                                t = openConversationMethod;
                                                            } else if (o.LJ(name, "download_click")) {
                                                                C40496Fuu c40496Fuu = new C40496Fuu(weakReference);
                                                                c40496Fuu.LIZ(c38150EyA);
                                                                t = c40496Fuu;
                                                            } else if (o.LJ(name, "sendThirdTrack")) {
                                                                t = new AdThirdTrackMethod(c38049EwX);
                                                            } else if (o.LJ(name, "getWebViewInfo")) {
                                                                t = new GetWebViewInfo(c38049EwX);
                                                            } else if (o.LJ(name, "openRechargePanel")) {
                                                                OpenRechargePanel openRechargePanel = new OpenRechargePanel(c38049EwX);
                                                                openRechargePanel.attach(weakReference);
                                                                t = openRechargePanel;
                                                            } else if (o.LJ(name, "openLightLandingPage")) {
                                                                t = new C40289FrZ(c38049EwX);
                                                            } else if (o.LJ(name, "closeLightLandingPage")) {
                                                                t = new C40289FrZ(c38049EwX);
                                                            } else if (o.LJ(name, "sendAdLog")) {
                                                                t = new AdCommonJsMethod(c38150EyA, weakReference);
                                                            } else {
                                                                if (o.LJ(name, "getPurchaseItemList")) {
                                                                    if (context != null) {
                                                                        interfaceC38012Evw = new C77577UcX(context, c38049EwX);
                                                                    }
                                                                } else if (o.LJ(name, "charge")) {
                                                                    if (context != null) {
                                                                        interfaceC38012Evw = new ChargeMethodNew(context, c38049EwX);
                                                                    }
                                                                } else if (o.LJ(name, "openGBLOCRpage")) {
                                                                    if (context != null) {
                                                                        interfaceC38012Evw = new C77593Ucn(context, c38049EwX);
                                                                    }
                                                                } else if (o.LJ(name, "jumpOpenAuthPage")) {
                                                                    OpenAuthPageMethod openAuthPageMethod = new OpenAuthPageMethod(c38049EwX);
                                                                    openAuthPageMethod.attach(f0e);
                                                                    openAuthPageMethod.attach(weakReference);
                                                                    t = openAuthPageMethod;
                                                                } else if (o.LJ(name, "shareOpenPlatform")) {
                                                                    ShareOpenPlatformMethod shareOpenPlatformMethod = new ShareOpenPlatformMethod(c38049EwX);
                                                                    shareOpenPlatformMethod.attach(f0e);
                                                                    shareOpenPlatformMethod.attach(weakReference);
                                                                    t = shareOpenPlatformMethod;
                                                                } else {
                                                                    BaseCommonJavaMethod LIZJ = ECommerceLiveBridgeMethodServiceImpl.LJ().LIZJ(c38150EyA, weakReference, name);
                                                                    t = LIZJ;
                                                                    if (LIZJ == null) {
                                                                        InterfaceC38012Evw javaMethodByName = HG3.LJIIJJI().getJavaMethodByName(weakReference, c38049EwX, name);
                                                                        t = javaMethodByName;
                                                                        if (javaMethodByName == null) {
                                                                            IPitayaOfflineService iPitayaOfflineService = (IPitayaOfflineService) ServiceManager.get().getService(IPitayaOfflineService.class);
                                                                            if (iPitayaOfflineService == null || (interfaceC38012Evw = iPitayaOfflineService.LIZ()) == null) {
                                                                                InterfaceC38012Evw jSMethodByName = Z9N.LIZIZ.getJSMethodByName(c38150EyA, weakReference, name);
                                                                                t = jSMethodByName;
                                                                                if (jSMethodByName == null) {
                                                                                    t = ECommerceHybridServiceImpl.LJIIIIZZ().LJII(c38150EyA, weakReference, name);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                t = interfaceC38012Evw;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c68322mC.element = t;
        }
        return c68322mC.element;
    }
}
