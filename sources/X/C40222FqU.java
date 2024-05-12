package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
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
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetScrollTopMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.ss.android.ugc.aweme.bullet.module.p002default.BridgeProxy;
import com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.anchor.GetContainerDataMethod;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.jsb.LiveMethod;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.FqU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40222FqU {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(F3T providerFactory) {
        String str;
        int i;
        C61878OQg c61878OQg;
        F21 LLLLLLJ;
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C47261Igj.LJJIJIIJI(new FetchMethod(providerFactory), new RequestMethod(providerFactory), new GetNativeItemMethod(providerFactory), new SetNativeItemMethod(providerFactory), new GetSettingsMethod(providerFactory), new BroadcastMethod(providerFactory), new IBEPreRenderReadyMethod(providerFactory), new IBEGetViewSizeMethod(providerFactory), new IBEDidFinishInteractionMethod(providerFactory), new IBEDidStartInteractionMethod(providerFactory), new InitPIPOSdkMethod(providerFactory), new SetScrollTopMethod(providerFactory), new OpenBrowserMethod(providerFactory), new UploadFileMethod(providerFactory), new OpenScanMethod(providerFactory), new FileSelectionMethod(providerFactory), new IsAppInstalledMethod(providerFactory), new NoticePermissionMethod(providerFactory), new LoginMethod(providerFactory), new LoginWithPlatform(providerFactory), new LogoutMethod(providerFactory), new OpenPhoneAreaMethod(providerFactory), new OpenRechargePanel(providerFactory), new GetAbTestMethod(providerFactory), new CopyContentMethod(providerFactory), new GetThemeMethod(providerFactory), new OpenAdPanelPageMethod(providerFactory), new OpenCalendarMethod(providerFactory), new BdturingMethod(providerFactory), new LaunchChatMethod(providerFactory), new AppInstalledMethod(providerFactory)));
        C86290Xtm.LIZ();
        F2E.LIZ();
        C31926Cfy c31926Cfy = new C31926Cfy();
        c31926Cfy.LIZJ(Context.class, providerFactory.LIZJ(Context.class));
        c31926Cfy.LIZJ(F3T.class, providerFactory);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(C37782EsE.LIZ(c31926Cfy, providerFactory, C47261Igj.LJJIJIIJI(new F0X(), new F0W()), "DEFAULT"));
        if (providerFactory.LIZIZ != null) {
            arrayList2.addAll(C37782EsE.LIZ(c31926Cfy, providerFactory, C47261Igj.LJJIJIIJI(new F0X(), new F0W()), "Spark"));
        }
        arrayList.addAll(arrayList2);
        Context context = (Context) providerFactory.LIZJ(Context.class);
        View view = (View) providerFactory.LIZJ(View.class);
        InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) providerFactory.LIZJ(InterfaceC40516FvE.class);
        if (interfaceC40516FvE != null && (LLLLLLJ = interfaceC40516FvE.LLLLLLJ()) != null) {
            str = LLLLLLJ.LJLIL;
        } else {
            str = null;
        }
        C37922EuU LIZ2 = C37927EuZ.LIZ(new C37928Eua(context, view, str, new C78949Uyf()));
        java.util.Map<String, Class<? extends InterfaceC37666EqM>> LIZ3 = C37831Et1.LIZ(EnumC37844EtE.ALL, "DEFAULT");
        if (LIZ3 != null) {
            ArrayList arrayList3 = new ArrayList(LIZ3.size());
            Iterator<Map.Entry<String, Class<? extends InterfaceC37666EqM>>> it = LIZ3.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC37666EqM newInstance = it.next().getValue().newInstance();
                newInstance.LIZJ(LIZ2);
                arrayList3.add(C37781EsD.LIZ(null, null, providerFactory, null, newInstance, 8));
            }
            i = 24;
            c61878OQg = arrayList3;
        } else {
            i = 24;
            c61878OQg = C61878OQg.INSTANCE;
        }
        arrayList.addAll(c61878OQg);
        BridgeProxy[] bridgeProxyArr = new BridgeProxy[i];
        bridgeProxyArr[0] = new BridgeProxy("close", providerFactory, C40230Fqc.LJLIL);
        bridgeProxyArr[1] = new BridgeProxy("userInfo", providerFactory, C40235Fqh.LJLIL);
        bridgeProxyArr[2] = new BridgeProxy("sendLog", providerFactory, C40236Fqi.LJLIL);
        bridgeProxyArr[3] = new BridgeProxy("sendLogV3", providerFactory, C37785EsH.LJLIL);
        bridgeProxyArr[4] = new BridgeProxy("monitorLog", providerFactory, C40237Fqj.LJLIL);
        bridgeProxyArr[5] = new BridgeProxy("openSchema", providerFactory, C39474FeQ.LJLIL);
        bridgeProxyArr[6] = new BridgeProxy("share", providerFactory, C40223FqV.LJLIL);
        bridgeProxyArr[7] = new BridgeProxy("shareSearch", providerFactory, C40224FqW.LJLIL);
        bridgeProxyArr[8] = new BridgeProxy("showToast", providerFactory, C40238Fqk.LJLIL);
        bridgeProxyArr[9] = new BridgeProxy("openBrowser", providerFactory, C39554Ffi.LJLIL);
        bridgeProxyArr[10] = new BridgeProxy("appInfo", providerFactory, C37783EsF.LJLIL);
        bridgeProxyArr[11] = new BridgeProxy("getAppInfo", providerFactory, C37784EsG.LJLIL);
        bridgeProxyArr[12] = new BridgeProxy("loadFeedsFlow", providerFactory, C37786EsI.LJLIL);
        bridgeProxyArr[13] = new BridgeProxy("openFeedsFlow", providerFactory, C40226FqY.LJLIL);
        bridgeProxyArr[14] = new BridgeProxy("openAwemeDetail", providerFactory, C40227FqZ.LJLIL);
        bridgeProxyArr[15] = new BridgeProxy("loadFeeds", providerFactory, C40228Fqa.LJLIL);
        bridgeProxyArr[16] = new BridgeProxy("darkMode", providerFactory, F3X.LJLIL);
        bridgeProxyArr[17] = new BridgeProxy("uniUserInfo", providerFactory, C40229Fqb.LJLIL);
        bridgeProxyArr[18] = new BridgeProxy("openRecord", providerFactory, C38283F0t.LJLIL);
        bridgeProxyArr[19] = new BridgeProxy("getContainerId", providerFactory, F0O.LJLIL);
        bridgeProxyArr[20] = new BridgeProxy("loadGeckoResources", providerFactory, C40231Fqd.LJLIL);
        bridgeProxyArr[21] = new BridgeProxy("shareOpenPlatform", providerFactory, C40232Fqe.LJLIL);
        bridgeProxyArr[22] = new BridgeProxy("jumpOpenAuthPage", providerFactory, C40233Fqf.LJLIL);
        bridgeProxyArr[23] = new BridgeProxy("openVideoEdit", providerFactory, C40234Fqg.LJLIL);
        arrayList.addAll(C47261Igj.LJJIJIIJI(bridgeProxyArr));
        C61878OQg c61878OQg2 = C61878OQg.INSTANCE;
        arrayList.addAll(c61878OQg2);
        List<InterfaceC38186Eyk> LJIL = a.LJIILL().LJIL(providerFactory);
        o.LJI(LJIL);
        arrayList.addAll(LJIL);
        List LJJII = MusicService.LJJLIIIJJI().LJJII();
        o.LJIIIIZZ(LJJII, "get().getService(IMusicS…leBridge(providerFactory)");
        arrayList.addAll(LJJII);
        arrayList.addAll(Z9N.LIZIZ.LLLLLLLZIL(providerFactory));
        arrayList.addAll(C47261Igj.LJJIJ(new AdInfoMethod(providerFactory)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new DownloadAppClickMethod(providerFactory));
        arrayList4.add(new GetContainerDataMethod(providerFactory));
        arrayList.addAll(arrayList4);
        arrayList.addAll(ECommerceLiveBridgeMethodServiceImpl.LJ().LIZ(providerFactory));
        arrayList.addAll(LIZLLL(providerFactory));
        arrayList.addAll(LIZIZ(providerFactory));
        arrayList.addAll(LIZJ(providerFactory));
        arrayList.addAll(C47261Igj.LJJIJIIJI(new SendAdLogMethod(providerFactory), new AdThirdTrackMethod(providerFactory)));
        arrayList.addAll(c61878OQg2);
        arrayList.addAll(ECommerceHybridServiceImpl.LJIIIIZZ().LIZ(providerFactory));
        arrayList.addAll(ShoppingAdsServiceImpl.LJIIIZ().LIZIZ(providerFactory));
        return arrayList;
    }

    public static List LIZIZ(F3T f3t) {
        java.util.Map<String, InterfaceC38012Evw> javaMethods;
        BulletMethodAdapter$javaMethodToBullet$1 LIZ2;
        ArrayList arrayList = new ArrayList();
        C38049EwX c38049EwX = (C38049EwX) f3t.LIZJ(C38049EwX.class);
        Object LIZJ = f3t.LIZJ(Context.class);
        if (c38049EwX != null && LIZJ != null && (javaMethods = HG3.LJIIJJI().getJavaMethods(new WeakReference<>(LIZJ), c38049EwX)) != null) {
            for (Map.Entry<String, InterfaceC38012Evw> entry : javaMethods.entrySet()) {
                if (!TextUtils.equals(entry.getKey(), "localPhoneNo")) {
                    String key = entry.getKey();
                    o.LJIIIIZZ(key, "entry.key");
                    InterfaceC38012Evw value = entry.getValue();
                    o.LJIIIIZZ(value, "entry.value");
                    LIZ2 = C40225FqX.LIZ(EnumC38014Evy.PRIVATE, f3t, value, key);
                    arrayList.add(LIZ2);
                }
            }
        }
        return arrayList;
    }

    public static List LIZJ(F3T f3t) {
        BulletMethodAdapter$javaMethodToBullet$1 LIZ2;
        ArrayList arrayList = new ArrayList();
        C38049EwX c38049EwX = (C38049EwX) f3t.LIZJ(C38049EwX.class);
        Object LIZJ = f3t.LIZJ(Context.class);
        if (c38049EwX != null && LIZJ != null) {
            ShareH5Service.LIZ.getClass();
            ShareH5Service LIZ3 = C58149Mrx.LIZ();
            LIZ3.LJIILLIIL();
            ShareLiveEventMethod LJIIZILJ = LIZ3.LJIIZILJ(c38049EwX);
            LJIIZILJ.attach(new WeakReference<>(LIZJ));
            o.LJIIIIZZ(LJIIZILJ, "getJsBridgeShareLiveEven…h(WeakReference(context))");
            LIZ2 = C40225FqX.LIZ(EnumC38014Evy.PRIVATE, f3t, LJIIZILJ, "shareLiveEvent");
            arrayList.add(LIZ2);
            new WeakReference(LIZJ);
            arrayList.add(C40225FqX.LIZ(EnumC38014Evy.PROTECT, f3t, new C38274F0k(), "copyToClipboard"));
        }
        return arrayList;
    }

    public static List LIZLLL(F3T f3t) {
        C86393XvR LJJIJIL;
        java.util.Map<String, InterfaceC38012Evw> liveWalletJSB;
        ArrayList arrayList = new ArrayList();
        C38049EwX c38049EwX = (C38049EwX) f3t.LIZJ(C38049EwX.class);
        Object LIZJ = f3t.LIZJ(Context.class);
        if (c38049EwX != null && LIZJ != null) {
            LiveMethod liveMethod = new LiveMethod(new WeakReference(LIZJ), c38049EwX);
            EnumC38014Evy enumC38014Evy = EnumC38014Evy.PROTECT;
            arrayList.add(C40225FqX.LIZ(enumC38014Evy, f3t, liveMethod, "openLiveRoom"));
            arrayList.add(C40225FqX.LIZ(enumC38014Evy, f3t, new C38292F1c(new WeakReference(LIZJ), c38049EwX), "openAweme"));
            arrayList.add(C40225FqX.LIZ(enumC38014Evy, f3t, new C38285F0v(new WeakReference(LIZJ)), "openRecord"));
            DownloadFileMethod downloadFileMethod = new DownloadFileMethod(c38049EwX);
            downloadFileMethod.attach(new WeakReference<>(LIZJ));
            arrayList.add(C40225FqX.LIZ(enumC38014Evy, f3t, downloadFileMethod, "downloadMedia"));
            new WeakReference(LIZJ);
            arrayList.add(C40225FqX.LIZ(enumC38014Evy, f3t, new C40259Fr5(c38049EwX), "appSetting"));
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (liveWalletJSB = LJJIJIL.getLiveWalletJSB(new WeakReference<>(LIZJ), c38049EwX)) != null) {
                for (Map.Entry<String, InterfaceC38012Evw> entry : liveWalletJSB.entrySet()) {
                    String key = entry.getKey();
                    o.LJIIIIZZ(key, "it.key");
                    InterfaceC38012Evw value = entry.getValue();
                    o.LJIIIIZZ(value, "it.value");
                    arrayList.add(C40225FqX.LIZ(EnumC38014Evy.PROTECT, f3t, value, key));
                }
            }
        }
        return arrayList;
    }
}
