package com.ss.android.ugc.aweme.services;

import X.AnonymousClass114;
import X.C00F;
import X.C113554cx;
import X.C162476Zf;
import X.C17N;
import X.C2068389v;
import X.C221108m2;
import X.C26045AKb;
import X.C2NU;
import X.C48203Ivv;
import X.C4VT;
import X.C58096Mr6;
import X.C5H3;
import X.C61664OIa;
import X.C61665OIb;
import X.C61666OIc;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C78983UzD;
import X.C82544WaS;
import X.C84443Tc;
import X.C84453Td;
import X.C84483Tg;
import X.EnumC111394Yt;
import X.FKM;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC69602oG;
import X.InterfaceC84463Te;
import X.MG5;
import X.MG6;
import X.ORZ;
import X.OSZ;
import X.WM7;
import X.X1D;
import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS11S2000000_9;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NetworkStandardUIServiceImpl implements INetworkStandardUIService, InterfaceC69602oG {
    public static final Companion Companion = new Companion();
    public static final int TIPS_ENABLE_KEY = R.id.cys;
    public boolean needPortal;
    public int retryCount;
    public final Map<WeakReference<C73305Spp>, WeakReference<InterfaceC65784Pro<C76800UCe>>> autoRetryListener = new LinkedHashMap();
    public final C5H3 init$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 168));
    public long tipsBarrierTime = 10000;
    public final Map<MG5, Runnable> showLazyToastWhenFake = new LinkedHashMap();
    public final ConcurrentHashMap<String, Long> historyToast = new ConcurrentHashMap<>();

    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC111394Yt.values().length];
            try {
                iArr[EnumC111394Yt.NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC111394Yt.FAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC111394Yt.AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC111394Yt.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean hasRetryButton() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public boolean isStandardUIEnable() {
        if (C00F.LIZ(31744, 2, "network_standard_ui_experiment", true) != 0) {
            return true;
        }
        return false;
    }

    public boolean triggerNetworkTipsForSharePanelExperiment(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return false;
    }

    private final boolean autoRefresh() {
        if (C00F.LIZ(31744, 2, "network_standard_ui_experiment", true) == 2 || C00F.LIZ(31744, 2, "network_standard_ui_experiment", true) == 3) {
            return true;
        }
        return false;
    }

    private final boolean getInit() {
        return ((Boolean) this.init$delegate.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public InterfaceC84463Te getNetworkStateForSharePanel() {
        int i;
        if (!C4VT.LIZJ()) {
            return C84453Td.LIZ;
        }
        EnumC111394Yt enumC111394Yt = C2NU.LIZ.LIZJ;
        if (enumC111394Yt != null && (i = WhenMappings.$EnumSwitchMapping$0[enumC111394Yt.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C162476Zf();
                        }
                    } else {
                        if (NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork()) {
                            return C84483Tg.LIZ;
                        }
                        return C84453Td.LIZ;
                    }
                } else {
                    return C61665OIb.LIZ;
                }
            } else {
                if (C48203Ivv.LIZJ(FKM.LIZ())) {
                    return C61664OIa.LIZ;
                }
                return C61666OIc.LIZ;
            }
        }
        return C84443Tc.LIZ;
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public static final class StatusInfo {
        public int networkStatus;
        public int retryCount;
        public InterfaceC65784Pro<C76800UCe> retryFunc;
        public String sceneName;

        public final int getNetworkStatus() {
            return this.networkStatus;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final InterfaceC65784Pro<C76800UCe> getRetryFunc() {
            return this.retryFunc;
        }

        public final String getSceneName() {
            return this.sceneName;
        }

        public final void setNetworkStatus(int i) {
            this.networkStatus = i;
        }

        public final void setRetryCount(int i) {
            this.retryCount = i;
        }

        public final void setRetryFunc(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
            this.retryFunc = interfaceC65784Pro;
        }

        public final void setSceneName(String str) {
            this.sceneName = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void registerForNetworkChangeToasts() {
        getInit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a4, code lost:
    
        if (r0.hasTransport(0) == true) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d3, code lost:
    
        if (r0.getType() == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int checkForTag(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.checkForTag(android.content.Context):int");
    }

    private final boolean checkNetworkDiagnosisOn(String str) {
        if (e1.LIZ(31744, "openNetworkDiagosis", true, false) && ORZ.LJLJJI(str, MG6.LIZJ)) {
            return true;
        }
        return false;
    }

    private final boolean checkRepeatedToast(String str) {
        Long l = this.historyToast.get(str);
        if (l == null || SystemClock.uptimeMillis() - l.longValue() > this.tipsBarrierTime) {
            this.historyToast.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            return false;
        }
        return true;
    }

    private final boolean checkStatusIfChanged(C73305Spp c73305Spp) {
        Object tag;
        if (c73305Spp != null && (tag = c73305Spp.getTag(R.id.gyr)) != null) {
            if (((StatusInfo) tag).getNetworkStatus() == checkForTag(FKM.LIZ())) {
                return false;
            }
        }
        return true;
    }

    public static INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(INetworkStandardUIService.class, z);
        if (LIZ != null) {
            return (INetworkStandardUIService) LIZ;
        }
        if (C58096Mr6.V5 == null) {
            synchronized (INetworkStandardUIService.class) {
                if (C58096Mr6.V5 == null) {
                    C58096Mr6.V5 = new NetworkStandardUIServiceImpl();
                }
            }
        }
        return C58096Mr6.V5;
    }

    public final StatusInfo getStatus(C73305Spp c73305Spp) {
        Object tag;
        if (c73305Spp == null || (tag = c73305Spp.getTag(R.id.gyr)) == null || !(tag instanceof StatusInfo)) {
            return null;
        }
        return (StatusInfo) tag;
    }

    public final void initTipsEnableTag(C73305Spp statusView) {
        o.LJIIIZ(statusView, "statusView");
        if (statusView.getTag(TIPS_ENABLE_KEY) == null && statusView.isShown()) {
            markTipsEnable(statusView, false);
        }
    }

    public final boolean isTipsEnable(C73305Spp statusView) {
        o.LJIIIZ(statusView, "statusView");
        if (!statusView.isShown()) {
            return true;
        }
        return o.LJ(statusView.getTag(TIPS_ENABLE_KEY), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void removeLazyToast(MG5 sceneName) {
        o.LJIIIZ(sceneName, "sceneName");
        if (sceneName != MG5.DEFAULT && this.showLazyToastWhenFake.remove(sceneName) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeLazyToast ");
            LIZ.append(sceneName);
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void resetTipsBarrier(C73305Spp tuxStatusView) {
        o.LJIIIZ(tuxStatusView, "tuxStatusView");
        markTipsEnable(tuxStatusView, false);
    }

    private final void tipsShowEvent(String str, String str2) {
        FMX.LJIIL("network_toast_show", C113554cx.LJJL(new OSZ("toast_content", str), new OSZ(WM7.SCENE_SERVICE, str2)));
    }

    public final void markTipsEnable(C73305Spp c73305Spp, boolean z) {
        c73305Spp.setTag(TIPS_ENABLE_KEY, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC69602oG
    public void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt enumC111394Yt2) {
        EnumC111394Yt enumC111394Yt3 = EnumC111394Yt.AVAILABLE;
        if (enumC111394Yt != enumC111394Yt3 && enumC111394Yt2 == enumC111394Yt3) {
            if (!checkRepeatedToast(MG5.FULL_FEED.getValue())) {
                Activity activity = ActivityStack.getTopActivity();
                o.LJIIIIZZ(activity, "activity");
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIIIZZ(R.string.dtl);
                c26045AKb.LJIIJ();
            }
            if (!autoRefresh()) {
                return;
            }
            for (Map.Entry<WeakReference<C73305Spp>, WeakReference<InterfaceC65784Pro<C76800UCe>>> entry : this.autoRetryListener.entrySet()) {
                final C73305Spp c73305Spp = entry.getKey().get();
                final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = entry.getValue().get();
                if (c73305Spp != null) {
                    markTipsEnable(c73305Spp, true);
                    C82544WaS.LIZLLL(500L, new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$onChange$1$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1__run$___twin___() {
                            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2;
                            if (C73305Spp.this.isAttachedToWindow() && (interfaceC65784Pro2 = interfaceC65784Pro) != null) {
                                interfaceC65784Pro2.invoke();
                            }
                        }

                        public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$onChange$1$1$1 networkStandardUIServiceImpl$onChange$1$1$1) {
                            boolean LIZ;
                            try {
                                networkStandardUIServiceImpl$onChange$1$1$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1__run$___twin___();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public final void retryEvent(String toastContent, String scene) {
        o.LJIIIZ(toastContent, "toastContent");
        o.LJIIIZ(scene, "scene");
        FMX.LJIIL("network_retry", C113554cx.LJJL(new OSZ("toast_content", toastContent), new OSZ(WM7.SCENE_SERVICE, scene), new OSZ("network_status", String.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()))));
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void startLazyToast(final MG5 sceneName, final Activity activity) {
        o.LJIIIZ(sceneName, "sceneName");
        if (sceneName != MG5.DEFAULT && activity != null) {
            this.showLazyToastWhenFake.put(sceneName, new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1__run$___twin___() {
                    if (!activity.isFinishing() && !activity.isDestroyed() && C2NU.LIZ.LIZJ == EnumC111394Yt.FAKE) {
                        this.triggerNetworkTips(activity, sceneName, (Exception) null, (C73305Spp) null);
                    }
                }

                public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1 networkStandardUIServiceImpl$startLazyToast$1$showToast$1) {
                    boolean LIZ;
                    try {
                        networkStandardUIServiceImpl$startLazyToast$1$showToast$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            C82544WaS.LIZLLL(5000L, new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$startLazyToast$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1__run$___twin___() {
                    Runnable remove = NetworkStandardUIServiceImpl.this.showLazyToastWhenFake.remove(sceneName);
                    if (remove != null) {
                        remove.run();
                    }
                }

                public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$startLazyToast$1$1 networkStandardUIServiceImpl$startLazyToast$1$1) {
                    boolean LIZ;
                    try {
                        networkStandardUIServiceImpl$startLazyToast$1$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private final void forceShowTips(Activity activity, int i, String str) {
        AnonymousClass114.LIZ(activity, i);
    }

    private final boolean showTips(Activity activity, int i, String str) {
        String str2;
        if (MG6.LIZLLL.contains(str)) {
            str2 = MG5.FULL_FEED.getValue();
        } else {
            str2 = str;
        }
        if (checkRepeatedToast(str)) {
            return false;
        }
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
        String string = activity.getString(i);
        o.LJIIIIZZ(string, "activity.getString(resId)");
        tipsShowEvent(string, str2);
        return true;
    }

    private final C73306Spq smallPanelStatusView(String str, String str2, String str3) {
        String str4;
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ != null) {
            str4 = LIZ.getString(R.string.n9);
        } else {
            str4 = null;
        }
        C73306Spq c73306Spq = new C73306Spq();
        o.LJI(str);
        c73306Spq.LJFF = str;
        o.LJI(str2);
        c73306Spq.LJI = str2;
        if (hasRetryButton()) {
            c73306Spq.LJII = new AqS28S1000000_3(str4, 4);
        }
        return c73306Spq;
    }

    public final void onEvent(final int i, final String str, final String str2) {
        C82544WaS.LIZ(new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$onEvent$1
            public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1__run$___twin___() {
                try {
                    int effectiveConnectionType = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType();
                    JSONObject jSONObject = new JSONObject();
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    jSONObject.put("connection_error_type", i2);
                    jSONObject.put("network_status", effectiveConnectionType);
                    jSONObject.put("enter_from", str3);
                    jSONObject.put("exit_method", str4);
                    FMX.LJIILJJIL("network_diagnosis_panel", jSONObject);
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$onEvent$1 networkStandardUIServiceImpl$onEvent$1) {
                boolean LIZ;
                try {
                    networkStandardUIServiceImpl$onEvent$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void showNetworkToast(Activity activity, InterfaceC84463Te state, String sceneName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(sceneName, "sceneName");
        if (!o.LJ(state, C84453Td.LIZ)) {
            if (o.LJ(state, C84483Tg.LIZ)) {
                AnonymousClass114.LIZ(activity, R.string.dto);
                return;
            }
            if (o.LJ(state, C61664OIa.LIZ)) {
                AnonymousClass114.LIZ(activity, R.string.dtk);
                return;
            }
            if (o.LJ(state, C61665OIb.LIZ)) {
                AnonymousClass114.LIZ(activity, R.string.dtm);
            } else if (o.LJ(state, C61666OIc.LIZ)) {
                AnonymousClass114.LIZ(activity, R.string.dtf);
            } else {
                if (!o.LJ(state, C84443Tc.LIZ)) {
                    return;
                }
                AnonymousClass114.LIZ(activity, R.string.dtj);
            }
        }
    }

    private final void saveStatus(C73305Spp c73305Spp, String str, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        StatusInfo status = getStatus(c73305Spp);
        if (status == null) {
            StatusInfo statusInfo = new StatusInfo();
            statusInfo.setSceneName(str);
            statusInfo.setRetryFunc(interfaceC65784Pro);
            statusInfo.setNetworkStatus(i);
            c73305Spp.setTag(R.id.gyr, statusInfo);
            return;
        }
        status.setSceneName(str);
        status.setRetryFunc(interfaceC65784Pro);
        status.setNetworkStatus(i);
        status.setRetryCount(status.getRetryCount());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if ((r0 instanceof X.C38306F1q) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStatusView(final X.C73305Spp r27, final java.lang.String r28, final X.InterfaceC65784Pro<X.C76800UCe> r29, final java.lang.Exception r30) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.setStatusView(X.Spp, java.lang.String, X.Pro, java.lang.Exception):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0044. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$1] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$4] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$3] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showDiagnoseDialog(final android.content.Context r18, int r19, boolean r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.showDiagnoseDialog(android.content.Context, int, boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0041, code lost:
    
        if (r1 != false) goto L22;
     */
    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void triggerNetworkTips(android.app.Activity r7, java.lang.String r8, java.lang.Exception r9, X.C73305Spp r10) {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "sceneName"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.ss.android.ugc.aweme.app.host.AwemeHostApplication r0 = X.FKM.LIZ()
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L36
            boolean r0 = X.C48203Ivv.LIZJ(r0)
            if (r0 != r3) goto L36
            r4 = 1
        L19:
            boolean r1 = r6.checkNetworkDiagnosisOn(r8)
            if (r1 == 0) goto L38
            boolean r0 = r6.checkStatusIfChanged(r10)
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$StatusInfo r0 = r6.getStatus(r10)
            if (r0 == 0) goto L38
            if (r10 == 0) goto L43
            X.Pro r1 = r0.getRetryFunc()
            r0 = 0
            r6.setStatusView(r10, r8, r1, r0)
            return
        L36:
            r4 = 0
            goto L19
        L38:
            if (r10 == 0) goto L41
            boolean r0 = r6.isTipsEnable(r10)
            if (r0 != 0) goto L41
            return
        L41:
            if (r1 == 0) goto L62
        L43:
            com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$StatusInfo r1 = r6.getStatus(r10)
            if (r1 == 0) goto L62
            int r0 = r1.getRetryCount()
            if (r0 != r3) goto L62
            r0 = 2131833550(0x7f1132ce, float:1.9300185E38)
            boolean r0 = r6.showTips(r7, r0, r8)
            if (r0 == 0) goto L61
            int r0 = r1.getRetryCount()
            int r0 = r0 + 1
            r1.setRetryCount(r0)
        L61:
            return
        L62:
            X.Ivu r0 = X.C2NU.LIZ
            X.4Yt r0 = r0.LIZJ
            if (r0 != 0) goto L69
        L68:
            return
        L69:
            int[] r1 = com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r2 = 2131826762(0x7f11184a, float:1.9286418E38)
            if (r1 == r3) goto La2
            r0 = 2
            if (r1 == r0) goto Lb1
            r0 = 3
            if (r1 == r0) goto L7d
            goto L68
        L7d:
            com.ss.android.ugc.aweme.network.spi.INetworkStateService r0 = com.ss.android.ugc.aweme.services.NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(r5)
            boolean r1 = r0.isWeakNetwork()
            if (r9 == 0) goto L93
            boolean r0 = r9 instanceof X.C38306F1q
            if (r0 == 0) goto L93
            r0 = 2131826766(0x7f11184e, float:1.9286426E38)
            boolean r0 = r6.showTips(r7, r0, r8)
            goto Lb8
        L93:
            if (r1 == 0) goto L9d
            r0 = 2131826771(0x7f111853, float:1.9286436E38)
            boolean r0 = r6.showTips(r7, r0, r8)
            goto Lb8
        L9d:
            boolean r0 = r6.showTips(r7, r2, r8)
            goto Lb8
        La2:
            if (r4 == 0) goto Lac
            r0 = 2131826767(0x7f11184f, float:1.9286428E38)
            boolean r0 = r6.showTips(r7, r0, r8)
            goto Lb8
        Lac:
            boolean r0 = r6.showTips(r7, r2, r8)
            goto Lb8
        Lb1:
            r0 = 2131826769(0x7f111851, float:1.9286432E38)
            boolean r0 = r6.showTips(r7, r0, r8)
        Lb8:
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$StatusInfo r1 = r6.getStatus(r10)
            if (r1 == 0) goto L68
            int r0 = r1.getRetryCount()
            int r0 = r0 + 1
            r1.setRetryCount(r0)
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.triggerNetworkTips(android.app.Activity, java.lang.String, java.lang.Exception, X.Spp):void");
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void setStatusView(C73305Spp tuxStatusView, MG5 sceneName, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Exception exc) {
        o.LJIIIZ(tuxStatusView, "tuxStatusView");
        o.LJIIIZ(sceneName, "sceneName");
        setStatusView(tuxStatusView, sceneName.getValue(), interfaceC65784Pro, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void triggerNetworkTips(Activity activity, MG5 sceneName, Exception exc, C73305Spp c73305Spp) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sceneName, "sceneName");
        this.tipsBarrierTime = 10000L;
        triggerNetworkTips(activity, sceneName.getValue(), exc, c73305Spp);
    }

    public void triggerNetworkTips(Activity activity, MG5 sceneName, Exception exc, C73305Spp c73305Spp, long j) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sceneName, "sceneName");
        this.tipsBarrierTime = j;
        triggerNetworkTips(activity, sceneName.getValue(), exc, c73305Spp);
    }

    private final C73306Spq largePanelStatusView(String str, String str2, String str3, int i, Runnable runnable, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z;
        int i2;
        String str4;
        if (i == 401) {
            z = true;
        } else {
            z = false;
        }
        boolean checkNetworkDiagnosisOn = checkNetworkDiagnosisOn(str3);
        if (checkNetworkDiagnosisOn && z) {
            i2 = R.raw.icon_large_airplane;
        } else {
            i2 = R.raw.icon_large_refresh;
        }
        AwemeHostApplication LIZ = FKM.LIZ();
        String str5 = null;
        if (LIZ != null) {
            str4 = LIZ.getString(R.string.n9);
        } else {
            str4 = null;
        }
        if (z) {
            AwemeHostApplication LIZ2 = FKM.LIZ();
            if (LIZ2 != null) {
                str5 = LIZ2.getString(R.string.is1);
            }
        } else {
            AwemeHostApplication LIZ3 = FKM.LIZ();
            if (LIZ3 != null) {
                str5 = LIZ3.getString(R.string.irf);
            }
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i2;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        int LJIILL = C17N.LJIILL(72.0d);
        c2068389v.LIZIZ = LJIILL;
        c2068389v.LIZJ = LJIILL;
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        o.LJI(str);
        c73306Spq.LJFF = str;
        o.LJI(str2);
        c73306Spq.LJI = str2;
        if (checkNetworkDiagnosisOn) {
            c73306Spq.LJIIIZ = new NetworkStandardUIServiceImpl$largePanelStatusView$1$1(str4, str3, str5, runnable, interfaceC65784Pro);
        } else if (hasRetryButton()) {
            c73306Spq.LJII = new AqS11S2000000_9(str4, str3, 1);
        }
        return c73306Spq;
    }
}
