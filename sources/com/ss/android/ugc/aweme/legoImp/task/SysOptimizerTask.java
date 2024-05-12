package com.ss.android.ugc.aweme.legoImp.task;

import X.C00F;
import X.C0RN;
import X.C16880lQ;
import X.C19N;
import X.C33949DUb;
import X.C35222Ds2;
import X.C36089EEj;
import X.C36093EEn;
import X.C36922EeM;
import X.C37179EiV;
import X.C37278Ek6;
import X.C39529FfJ;
import X.C39791FjX;
import X.C47959Irz;
import X.C52225Keb;
import X.C52294Kfi;
import X.C53943LFb;
import X.C56662Kg;
import X.C64241PJd;
import X.C64246PJi;
import X.C65379PlH;
import X.C65416Pls;
import X.C76W;
import X.C78598Ut0;
import X.C84763XOl;
import X.C88074YhS;
import X.EE1;
import X.EE4;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FFL;
import X.FKM;
import X.FMX;
import X.InterfaceC36076EDw;
import X.InterfaceC65349Pkn;
import X.PKV;
import X.PKW;
import X.RunnableC36853EdF;
import X.X1D;
import X.X1G;
import X.YAG;
import Y.AfS38S0000000_6;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.ACodecGetPortFormatOptimizer;
import com.bytedance.sysoptimizer.ArtOptimizer;
import com.bytedance.sysoptimizer.BypassDexFileVerify;
import com.bytedance.sysoptimizer.DetachCurrentThreadOpt;
import com.bytedance.sysoptimizer.DvmDeadLockOptimizer;
import com.bytedance.sysoptimizer.DvmGlesOptimizer;
import com.bytedance.sysoptimizer.DvmOptimizer;
import com.bytedance.sysoptimizer.EglCreateSurfaceFixer;
import com.bytedance.sysoptimizer.EnlargePoolOpt;
import com.bytedance.sysoptimizer.GraphicsEnvOpt;
import com.bytedance.sysoptimizer.HeapGCOptimizer;
import com.bytedance.sysoptimizer.HighLevelTrimMemory;
import com.bytedance.sysoptimizer.JemallocAllocatorOptimizer;
import com.bytedance.sysoptimizer.JemallocSettingResult;
import com.bytedance.sysoptimizer.JitCodeCacheShrinker;
import com.bytedance.sysoptimizer.JitCompileMethodCrash;
import com.bytedance.sysoptimizer.JitDebugInfoOptimizer;
import com.bytedance.sysoptimizer.KGetCookieOptimizer;
import com.bytedance.sysoptimizer.LocalRefEnlarger;
import com.bytedance.sysoptimizer.MaliGpuExtIsSupportOptimizer;
import com.bytedance.sysoptimizer.MaliMemOptimizer;
import com.bytedance.sysoptimizer.MediaCodecReleaseOpt;
import com.bytedance.sysoptimizer.MteSigactionOpt;
import com.bytedance.sysoptimizer.NativeAllocatorOptimizer;
import com.bytedance.sysoptimizer.ONativeCryptoCRLOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.RedmiTypeFaceOptimizer;
import com.bytedance.sysoptimizer.SmEditTextLeakOpt;
import com.bytedance.sysoptimizer.StackLeakChecker;
import com.bytedance.sysoptimizer.StageFrightAndroid4Optimizer;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.sysoptimizer.SystemSensorManagerOptimizer;
import com.bytedance.sysoptimizer.TestMteReport;
import com.bytedance.sysoptimizer.TryCallOptABTest;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.bytedance.sysoptimizer.VMDebugDumpHprofOptimizer;
import com.bytedance.sysoptimizer.VdexDupLoadOptimizer;
import com.bytedance.sysoptimizer.VivoPerfFrameInfoManagerImplOptimizer;
import com.bytedance.sysoptimizer.allocatorx.JemallocExtend;
import com.bytedance.sysoptimizer.fake.name.SmFakeNameHandler;
import com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import com.bytedance.sysoptimizer.java.IAutofillManagerProtector;
import com.bytedance.sysoptimizer.java.IConnectivityManagerProtector;
import com.bytedance.sysoptimizer.java.OppoNAlarmProtector;
import com.bytedance.sysoptimizer.perflock.PerfLockBooster;
import com.bytedance.xtrace.XTrace;
import com.google.gson.g;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.HeapGCSettingParam;
import com.ss.android.ugc.aweme.experiment.RegionSpaceShrinkParams;
import com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer;
import defpackage.e1;
import defpackage.i0;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes16.dex */
public class SysOptimizerTask implements EE1, InterfaceC36076EDw {
    public Boolean LJLIL;
    public boolean LJLILLLLZI;

    /* loaded from: classes16.dex */
    public static class ArtOatFileDumpParam {

        @InterfaceC65349Pkn("disable_oatfile_dump")
        public boolean disable_oatfile_dump = true;
    }

    /* loaded from: classes16.dex */
    public static class ArtOptimizerParam {

        @InterfaceC65349Pkn("optimize_sub_proc")
        public boolean optimize_sub_proc;

        @InterfaceC65349Pkn("optimizer_enable")
        public boolean optimizer_enable;
    }

    /* loaded from: classes16.dex */
    public static class JemallocExtendParams {

        @InterfaceC65349Pkn("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("main_thread_extend")
        public boolean mainThreadExtend;

        @InterfaceC65349Pkn("render_thread_extend")
        public boolean renderThreadExtend;
    }

    /* loaded from: classes16.dex */
    public static class JemallocExtendParamsAutoFinal {

        @InterfaceC65349Pkn("arena_num")
        public int arenaNum = -1;

        @InterfaceC65349Pkn("decay_time")
        public int decayTime = -1;

        @InterfaceC65349Pkn("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @InterfaceC65349Pkn("enable")
        public boolean enable;
    }

    /* loaded from: classes16.dex */
    public static class JemallocExtendParamsEx {

        @InterfaceC65349Pkn("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("max_thread_nums")
        public int maxThreadNums;
    }

    /* loaded from: classes16.dex */
    public static class JemallocExtendParamsSpecific {

        @InterfaceC65349Pkn("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("lib_name")
        public String libName;

        @InterfaceC65349Pkn("max_thread_nums")
        public int maxThreadNums;
    }

    /* loaded from: classes7.dex */
    public static class JemallocOptimizerParams {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("enable_purge")
        public boolean enable_purge;

        @InterfaceC65349Pkn("optimize_option")
        public int optimize_option = -1;
    }

    /* loaded from: classes10.dex */
    public static class JitCodeShrinkParam {

        @InterfaceC65349Pkn("shrink_size_mb")
        public int shrink_size_mb = -1;

        @InterfaceC65349Pkn("hook_mprotect_type")
        public int hook_mprotect_type = -1;
    }

    /* loaded from: classes16.dex */
    public static class MtkPvrOptimizerParam {

        @InterfaceC65349Pkn("always_catch_sigsegv")
        public boolean always_catch_sigsegv;

