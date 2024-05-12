package X;

import Y.ARunnableS9S0101000_5;
import Y.AfS36S0101000_5;
import android.content.Context;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.bytedance.android.livesdk.init.FeedDelayInitTask;
import com.bytedance.android.livesdk.init.HybridInitTask;
import com.bytedance.android.livesdk.init.I18nInitTask;
import com.bytedance.android.livesdk.init.ImsdkInitTask;
import com.bytedance.android.livesdk.init.InternalServiceInitTask;
import com.bytedance.android.livesdk.init.LinkMicDslTask;
import com.bytedance.android.livesdk.init.LiveClientAiInitTask;
import com.bytedance.android.livesdk.init.LiveMockTask;
import com.bytedance.android.livesdk.init.LiveReplayVideoListTask;
import com.bytedance.android.livesdk.init.MonitorInitTask;
import com.bytedance.android.livesdk.init.OptUtilsTask;
import com.bytedance.android.livesdk.init.PBInitTask;
import com.bytedance.android.livesdk.init.ParasiticModulesTask;
import com.bytedance.android.livesdk.init.PipoInitTask;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;
import com.bytedance.android.livesdk.init.ServicePreloadTask;
import com.bytedance.android.livesdk.init.SettingAdapterPreloadTask;
import com.bytedance.android.livesdk.init.SettingUpdateTask;
import com.bytedance.android.livesdk.init.SlardarLiveTagInitTask;
import com.bytedance.android.livesdk.init.TaskManagerInitTask;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageFrontierSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDarkModeEnabledSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLayoutParamsStartCachingCallCountSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSettingsWriteDelayTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizDialogCloseDegradeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizDialogInterceptDegradeSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.google.gson.m;
import com.ss.android.ugc.aweme.live.hostbusiness.AdLiveHelperService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostAction;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostAppContext;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCommerce;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCreativeTool;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostFrescoHelper;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostHybrid;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostInnerInit;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostMonitorAndLog;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostNetwork;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceMonitor;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceOpt;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPersonalized;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPlugin;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostResource;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSetting;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostShare;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSubscription;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostUser;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CMn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31205CMn {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static C30033BqX LIZ() {
        if (!LIZIZ) {
            return null;
        }
        if (C30033BqX.LIZIZ == null) {
            synchronized (C30033BqX.class) {
                if (C30033BqX.LIZIZ == null) {
                    C30033BqX.LIZIZ = new C30033BqX();
                }
            }
        }
        return C30033BqX.LIZIZ;
    }

    public static void LIZIZ(CN3 cn3) {
        cn3.getClass();
        CN1.LIZIZ(IHostAction.class, new LiveHostAction());
        CN1.LIZIZ(IHostAppContext.class, new LiveHostAppContext());
        CN1.LIZIZ(IHostMonitorAndLog.class, new LiveHostMonitorAndLog());
        CN1.LIZIZ(IHostNetwork.class, new LiveHostNetwork());
        CN1.LIZIZ(IHostPlugin.class, new LiveHostPlugin());
        CN1.LIZIZ(IHostShare.class, new LiveHostShare());
        CN1.LIZIZ(IHostUser.class, new LiveHostUser());
        CN1.LIZIZ(IHostConfig.class, new LiveHostConfig());
        CN1.LIZIZ(IHostHybrid.class, new LiveHostHybrid());
        CN1.LIZIZ(IHostFrescoHelper.class, new LiveHostFrescoHelper());
        CN1.LIZIZ(IHostPerformanceMonitor.class, new LiveHostPerformanceMonitor());
        CN1.LIZIZ(IAdLiveHelperService.class, new AdLiveHelperService());
        CN1.LIZIZ(IHostSubscription.class, new LiveHostSubscription());
        CN1.LIZIZ(IHostPersonalized.class, new LiveHostPersonalized());
        CN1.LIZIZ(IHostSetting.class, new LiveHostSetting());
        CN1.LIZIZ(IHostCommerce.class, LiveHostCommerce.LJLIL);
        CN1.LIZIZ(IHostWatch.class, new LiveHostWatch());
        CN1.LIZIZ(IHostPerformanceOpt.class, new LiveHostPerformanceOpt());
        CN1.LIZIZ(IHostCreativeTool.class, new LiveHostCreativeTool());
        CN1.LIZIZ(IHostResource.class, new LiveHostResource());
    }

    public static void LIZJ(CN3 cn3) {
        boolean z;
        LJ(cn3);
        C62044OWq.LIZIZ("init_live_setting_init");
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) {
            z = true;
        } else {
            z = false;
        }
        SettingsManager.INSTANCE.init(z, new C77857Uh3(), new C31202CMk(z), C38995FSd.LIZIZ());
        C62044OWq.LIZ("init_live_setting_init");
        C62044OWq.LIZIZ("init_live_inner_init");
        cn3.getClass();
        new LiveHostInnerInit();
        new LiveHostInnerInit();
        new LiveHostInnerInit();
        CN0.LIZ = new LiveHostAppContext().isLocalTest();
        C62044OWq.LIZ("init_live_inner_init");
        C62044OWq.LIZIZ("init_live_register_service");
        C31206CMo c31206CMo = C31213CMv.LIZ;
        ((List) ((HashMap) c31206CMo.LIZ).get(0)).add(new SDKServiceInitTask());
        ((List) ((HashMap) c31206CMo.LIZ).get(0)).add(new TaskManagerInitTask());
        c31206CMo.LIZ(new LiveMockTask());
        c31206CMo.LIZ(new ServicePreloadTask());
        c31206CMo.LIZ(new SettingAdapterPreloadTask());
        c31206CMo.LIZ(new I18nInitTask());
        c31206CMo.LIZ(new PBInitTask());
        c31206CMo.LIZ(new InternalServiceInitTask());
        c31206CMo.LIZ(new FeedDelayInitTask());
        c31206CMo.LIZ(new PipoInitTask());
        c31206CMo.LIZ(new MonitorInitTask());
        c31206CMo.LIZ(new OptUtilsTask());
        c31206CMo.LIZ(new BadPhonesCommonOptTask());
        c31206CMo.LIZ(new ParasiticModulesTask());
        c31206CMo.LIZ(new HybridInitTask());
        c31206CMo.LIZ(new LinkMicDslTask());
        c31206CMo.LIZ(new ImsdkInitTask());
        c31206CMo.LIZ(new LiveReplayVideoListTask());
        c31206CMo.LIZ(new SlardarLiveTagInitTask());
        c31206CMo.LIZ(new SettingUpdateTask());
        c31206CMo.LIZ(new LiveClientAiInitTask());
        C62044OWq.LIZ("init_live_register_service");
        C62044OWq.LIZIZ("init_live_launch_task");
        c31206CMo.LIZIZ(0);
        c31206CMo.LIZIZ(1);
        C38995FSd.LIZIZ().execute(new ARunnableS9S0101000_5(1, c31206CMo, 21));
        synchronized (C31210CMs.class) {
            try {
                List<Runnable> list = C31210CMs.LIZ;
                if (!((ArrayList) list).isEmpty()) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                ((ArrayList) C31210CMs.LIZ).clear();
            } catch (Throwable unused) {
            }
        }
        C62044OWq.LIZ("init_live_launch_task");
        C62044OWq.LIZIZ("init_live_design_init");
        C259810g c259810g = C259710f.LIZ;
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        c259810g.getClass();
        c259810g.LIZIZ = C16880lQ.LLLLL(context);
        boolean isLocalTest = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest();
        C30922CBq.LIZIZ = isLocalTest;
        c259810g.LJIIZILJ = isLocalTest;
        c259810g.LJIIJJI = new C31211CMt();
        c259810g.LJIIL = new C06420Na();
        new LiveHostResource();
        c259810g.LJIIIZ = R.style.ij;
        new LiveHostResource();
        c259810g.LJIIJ = R.style.ii;
        c259810g.LJIILIIL = new C31215CMx();
        int value = LiveLayoutParamsStartCachingCallCountSetting.INSTANCE.getValue();
        c259810g.LJIILLIIL = value;
        C0RP.LIZJ = value;
        if (isLocalTest) {
            c259810g.LJIIIIZZ = true;
        } else {
            c259810g.LJIIIIZZ = LiveDarkModeEnabledSetting.INSTANCE.getValue();
        }
        new LiveHostResource();
        c259810g.LJ = C78927UyJ.LJLIL;
        c259810g.LJII = !LiveQuizDialogCloseDegradeSetting.INSTANCE.getValue();
        c259810g.LJI = !LiveQuizDialogInterceptDegradeSetting.INSTANCE.getValue();
        c259810g.LIZ = true;
        c259810g.LIZJ = new C06420Na();
        C259810g.LJIIIIZZ(R.drawable.d3e, new C42061kw());
        java.util.Map<String, String> xv = ((IHostResource) CN1.LIZ(IHostResource.class)).xv();
        java.util.Map<String, String> eg0 = ((IHostResource) CN1.LIZ(IHostResource.class)).eg0();
        HashMap hashMap = new HashMap();
        c259810g.LJIJI = xv;
        c259810g.LJIJJ = eg0;
        c259810g.LJIJJLI = hashMap;
        new LiveHostResource();
        c259810g.LJFF = R.style.im;
        c259810g.LIZLLL = new C48693J9d(new LiveHostResource());
        if (!C31216CMy.LIZ) {
            C18390nr LIZ2 = C18390nr.LIZ();
            new Object() { // from class: X.0ns
            };
            new C0W8(R.string.mo2);
            new C0W8(R.string.mo3);
            new C41211jZ(R.attr.au1);
            new C30461Hm(R.drawable.bpm);
            LIZ2.getClass();
            C18390nr LIZ3 = C18390nr.LIZ();
            new Object() { // from class: X.0ns
            };
            new C0W8(R.string.nhs);
            new C0W8(R.string.mo3);
            new C30461Hm(R.drawable.d4f);
            new C41211jZ(R.attr.avk);
            LIZ3.getClass();
            C31216CMy.LIZ = true;
        }
        c259810g.LJIJ = new C31212CMu();
        C62044OWq.LIZ("init_live_design_init");
        C62044OWq.LIZIZ("init_live_so_loader");
        LiveAppBundleUtils.initCoreSOLoader();
        C62044OWq.LIZ("init_live_so_loader");
        C62044OWq.LIZIZ("init_live_register_ws");
        if (LiveMessageFrontierSetting.INSTANCE.enable()) {
            ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).registerHostWS();
        }
        C62044OWq.LIZ("init_live_register_ws");
        LIZ = true;
    }

    public static void LIZLLL(CN3 cn3) {
        if (!LIZ) {
            synchronized (C31205CMn.class) {
                if (!LIZ) {
                    C62044OWq.LIZIZ("init_live_sdk_all_duration");
                    LIZJ(cn3);
                    C62044OWq.LIZ("init_live_sdk_all_duration");
                }
            }
        }
    }

    public static void LJ(CN3 cn3) {
        if (!LIZIZ) {
            synchronized (C31205CMn.class) {
                if (!LIZIZ) {
                    C62044OWq.LIZIZ("init_live_sdk_lite_duration");
                    LIZIZ(cn3);
                    C62044OWq.LIZ("init_live_sdk_lite_duration");
                }
                LIZIZ = true;
            }
        }
    }

    public static void LJFF(Context context, m mVar) {
        if (context != null && mVar != null) {
            AbstractC73672Svk.LJJLIIIJLJLI(LiveSettingsWriteDelayTimeSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJLIIL(new AfS36S0101000_5(2, mVar, 43), BTJ.LIZ);
        }
    }
}
