package com.ss.android.ugc.aweme.live;

import X.AV1;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C0NB;
import X.C16880lQ;
import X.C30868C9o;
import X.C30922CBq;
import X.C31205CMn;
import X.C37091Eh5;
import X.C38995FSd;
import X.C46725IVl;
import X.C54285LSf;
import X.C56500MFk;
import X.C61099NyR;
import X.C61115Nyh;
import X.C61184Nzo;
import X.C62041OWn;
import X.C62042OWo;
import X.C62044OWq;
import X.C64707PaR;
import X.C78880UxY;
import X.C84763XOl;
import X.C85990Xow;
import X.C85999Xp5;
import X.C8HX;
import X.CN1;
import X.CN3;
import X.EF7;
import X.FCD;
import X.FXJ;
import X.InterfaceC39796Fjc;
import X.InterfaceC86003Zc;
import X.InterfaceC86394XvS;
import X.OHI;
import X.PEH;
import X.T16;
import X.UC0;
import Y.ARunnableS5S0001000_10;
import Y.AfS17S0001000_5;
import Y.AfS39S0000000_10;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.external.ui.LiveParams;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes11.dex */
public class Live {
    public static CN3 hostService;
    public static Set<InterfaceC39796Fjc> liveSDKInitedListenerSet;
    public static volatile boolean sInitedLiteLiveSDK;
    public static volatile boolean sInitedLiveSDK;

    public static InterfaceC86394XvS getService() {
        return getService(false);
    }

    public static InterfaceC86394XvS getServiceInternal() {
        return getServiceInternal(false);
    }

    public static /* synthetic */ void lambda$refreshLoginState$1(Object obj) {
    }

    public static /* synthetic */ void lambda$refreshLoginState$2(Throwable th) {
    }

    public static synchronized CN3 getHostService() {
        CN3 cn3;
        synchronized (Live.class) {
            if (hostService == null) {
                hostService = new C78880UxY();
            }
            cn3 = hostService;
        }
        return cn3;
    }

    public static String getKYCDomain() {
        String str = C64707PaR.LIZJ;
        if (str != null && str.equalsIgnoreCase("us")) {
            return "webcast.us.tiktokv.com";
        }
        return "webcast.tiktokv.com";
    }

    public static InterfaceC86394XvS getLiteServiceInternal() {
        if (!sInitedLiteLiveSDK) {
            synchronized (Live.class) {
                if (sInitedLiteLiveSDK) {
                    return C31205CMn.LIZ();
                }
                C62044OWq.LIZIZ("init_live_lite_duration");
                C62044OWq.LIZIZ("init_live_host_service");
                CN3 hostService2 = getHostService();
                C62044OWq.LIZ("init_live_host_service");
                C31205CMn.LJ(hostService2);
                C62044OWq.LIZIZ("init_live_refresh_login_state");
                refreshLoginState();
                C62044OWq.LIZ("init_live_refresh_login_state");
                C62044OWq.LIZ("init_live_lite_duration");
                sInitedLiteLiveSDK = true;
            }
        }
        return C31205CMn.LIZ();
    }