        @InterfaceC65349Pkn("enable_optimizer")
        public boolean enable_optimizer;

        @InterfaceC65349Pkn("target_devices")
        public String[] target_devices;
    }

    /* loaded from: classes16.dex */
    public static class NativePerflockParams {

        @InterfaceC65349Pkn("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("perflock_param_string")
        public String perflockParmaString;

        @InterfaceC65349Pkn("timeout")
        public int timeout;
    }

    /* loaded from: classes10.dex */
    public static class RuntimeHeapExpansionParameters {

        @InterfaceC65349Pkn("expand_value_mb")
        public int expandBy;

        @InterfaceC65349Pkn("enable")
        public boolean isEnabled;

        @InterfaceC65349Pkn("do_remap")
        public boolean remap;

        @InterfaceC65349Pkn("run_before_boot_finished")
        public boolean runBeforeBootFinished;
    }

    /* loaded from: classes16.dex */
    public static class StackLeakCheckerParams {

        @InterfaceC65349Pkn("auto_fix_allowlist")
        public String auto_fix_list;

        @InterfaceC65349Pkn("enable_checker")
        public boolean enable_checker;

        @InterfaceC65349Pkn("report_threshold")
        public int report_threshold = 100;

        @InterfaceC65349Pkn("check_interval_mins")
        public int check_interval_mins = 100;
    }

    /* loaded from: classes10.dex */
    public static class SysOptRuntimeHeapExpansionTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptRuntimeHeapExpansionTask";
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

        @Override // X.EE1
        public final EFK type() {
            RuntimeHeapExpansionParameters runtimeHeapExpansionParameters = (RuntimeHeapExpansionParameters) i0.LJ(true, "tiktok_runtime_heap_expansion", 31744, RuntimeHeapExpansionParameters.class, null);
            if (runtimeHeapExpansionParameters == null) {
                runtimeHeapExpansionParameters = new RuntimeHeapExpansionParameters();
            }
            if (runtimeHeapExpansionParameters.runBeforeBootFinished) {
                return EFK.BACKGROUND;
            }
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EEY
        public final void run(Context context) {
            RuntimeHeapExpansionParameters runtimeHeapExpansionParameters = (RuntimeHeapExpansionParameters) i0.LJ(true, "tiktok_runtime_heap_expansion", 31744, RuntimeHeapExpansionParameters.class, null);
            if (runtimeHeapExpansionParameters == null) {
                runtimeHeapExpansionParameters = new RuntimeHeapExpansionParameters();
            }
            if (runtimeHeapExpansionParameters.isEnabled) {
                HeapGCOptimizer.heapExpand(context, runtimeHeapExpansionParameters.expandBy, runtimeHeapExpansionParameters.remap);
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class VMShrinkerParam {

        @InterfaceC65349Pkn("shrink_enable")
        public boolean shrink_enable;
    }

    @Override // X.EEY
    public final String key() {
        return "SysOptimizerTask";
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static void LJIILJJIL() {
        boolean LJ = C19N.LJ("BundleSizeTooLargeSwitch", true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bundleCheckerEnabled: ");
        LIZ.append(LJ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SysOptimizerTask", X1D.LIZIZ(LIZ));
        if (LJ) {
            AwemeHostApplication LIZ2 = FKM.LIZ();
            final ArrayDeque arrayDeque = new ArrayDeque(3);
            LIZ2.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.08i
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    try {
                        if (arrayDeque.size() >= 3) {
                            arrayDeque.removeFirst();
                        }
                        arrayDeque.addLast(Pair.create(new WeakReference(bundle), activity.getClass().getName()));
                    } catch (Throwable unused) {
                    }
                }
            });
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.1B5
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    if (str != null) {
                        try {
                            if (str.contains("android.os.TransactionTooLargeException")) {
                                final StringBuilder sb = new StringBuilder();
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    Bundle bundle = (Bundle) ((WeakReference) pair.first).get();
                                    if (bundle != null) {
                                        int LIZJ = C026408m.LIZJ(bundle);
                                        sb.append("Activity: ");
                                        sb.append((String) pair.second);
                                        sb.append(", Bundle size: ");
                                        sb.append(C026408m.LIZIZ(LIZJ));
                                        sb.append('\n');
                                        C026408m.LIZ(bundle, sb, 4);
                                        sb.append('\n');
                                    }
                                }
                                Npth.addAttachLongUserData(new AttachUserData() { // from class: X.1B4
                                    @Override // com.bytedance.crash.AttachUserData
                                    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType2) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("BundleTooLarge", sb.toString());
                                        return hashMap;
                                    }
                                }, CrashType.JAVA);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }, CrashType.JAVA);
        }
    }

    public static void LJJIII() {
        int i = Build.VERSION.SDK_INT;
        if (i > 32 || i < 26) {
            return;
        }
        int LIZ = C00F.LIZ(31744, 0, "tiktok_weak_ref_unblock_opt", true);
        if (LIZ == 1) {
            JatoXL.weakRefUnblock();
        } else {
            if (LIZ != 2) {
                return;
            }
            LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.13
                @Override // X.EEY
                public final String key() {
                    return "SysOptimizerTask$13";
                }

                @Override // X.EEY
                public final void run(Context context) {
                    JatoXL.weakRefUnblock();
                }
            });
        }
    }

