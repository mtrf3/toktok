package com.ss.android.ugc.aweme.live.livehostimpl;

import X.ActivityC45651qj;
import X.B4D;
import X.BMP;
import X.C12500eM;
import X.C158056If;
import X.C16880lQ;
import X.C26073ALd;
import X.C26074ALe;
import X.C26076ALg;
import X.C27740Aue;
import X.C28486BFy;
import X.C28838BTm;
import X.C29612Bjk;
import X.C2U8;
import X.C2YJ;
import X.C31855Cep;
import X.C38943FQd;
import X.C39061g6;
import X.C39960FmG;
import X.C39961FmH;
import X.C39966FmM;
import X.C40019FnD;
import X.C40691Fy3;
import X.C41402GMs;
import X.C46104I7o;
import X.C47130Iec;
import X.C57415Mg7;
import X.C59581NZx;
import X.C60230NkQ;
import X.C60342NmE;
import X.C60373Nmj;
import X.C60378Nmo;
import X.C60507Not;
import X.C60510Now;
import X.C60511Nox;
import X.C60519Np5;
import X.C60520Np6;
import X.C60524NpA;
import X.C60525NpB;
import X.C60544NpU;
import X.C61200O0e;
import X.C61227O1f;
import X.C61658OHu;
import X.C61845OOz;
import X.C73353Sqb;
import X.C73975T1n;
import X.C76800UCe;
import X.C76965UIn;
import X.C85990Xow;
import X.CN1;
import X.EF7;
import X.F0H;
import X.FQD;
import X.FQE;
import X.HG3;
import X.InterfaceC29613Bjl;
import X.InterfaceC60232NkS;
import X.InterfaceC60276NlA;
import X.InterfaceC60316Nlo;
import X.InterfaceC60324Nlw;
import X.InterfaceC60387Nmx;
import X.InterfaceC60521Np7;
import X.InterfaceC60523Np9;
import X.InterfaceC62969OnV;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.LQG;
import X.O1D;
import X.O1E;
import X.O3G;
import X.X1D;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSchemaForceUseDeepLinkSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.lynx.tasm.LynxEnv;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity;
import com.ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.ss.android.ugc.aweme.live.LiveBroadcastEndSafetyToolsActivity;
import com.ss.android.ugc.aweme.live.LiveCoverCameraActivity;
import com.ss.android.ugc.aweme.live.LiveDummyActivity;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.live.VoiceBroadcastActivity;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public class LiveHostAction implements IHostAction {
    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final String getBgBroadcastServiceName() {
        return "com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean hostInterceptSpark(String str) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C60524NpA.LIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void setCurrentPage(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final HandlerThread getHostHandlerThread() {
        HandlerThread handlerThread = C60525NpB.LIZ;
        if (handlerThread == null) {
            HandlerThread handlerThread2 = new HandlerThread("watch_live_timer");
            C60525NpB.LIZ = handlerThread2;
            handlerThread2.start();
            return C60525NpB.LIZ;
        }
        return handlerThread;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final List<Class> getLiveActivityClass() {
        return C76965UIn.LIZ(LivePlayActivity.class);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final List<BMP> getLiveActivityTasksSetting() {
        ArrayList arrayList = new ArrayList();
        try {
            List<UgActivityTasks> activityTasks = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting().getActivityTasks();
            if (activityTasks != null) {
                for (UgActivityTasks ugActivityTasks : activityTasks) {
                    if (ugActivityTasks.getTaskType().intValue() == 2 || ugActivityTasks.getTaskType().intValue() == 3) {
                        BMP bmp = new BMP();
                        ugActivityTasks.getTaskId();
                        bmp.LIZ = ugActivityTasks.getTaskType();
                        bmp.LIZIZ = Long.valueOf(ugActivityTasks.getTime().longValue());
                        bmp.LIZJ = ugActivityTasks.getUrlList();
                        arrayList.add(bmp);
                    }
                }
            }
        } catch (C158056If unused) {
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final float calcTargetLoudness() {
        return C47130Iec.LIZIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void finishLivePlayActivity() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (LivePlayActivity.class.isInstance(activity)) {
                activity.finish();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean getPushLiveState() {
        if (LiveOuterService.LJJJLL().LJJIZ().LJJJZ() != null) {
            return C26073ALd.LIZLLL();
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Activity getTopActivity() {
        return ActivityStack.getTopActivity();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final ActivityC45651qj getTopFragmentActivity() {
        Activity topActivity = getTopActivity();
        if (topActivity instanceof ActivityC45651qj) {
            return (ActivityC45651qj) topActivity;
        }
        Activity[] activityStack = ActivityStack.getActivityStack();
        for (int length = activityStack.length - 1; length >= 0; length--) {
            Activity activity = activityStack[length];
            if (activity instanceof ActivityC45651qj) {
                return (ActivityC45651qj) activity;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void initLynxEnv() {
        Uri parse;
        String path;
        if (!LynxEnv.LJIIIZ().LJ.get()) {
            C57415Mg7.LIZ().LJIIL(ILynxKitApi.class);
        }
        InterfaceC60387Nmx LIZJ = C60373Nmj.LIZIZ().LIZJ(InterfaceC60316Nlo.class, "live");
        if (LIZJ != null && o.LJ(LIZJ.getBid(), "live")) {
            return;
        }
        Application application = (Application) EF7.LIZIZ();
        C39960FmG c39960FmG = new C39960FmG(application);
        C39961FmH.LIZIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest();
        C39966FmM c39966FmM = new C39966FmM(c39960FmG.LJFF, c39960FmG);
        InterfaceC60324Nlw LIZIZ = C60373Nmj.LIZIZ();
        C60342NmE c60342NmE = new C60342NmE();
        c60342NmE.LIZ(InterfaceC60316Nlo.class, new C40019FnD(c39966FmM));
        C73975T1n c73975T1n = new C73975T1n();
        F0H f0h = new F0H();
        f0h.LIZJ = "webcast_oversea";
        f0h.LIZ = "webcast_oversea";
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        f0h.LIZIZ = "99999";
        c60342NmE.LIZ(InterfaceC60276NlA.class, new C60544NpU(c73975T1n, new C60510Now(f0h.LIZ, f0h.LIZIZ, f0h.LIZJ)));
        O1D o1d = new O1D(application);
        String geckoHost = C38943FQd.LIZIZ();
        String LIZ = C85990Xow.LIZ();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C46104I7o.LJJIIJ()).iterator();
        while (it.hasNext()) {
            Pattern pattern = (Pattern) it.next();
            if (pattern != null) {
                String pattern2 = pattern.toString();
                o.LJIIIIZZ(pattern2, "p.toString()");
                if (pattern2.length() > 0 && (path = (parse = UriProtector.parse(pattern.toString())).getPath()) != null && path.length() != 0) {
                    String path2 = parse.getPath();
                    o.LJI(path2);
                    arrayList.add(path2);
                }
            }
        }
        String valueOf = String.valueOf(EF7.LJIIIZ);
        String LIZLLL = EF7.LIZLLL();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        O3G o3g = new O3G();
        GeckoXNetImpl geckoXNetImpl = new GeckoXNetImpl();
        GeckoConfig geckoConfig = new GeckoConfig(C38943FQd.LIZ(), "offlineX", new C61227O1f(), true, false, 16, null);
        o.LJIIIIZZ(geckoHost, "geckoHost");
        o1d.init(new O1E(geckoHost, LIZ, arrayList, valueOf, LIZLLL, serverDeviceId, geckoConfig, o3g, geckoXNetImpl, 128));
        c60342NmE.LIZ(IResourceLoaderService.class, o1d);
        C60507Not c60507Not = new C60507Not();
        c60342NmE.LIZ(InterfaceC60232NkS.class, new C60230NkQ(new C60511Nox(c60507Not.LIZ, c60507Not.LIZIZ)));
        LIZIZ.LJIIIIZZ("live", new C60378Nmo(c60342NmE));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final FQE getHostClientAiService() {
        return FQD.LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final B4D getLivePreloadService() {
        return C28838BTm.LJ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void addPauseTask(Runnable runnable) {
        if (runnable != null) {
            synchronized (C60520Np6.LIZ) {
                C60520Np6.LIZIZ.add(runnable);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Class getHostActivity(int i) {
        if (i != 5) {
            if (i != 6) {
                if (i != 7) {
                    return null;
                }
                return VoiceBroadcastActivity.class;
            }
            return LiveBgBroadcastActivity.class;
        }
        return LiveBroadcastActivity.class;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void hideNotificationTipDialog(Context context) {
        if (LiveOuterService.LJJJLL().LJJIZ().LJJJZ() != null) {
            o.LJIIIZ(context, "context");
            if (context instanceof ActivityC45651qj) {
                Fragment LJJJIL = ((ActivityC45651qj) context).getSupportFragmentManager().LJJJIL("NotificationLiveDialog");
                if (LJJJIL instanceof DialogFragment) {
                    ((DialogFragment) LJJJIL).dismiss();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isNotificationEnabled(Context context) {
        return ProfileServiceImpl.LIZ().isNotificationEnabled(context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void jumpLivePlayActivityClearTop(Context context) {
        Intent intent = new Intent(context, (Class<?>) LivePlayActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        intent.putExtra("room_id", -3L);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void notifyShowLiveIconEntrance(boolean z) {
        C2U8.LIZ(new LQG(z));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openWallet(Activity activity) {
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null) {
            LJJJLL.LJJJJI(activity, "page_charge");
        }
    }

    public static boolean LIZ(Context context, String str) {
        Class<? extends Activity> LJIIZILJ;
        Uri parse = UriProtector.parse(str);
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (LIZ == null || (LJIIZILJ = LIZ.LJIIZILJ()) == null) {
            return false;
        }
        Intent intent = new Intent(context, LJIIZILJ);
        intent.setData(parse);
        C16880lQ.LIZJ(context, intent);
        C12500eM.LIZIZ(str, "handler_path_deep_link");
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent createBroadcastEndSafetyToolsIntent(ActivityC45651qj activityC45651qj, Uri uri) {
        Intent intent = new Intent(activityC45651qj, (Class<?>) LiveBroadcastEndSafetyToolsActivity.class);
        intent.putExtra("scheme", uri);
        return intent;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void createNewNavi(String str, InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns) {
        ProfileNaviServiceImpl.LJIIL().LJIIIZ();
        C41402GMs.LIZ(str, interfaceC88472Yns);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent createStartBroadcastIntent(ActivityC45651qj activityC45651qj, int i) {
        Intent intent;
        if (i != 2 && i != 3 && i != 4) {
            if (i != 5) {
                intent = new Intent(activityC45651qj, (Class<?>) LiveBroadcastActivity.class);
            } else {
                intent = new Intent(activityC45651qj, (Class<?>) VoiceBroadcastActivity.class);
            }
        } else {
            intent = new Intent(activityC45651qj, (Class<?>) LiveBgBroadcastActivity.class);
        }
        intent.putExtra("broadcast_type", i);
        return intent;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleIntentSchema(WebView webView, String str) {
        return new C59581NZx().shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void jumpToAgsStatusPage(Context context, String str) {
        IBanAppealService LJIIL = BanAppealServiceImpl.LJIIL();
        if (LJIIL != null) {
            LJIIL.jumpToAgsStatusPage(context, str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void jumpToFeedBack(Activity activity, long j) {
        ShareService LJJJLZIJ = ShareServiceImpl.LJJJLZIJ();
        if (LJJJLZIJ != null) {
            LJJJLZIJ.LJJIIZ(activity, j);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openFeedBack(String str, Context context) {
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://m.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
        LIZ.append("?enter_from=");
        LIZ.append(str);
        intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
        intent.putExtra("hide_nav_bar", true);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openRegionListPage(Activity activity, InterfaceC60521Np7 interfaceC60521Np7) {
        HG3.LJIIIIZZ().openCountryListActivity(activity, new C60519Np5(interfaceC60521Np7));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openUserProfilePage(long j, Map<String, String> map) {
        C39061g6 c39061g6 = new C39061g6(C61845OOz.LIZ("aweme://user/profile/", j));
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c39061g6.LIZIZ(entry.getKey(), entry.getValue());
            }
        }
        C61200O0e.LIZLLL().LJII(c39061g6.LIZJ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportPushImprDurationTrack(HashMap<String, String> hashMap, boolean z) {
        if (z) {
            C73353Sqb.LIZLLL().LIZJ();
            return;
        }
        C73353Sqb.LIZLLL().LJIIJJI();
        C73353Sqb.LIZLLL().LJIIIIZZ();
        C73353Sqb.LIZLLL().LJIIL("push", "push", "click", hashMap);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void goEditDoBAgeGatePage(Activity activity, String str, final InterfaceC60523Np9 interfaceC60523Np9) {
        a.LIZIZ().LJIIL(activity, new InterfaceC62969OnV() { // from class: X.Np8
            @Override // X.InterfaceC62969OnV
            public final void LIZ(String str2, boolean z) {
                InterfaceC60523Np9 interfaceC60523Np92 = InterfaceC60523Np9.this;
                if (z) {
                    interfaceC60523Np92.onSuccess(str2);
                } else {
                    interfaceC60523Np92.onFailed();
                }
            }
        }, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return handleSchema(context, str, bundle, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveBrowser(String url, Bundle bundle, Context context) {
        Uri parse;
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context == null) {
            return;
        }
        if (hostInterceptSpark(url)) {
            o.LJIIIZ(url, "url");
            C31855Cep c31855Cep = new C31855Cep();
            c31855Cep.LJIIIZ(url);
            c31855Cep.LJIIJJI();
            if (bundle.containsKey("hide_nav_bar") && bundle.getBoolean("hide_nav_bar", false)) {
                ((HashMap) c31855Cep.LIZ).put("hide_nav_bar", "1");
            }
            if (bundle.containsKey("hide_status_bar") && bundle.getBoolean("hide_status_bar", false)) {
                ((HashMap) c31855Cep.LIZ).put("hide_nav_bar", "1");
            }
            if (bundle.containsKey("title")) {
                String title = bundle.getString("title", "");
                if (!TextUtils.isEmpty(title)) {
                    o.LJIIIZ(title, "title");
                    ((HashMap) c31855Cep.LIZ).put("title", title);
                }
            }
            if (bundle.containsKey("show_progress")) {
                if (bundle.getBoolean("show_progress", false)) {
                    c31855Cep.LJI(false);
                } else {
                    c31855Cep.LJI(true);
                }
            }
            if (bundle.containsKey("bundle_user_webview_title")) {
                if (bundle.getBoolean("bundle_user_webview_title", false)) {
                    ((HashMap) c31855Cep.LIZ).put("use_webview_title", "1");
                } else {
                    ((HashMap) c31855Cep.LIZ).put("use_webview_title", CardStruct.IStatusCode.DEFAULT);
                }
            }
            if (bundle.containsKey("status_bar_bg_color")) {
                String statusBarBgColor = C40691Fy3.LIZ(bundle.getInt("status_bar_bg_color"));
                o.LJIIIZ(statusBarBgColor, "statusBarBgColor");
                ((HashMap) c31855Cep.LIZ).put("status_bar_bg_color", statusBarBgColor);
            }
            if (bundle.containsKey("bundle_web_view_background_color")) {
                c31855Cep.LJ(bundle.getInt("bundle_web_view_background_color"));
            }
            LiveOuterService.LJJJLL().LJIIJ(context, c31855Cep.LIZ().toString());
            return;
        }
        Intent intent = new Intent(context, (Class<?>) LiveDummyActivity.class);
        bundle.putString("url", url);
        String string = bundle.getString("original_scheme");
        if (!TextUtils.isEmpty(string) && (parse = UriProtector.parse(string)) != null) {
            String queryParameter = UriProtector.getQueryParameter(parse, "sec_link_scene");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("sec_link_scene", queryParameter);
            }
        }
        bundle.putBoolean("show_progress", false);
        intent.putExtra("intent_type", 1);
        intent.putExtras(bundle);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveLynx(String str, Bundle bundle, Context context) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) LiveDummyActivity.class);
        bundle.putString("url", str);
        intent.putExtra("intent_type", 4);
        intent.putExtras(bundle);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveNewHybrid(Uri uri, Context context, Bundle bundle) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) LiveDummyActivity.class);
        intent.putExtra("intent_type", 5);
        bundle.putParcelable("bundle_uri", uri);
        intent.putExtras(bundle);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void startNaviOnboarding(Activity activity, View view, String str) {
        ProfileNaviServiceImpl.LJIIL().LJIIJ(activity, view, str, new C61658OHu(false, true, null));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void uploadNaviAsset(Context context, Bitmap bitmap, InterfaceC88471Ynr<List<String>, String, C76800UCe> interfaceC88471Ynr) {
        ProfileNaviServiceImpl.LJIIL().LJIIIZ();
        C41402GMs.LIZLLL(context, bitmap, interfaceC88471Ynr);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveBrowser(String str, String str2, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", TextUtils.isEmpty(str2));
        bundle.putString("title", str2);
        openLiveBrowser(str, bundle, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Fragment getSubOnlyVideoContentFragment(boolean z, long j, String secUserId, String enterFrom) {
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(enterFrom, "enterFrom");
        SubOnlyVideoContentFragment subOnlyVideoContentFragment = new SubOnlyVideoContentFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_author", z);
        bundle.putLong("user_id", j);
        bundle.putString("sec_user_id", secUserId);
        bundle.putString("enter_from", enterFrom);
        subOnlyVideoContentFragment.setArguments(bundle);
        return subOnlyVideoContentFragment;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleSchema(Context context, String str, Bundle bundle, boolean z) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String uri = UriProtector.parse(str).buildUpon().clearQuery().build().toString();
        String[] value = LiveSchemaForceUseDeepLinkSetting.INSTANCE.getValue();
        int length = value.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (value[i].equals(uri)) {
                    LIZ(context, str);
                    break;
                }
                i++;
            } else if (SmartRouter.canOpen(str)) {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
                if (bundle != null) {
                    buildRoute.withParam(bundle);
                }
                buildRoute.open();
                C12500eM.LIZIZ(str, "handler_path_router");
            } else {
                if (!z) {
                    return false;
                }
                return LIZ(context, str);
            }
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openCamera(Activity activity, int i, Uri uri, Boolean bool) {
        Intent intent = new Intent(activity, (Class<?>) LiveCoverCameraActivity.class);
        intent.putExtra("photoUri", uri);
        intent.putExtra("isFromLiveCover", bool);
        C16880lQ.LJFF(activity, i, intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final View getNaviSkinToneView(Context context, List<Effect> list, int i, boolean z, InterfaceC88472Yns<Effect, C76800UCe> interfaceC88472Yns) {
        ProfileNaviServiceImpl.LJIIL().LJIIIZ();
        return C41402GMs.LIZ.LIZIZ(context, list, i, z, interfaceC88472Yns);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void onNaviMessageReceived(int i, int i2, int i3, String str, InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2) {
        ProfileNaviServiceImpl.LJIIL().LJIIIZ();
        C41402GMs.LIZ.LIZJ(i, i2, str, interfaceC88472Yns, interfaceC88472Yns2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showNotificationTipDialog(String str, String str2, String str3, String str4, int i, View view, String str5, C28486BFy c28486BFy, boolean z, InterfaceC29613Bjl interfaceC29613Bjl) {
        showNotificationTipDialog(1, str, str2, str3, str4, i, view, str5, c28486BFy, z, interfaceC29613Bjl);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showNotificationTipDialog(int i, String str, String str2, String str3, String str4, int i2, View view, String str5, C28486BFy c28486BFy, boolean z, InterfaceC29613Bjl interfaceC29613Bjl) {
        if (LiveOuterService.LJJJLL().LJJIZ().LJJJZ() != null) {
            User user = new User();
            user.setUid(str2);
            user.setUniqueId(str3);
            user.setFollowStatus(i);
            user.setLivePushNotificationStatus(i2);
            user.setSecUid(str4);
            user.setNickname(str);
            C26074ALe.LIZLLL(new C26076ALg(user, C27740Aue.LIZ(view.getContext()), "", "others_homepage", "", null, "", null, z, false, new C29612Bjk(c28486BFy, interfaceC29613Bjl, str5)));
        }
    }
}
