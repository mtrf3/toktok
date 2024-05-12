package com.appsflyer.internal;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ab {
    public static final BitSet AFLogger$LogLevel;
    public static final Handler AppsFlyer2dXConversionCallback;
    public static volatile ab init;
    public final Object AFInAppEventParameterName = new Object();
    public final Handler AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public final Executor AFVersionDeclaration;
    public final Runnable getLevel;
    public final SensorManager onAppOpenAttributionNative;
    public long onAttributionFailure;
    public final Map<w, Map<String, Object>> onAttributionFailureNative;
    public final Runnable onDeepLinking;
    public final Map<w, w> onDeepLinkingNative;
    public int onInstallConversionDataLoadedNative;
    public boolean onInstallConversionFailureNative;
    public final Runnable valueOf;
    public boolean values;

    /* renamed from: com.appsflyer.internal.ab$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Runnable {
        public static void com_appsflyer_internal_ab$6_android_hardware_SensorManager_unregisterListener(SensorManager sensorManager, SensorEventListener sensorEventListener) {
            if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{sensorEventListener}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "-2188558172191876284")).LIZ) {
                return;
            }
            sensorManager.unregisterListener(sensorEventListener);
        }

        @Override // java.lang.Runnable
        public final void run() {
            com_appsflyer_internal_ab$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public final void com_appsflyer_internal_ab$6__run$___twin___() {
            try {
                if (!ab.this.onDeepLinkingNative.isEmpty()) {
                    for (w wVar : ab.this.onDeepLinkingNative.values()) {
                        com_appsflyer_internal_ab$6_android_hardware_SensorManager_unregisterListener(ab.this.onAppOpenAttributionNative, wVar);
                        wVar.values(ab.this.onAttributionFailureNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            ab.this.onInstallConversionDataLoadedNative = 0;
            ab.this.onInstallConversionFailureNative = false;
        }

        public AnonymousClass6() {
        }

        public static void com_appsflyer_internal_ab$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
            boolean LIZ;
            try {
                anonymousClass6.com_appsflyer_internal_ab$6__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        AFLogger$LogLevel = bitSet;
        AppsFlyer2dXConversionCallback = new Handler(C16880lQ.LLJJJJ());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    public final List<Map<String, Object>> AFInAppEventType() {
        Iterator<w> it = this.onDeepLinkingNative.values().iterator();
        while (it.hasNext()) {
            it.next().values(this.onAttributionFailureNative, true);
        }
        Map<w, Map<String, Object>> map = this.onAttributionFailureNative;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.onAttributionFailureNative.values());
    }

    public final List<Map<String, Object>> values() {
        synchronized (this.AFInAppEventParameterName) {
            if (!this.onDeepLinkingNative.isEmpty() && this.onInstallConversionFailureNative) {
                Iterator<w> it = this.onDeepLinkingNative.values().iterator();
                while (it.hasNext()) {
                    it.next().values(this.onAttributionFailureNative, false);
                }
            }
            if (this.onAttributionFailureNative.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.onAttributionFailureNative.values());
        }
    }

    public final void valueOf() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.onAttributionFailure;
        if (j != 0) {
            this.onInstallConversionDataLoadedNative++;
            if (j - currentTimeMillis < 500) {
                this.AFInAppEventType.removeCallbacks(this.AFKeystoreWrapper);
                this.AFInAppEventType.post(this.valueOf);
            }
        } else {
            this.AFInAppEventType.post(this.getLevel);
            this.AFInAppEventType.post(this.valueOf);
        }
        this.onAttributionFailure = currentTimeMillis;
    }

    public static boolean AFInAppEventParameterName(int i) {
        if (i >= 0 && AFLogger$LogLevel.get(i)) {
            return true;
        }
        return false;
    }

    public static ab AFKeystoreWrapper(Context context) {
        if (init != null) {
            return init;
        }
        return AFInAppEventParameterName((SensorManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "sensor"), AppsFlyer2dXConversionCallback);
    }

    public ab(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFLogger$LogLevel;
        this.onDeepLinkingNative = new HashMap(bitSet.size());
        this.onAttributionFailureNative = new ConcurrentHashMap(bitSet.size());
        this.valueOf = new Runnable() { // from class: com.appsflyer.internal.ab.4
            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_ab$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_ab$4__run$___twin___() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    final ab abVar = ab.this;
                    abVar.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.ab.3
                        public static List com_appsflyer_internal_ab$3_android_hardware_SensorManager_getSensorList(SensorManager sensorManager2, int i) {
                            C03880Dg c03880Dg = new C03880Dg(2);
                            Object[] objArr = {Integer.valueOf(i)};
                            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Ljava/util/List;", "-2188558172191876284");
                            C39519Ff9 LIZJ = c03880Dg.LIZJ(100702, "android/hardware/SensorManager", "getSensorList", sensorManager2, objArr, "java.util.List", c65300Pk0);
                            if (LIZJ.LIZ) {
                                c03880Dg.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", null, objArr, sensorManager2, c65300Pk0, false);
                                return (List) LIZJ.LIZIZ;
                            }
                            List<Sensor> sensorList = sensorManager2.getSensorList(i);
                            c03880Dg.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", sensorList, objArr, sensorManager2, c65300Pk0, true);
                            return sensorList;
                        }

                        public static boolean com_appsflyer_internal_ab$3_android_hardware_SensorManager_registerListener(SensorManager sensorManager2, SensorEventListener sensorEventListener, Sensor sensor, int i) {
                            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager2, new Object[]{sensorEventListener, sensor, Integer.valueOf(i)}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "-2188558172191876284"));
                            return LIZJ.LIZ ? ((Boolean) LIZJ.LIZIZ).booleanValue() : sensorManager2.registerListener(sensorEventListener, sensor, i);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            com_appsflyer_internal_ab$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public final void com_appsflyer_internal_ab$3__run$___twin___() {
                            try {
                                for (Sensor sensor : com_appsflyer_internal_ab$3_android_hardware_SensorManager_getSensorList(ab.this.onAppOpenAttributionNative, -1)) {
                                    if (ab.AFInAppEventParameterName(sensor.getType())) {
                                        w wVar = new w(sensor, ab.this.AFVersionDeclaration);
                                        if (!ab.this.onDeepLinkingNative.containsKey(wVar)) {
                                            ab.this.onDeepLinkingNative.put(wVar, wVar);
                                        }
                                        com_appsflyer_internal_ab$3_android_hardware_SensorManager_registerListener(ab.this.onAppOpenAttributionNative, (SensorEventListener) ab.this.onDeepLinkingNative.get(wVar), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            ab.this.onInstallConversionFailureNative = true;
                        }

                        public static void com_appsflyer_internal_ab$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                            boolean LIZ;
                            try {
                                anonymousClass3.com_appsflyer_internal_ab$3__run$___twin___();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                    ab abVar2 = ab.this;
                    abVar2.AFInAppEventType.postDelayed(abVar2.onDeepLinking, 100L);
                    ab.this.values = true;
                }
            }

            public static void com_appsflyer_internal_ab$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_appsflyer_internal_ab$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.AFKeystoreWrapper = new Runnable() { // from class: com.appsflyer.internal.ab.5
            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_ab$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_ab$5__run$___twin___() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    ab abVar = ab.this;
                    abVar.AFVersionDeclaration.execute(new AnonymousClass6());
                }
            }

            public static void com_appsflyer_internal_ab$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_appsflyer_internal_ab$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.getLevel = new Runnable() { // from class: com.appsflyer.internal.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_ab$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_ab$1__run$___twin___() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    ab abVar = ab.this;
                    if (abVar.values) {
                        abVar.AFInAppEventType.removeCallbacks(abVar.valueOf);
                        ab abVar2 = ab.this;
                        abVar2.AFInAppEventType.removeCallbacks(abVar2.AFKeystoreWrapper);
                        ab abVar3 = ab.this;
                        abVar3.AFVersionDeclaration.execute(new AnonymousClass6());
                        ab.this.values = false;
                    }
                }
            }

            public static void com_appsflyer_internal_ab$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_appsflyer_internal_ab$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.onInstallConversionDataLoadedNative = 1;
        this.onAttributionFailure = 0L;
        this.onDeepLinking = new Runnable() { // from class: com.appsflyer.internal.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_ab$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_ab$2__run$___twin___() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    if (ab.this.onInstallConversionDataLoadedNative == 0) {
                        ab.this.onInstallConversionDataLoadedNative = 1;
                    }
                    ab abVar = ab.this;
                    abVar.AFInAppEventType.postDelayed(abVar.AFKeystoreWrapper, abVar.onInstallConversionDataLoadedNative * 500);
                }
            }

            public static void com_appsflyer_internal_ab$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_appsflyer_internal_ab$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.AFVersionDeclaration = C16880lQ.LLLLZLLIL();
        this.onAppOpenAttributionNative = sensorManager;
        this.AFInAppEventType = handler;
    }

    public static ab AFInAppEventParameterName(SensorManager sensorManager, Handler handler) {
        if (init == null) {
            synchronized (ab.class) {
                if (init == null) {
                    init = new ab(sensorManager, handler);
                }
            }
        }
        return init;
    }
}
