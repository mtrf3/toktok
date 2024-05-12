package X;

import X.C0RN;
import X.C44375HbH;
import X.C61359O6h;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC39140FXs;
import X.J9A;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.openauthorize.AuthorizeCommonService;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import ujb.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class NW4 implements NPU {
    @Override // X.NPU
    public final void LIZ() {
    }

    @Override // X.NPU
    public final void LJII() {
    }

    @Override // X.NPU
    public final void LJIIJJI() {
    }

    @Override // X.NPU
    public final void LJIIL() {
        C56662Kg.LIZ().LIZLLL = false;
    }

    @Override // X.NPU
    public final void LJIL(NormalSplashAdActivity normalSplashAdActivity) {
    }

    @Override // X.NPU
    public final void LJJIIZ() {
        MainLooperOptService.LLFFF = false;
    }

    @Override // X.NPU
    public final long LJIIIIZZ() {
        return ((Number) AnonymousClass906.LIZ.getValue()).longValue();
    }

    @Override // X.NPU
    public final boolean LJIIJ() {
        return C59858NeQ.LIZ.get();
    }

    @Override // X.NPU
    public final boolean LJIJJ() {
        if (o.LJJJJIZL("startupTest", F78.LIZ, true) || o.LJJJJIZL("MTraceStartupDiff", F78.LIZ, true) || o.LJJJJIZL("manuallyMTrace", F78.LIZ, true) || o.LJJJJIZL("MTraceStartup", F78.LIZ, true) || o.LJJJJIZL("systrace", F78.LIZ, true) || o.LJJJJIZL("manuallyATrace", F78.LIZ, true) || o.LJJJJIZL("dominoMode", F78.LIZ, true)) {
            return true;
        }
        return false;
    }

    @Override // X.NPU
    public final HashMap<String, String> LJJIIZI() {
        int i;
        String valueOf;
        String LIZIZ;
        HashMap<String, String> hashMap = new HashMap<>();
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        String accountRegion = curUser.getAccountRegion();
        int LJIILIIL = a.LJIIJ().LJIILIIL();
        if (curUser.getUserMode() != -1) {
            i = curUser.getUserMode();
        } else {
            i = 0;
        }
        if (LJIILIIL != 0 && LJIILIIL != 2) {
            valueOf = String.valueOf(i);
        } else {
            valueOf = String.valueOf(i | 4);
        }
        hashMap.put("user_mode", valueOf);
        hashMap.put("user_period", String.valueOf(curUser.getUserPeriod()));
        if (accountRegion != null && accountRegion.length() > 0) {
            hashMap.put("account_region", accountRegion);
        }
        String LJIILL = AccountService.LJIJ().LJIILL();
        kotlin.jvm.internal.o.LJIIIIZZ(LJIILL, "get().getService(IAccoun…ava).storeRegionUpperCase");
        hashMap.put("user_region", LJIILL);
        int[] LIZ = J7H.LIZ(100);
        if (LIZ == null) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ[0]);
            LIZ2.append('_');
            LIZ2.append(LIZ[1]);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        hashMap.put("user_avatar_shrink", String.valueOf(LIZIZ));
        String id = TimeZone.getDefault().getID();
        kotlin.jvm.internal.o.LJIIIIZZ(id, "getDefault().id");
        hashMap.put("tz_name", id);
        return hashMap;
    }

    @Override // X.NPU
    public final String getOpenUdid() {
        HashMap hashMap = new HashMap();
        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(hashMap);
        String str = (String) hashMap.get("openudid");
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.NPU
    public final boolean LIZIZ() {
        return a.LJIIJ().LIZIZ();
    }

    @Override // X.NPU
    public final String LIZJ() {
        String installId = AppLog.getInstallId();
        kotlin.jvm.internal.o.LJIIIIZZ(installId, "getInstallId()");
        return installId;
    }

    @Override // X.NPU
    public final IDownloadService LIZLLL() {
        IDownloadService LIZJ = DownloadServiceImpl.LIZJ();
        kotlin.jvm.internal.o.LJIIIIZZ(LIZJ, "getDownloadService()");
        return LIZJ;
    }

    @Override // X.NPU
    public final boolean LJ() {
        return a.LJIIJ().LJ();
    }

    @Override // X.NPU
    public final boolean LJFF() {
        return FJU.LIZIZ().LIZLLL;
    }

    @Override // X.NPU
    public final boolean LJIILIIL() {
        return FJU.LIZIZ().LJ;
    }

    @Override // X.NPU
    public final String LJIILL() {
        return a.LJIIZILJ().LIZJ();
    }

    @Override // X.NPU
    public final int LJIJJLI() {
        return C61447O9r.LIZJ(EF7.LIZIZ());
    }

    @Override // X.NPU
    public final void LJJ() {
        InitAllServiceImpl.LJIILLIIL().LJIILL(FKM.LIZ());
    }

    @Override // X.NPU
    public final long LJJI() {
        return C61017Nx7.LIZ().LIZ.LIZJ;
    }

    @Override // X.NPU
    public final boolean LJJIIJZLJL() {
        return FJU.LIZIZ().LJFF;
    }

    @Override // X.NPU
    public final String LJJIJ() {
        String LIZJ = EU3.LIZJ();
        if (LIZJ == null) {
            return "";
        }
        return LIZJ;
    }

    @Override // X.NPU
    public final String getCurUserId() {
        return HG3.LJIILL().getCurUserId();
    }

    @Override // X.NPU
    public final String getDeviceId() {
        return AppLog.getServerDeviceId();
    }

    @Override // X.NPU
    public final boolean isAppBackground() {
        return C61017Nx7.LIZ().LIZ.LIZIZ;
    }

    @Override // X.NPU
    public final boolean isChildrenMode() {
        return AV1.LJIIJJI();
    }

    @Override // X.NPU
    public final void LJIIIZ() {
    }

    @Override // X.NPU
    public final void LJIILJJIL() {
    }

    @Override // X.NPU
    public final NQM LJI(Context context) {
        return new NQM(context);
    }

    @Override // X.NPU
    public final boolean LJIILLIIL(NPX npx) {
        TopViewAwemeRawAd LIZ;
        OmVast omVast;
        TopViewAwemeRawAd LIZ2;
        OmVast omVast2;
        if (!npx.LJZ() || (LIZ = npx.LIZ()) == null || (omVast = LIZ.getOmVast()) == null || omVast.loaded || (LIZ2 = npx.LIZ()) == null || (omVast2 = LIZ2.getOmVast()) == null || omVast2.providerType != 3) {
            return true;
        }
        return false;
    }

    @Override // X.NPU
    public final void LJIIZILJ(Aweme aweme) {
        C59252NNg.LJIIIIZZ(aweme, null, null, false);
    }

    @Override // X.NPU
    public final Intent LJIJI(NormalSplashAdActivity normalSplashAdActivity) {
        return new Intent(normalSplashAdActivity, (Class<?>) CrossPlatformActivity.class);
    }

    @Override // X.NPU
    public final void LJJII(final C44375HbH c44375HbH) {
        C36093EEn.LIZ.getClass();
        C36093EEn.LJIIIZ().LIZ(new EE1() { // from class: com.ss.android.ugc.aweme.commercialize.splash.SplashAdDependImpl$setPreloadDelay$1
            @Override // X.EEY
            public final String key() {
                return "SplashAdDependImpl$setPreloadDelay$1";
            }

            @Override // X.EEY
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.EEY
            public final /* synthetic */ String prefix() {
                return "task_";
            }

            @Override // X.EE1
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.EEY
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
            }

            @Override // X.EEY
            public final /* synthetic */ List triggerOtherLegoComponents() {
                return null;
            }

            @Override // X.EEY
            public final /* synthetic */ EnumC36103EEx triggerType() {
                return C0RN.LIZIZ(this);
            }

            @Override // X.EEY
            public final EnumC36092EEm scenesType() {
                return EnumC36092EEm.DEFAULT;
            }

            @Override // X.EE1
            public final EFK type() {
                return EFK.BOOT_FINISH;
            }

            @Override // X.EEY
            public final void run(Context context) {
                InterfaceC39140FXs interfaceC39140FXs = (InterfaceC39140FXs) C44375HbH.this.LJLIL;
                long LIZIZ = J9A.LIZIZ("splash_preload_delay", 0L);
                interfaceC39140FXs.getClass();
                C61359O6h.LJJIJIL = LIZIZ;
            }
        });
    }

    @Override // X.NPU
    public final void LJJIJIIJI(String log) {
        kotlin.jvm.internal.o.LJIIIZ(log, "log");
        TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, log, null, 2, null);
    }

    @Override // X.NPU
    public final boolean isActivityAwemeAuthorize(Activity activity) {
        IAuthorizeCommonService iAuthorizeCommonService;
        kotlin.jvm.internal.o.LJIIIZ(activity, "activity");
        Object LIZ = C58096Mr6.LIZ(IAuthorizeCommonService.class, false);
        if (LIZ != null) {
            iAuthorizeCommonService = (IAuthorizeCommonService) LIZ;
        } else {
            if (C58096Mr6.V8 == null) {
                synchronized (IAuthorizeCommonService.class) {
                    if (C58096Mr6.V8 == null) {
                        C58096Mr6.V8 = new AuthorizeCommonService();
                    }
                }
            }
            iAuthorizeCommonService = C58096Mr6.V8;
        }
        return iAuthorizeCommonService.isActivityAwemeAuthorize(activity);
    }

    @Override // X.NPU
    public final void LJIJ(NormalSplashAdActivity normalSplashAdActivity, String openUrl) {
        kotlin.jvm.internal.o.LJIIIZ(openUrl, "openUrl");
        C224488rU.LIZJ(openUrl);
        Object[] objArr = new Object[4];
        objArr[0] = openUrl;
        String str = "?";
        if (openUrl.contains("?")) {
            str = "&";
        }
        objArr[1] = str;
        objArr[2] = URLEncoder.encode("trigger_by");
        objArr[3] = URLEncoder.encode("splash");
        C57422MgE.LIZIZ(normalSplashAdActivity, C16880lQ.LLLZ("%s%s%s=%s", objArr), null, true);
    }

    @Override // X.NPU
    public final void LJJIIJ(Context context, Aweme aweme) {
        int i;
        if (!C63081OpJ.LLIIII(aweme) || AnonymousClass906.LIZIZ == 0) {
            return;
        }
        if (!AnonymousClass906.LJ) {
            i = 2;
        } else {
            i = 1;
        }
        long currentTimeMillis = System.currentTimeMillis() - AnonymousClass906.LIZIZ;
        AnonymousClass906.LIZIZ = 0L;
        HashMap hashMap = new HashMap();
        hashMap.put("feedduration", String.valueOf(currentTimeMillis));
        hashMap.put("awemelaunch", String.valueOf(i));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
        NN1.LJJJJI(context, "feed_show", aweme, NN1.LJIIL(context, aweme, false, hashMap2));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "feed_show", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(Long.valueOf(currentTimeMillis), "feedduration");
        LIZLLL.LIZIZ(Integer.valueOf(i), "awemelaunch");
        LIZLLL.LJII();
        IFT.LIZIZ(System.currentTimeMillis(), "finish");
    }

    @Override // X.NPU
    public final void LJJIFFI(String str, boolean z, boolean z2) {
        if (z) {
            C56662Kg.LIZ().LIZJ(str, z2);
        } else {
            C56662Kg.LIZ().LJFF(str, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // X.NPU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(final android.content.Context r7, final com.ss.android.ugc.aweme.feed.model.Aweme r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            if (r8 != 0) goto Ld
        Lc:
            return
        Ld:
            boolean r0 = X.C63081OpJ.LLIIII(r8)
            if (r0 != 0) goto L14
            goto Lc
        L14:
            boolean r0 = X.C63081OpJ.LLIIIILZ(r8)
            if (r0 != 0) goto L25
            java.lang.String r0 = X.C63081OpJ.LJJIIZI(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            goto Lc
        L25:
            r0 = 0
            org.json.JSONObject r1 = X.NN1.LJIIL(r7, r8, r0, r9)
            java.lang.String r0 = "splash_click"
            X.NN1.LJJJJI(r7, r0, r8, r1)
            java.lang.String r1 = "ad_extra_data"
            r0 = r9
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r5 = 0
            if (r0 != 0) goto L56
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L53
            r2.<init>(r1)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = "click_x"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = "click_y"
            java.lang.String r5 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)     // Catch: java.lang.Exception -> L58
            goto L5c
        L53:
            r0 = move-exception
            r1 = r5
            goto L59
        L56:
            r4 = r5
            goto L5e
        L58:
            r0 = move-exception
        L59:
            X.C78983UzD.LJIIZILJ(r0)
        L5c:
            r4 = r5
            r5 = r1
        L5e:
            com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger r3 = com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger.LJJIJ()
            X.N0f r2 = X.NMA.LJIILLIIL
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r8.getAwemeRawAd()
            X.NMM r0 = new X.NMM
            r0.<init>()
            r3.LJIIIZ(r2, r1, r0)
            java.lang.String r2 = "takeover"
            r0 = 1
            org.json.JSONObject r1 = X.NN1.LJIIL(r7, r8, r0, r9)
            java.lang.String r0 = "refer"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L7d
            goto L81
        L7d:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L81:
            java.lang.String r3 = "click"
            X.NN1.LJJJJI(r7, r3, r8, r1)
            boolean r0 = X.C63081OpJ.LJJLIIIJJI(r8)
            if (r0 == 0) goto L9f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getClickTrackUrlList()
            java.lang.Long r1 = r0.getCreativeId()
            java.lang.String r0 = r0.getLogExtra()
            X.O8Z.LIZ(r3, r2, r1, r0)
        L9f:
            X.NPO r1 = new X.NPO
            r1.<init>()
            r0 = 42
            boolean r0 = X.AM0.LIZ(r7, r8, r0, r1)
            if (r0 != 0) goto Lc
            X.NO5.LIZIZ(r7, r8)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NW4.LJJIII(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.util.Map):void");
    }
}