    public final void LJJI() {
        boolean LJ = C19N.LJ("window_manager_stack_guard", false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("windowManagerGuardEnable: ");
        LIZ.append(LJ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SysOptimizerTask", X1D.LIZIZ(LIZ));
        if (LJ) {
            AndroidNWindowManagerProtector.install(new YAG(this));
        }
    }

    @Override // X.InterfaceC36076EDw
    public final String[] deps() {
        return new String[]{"ABTask"};
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (((Boolean) C33949DUb.LIZLLL.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LJ() {
        int size = SysOptimizer.getLoadLibraryError().size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        do {
            LJIJ("load_so_exception", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "SysOptimizerTask Thread", (Throwable) ListProtector.get(SysOptimizer.getLoadLibraryError(), i));
            i++;
        } while (i < size);
    }

    public static void LJIILLIIL() {
        try {
            SettingsManager.LIZLLL().getClass();
            VMShrinkerParam vMShrinkerParam = (VMShrinkerParam) SettingsManager.LJII("shrink_settings", VMShrinkerParam.class);
            if (vMShrinkerParam != null && vMShrinkerParam.shrink_enable) {
                Shrinker shrinker = Shrinker.getInstance();
                SettingsManager.LIZLLL().getClass();
                shrinker.doShrink(SettingsManager.LJ("shrink_threshold", 512));
            }
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class BootFinishTask implements EE1 {
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
        public final int targetProcess() {
            return 1;
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
    }

    /* loaded from: classes10.dex */
    public class SysMemOptBootFinishTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysMemOptBootFinishTask";
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

        public SysMemOptBootFinishTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            int i;
            SysOptimizerTask.this.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "tiktok_native_thread_shrink_opt", true, false)) {
                NativeAllocatorOptimizer.doShrinkNativeThread(context, 524288);
            }
            if (e1.LIZ(31744, "tiktok_native_java_thread_precise_shrink_opt", true, false)) {
                int LIZ = C00F.LIZ(31744, -1, "tiktok_native_java_thread_precise_shrink_parameter", true);
                if (e1.LIZ(31744, "tiktok_native_java_thread_precise_shrink_64bit", true, false)) {
                    NativeAllocatorOptimizer.doShrinkJavaNativeThread(context, LIZ, true);
                } else {
                    NativeAllocatorOptimizer.doShrinkJavaNativeThread(context, LIZ, false);
                }
            }
            if (e1.LIZ(31744, "tt_webview_reserved_shrink_opt", true, false)) {
                JatoXL.shrinkWebviewNative();
            }
            if (e1.LIZ(31744, "tt_vdex_dup_load_opt", true, false)) {
                VdexDupLoadOptimizer.optimize(context);
            }
            JitCodeShrinkParam jitCodeShrinkParam = (JitCodeShrinkParam) i0.LJ(true, "tt_jit_code_cache_shrink_v4", 31744, JitCodeShrinkParam.class, null);
            if (jitCodeShrinkParam != null && (i = jitCodeShrinkParam.shrink_size_mb) > 0) {
                JitCodeCacheShrinker.shrink(context, i, jitCodeShrinkParam.hook_mprotect_type);
            }
            if (e1.LIZ(31744, "tt_vdex_dup_load_opt", true, false)) {
                VdexDupLoadOptimizer.optimize(context);
            }
            int LIZ2 = C00F.LIZ(31744, -1, "tt_renderd128_memory_opt", true);
            if (LIZ2 > 0) {
                Npth.startOptMtkBuffer(LIZ2);
            }
            int LIZ3 = C00F.LIZ(31744, 0, "tiktok_graphic_extra_buffer_bf_opt", true);
            if (LIZ3 != 0) {
                NativeAllocatorOptimizer.doSetExtraGraphicBuffer(context, LIZ3);
            }
            HeapGCSettingParam heapGCSettingParam = (HeapGCSettingParam) i0.LJ(true, "heap_gc_adjust_bootfinish", 31744, HeapGCSettingParam.class, null);
            if (!SysOptimizerTask.this.LJLILLLLZI && heapGCSettingParam != null && heapGCSettingParam.enable) {
                HeapGCOptimizer.optimize(context, heapGCSettingParam.minFreeRatio, heapGCSettingParam.maxFreeRatio, heapGCSettingParam.foregroundMulRatio);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class MainThreadTask implements EE1 {
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
        public final int targetProcess() {
            return 1;
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
            return EFK.MAIN;
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptAddMemAllocator implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptAddMemAllocator";
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
            return EFK.BACKGROUND;
        }

        public SysOptAddMemAllocator() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJJII(context);
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptCheckSoLoadResult implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptCheckSoLoadResult";
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
            SysOptimizerTask.LJ();
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptDisableDumpOatFileForANR implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptDisableDumpOatFileForANR";
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
            return EFK.BACKGROUND;
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask.LJII(context);
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptDvmOptimizer implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptDvmOptimizer";
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
            return EFK.BACKGROUND;
        }

        public SysOptDvmOptimizer() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask sysOptimizerTask = SysOptimizerTask.this;
            System.currentTimeMillis();
            sysOptimizerTask.getClass();
            DvmOptimizer.optDvmLinearAllocBuffer(context);
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptEnableStackLeakChecker implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptEnableStackLeakChecker";
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
            return EFK.BACKGROUND;
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask.LJIIL(context);
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptFixSamSungGetNameCrash implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptFixSamSungGetNameCrash";
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
            return EFK.BACKGROUND;
        }

        @Override // X.EEY
        public final void run(Context context) {
            if (C19N.LJ("fix_samsung_field_get_name_crash", true)) {
                SmFakeNameHandler.start(context);
            }
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptHeapGCAdjustTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptHeapGCAdjustTask";
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
            return EFK.BACKGROUND;
        }

        public SysOptHeapGCAdjustTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask.this.LJIJJLI(context);
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptMaliSwapBufferError implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptMaliSwapBufferError";
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
            return EFK.BACKGROUND;
        }

        public SysOptMaliSwapBufferError() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJJIFFI(context);
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptOptimizeShrinker implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptOptimizeShrinker";
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
            return EFK.BACKGROUND;
        }

        @Override // X.EEY
        public final void run(Context context) {
            SysOptimizerTask.LJIILLIIL();
        }
    }

    /* loaded from: classes7.dex */
    public class SysOptOptimizeSuspendTimeout implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptOptimizeSuspendTimeout";
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
            return EFK.BACKGROUND;
        }

        @Override // X.EEY
        public final void run(Context context) {
            if (e1.LIZ(31744, "suspendtimeout_opt", true, true)) {
                SysOptimizerTask.LJIIZILJ(context);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class SysOptHookOptimizerEnable implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "SysOptimizerTask$SysOptHookOptimizerEnable";
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
            return EFK.BACKGROUND;
        }

        public SysOptHookOptimizerEnable() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            System.currentTimeMillis();
            if (Build.VERSION.SDK_INT == 24) {
                HighLevelTrimMemory.optimize(context);
            }
            DvmDeadLockOptimizer.optimize(context);
            if (FCD.LJI(context)) {
                SysOptimizerTask.LJIILL(context);
            }
            SysOptimizerTask.this.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "fix_jit_compile_method_crash_opt", true, false)) {
                JitCompileMethodCrash.optimize(context);
            }
            if (C19N.LJ("egl_create_surface_crash_enable", false)) {
                EglCreateSurfaceFixer.fixOsOP(context, 2);
            }
            SysOptimizerTask.LIZLLL(context);
            SysOptimizerTask.this.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("hprof_dump_data_opt", true)) {
                VMDebugDumpHprofOptimizer.fix(context);
            }
            if (FCD.LJI(context)) {
                SysOptimizerTask.this.getClass();
                FFL.LJIIIZ().getClass();
                if (FFL.LJ(31744, "tiktok_vivo_perf_anr_fix", true, false)) {
                    VivoPerfFrameInfoManagerImplOptimizer.fix(context);
                }
            }
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJIJJ(context);
            SysOptimizerTask.this.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("fix_package_not_belong", false)) {
                BinderServiceWrapperProtector.setDebug(false);
                IConnectivityManagerProtector.install(context);
                IAutofillManagerProtector.install(context);
                OppoNAlarmProtector.install(context);
            }
            SysOptimizerTask.this.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("type_face_opt_switch", true)) {
                TypeFaceOptimizer.start();
            }
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJJ(context);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ul_native_crypto_opt", false)) {
                ONativeCryptoCRLOptimizer.fix(context);
            }
            if (C19N.LJ("ul_mali_gpu_format_opt", false)) {
                MaliGpuExtIsSupportOptimizer.fix(context);
            }
            if (C19N.LJ("ul_kitkat_get_cookie_opt", false)) {
                KGetCookieOptimizer.fix(context);
            }
            SysOptimizerTask.this.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, -1, "detach_current_thread_crash_fix_ab2", true) > 0) {
                DetachCurrentThreadOpt.fix(context);
            }
            SysOptimizerTask.this.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("red_mi_typeface_fix", false)) {
                RedmiTypeFaceOptimizer.fixOnAndroidQ(context);
            }
            SysOptimizerTask.this.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("stage_fright_fix", false)) {
                StageFrightAndroid4Optimizer.fixStageFrightAndroid4(context);
            }
            SysOptimizerTask.this.getClass();
            MediaCodecReleaseOpt.fix(context, true);
            DvmGlesOptimizer.fix(context);
            SysOptimizer.hookOptimizerEnable();
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJIILJJIL();
            C65416Pls.LIZ();
            SysOptimizerTask.this.LJJI();
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJIL(context);
            SysOptimizerTask.this.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "tiktok_a_codec_get_port_format", true, false)) {
                ACodecGetPortFormatOptimizer.fixACodecGetPortFormat(context);
            }
            SysOptimizerTask.this.getClass();
            FFL.LJIIIZ().getClass();
            int LJIIJ = FFL.LJIIJ(31744, -1, "enlarge_pool_opt", true);
            if (LJIIJ > 0) {
                EnlargePoolOpt.fix(context, LJIIJ);
            }
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJIILIIL(context);
            SysOptimizerTask.this.getClass();
            SysOptimizerTask.LJJIII();
            SysOptimizerTask.this.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "fix_dump_stack", true, false)) {
                Npth.setFixDumpStack(true);
            } else {
                Npth.setFixDumpStack(false);
            }
            System.currentTimeMillis();
            SysOptimizerTask.this.LJLIL.booleanValue();
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static void LIZLLL(Context context) {
        int i;
        if (C00F.LIZ(31744, 0, "bypass_dexfile_verify_v2", true) <= 0 || (i = Build.VERSION.SDK_INT) < 24 || i > 27) {
            return;
        }
        BypassDexFileVerify.bypassVerify(context);
    }

    public static void LJII(Context context) {
        try {
            SettingsManager.LIZLLL().getClass();
            ArtOatFileDumpParam artOatFileDumpParam = (ArtOatFileDumpParam) SettingsManager.LJII("art_oatfile_dump_settings", ArtOatFileDumpParam.class);
            if (artOatFileDumpParam == null) {
                ArtOptimizer.disableDumpOatFileForANR(context);
            } else {
                if (!artOatFileDumpParam.disable_oatfile_dump) {
                    return;
                }
                ArtOptimizer.disableDumpOatFileForANR(context);
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJIIJ(BootFinishTask bootFinishTask) {
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(bootFinishTask, true);
        LJIIIZ.LIZJ();
    }

    public static void LJIIJJI(Context context) {
        final NativePerflockParams nativePerflockParams = (NativePerflockParams) i0.LJ(true, "tiktok_native_perflock_settings", 31744, NativePerflockParams.class, null);
        if (nativePerflockParams != null && nativePerflockParams.enable) {
            if (nativePerflockParams.doWhenBootFinish) {
                LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.10
                    @Override // X.EEY
                    public final String key() {
                        return "SysOptimizerTask$10";
                    }

                    @Override // X.EEY
                    public final void run(Context context2) {
                        String str = NativePerflockParams.this.perflockParmaString;
                        if (str != null) {
                            String[] split = str.split(",");
                            int[] iArr = new int[split.length];
                            for (int i = 0; i < split.length; i++) {
                                try {
                                    iArr[i] = CastIntegerProtector.parseInt(split[i], 16);
                                    if (i == split.length - 1) {
                                        PerfLockBooster.boostDevWithParams(context2, iArr, NativePerflockParams.this.timeout);
                                    }
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                        }
                    }
                });
                return;
            }
            String str = nativePerflockParams.perflockParmaString;
            if (str == null) {
                return;
            }
            String[] split = str.split(",");
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                try {
                    iArr[i] = CastIntegerProtector.parseInt(split[i], 16);
                    if (i == split.length - 1) {
                        PerfLockBooster.boostDevWithParams(context, iArr, nativePerflockParams.timeout);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    public static void LJIIL(Context context) {
        String[] strArr;
        try {
            SettingsManager.LIZLLL().getClass();
            StackLeakCheckerParams stackLeakCheckerParams = (StackLeakCheckerParams) SettingsManager.LJII("enable_stack_leak_checker", StackLeakCheckerParams.class);
            if (stackLeakCheckerParams == null || !stackLeakCheckerParams.enable_checker) {
                return;
            }
            StackLeakChecker.registerStackLeakListener(new C37278Ek6());
            StackLeakChecker.setInterval(stackLeakCheckerParams.report_threshold, stackLeakCheckerParams.check_interval_mins * 6 * 10000000);
            String str = stackLeakCheckerParams.auto_fix_list;
            if (str != null && str.length() > 1) {
                strArr = stackLeakCheckerParams.auto_fix_list.split(":");
            } else {
                strArr = null;
            }
            StackLeakChecker.enableChecker(context, strArr);
        } catch (Throwable unused) {
        }
    }

    public static void LJIILIIL(Context context) {
        if (EF7.LJIILLIIL) {
            boolean fix = MteSigactionOpt.fix(context);
            int LIZ = C00F.LIZ(31744, -1, "mte_test_type", true);
            if (fix && LIZ != -1) {
                TestMteReport.testSigSegv(context, LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(android.content.Context r5) {
        /*
            r3 = 0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "mtk_power_vr_optimizer"
            java.lang.Class<com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$MtkPvrOptimizerParam> r0 = com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.MtkPvrOptimizerParam.class
            r2.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r4 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L21
            com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$MtkPvrOptimizerParam r4 = (com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.MtkPvrOptimizerParam) r4     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L21
            java.lang.String[] r0 = r4.target_devices     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L22
            int r1 = r0.length     // Catch: java.lang.Throwable -> L1f
            r0 = 0
        L1a:
            if (r0 >= r1) goto L22
            int r0 = r0 + 1
            goto L1a
        L1f:
            if (r4 != 0) goto L22
        L21:
            return
        L22:
            boolean r0 = r4.enable_optimizer
            if (r0 == 0) goto L41
            java.lang.String[] r2 = r4.target_devices
            if (r2 == 0) goto L5c
            int r0 = r2.length
            if (r0 <= 0) goto L5c
            java.lang.String r1 = "all_devices"
            r0 = r2[r3]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5c
            java.lang.String[] r3 = r4.target_devices
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r1 = android.os.Build.MODEL
            if (r1 != 0) goto L42
        L3f:
            if (r2 != 0) goto L52
        L41:
            return
        L42:
            if (r2 == 0) goto L51
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L51
            r0 = 32
            java.lang.String r2 = X.C00F.LIZIZ(r2, r0, r1)
            goto L3f
        L51:
            r2 = r1
        L52:
            java.util.List r0 = java.util.Arrays.asList(r3)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L41
        L5c:
            boolean r0 = r4.always_catch_sigsegv
            com.bytedance.sysoptimizer.MTK_PVR_Optimizer.setAlwaysCatchSIGSEGV(r0)
            com.bytedance.sysoptimizer.MTK_PVR_Optimizer.enable(r5)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.LJIILL(android.content.Context):void");
    }

    public static void LJIIZILJ(Context context) {
        try {
            SettingsManager.LIZLLL().getClass();
            ArtOptimizerParam artOptimizerParam = (ArtOptimizerParam) SettingsManager.LJII("art_suspend_timeout_settings", ArtOptimizerParam.class);
            if (artOptimizerParam == null) {
                ArtOptimizer.optSuspendTimeout(context);
            } else {
                if (!artOptimizerParam.optimizer_enable) {
                    return;
                }
                if (artOptimizerParam.optimize_sub_proc || FCD.LJI(context)) {
                    ArtOptimizer.optSuspendTimeout(context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJIJI(boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
        C37179EiV.LIZJ(false).execute(new RunnableC36853EdF(z, C16880lQ.LLLLIIIILLL().getName(), currentTimeMillis));
    }

    public static void LJIJJ(Context context) {
        if (C19N.LJ("fix_sensor_at_index", true)) {
            SystemSensorManagerOptimizer.fix(context);
        }
        if (C19N.LJ("local_ref_enlarger", false)) {
            LocalRefEnlarger.fix(context);
        }
    }

    public static void LJIL(Context context) {
        if (Build.VERSION.SDK_INT > 27 && ((Boolean) C35222Ds2.LIZ.getValue()).booleanValue()) {
            JitDebugInfoOptimizer.install(context, false);
        }
    }

    public static void LJJ(Context context) {
        if (C19N.LJ("register_broadcast_protector", true) && (C16880lQ.LLLLL(context) instanceof Application)) {
            ReceiverRegisterCrashOptimizer.fix((Application) C16880lQ.LLLLL(context));
        }
        ReceiverRegisterCrashOptimizer.setDoRegisterHandlerCallback(new C65379PlH());
    }

    public static void LJJIFFI(Context context) {
        if (Build.VERSION.SDK_INT < 29 || !Process.is64Bit() || !C19N.LJ("opt_mali_swap_buffer_error_enable", false)) {
            return;
        }
        MaliMemOptimizer.enableMaliGLErrorSkip(context, false);
    }

    public static void LJJII(Context context) {
        int i;
        String str;
        if (NativeAllocatorOptimizer.isJemallocAllocator(context)) {
            JemallocOptimizerParams jemallocOptimizerParams = (JemallocOptimizerParams) i0.LJ(true, "tiktok_jemalloc_settings", 31744, JemallocOptimizerParams.class, null);
            if (jemallocOptimizerParams != null && jemallocOptimizerParams.enable) {
                NativeAllocatorOptimizer.optimize(context, jemallocOptimizerParams.optimize_option);
            }
            int LIZ = C00F.LIZ(31744, -1, "tiktok_jemalloc_decaytime_opt", true);
            if (LIZ > 0) {
                NativeAllocatorOptimizer.doJemallocDecayOpt(context, LIZ);
            }
            ArrayList arrayList = new ArrayList();
            boolean LIZ2 = e1.LIZ(31744, "tiktok_jemalloc_do_decay_time_at_boot_finish", true, false);
            if (e1.LIZ(31744, "tiktok_jemalloc_thread_tcache_enabled", true, false)) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocThreadTcacheEnabled(context, true));
            }
            int LIZ3 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arena_decay_time", true);
            if (LIZ3 != Integer.MIN_VALUE) {
                if (LIZ2) {
                    JemallocOptimizer.LIZ(new JemallocOptimizer.BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer.1
                        public final /* synthetic */ int LJLIL;

                        @Override // X.EEY
                        public final String key() {
                            return "JemallocOptimizer$1";
                        }

                        public AnonymousClass1(int LIZ32) {
                            r1 = LIZ32;
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocOptimizer.LIZIZ(JemallocAllocatorOptimizer.doJemallocArenaDecayTime(context2, r1));
                        }
                    });
                } else {
                    arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaDecayTime(context, LIZ32));
                }
            }
            String LIZLLL = C47959Irz.LIZLLL(31744, "tiktok_jemalloc_arena_dss", "null", true);
            if (LIZLLL != null && !LIZLLL.equals("null")) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaDss(context, LIZLLL));
            }
            int LIZ4 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arena_lg_dirty_mult", true);
            if (LIZ4 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaLgDirtyMult(context, LIZ4));
            }
            int LIZ5 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arena_dirty_decay_ms", true);
            if (LIZ5 != Integer.MIN_VALUE) {
                if (LIZ2) {
                    JemallocOptimizer.LIZ(new JemallocOptimizer.BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer.2
                        public final /* synthetic */ int LJLIL;

                        @Override // X.EEY
                        public final String key() {
                            return "JemallocOptimizer$2";
                        }

                        public AnonymousClass2(int LIZ52) {
                            r1 = LIZ52;
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocOptimizer.LIZIZ(JemallocAllocatorOptimizer.doJemallocArenaDirtyDecayMs(context2, r1));
                        }
                    });
                } else {
                    arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaDirtyDecayMs(context, LIZ52));
                }
            }
            int LIZ6 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arena_muzzy_decay_ms", true);
            if (LIZ6 != Integer.MIN_VALUE) {
                if (LIZ2) {
                    JemallocOptimizer.LIZ(new JemallocOptimizer.BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer.3
                        public final /* synthetic */ int LJLIL;

                        @Override // X.EEY
                        public final String key() {
                            return "JemallocOptimizer$3";
                        }

                        public AnonymousClass3(int LIZ62) {
                            r1 = LIZ62;
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocOptimizer.LIZIZ(JemallocAllocatorOptimizer.doJemallocArenaMuzzyDecayMs(context2, r1));
                        }
                    });
                } else {
                    arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaMuzzyDecayMs(context, LIZ62));
                }
            }
            int LIZ7 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arena_retain_grow_limit", true);
            if (LIZ7 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaRetainGrowLimit(context, LIZ7));
            }
            int LIZ8 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arenas_lg_dirty_mult", true);
            if (LIZ8 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasLgDirtyMult(context, LIZ8));
            }
            int LIZ9 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arenas_decay_time", true);
            if (LIZ9 != Integer.MIN_VALUE) {
                if (LIZ2) {
                    JemallocOptimizer.LIZ(new JemallocOptimizer.BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer.4
                        public final /* synthetic */ int LJLIL;

                        @Override // X.EEY
                        public final String key() {
                            return "JemallocOptimizer$4";
                        }

                        public AnonymousClass4(int LIZ92) {
                            r1 = LIZ92;
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocOptimizer.LIZIZ(JemallocAllocatorOptimizer.doJemallocArenasDecayTime(context2, r1));
                        }
                    });
                } else {
                    arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasDecayTime(context, LIZ92));
                }
            }
            int LIZ10 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arenas_dirty_decay_ms", true);
            if (LIZ10 != Integer.MIN_VALUE) {
                if (LIZ2) {
                    JemallocOptimizer.LIZ(new JemallocOptimizer.BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer.5
                        public final /* synthetic */ int LJLIL;

                        @Override // X.EEY
                        public final String key() {
                            return "JemallocOptimizer$5";
                        }

                        public AnonymousClass5(int LIZ102) {
                            r1 = LIZ102;
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocOptimizer.LIZIZ(JemallocAllocatorOptimizer.doJemallocArenasDirtyDecayMs(context2, r1));
                        }
                    });
                } else {
                    arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasDirtyDecayMs(context, LIZ102));
                }
            }
            int LIZ11 = C00F.LIZ(31744, LiveLayoutPreloadThreadPriority.DEFAULT, "tiktok_jemalloc_arenas_muzzy_decay_ms", true);
            if (LIZ11 != Integer.MIN_VALUE) {
                if (LIZ2) {
                    JemallocOptimizer.LIZ(new JemallocOptimizer.BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.JemallocOptimizer.6
                        public final /* synthetic */ int LJLIL;

                        @Override // X.EEY
                        public final String key() {
                            return "JemallocOptimizer$6";
                        }

                        public AnonymousClass6(int LIZ112) {
                            r1 = LIZ112;
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocOptimizer.LIZIZ(JemallocAllocatorOptimizer.doJemallocArenasMuzzyDecayMs(context2, r1));
                        }
                    });
                } else {
                    arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasMuzzyDecayMs(context, LIZ112));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JemallocSettingResult jemallocSettingResult = (JemallocSettingResult) it.next();
                C76W c76w = new C76W();
                c76w.LIZ("option", jemallocSettingResult.optionName);
                c76w.LIZ("origin_value", jemallocSettingResult.rawValue);
                c76w.LIZ("setting_value", jemallocSettingResult.settingValue);
                c76w.LIZ("result", String.valueOf(jemallocSettingResult.exitCode));
                FMX.LJIILJJIL("android_jemalloc_setting_result", c76w.LIZIZ());
            }
            int LIZ12 = C00F.LIZ(31744, 0, "tiktok_hwui_purge_control_ab", true);
            if (LIZ12 != 0) {
                JemallocExtend.hwuiPurgeCtl(context, LIZ12);
            }
            final JemallocExtendParams jemallocExtendParams = (JemallocExtendParams) i0.LJ(true, "tiktok_jemalloc_extend_settings", 31744, JemallocExtendParams.class, null);
            if (jemallocExtendParams != null && jemallocExtendParams.enable) {
                if (jemallocExtendParams.doWhenBootFinish) {
                    LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.3
                        @Override // X.EEY
                        public final String key() {
                            return "SysOptimizerTask$3";
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            if (JemallocExtendParams.this.mainThreadExtend) {
                                JemallocExtend.extendArena(context2);
                            }
                            if (JemallocExtendParams.this.renderThreadExtend) {
                                JemallocExtend.renderThreadExtendArena(context2);
                            }
                        }
                    });
                } else {
                    if (jemallocExtendParams.mainThreadExtend) {
                        MainThreadTask mainThreadTask = new MainThreadTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.4
                            @Override // X.EEY
                            public final String key() {
                                return "SysOptimizerTask$4";
                            }

                            @Override // X.EEY
                            public final void run(Context context2) {
                                JemallocExtend.extendArena(context2);
                            }
                        };
                        C36093EEn.LIZ.getClass();
                        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                        LJIIIZ.LIZIZ(mainThreadTask, true);
                        LJIIIZ.LIZJ();
                    }
                    if (jemallocExtendParams.renderThreadExtend) {
                        JemallocExtend.renderThreadExtendArena(context);
                    }
                }
            }
            final JemallocExtendParamsEx jemallocExtendParamsEx = (JemallocExtendParamsEx) i0.LJ(true, "tiktok_jemalloc_extend_ex_art", 31744, JemallocExtendParamsEx.class, null);
            if (jemallocExtendParamsEx != null && jemallocExtendParamsEx.enable) {
                if (jemallocExtendParamsEx.doWhenBootFinish) {
                    LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.5
                        @Override // X.EEY
                        public final String key() {
                            return "SysOptimizerTask$5";
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocExtend.artThreadExtendArena(context2, JemallocExtendParamsEx.this.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.artThreadExtendArena(context, jemallocExtendParamsEx.maxThreadNums);
                }
            }
            final JemallocExtendParamsEx jemallocExtendParamsEx2 = (JemallocExtendParamsEx) i0.LJ(true, "tiktok_jemalloc_extend_ex_player", 31744, JemallocExtendParamsEx.class, null);
            if (jemallocExtendParamsEx2 != null && jemallocExtendParamsEx2.enable) {
                if (jemallocExtendParamsEx2.doWhenBootFinish) {
                    LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.6
                        @Override // X.EEY
                        public final String key() {
                            return "SysOptimizerTask$6";
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocExtend.playerExtendArena(context2, JemallocExtendParamsEx.this.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.playerExtendArena(context, jemallocExtendParamsEx2.maxThreadNums);
                }
            }
            final JemallocExtendParamsEx jemallocExtendParamsEx3 = (JemallocExtendParamsEx) i0.LJ(true, "tiktok_jemalloc_extend_ex_partial_libs", 31744, JemallocExtendParamsEx.class, null);
            if (jemallocExtendParamsEx3 != null && jemallocExtendParamsEx3.enable) {
                if (jemallocExtendParamsEx3.doWhenBootFinish) {
                    LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.7
                        @Override // X.EEY
                        public final String key() {
                            return "SysOptimizerTask$7";
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocExtend.otherCoreLibsExtendArena(context2, JemallocExtendParamsEx.this.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.otherCoreLibsExtendArena(context, jemallocExtendParamsEx3.maxThreadNums);
                }
            }
            final JemallocExtendParamsSpecific jemallocExtendParamsSpecific = (JemallocExtendParamsSpecific) i0.LJ(true, "tiktok_jemalloc_extend_ex_specific", 31744, JemallocExtendParamsSpecific.class, null);
            if (jemallocExtendParamsSpecific != null && jemallocExtendParamsSpecific.enable && (str = jemallocExtendParamsSpecific.libName) != null) {
                if (jemallocExtendParamsSpecific.doWhenBootFinish) {
                    LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.8
                        @Override // X.EEY
                        public final String key() {
                            return "SysOptimizerTask$8";
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocExtendParamsSpecific jemallocExtendParamsSpecific2 = JemallocExtendParamsSpecific.this;
                            JemallocExtend.extendArenaSpecific(context2, jemallocExtendParamsSpecific2.libName, jemallocExtendParamsSpecific2.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.extendArenaSpecific(context, str, jemallocExtendParamsSpecific.maxThreadNums);
                }
            }
            final JemallocExtendParamsAutoFinal jemallocExtendParamsAutoFinal = (JemallocExtendParamsAutoFinal) i0.LJ(true, "tiktok_jemalloc_extend_auto_final", 31744, JemallocExtendParamsAutoFinal.class, null);
            if (jemallocExtendParamsAutoFinal != null && jemallocExtendParamsAutoFinal.enable && (i = jemallocExtendParamsAutoFinal.arenaNum) > 0) {
                if (jemallocExtendParamsAutoFinal.doWhenBootFinish) {
                    LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.9
                        @Override // X.EEY
                        public final String key() {
                            return "SysOptimizerTask$9";
                        }

                        @Override // X.EEY
                        public final void run(Context context2) {
                            JemallocExtendParamsAutoFinal jemallocExtendParamsAutoFinal2 = JemallocExtendParamsAutoFinal.this;
                            JemallocExtend.extendMultiArenaToAuto(context2, jemallocExtendParamsAutoFinal2.arenaNum, jemallocExtendParamsAutoFinal2.decayTime);
                        }
                    });
                } else {
                    JemallocExtend.extendMultiArenaToAuto(context, i, jemallocExtendParamsAutoFinal.decayTime);
                }
            }
        }
        int LIZ13 = C00F.LIZ(31744, 0, "tiktok_graphic_extra_buffer_opt", true);
        if (LIZ13 != 0) {
            NativeAllocatorOptimizer.doSetExtraGraphicBuffer(context, LIZ13);
        }
    }

    public final void LJIJJLI(Context context) {
        HeapGCSettingParam heapGCSettingParam = (HeapGCSettingParam) i0.LJ(true, "heap_gc_adjust_settings", 31744, HeapGCSettingParam.class, null);
        if (heapGCSettingParam != null && heapGCSettingParam.enable) {
            HeapGCOptimizer.optimize(context, heapGCSettingParam.minFreeRatio, heapGCSettingParam.maxFreeRatio, heapGCSettingParam.foregroundMulRatio);
            this.LJLILLLLZI = true;
        }
        if (e1.LIZ(31744, "tiktok_native_thread_shrink_immediate", true, false)) {
            NativeAllocatorOptimizer.doShrinkNativeThread(context, 524288);
        }
        if (e1.LIZ(31744, "tiktok_native_thread_shrink_64bit", true, false)) {
            NativeAllocatorOptimizer.doShrinkNativeThread(context, 524288, true);
        }
        RegionSpaceShrinkParams regionSpaceShrinkParams = (RegionSpaceShrinkParams) i0.LJ(true, "region_space_shrink_exp_v2", 31744, RegionSpaceShrinkParams.class, null);
        if (regionSpaceShrinkParams != null && regionSpaceShrinkParams.enable) {
            HeapGCOptimizer.VssConfig vssConfig = new HeapGCOptimizer.VssConfig();
            vssConfig.firstDelay = regionSpaceShrinkParams.firstDelay;
            vssConfig.periodOfCheck = regionSpaceShrinkParams.periodOfCheck;
            vssConfig.periodOfShrink = regionSpaceShrinkParams.periodOfShrink;
            vssConfig.periodOfLessMemoryUsage = regionSpaceShrinkParams.periodOfLessMemoryUsage;
            vssConfig.shrinkStep = regionSpaceShrinkParams.shrinkStep;
            vssConfig.lowerLimit = regionSpaceShrinkParams.lowerLimit;
            HeapGCOptimizer.optimizeRegionSpaceVSS(context, vssConfig);
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        int i;
        int LIZ;
        C36922EeM.LJ("SysOptimizerTask");
        FFL.LJIIIZ().getClass();
        boolean LJ = FFL.LJ(31744, "use_new_try_call", true, false);
        if (LJ) {
            TryCallOptABTest.newTryOPt(context, LJ);
        }
        this.LJLIL = Boolean.valueOf(FCD.LJI(context));
        try {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("out_of_memory_error_clear_bitmap_cache", false);
        } catch (Throwable unused) {
        }
        if (((Boolean) C88074YhS.LJIIJ.getValue()).booleanValue()) {
            System.currentTimeMillis();
            C36093EEn.LIZ.getClass();
            C36089EEj c36089EEj = new C36089EEj(false, false);
            c36089EEj.LIZIZ(new SysOptRuntimeHeapExpansionTask(), true);
            c36089EEj.LIZIZ(new SysOptDvmOptimizer(), true);
            c36089EEj.LIZIZ(new SysOptOptimizeSuspendTimeout(), true);
            c36089EEj.LIZIZ(new SysOptFixSamSungGetNameCrash(), true);
            c36089EEj.LIZIZ(new SysOptAddMemAllocator(), true);
            c36089EEj.LIZIZ(new SysOptMaliSwapBufferError(), true);
            c36089EEj.LIZIZ(new SysOptHeapGCAdjustTask(), true);
            c36089EEj.LIZIZ(new SysMemOptBootFinishTask(), true);
            c36089EEj.LIZIZ(new SysOptDisableDumpOatFileForANR(), true);
            c36089EEj.LIZIZ(new SysOptHookOptimizerEnable(), true);
            c36089EEj.LIZIZ(new SysOptOptimizeShrinker(), true);
            c36089EEj.LIZIZ(new SysOptEnableStackLeakChecker(), true);
            c36089EEj.LIZIZ(new SysOptCheckSoLoadResult(), true);
            c36089EEj.LIZJ();
            return;
        }
        System.currentTimeMillis();
        SysOptRuntimeHeapExpansionTask sysOptRuntimeHeapExpansionTask = new SysOptRuntimeHeapExpansionTask();
        if (sysOptRuntimeHeapExpansionTask.type() == EFK.BOOT_FINISH) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(sysOptRuntimeHeapExpansionTask, true);
            LJIIIZ.LIZJ();
        } else {
            sysOptRuntimeHeapExpansionTask.run(context);
        }
        DvmOptimizer.optDvmLinearAllocBuffer(context);
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "suspendtimeout_opt", true, true)) {
            LJIIZILJ(context);
        }
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ2 = C36093EEn.LJIIIZ();
        LJIIIZ2.LIZIZ(new SysMemOptBootFinishTask(), true);
        LJIIIZ2.LIZJ();
        LJJIFFI(context);
        LJIJJLI(context);
        LJJII(context);
        FFL.LJIIIZ().getClass();
        int LJIIJ = FFL.LJIIJ(31744, -1, "enlarge_pool_opt", true);
        if (LJIIJ > 0) {
            EnlargePoolOpt.fix(context, LJIIJ);
        }
        LJIILIIL(context);
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "fix_dump_stack", true, false)) {
            Npth.setFixDumpStack(true);
        } else {
            Npth.setFixDumpStack(false);
        }
        if (C19N.LJ("fix_samsung_field_get_name_crash", true)) {
            SmFakeNameHandler.start(context);
        }
        LJII(context);
        if (Build.VERSION.SDK_INT == 24) {
            HighLevelTrimMemory.optimize(context);
        }
        DvmDeadLockOptimizer.optimize(context);
        if (FCD.LJI(context)) {
            LJIILL(context);
        }
        if (e1.LIZ(31744, "fix_jit_compile_method_crash_opt", true, false)) {
            JitCompileMethodCrash.optimize(context);
        }
        LJIJJ(context);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fix_package_not_belong", false)) {
            BinderServiceWrapperProtector.setDebug(false);
            IConnectivityManagerProtector.install(context);
            IAutofillManagerProtector.install(context);
            OppoNAlarmProtector.install(context);
        }
        if (C19N.LJ("type_face_opt_switch", true)) {
            TypeFaceOptimizer.start();
        }
        LJJ(context);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ul_native_crypto_opt", false)) {
            ONativeCryptoCRLOptimizer.fix(context);
        }
        if (C19N.LJ("ul_mali_gpu_format_opt", false)) {
            MaliGpuExtIsSupportOptimizer.fix(context);
        }
        if (C19N.LJ("ul_kitkat_get_cookie_opt", false)) {
            KGetCookieOptimizer.fix(context);
        }
        if (C19N.LJ("red_mi_typeface_fix", false)) {
            RedmiTypeFaceOptimizer.fixOnAndroidQ(context);
        }
        Application application = (Application) context;
        if (C19N.LJ("samsung_et_leak_opt", true)) {
            SmEditTextLeakOpt.optimize(application);
            C84763XOl.LJI().LJJJJZI(new AfS38S0000000_6(0));
        }
        if (C19N.LJ("stage_fright_fix", false)) {
            StageFrightAndroid4Optimizer.fixStageFrightAndroid4(context);
        }
        MediaCodecReleaseOpt.fix(context, true);
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "hint_activity_launch_crash_fix_ab", true, false)) {
            GraphicsEnvOpt.fix(context);
        }
        if (C00F.LIZ(31744, -1, "detach_current_thread_crash_fix_ab2", true) > 0) {
            DetachCurrentThreadOpt.fix(context);
        }
        if (C19N.LJ("egl_create_surface_crash_enable", false)) {
            EglCreateSurfaceFixer.fixOsOP(context, 2);
        }
        LIZLLL(context);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fix_NativeCrypto_d2i_X509_CRL_bio_crash", true)) {
            ONativeCryptoCRLOptimizer.fix(context);
        }
        DvmGlesOptimizer.fix(context);
        SysOptimizer.hookOptimizerEnable();
        LJIILLIIL();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("hprof_dump_data_opt", true)) {
            VMDebugDumpHprofOptimizer.fix(context);
        }
        if (e1.LIZ(31744, "tiktok_vivo_perf_anr_fix", true, false)) {
            VivoPerfFrameInfoManagerImplOptimizer.fix(context);
        }
        LJIIL(context);
        C52225Keb.LIZ.getClass();
        if (C52225Keb.LIZIZ) {
            try {
                Reflect on = Reflect.on("com.mediatek.view.ViewDebugManager");
                on.set("sInstance", on.create().get());
            } catch (Throwable unused2) {
            }
        }
        if (C52294Kfi.LIZ) {
            try {
                Reflect.on("com.android.internal.policy.DecorView").set("sHasRelativeVolumeFeature", Boolean.FALSE);
            } catch (Throwable unused3) {
            }
        }
        LJ();
        LJIILJJIL();
        C65416Pls.LIZ();
        LJJI();
        LJIL(context);
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "tiktok_a_codec_get_port_format", true, false)) {
            ACodecGetPortFormatOptimizer.fixACodecGetPortFormat(context);
        }
        int LIZ2 = C00F.LIZ(31744, -1, "string_builder_opt_ab", true);
        if (LIZ2 == 1) {
            X1D.LIZ = new C39791FjX();
        } else if (LIZ2 == 2) {
            X1D.LIZ = new X1G();
        }
        LJJIII();
        LJIIJJI(context);
        LJIIJ(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.1
            @Override // X.EEY
            public final String key() {
                return "SysOptimizerTask$1";
            }

            @Override // X.EEY
            public final void run(Context context2) {
                SysOptimizerTask sysOptimizerTask = SysOptimizerTask.this;
                sysOptimizerTask.getClass();
                FFL.LJIIIZ().getClass();
                if (FFL.LJ(31744, "tiktok_native_perflock_work_with_lifecycle", true, false)) {
                    ((Application) EF7.LIZIZ()).registerActivityLifecycleCallbacks(new C53943LFb(sysOptimizerTask));
                }
            }
        });
        if (!this.LJLIL.booleanValue() || (i = Build.VERSION.SDK_INT) < 23) {
            return;
        }
        if (Process.is64Bit() && e1.LIZ(31744, "enable_jni_ref_monitor", true, false)) {
            JSONArray jSONArray = new JSONArray();
            FFL.LJIIIZ().getClass();
            jSONArray.put(FFL.LJIIJ(31744, 5000, "jni_global_ref_threshold", true));
            FFL.LJIIIZ().getClass();
            jSONArray.put(FFL.LJIIJ(31744, 5000, "jni_weak_global_ref_threshold", true));
            if (i >= 26) {
                LIZ = C00F.LIZ(31744, 5000, "jni_local_ref_threshold", true);
            } else {
                LIZ = C00F.LIZ(31744, 435, "jni_local_ref_threshold_below_o", true);
            }
            jSONArray.put(LIZ);
            FFL.LJIIIZ().getClass();
            PKV.LIZ(jSONArray, FFL.LJIIJ(31744, 7, "jni_monitor_type", true));
        }
        if (i < 26 || !Process.is64Bit() || !e1.LIZ(31744, "enable_xtrace", true, false) || SettingsManager.LIZLLL().LJIIIIZZ("dynamic_trace_config", g.class, null) == null || C39529FfJ.LIZ) {
            return;
        }
        if (XTrace.init(context)) {
            System.err.println("init trace success");
            XTrace.setInterceptor(new C78598Ut0());
            try {
                C39529FfJ.LIZ();
            } catch (Throwable th) {
                PrintStream printStream = System.err;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("startTrace failed:");
                LIZ3.append(th);
                printStream.println(X1D.LIZIZ(LIZ3));
            }
        }
        C39529FfJ.LIZ = true;
    }

    public static void LJIJ(String str, String str2, String str3, String str4, String str5, Throwable th) {
        C64246PJi LJJIFFI = C64246PJi.LJJIFFI(th.getStackTrace()[th.getStackTrace().length - 1], PKW.LJ(th.getStackTrace()), str2, str5, false, str3, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(th.toString());
        LJJIFFI.LIZJ(str, arrayList);
        LJJIFFI.LJFF(str4, "true");
        C64241PJd.LIZIZ(LJJIFFI);
    }
}
