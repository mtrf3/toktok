package com.ss.android.ugc.aweme.bullet;

import X.C113554cx;
import X.C37848EtI;
import X.C38285F0v;
import X.C40222FqU;
import X.C51029K0z;
import X.C58096Mr6;
import X.C58149Mrx;
import X.C86290Xtm;
import X.EnumC37847EtH;
import X.F2E;
import X.F3T;
import X.InterfaceC37774Es6;
import X.InterfaceC38186Eyk;
import X.OSZ;
import X.Z9N;
import com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.LoadGeckoResourcesMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel;
import com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.CopyContentMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEDidFinishInteractionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEDidStartInteractionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEGetViewSizeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEPreRenderReadyMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform;
import com.ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAdPanelPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetScrollTopMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.EditPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.GetContainerIdMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.anchor.GetContainerDataMethod;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class BulletHostProxy implements IBulletHostProxy {
    public static IBulletHostProxy LIZ() {
        Object LIZ = C58096Mr6.LIZ(IBulletHostProxy.class, false);
        if (LIZ != null) {
            return (IBulletHostProxy) LIZ;
        }
        if (C58096Mr6.LLJJJJ == null) {
            synchronized (IBulletHostProxy.class) {
                if (C58096Mr6.LLJJJJ == null) {
                    C58096Mr6.LLJJJJ = new BulletHostProxy();
                }
            }
        }
        return C58096Mr6.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final HashMap<Class<?>, HashMap<String, Class<?>>> LJI() {
        HashMap<Class<?>, HashMap<String, Class<?>>> hashMap = new HashMap<>();
        HashMap<String, Class<?>> hashMap2 = new HashMap<>();
        HashMap hashMap3 = new HashMap();
        EnumC37847EtH enumC37847EtH = EnumC37847EtH.ALL;
        Map LIZIZ = C37848EtI.LIZIZ(enumC37847EtH, "DEFAULT");
        if (LIZIZ != null) {
            hashMap3.putAll(LIZIZ);
        }
        Map LIZIZ2 = C37848EtI.LIZIZ(enumC37847EtH, "Spark");
        if (LIZIZ2 != null) {
            hashMap3.putAll(LIZIZ2);
        }
        hashMap2.putAll(hashMap3);
        hashMap.put(InterfaceC37774Es6.class, hashMap2);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final HashMap<Class<?>, HashMap<String, Class<?>>> LJII() {
        HashMap<Class<?>, HashMap<String, Class<?>>> hashMap = new HashMap<>();
        HashMap<String, Class<?>> hashMap2 = new HashMap<>();
        hashMap2.putAll(C113554cx.LJJL(new OSZ("fetch", FetchMethod.class), new OSZ("request", RequestMethod.class), new OSZ("getNativeItem", GetNativeItemMethod.class), new OSZ("setNativeItem", SetNativeItemMethod.class), new OSZ("getSettings", GetSettingsMethod.class), new OSZ("broadcast", BroadcastMethod.class), new OSZ("IBEPreRenderReady", IBEPreRenderReadyMethod.class), new OSZ("IBEGetViewSize", IBEGetViewSizeMethod.class), new OSZ("IBEDidFinishInteraction", IBEDidFinishInteractionMethod.class), new OSZ("IBEDidStartInteraction", IBEDidStartInteractionMethod.class), new OSZ("initPipo", InitPIPOSdkMethod.class), new OSZ("setScrollTop", SetScrollTopMethod.class), new OSZ("openBrowser", OpenBrowserMethod.class), new OSZ("uploadFile", UploadFileMethod.class), new OSZ("scan", OpenScanMethod.class), new OSZ("fileSelection", FileSelectionMethod.class), new OSZ("isAppInstall", IsAppInstalledMethod.class), new OSZ("noticePermission", NoticePermissionMethod.class), new OSZ("login", LoginMethod.class), new OSZ("loginWithPlatform", LoginWithPlatform.class), new OSZ("accountLogout", LogoutMethod.class), new OSZ("choosePhoneArea", OpenPhoneAreaMethod.class), new OSZ("openRechargePanel", OpenRechargePanel.class), new OSZ("getABTestParams", GetAbTestMethod.class), new OSZ("copyContent", CopyContentMethod.class), new OSZ("getTheme", GetThemeMethod.class), new OSZ("openAdPanelPage", OpenAdPanelPageMethod.class), new OSZ("calendarOperation", OpenCalendarMethod.class), new OSZ("popTuringVerifyView", BdturingMethod.class), new OSZ("launchChat", LaunchChatMethod.class), new OSZ("isAppInstalled", AppInstalledMethod.class)));
        Map<? extends String, ? extends Class<?>> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("close", CloseMethod.class), new OSZ("userInfo", UserInfoMethod.class), new OSZ("sendLog", SendLogMethod.class), new OSZ("sendLogV3", SendLogV3Method.class), new OSZ("monitorLog", MonitorLogMethod.class), new OSZ("openSchema", OpenSchemaMethod.class), new OSZ("showToast", ShowToastMethod.class), new OSZ("openBrowser", OpenBrowserMethod.class), new OSZ("appInfo", AppInfoMethod.class), new OSZ("getAppInfo", GetAppInfoMethod.class), new OSZ("loadFeedsFlow", LoadFeedsFlowMethod.class), new OSZ("openFeedsFlow", OpenFeedsFlowMethod.class), new OSZ("openAwemeDetail", OpenAwemeDetailMethod.class), new OSZ("loadFeeds", LoadFeedsMethod.class), new OSZ("darkMode", DarkModeMethod.class), new OSZ("uniUserInfo", BulletUserInfoMethod.class), new OSZ("uniAppInfo", BulletGetAppInfoMethod.class), new OSZ("openRecord", C38285F0v.class), new OSZ("getContainerId", GetContainerIdMethod.class), new OSZ("loadGeckoResources", LoadGeckoResourcesMethod.class), new OSZ("shareOpenPlatform", ShareOpenPlatformMethod.class), new OSZ("jumpOpenAuthPage", OpenAuthPageMethod.class), new OSZ("openVideoEdit", EditPageMethod.class));
        ShareH5Service.LIZ.getClass();
        LJJLIIIIJ.putAll(C58149Mrx.LIZ().LIZIZ());
        hashMap2.putAll(LJJLIIIIJ);
        hashMap2.putAll(C113554cx.LJJJLIIL());
        hashMap2.putAll(MusicService.LJJLIIIJJI().LJJLIIIJILLIZJL());
        hashMap2.putAll(Z9N.LIZIZ.LJIIIIZZ());
        hashMap2.putAll(C51029K0z.LJJIIZI(new OSZ("adInfo", AdInfoMethod.class)));
        hashMap2.putAll(C113554cx.LJJL(new OSZ("download_app_click", DownloadAppClickMethod.class), new OSZ("getContainerData", GetContainerDataMethod.class)));
        hashMap2.putAll(ECommerceLiveBridgeMethodServiceImpl.LJ().LIZLLL());
        hashMap2.putAll(C113554cx.LJJL(new OSZ("sendAdLog", SendAdLogMethod.class), new OSZ("sendThirdTrack", AdThirdTrackMethod.class)));
        hashMap2.putAll(C113554cx.LJJJLIIL());
        hashMap2.putAll(ECommerceService.createIECommerceServicebyMonsterPlugin(false).getJSMethodClass());
        hashMap2.putAll(ShoppingAdsServiceImpl.LJIIIZ().LIZJ());
        hashMap.put(InterfaceC38186Eyk.class, hashMap2);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final HashMap<Class<?>, HashMap<String, Class<?>>> LJIIIIZZ() {
        HashMap<Class<?>, HashMap<String, Class<?>>> hashMap = new HashMap<>();
        HashMap<String, Class<?>> hashMap2 = new HashMap<>();
        C86290Xtm.LIZ();
        F2E.LIZ();
        HashMap hashMap3 = new HashMap();
        EnumC37847EtH enumC37847EtH = EnumC37847EtH.ALL;
        Map LIZIZ = C37848EtI.LIZIZ(enumC37847EtH, "DEFAULT");
        if (LIZIZ != null) {
            hashMap3.putAll(LIZIZ);
        }
        Map LIZIZ2 = C37848EtI.LIZIZ(enumC37847EtH, "Spark");
        if (LIZIZ2 != null) {
            hashMap3.putAll(LIZIZ2);
        }
        hashMap2.putAll(hashMap3);
        hashMap.put(InterfaceC37774Es6.class, hashMap2);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJFF(java.lang.String r7) {
        /*
            r6 = this;
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            java.lang.String r0 = "ab_params"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            boolean r0 = X.V1B.LJL(r1)
            if (r0 == 0) goto L84
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r3 = android.net.Uri.decode(r1)
            java.lang.String r0 = "decode(abKeysStr)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            r0 = 1
            char[] r2 = new char[r0]
            r0 = 44
            r1 = 0
            r2[r1] = r0
            r0 = 6
            java.util.List r1 = ujb.s.LJLJJI(r3, r2, r1, r0)
            X.Ol8 r0 = X.C40239Fql.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            com.google.gson.m r4 = new com.google.gson.m     // Catch: java.lang.Throwable -> L86
            r4.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L86
        L43:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L86
            X.Efv r0 = X.C37019Efv.LIZIZ     // Catch: java.lang.Throwable -> L86
            r0.LIZIZ(r4, r1)     // Catch: java.lang.Throwable -> L86
            goto L43
        L55:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L86
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L86
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L64
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L64
            goto L8f
        L64:
            r0 = move-exception
            goto L88
        L66:
            X.Eg2 r0 = X.C37026Eg2.LIZ
            org.json.JSONObject r3 = r0.LIZIZ()
            java.util.Iterator r2 = r1.iterator()
        L70:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r3.opt(r1)
            r5.put(r1, r0)
            goto L70
        L84:
            r5 = 0
            goto Laf
        L86:
            r0 = move-exception
            r3 = r5
        L88:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L8f:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r2 == 0) goto Lae
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "get ab params with new strategy failed! reason: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ABTestHelper"
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(r0, r1)
        Lae:
            r5 = r3
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.BulletHostProxy.LJFF(java.lang.String):org.json.JSONObject");
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final List<InterfaceC38186Eyk> LJIIJ(F3T f3t) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C40222FqU.LIZLLL(f3t));
        arrayList.addAll(C40222FqU.LIZIZ(f3t));
        arrayList.addAll(C40222FqU.LIZJ(f3t));
        List<InterfaceC38186Eyk> LJIL = a.LJIILL().LJIL(f3t);
        o.LJI(LJIL);
        arrayList.addAll(LJIL);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final List<InterfaceC38186Eyk> createBridges(F3T contextFactory) {
        o.LJIIIZ(contextFactory, "contextFactory");
        return C40222FqU.LIZ(contextFactory);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        r0 = X.C40225FqX.LIZ(X.EnumC38014Evy.PRIVATE, r6, r0, r7);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x00b0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b9  */
    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC38186Eyk LJIIIZ(X.F3T r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.BulletHostProxy.LJIIIZ(X.F3T, java.lang.String):X.Eyk");
    }
}