    public static String getLiveWebSocketDomain() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isBoe()) {
            return C37091Eh5.LIZ().getLiveBoeWsDomain();
        }
        return "webcast-ws.tiktokv.com";
    }

    public static /* synthetic */ void lambda$getServiceInternal$3() {
        Iterator<InterfaceC39796Fjc> it = liveSDKInitedListenerSet.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        liveSDKInitedListenerSet = null;
    }

    public static void refreshLoginState() {
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.OWp
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                Live.syncShareCookieToTarget();
            }
        }).LJJL(T16.LJ).LJJJLIIL(new AfS17S0001000_5(1, 14), new AfS39S0000000_10(0));
    }

    public static void syncShareCookieToTarget() {
        try {
            FXJ.LIZIZ(C16880lQ.LLLZ("https://%s/", new Object[]{getLiveDomain()}));
        } catch (Exception unused) {
        }
    }

    public static InterfaceC86394XvS getLiteService() {
        if (!FCD.LJI(EF7.LIZIZ())) {
            C0NB.LJ("Live", "cannot use LiveService in non-main process");
            if (C46725IVl.LIZ()) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("error_msg", Log.getStackTraceString(new Throwable("")));
                hashMap.put("cur_process_name", FCD.LIZ(EF7.LIZIZ()));
                C54285LSf.LIZ.LIZ(1, "ttlive_init_non_main_process_error", hashMap);
                return null;
            }
            return null;
        }
        InterfaceC86394XvS liteServiceInternal = getLiteServiceInternal();
        if (liteServiceInternal == null) {
            C0NB.LJ("Live", "Live getLiteService is null");
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("error_msg", Log.getStackTraceString(new Throwable("")));
            C54285LSf.LIZ.LIZ(1, "ttlive_live_get_lite_service_null_error", hashMap2);
        }
        return liteServiceInternal;
    }

    public static String getLiveDomain() {
        if (C85990Xow.LJIIIZ()) {
            return "webcast.tiktokv.com";
        }
        return "webcast-va.tiktokv.com";
    }

    public static boolean invalid() {
        if (getServiceInternal() == null) {
            return true;
        }
        return false;
    }

    public static void switchLocale() {
        Locale LIZJ;
        Context LIZIZ = EF7.LIZIZ();
        InterfaceC86394XvS service = getService();
        if (service == null || (LIZJ = C85999Xp5.LIZJ(LIZIZ, null, null)) == null || TextUtils.isEmpty(LIZJ.getLanguage())) {
            return;
        }
        service.onLocaleChanged(LIZJ);
    }

    public static boolean isInitedLiveSDK() {
        return sInitedLiveSDK;
    }

    public static InterfaceC86394XvS getService(boolean z) {
        if (!FCD.LJI(EF7.LIZIZ())) {
            C0NB.LJ("Live", "cannot use LiveService in non-main process");
            HashMap hashMap = new HashMap(2);
            hashMap.put("error_msg", Log.getStackTraceString(new Throwable("")));
            hashMap.put("cur_process_name", FCD.LIZ(EF7.LIZIZ()));
            if (C46725IVl.LIZ()) {
                C54285LSf.LIZ.LIZ(1, "ttlive_init_non_main_process_error", hashMap);
                return null;
            }
            return null;
        }
        InterfaceC86394XvS serviceInternal = getServiceInternal(z);
        if (serviceInternal == null) {
            C0NB.LJ("Live", "Live getService is null");
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("error_msg", Log.getStackTraceString(new Throwable("")));
            C54285LSf.LIZ.LIZ(1, "ttlive_live_get_service_null_error", hashMap2);
        }
        return serviceInternal;
    }

    public static InterfaceC86394XvS getServiceInternal(boolean z) {
        if (!sInitedLiveSDK) {
            synchronized (Live.class) {
                if (sInitedLiveSDK) {
                    return C31205CMn.LIZ();
                }
                C62044OWq.LIZIZ("init_live_all_duration");
                boolean z2 = sInitedLiteLiveSDK;
                getLiteServiceInternal();
                C31205CMn.LIZLLL(hostService);
                sInitedLiveSDK = true;
                C62044OWq.LIZ("init_live_all_duration");
                C62044OWq.LIZJ(z, z2);
                if (liveSDKInitedListenerSet != null) {
                    C38995FSd.LIZIZ().execute(new ARunnableS5S0001000_10(1, 1));
                }
            }
        }
        return C31205CMn.LIZ();
    }

    public static boolean hasFollowed(User user) {
        if (user != null && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2)) {
            return true;
        }
        return false;
    }

    public static boolean isPrivateAccount(User user) {
        if (user != null && user.isSecret()) {
            return true;
        }
        return false;
    }

    public static boolean openLiveRecordBySchema(String str) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return false;
        }
        if (C30922CBq.LIZIZ) {
            C30868C9o.LJ(1L, LJIIIIZZ, "Your link jump method is about to be abandoned, please contact yanpeng.p to solve it");
        }
        if (AV1.LJIIJJI()) {
            C8HX.LIZIZ("ttlive_minor_mode_live", "", null);
        }
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            OHI.LIZ.getClass();
            if (OHI.LJ(LJIIIIZZ, "android.permission.CAMERA") && OHI.LJ(LJIIIIZZ, "android.permission.RECORD_AUDIO")) {
                jumpToLive(LJIIIIZZ, str);
                return true;
            }
            C61099NyR.LIZIZ.LIZIZ(LJIIIIZZ, TokenCert.with("bpea-live_jump_to_broadcast")).LIZ("android.permission.CAMERA", "android.permission.RECORD_AUDIO").LIZJ(new C62041OWn(LJIIIIZZ, str));
            return true;
        }
        if (C61184Nzo.LIZ(LJIIIIZZ) == 0 && C61184Nzo.LIZ.LIZ(LJIIIIZZ) == 0) {
            jumpToLive(LJIIIIZZ, str);
        } else {
            C61115Nyh.LIZJ(LJIIIIZZ, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new C62042OWo(LJIIIIZZ, str));
        }
        PEH.LIZLLL(new Throwable(), "openLiveRecordBySchema");
        return true;
    }

    public static boolean showLive(User user) {
        if (user != null && user.isLive() && UC0.LJJLI()) {
            if (isPrivateAccount(user)) {
                return hasFollowed(user);
            }
            return true;
        }
        return false;
    }

    public static void jumpToLive(Activity activity, String str) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("direct_shoot");
        builder.translationType(3);
        builder.defaultTab(2);
        builder.enterFrom(UriProtector.getQueryParameter(UriProtector.parse(str), "enter_from"));
        builder.liveParams(new LiveParams(UriProtector.getQueryParameter(UriProtector.parse(str), "source_params"), Boolean.FALSE));
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        AVExternalServiceImpl.LIZ().asyncService("Live", new C56500MFk(activity, builder));
    }
}
