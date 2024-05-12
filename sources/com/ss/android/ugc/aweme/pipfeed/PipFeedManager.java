package com.ss.android.ugc.aweme.pipfeed;

import X.AbstractC48820JEa;
import X.AnonymousClass028;
import X.C113554cx;
import X.C16880lQ;
import X.C221108m2;
import X.C47261Igj;
import X.C48800JDg;
import X.C48802JDi;
import X.C48803JDj;
import X.C48804JDk;
import X.C48805JDl;
import X.C48807JDn;
import X.C48808JDo;
import X.C48811JDr;
import X.C4P;
import X.C51639KOl;
import X.C5H3;
import X.C60903NvH;
import X.C61898ORa;
import X.C63292e5;
import X.C76800UCe;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC48809JDp;
import X.InterfaceC48810JDq;
import X.InterfaceC63764P0u;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.JD8;
import X.JDE;
import X.JDO;
import X.JDV;
import X.JEE;
import X.JEF;
import X.JEG;
import X.JEK;
import X.JET;
import X.JEX;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.XKX;
import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.WindowManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS46S1000000_8;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class PipFeedManager implements JEX, InterfaceC63764P0u {
    public String currentPipScene;
    public long enterBackgroundTime;
    public boolean initialized;
    public boolean initializedComplianceSettings;
    public boolean isInPipMode;
    public Boolean isPipEnabled;
    public JEG pipFeedWindow;
    public boolean playerControllerNeedReportExtraRenderEvent;
    public boolean topActivityWillFinish;
    public long uiFirstDrawTime;
    public static final JDO Companion = new JDO();
    public static final List<String> sceneWhiteList = C47261Igj.LJJIJ("For You");
    public static final List<Integer> bannedAudioModes = C47261Igj.LJJIJIIJI(2, 3, 1);
    public final C5H3 _keva$delegate = C221108m2.LIZIZ(C48805JDl.LJLIL);
    public final CopyOnWriteArrayList<InterfaceC48810JDq> callbacks = new CopyOnWriteArrayList<>();
    public boolean isColdBoot = true;
    public String exitReason = "click_back_icon";
    public final C5H3 complianceBusinessService$delegate = C221108m2.LIZIZ(C48807JDn.LJLIL);
    public final C5H3 complianceSettingsService$delegate = C221108m2.LIZIZ(C48808JDo.LJLIL);
    public final C5H3 commendFeedService$delegate = C221108m2.LIZIZ(C48804JDk.LJLIL);
    public final C5H3 audioManager$delegate = C221108m2.LIZIZ(JD8.INSTANCE);
    public final List<InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object>> pendingBlocks = new ArrayList();
    public final List<InterfaceC65784Pro<C76800UCe>> enterBackgroundListeners = new ArrayList();
    public final C5H3 handler$delegate = C221108m2.LIZIZ(JDV.INSTANCE);
    public final Runnable startOneShotPipRunnable = new ARunnableS44S0100000_8(this, 27);
    public final C5H3 logs$delegate = C221108m2.LIZIZ(new AqS46S1000000_8("PIPMGR", 1));

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
        this.topActivityWillFinish = false;
        if (this.isColdBoot) {
            this.isColdBoot = false;
        } else {
            if (!isPipEnabled$pipfeed_release()) {
                return;
            }
            closePipWindow("click_back_icon");
        }
    }

    public final void onAppQuit$pipfeed_release() {
        this.topActivityWillFinish = true;
    }

    private final AudioManager getAudioManager() {
        return (AudioManager) this.audioManager$delegate.getValue();
    }

    private final FeedCommonService getCommendFeedService() {
        return (FeedCommonService) this.commendFeedService$delegate.getValue();
    }

    private final IComplianceBusinessService getComplianceBusinessService() {
        return (IComplianceBusinessService) this.complianceBusinessService$delegate.getValue();
    }

    private final IComplianceSettingsService getComplianceSettingsService() {
        return (IComplianceSettingsService) this.complianceSettingsService$delegate.getValue();
    }

    private final Keva get_keva() {
        return (Keva) this._keva$delegate.getValue();
    }

    private final void onWindowShowed() {
        this.exitReason = "click_exit_app";
        Iterator<InterfaceC48810JDq> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
        get_keva().storeBoolean("has_opened_pip", true);
        get_keva().storeBoolean("last_session_reported_exit", false);
        runWhenThisWindowClose$pipfeed_release(new AqS158S0100000_8(this, 95));
    }

    public final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    public final AbstractC48820JEa getLogs() {
        return (AbstractC48820JEa) this.logs$delegate.getValue();
    }

    public final boolean getPlayerControllerNeedReportExtraRenderEvent$pipfeed_release() {
        if (!this.playerControllerNeedReportExtraRenderEvent) {
            return false;
        }
        this.playerControllerNeedReportExtraRenderEvent = false;
        return true;
    }

    public final void initPip() {
        if (this.initialized) {
            return;
        }
        AbstractC48820JEa logs = getLogs();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[initPip] ");
        LIZ.append(System.currentTimeMillis());
        logs.LJIIIIZZ(X1D.LIZIZ(LIZ));
        ActivityStack.addAppBackGroundListener(this);
        synchronized (this) {
            this.initialized = true;
        }
        checkReportLastSessionExit();
    }

    public final boolean isCurrentSceneEligible$pipfeed_release() {
        return ORZ.LJLJJI(this.currentPipScene, sceneWhiteList);
    }

    public final boolean isPipEnabled$pipfeed_release() {
        Boolean valueOf;
        if (this.isPipEnabled == null) {
            if (C48800JDg.LIZ()) {
                valueOf = Boolean.FALSE;
            } else {
                valueOf = Boolean.valueOf(get_keva().getBoolean("enable_pip", false));
            }
            this.isPipEnabled = valueOf;
        }
        Boolean bool = this.isPipEnabled;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean isWindowShowing$pipfeed_release() {
        if (this.pipFeedWindow != null) {
            return true;
        }
        return false;
    }

    public final void onPrevActivityDestroyed$pipfeed_release() {
        closePipWindow("click_exit_app");
        FMX.onEventV3("activity_recycled_during_pip");
        AbstractC48820JEa logs = getLogs();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activity is recycled during pip: ");
        LIZ.append(ActivityStack.getTopActivity());
        logs.LJIIL(X1D.LIZIZ(LIZ));
    }

    public final void reportFirstVideoReady$pipfeed_release() {
        long j = this.uiFirstDrawTime;
        long j2 = this.enterBackgroundTime;
        if (1 <= j2 && j2 < j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.enterBackgroundTime;
            long j4 = elapsedRealtime - j3;
            long j5 = this.uiFirstDrawTime - j3;
            FMX.LJIIL("first_floating_window_show_duration", C113554cx.LJJL(new OSZ("total_duration", String.valueOf(j4)), new OSZ("ui_duration", String.valueOf(j5)), new OSZ("first_frame_duration", String.valueOf(j4 - j5))));
        }
    }

    private final void checkReportLastSessionExit() {
        long j;
        Double d;
        Double d2;
        int i = 0;
        if (!get_keva().getBoolean("last_session_reported_exit", false)) {
            Map map = (Map) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), get_keva().getString("last_session_record", "{}"), (Type) Map.class);
            Object obj = map.get("video_cnt");
            if ((obj instanceof Double) && (d2 = (Double) obj) != null) {
                i = (int) d2.doubleValue();
            }
            Object obj2 = map.get("duration");
            if ((obj2 instanceof Double) && (d = (Double) obj2) != null) {
                j = (long) d.doubleValue();
            } else {
                j = 0;
            }
            if (i > 0) {
                Map<String, ? extends Object> LJJLIL = C113554cx.LJJLIL(map);
                LJJLIL.put("video_cnt", Integer.valueOf(i));
                LJJLIL.put("duration", Long.valueOf(j));
                reportExitFloatingWindow$pipfeed_release(LJJLIL);
            }
        }
        get_keva().storeString("last_session_record", "{}");
    }

    private final boolean isAccountEligible() {
        return HG3.LJIILL().isLogin();
    }

    private final boolean isPrevActivityAvailable() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (!this.topActivityWillFinish && topActivity != null && !topActivity.isFinishing()) {
            return true;
        }
        return false;
    }

    private final void relaunchApp() {
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//main");
        buildRoute.withParam("enter_from_pip", true);
        buildRoute.withParam("enter_from_pip_recreate_activity", true);
        buildRoute.open();
    }

    private final void tryShowWindow() {
        int i;
        if (ActivityStack.getTopActivity() == null) {
            return;
        }
        JEF jef = new JEF(EF7.LIZIZ());
        if (jef.LIZIZ.getDefaultDisplay().getState() != 2) {
            jef.LJFF().LIZLLL("[showWindow] called when screen is off");
            jef.LIZIZ();
            return;
        }
        Iterator it = ((ArrayList) jef.LJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC48809JDp) it.next()).LIZIZ();
        }
        if (jef.LJFF == null) {
            jef.LIZJ = new C48811JDr(jef, jef.LJIJJLI);
            JEE LJIIJ = jef.LJIIJ(jef.LIZ);
            JET jet = new JET(jef, jef.LIZ);
            jet.addView(LJIIJ);
            jef.LJFF = jet;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            jef.LJIIIZ(null);
            C48811JDr c48811JDr = jef.LIZJ;
            if (c48811JDr != null) {
                int LIZJ = c48811JDr.LIZJ();
                C48811JDr c48811JDr2 = jef.LIZJ;
                if (c48811JDr2 != null) {
                    jef.LJIIIIZZ(LIZJ, c48811JDr2.LIZ());
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = 2038;
                    } else {
                        i = 2002;
                    }
                    layoutParams.type = i;
                    layoutParams.format = 1;
                    layoutParams.gravity = 51;
                    layoutParams.flags = 552;
                    C48811JDr c48811JDr3 = jef.LIZJ;
                    if (c48811JDr3 != null) {
                        layoutParams.width = c48811JDr3.LIZJ();
                        C48811JDr c48811JDr4 = jef.LIZJ;
                        if (c48811JDr4 != null) {
                            layoutParams.height = c48811JDr4.LIZ();
                            jef.LJIIJJI(layoutParams);
                            WindowManager windowManager = jef.LIZIZ;
                            JET jet2 = jef.LJFF;
                            C51639KOl.LIZ(new Object[]{jet2, layoutParams});
                            windowManager.addView(jet2, layoutParams);
                            int i2 = jef.LJIIJJI;
                            int i3 = jef.LJIIL;
                            jef.LJIILJJIL = (jef.LJIIIIZZ.y - i3) / ((i2 - i3) - jef.LJIILIIL);
                            AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(jef, 1);
                            ArrayList arrayList = (ArrayList) C4P.LIZIZ;
                            arrayList.add(aqS158S0100000_8);
                            if (arrayList.size() == 1) {
                                C16880lQ.LJJLIIIJILLIZJL((BroadcastReceiver) C4P.LIZ.getValue(), EF7.LIZIZ(), AnonymousClass028.LIZ("android.intent.action.CONFIGURATION_CHANGED"));
                            }
                            AbstractC48820JEa LJFF = jef.LJFF();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("[ShowWindow] size: ");
                            C48811JDr c48811JDr5 = jef.LIZJ;
                            if (c48811JDr5 != null) {
                                LIZ.append(c48811JDr5);
                                LIZ.append(" rel_position: ");
                                LIZ.append(jef.LJIILJJIL);
                                LJFF.LJIIIIZZ(X1D.LIZIZ(LIZ));
                            } else {
                                o.LJIJI("currentWindowSize");
                                throw null;
                            }
                        } else {
                            o.LJIJI("currentWindowSize");
                            throw null;
                        }
                    } else {
                        o.LJIJI("currentWindowSize");
                        throw null;
                    }
                } else {
                    o.LJIJI("currentWindowSize");
                    throw null;
                }
            } else {
                o.LJIJI("currentWindowSize");
                throw null;
            }
        }
        this.pipFeedWindow = jef;
        onWindowShowed();
    }

    public final boolean canStartPipNow$pipfeed_release() {
        Context LIZIZ = EF7.LIZIZ();
        if (isPipEnabled$pipfeed_release() && isCurrentSceneEligible$pipfeed_release() && isPrevActivityAvailable() && h.LJFF(LIZIZ) && JDE.LIZ() && !getComplianceBusinessService().LJIIZILJ() && isAccountEligible() && this.initializedComplianceSettings && !getCommendFeedService().LJIIL() && !bannedAudioModes.contains(Integer.valueOf(getAudioManager().getMode()))) {
            return true;
        }
        return false;
    }

    public final Keva getKeva() {
        Keva _keva = get_keva();
        o.LJIIIIZZ(_keva, "_keva");
        return _keva;
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
        JEK jek;
        this.enterBackgroundTime = SystemClock.elapsedRealtime();
        Iterator<InterfaceC65784Pro<C76800UCe>> it = this.enterBackgroundListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.enterBackgroundListeners.clear();
        if (canStartPipNow$pipfeed_release()) {
            this.isInPipMode = true;
            tryShowWindow();
            for (InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> block : this.pendingBlocks) {
                JEG jeg = this.pipFeedWindow;
                if (jeg != null && (jek = jeg.LJII) != null) {
                    o.LJIIIZ(block, "block");
                    ((ArrayList) jek.LJLILLLLZI).add(XKX.LIZLLL(jek, null, null, new C63292e5(block, jek, null), 3));
                }
            }
            this.pendingBlocks.clear();
        }
    }

    public final void onComplianceTakeDown$pipfeed_release() {
        AbstractC48820JEa logs = getLogs();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onComplianceTakeDown] isShowing: ");
        LIZ.append(isWindowShowing$pipfeed_release());
        LIZ.append(", called with ");
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        o.LJIIIIZZ(stackTrace, "currentThread().stackTrace");
        LIZ.append(C61898ORa.LJIILL(stackTrace));
        logs.LIZLLL(X1D.LIZIZ(LIZ));
        if (isWindowShowing$pipfeed_release()) {
            closePipWindow("click_exit_app");
        }
    }

    public final void onFetchedComplianceSetting$pipfeed_release() {
        getLogs().LJIIIIZZ("[onFetchedComplianceSetting] success");
        setInitializedComplianceSettings(true);
    }

    public final void reenterMainApp$pipfeed_release() {
        int i;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            relaunchApp();
            return;
        }
        Context LIZIZ = EF7.LIZIZ();
        Intent intent = new Intent(EF7.LIZIZ(), topActivity.getClass());
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(131072);
        intent.putExtra("enter_from_pip", true);
        intent.putExtra("enter_from_pip_recreate_activity", false);
        if (Build.VERSION.SDK_INT >= 31) {
            i = 335544320;
        } else {
            i = 268435456;
        }
        PendingIntent.getActivity(LIZIZ, 0, intent, i).send();
        closePipWindow("click_back_icon");
        a.LJIILL().LIZ();
    }

    public final void reportViewReady$pipfeed_release() {
        this.uiFirstDrawTime = SystemClock.elapsedRealtime();
    }

    public final CopyOnWriteArrayList<InterfaceC48810JDq> getCallbacks$pipfeed_release() {
        return this.callbacks;
    }

    public final String getExitReason$pipfeed_release() {
        return this.exitReason;
    }

    public final boolean isInPipMode$pipfeed_release() {
        return this.isInPipMode;
    }

    private final void closePipWindow(String str) {
        AbstractC48820JEa logs = getLogs();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[CloseWindow]: with reason ");
        LIZ.append(str);
        logs.LJIIIIZZ(X1D.LIZIZ(LIZ));
        this.exitReason = str;
        JEG jeg = this.pipFeedWindow;
        if (jeg != null) {
            jeg.LIZIZ();
            Iterator<InterfaceC48810JDq> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            ORS.LJJLIL(C48802JDi.LJLIL, this.callbacks);
        }
        this.pipFeedWindow = null;
        this.isInPipMode = false;
    }

    private final void runWhenEnterBackground(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.enterBackgroundListeners.add(interfaceC65784Pro);
    }

    private final void setInitializedComplianceSettings(boolean z) {
        if (this.initializedComplianceSettings) {
            return;
        }
        this.initializedComplianceSettings = z;
    }

    public final void closeWindowOnly$pipfeed_release(String reason) {
        o.LJIIIZ(reason, "reason");
        closePipWindow(reason);
    }

    public final void launchUtilWindowDestroy$pipfeed_release(InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> block) {
        JEK jek;
        o.LJIIIZ(block, "block");
        JEG jeg = this.pipFeedWindow;
        if (jeg != null && (jek = jeg.LJII) != null) {
            ((ArrayList) jek.LJLILLLLZI).add(XKX.LIZLLL(jek, null, null, new C63292e5(block, jek, null), 3));
        } else {
            if (!this.isInPipMode) {
                return;
            }
            this.pendingBlocks.add(block);
        }
    }

    @Override // X.JEX
    public void onAppBackground(Activity activity) {
        o.LJIIIZ(activity, "activity");
        isPipEnabled$pipfeed_release();
    }

    public final void reportExitFloatingWindow$pipfeed_release(Map<String, ? extends Object> params) {
        o.LJIIIZ(params, "params");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reporting exit with ");
        LIZ.append(params);
        String log = X1D.LIZIZ(LIZ);
        o.LJIIIZ(log, "log");
        AbstractC48820JEa logs = getLogs();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[CloseWindow] pip session info: ");
        LIZ2.append(params);
        logs.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        C60903NvH.LJJIJIL("exit_floating_window_mode", params);
        get_keva().storeBoolean("last_session_reported_exit", true);
    }

    public final void runWhenThisWindowClose$pipfeed_release(InterfaceC65784Pro<C76800UCe> r) {
        o.LJIIIZ(r, "r");
        this.callbacks.add(new C48803JDj(r));
    }

    public final void setPipEnabled$pipfeed_release(boolean z) {
        this.isPipEnabled = Boolean.valueOf(z);
        get_keva().storeBoolean("enable_pip", z);
    }

    public final void setPlayerControllerNeedReportExtraRenderEvent$pipfeed_release(boolean z) {
        if (z) {
            this.playerControllerNeedReportExtraRenderEvent = true;
        }
    }

    public final void setScene$pipfeed_release(String str) {
        this.currentPipScene = str;
    }

    public final void startPipByEnterBackground$pipfeed_release(long j) {
        if (j > 0) {
            runWhenEnterBackground(new AqS158S0100000_8(this, 96));
        }
        getHandler().removeCallbacks(this.startOneShotPipRunnable);
        getHandler().postDelayed(this.startOneShotPipRunnable, j);
    }

    public static /* synthetic */ void startPipByEnterBackground$pipfeed_release$default(PipFeedManager pipFeedManager, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        pipFeedManager.startPipByEnterBackground$pipfeed_release(j);
    }
}
