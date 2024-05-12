package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.helios.api.config.ApiSampleRateConfig;
import com.bytedance.helios.api.config.DefaultSampleRateConfig;
import com.bytedance.helios.api.config.ResourceSampleRateConfig;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Puq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65972Puq implements InterfaceC66032Pvo {
    public static final Calendar LIZ;
    public static C65977Puv LIZIZ;
    public static final java.util.Map<String, C65976Puu> LIZJ;
    public static final java.util.Map<Integer, C65976Puu> LIZLLL;
    public static final C65972Puq LJ = new C65972Puq();

    static {
        Calendar calendar = Calendar.getInstance();
        o.LJIIIIZZ(calendar, "Calendar.getInstance()");
        LIZ = calendar;
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r1 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ() {
        /*
            com.bytedance.helios.sdk.HeliosEnvImpl r1 = com.bytedance.helios.sdk.HeliosEnvImpl.get()
            java.lang.String r0 = "HeliosEnvImpl.get()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.Pwg r0 = r1.LIZIZ
            java.lang.String r3 = ""
            if (r0 != 0) goto L44
            r1 = r3
        L10:
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L33
        L16:
            java.lang.String r2 = "random_device_id"
            java.lang.String r1 = X.C66046Pw2.LIZ(r2, r3)
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L32
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C66046Pw2.LIZIZ(r2, r1)
        L32:
            return r1
        L33:
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "-1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L32
            goto L16
        L44:
            java.lang.String r1 = r0.getDeviceId()
            if (r1 == 0) goto L16
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65972Puq.LIZJ():java.lang.String");
    }

    public static boolean LJ(double d) {
        if (d <= 0) {
            return false;
        }
        if (d < 1 && V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d) >= d) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(double d) {
        byte[] bytes;
        String LIZJ2 = LIZJ();
        if (LIZJ2 == null || (bytes = LIZJ2.getBytes(PVC.LIZ)) == null) {
            return false;
        }
        return LIZIZ(d, Math.abs(C65979Pux.LIZ(bytes)));
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        byte[] bytes;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        C65976Puu c65976Puu;
        C65976Puu c65976Puu2;
        C65976Puu c65976Puu3;
        o.LJIIIZ(newSettings, "newSettings");
        long currentTimeMillis = System.currentTimeMillis();
        SampleRateConfig sampleRateConfig = newSettings.sampleRateConfig;
        o.LJIIIZ(sampleRateConfig, "sampleRateConfig");
        String LIZJ2 = LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        Calendar calendar = LIZ;
        LIZ2.append(calendar.get(1));
        LIZ2.append('-');
        LIZ2.append(calendar.get(2) + 1);
        LIZ2.append('-');
        LIZ2.append(calendar.get(5));
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        String LIZ3 = C66046Pw2.LIZ("sample_rate_date", "");
        if (LIZJ2 != null && (bytes = LIZJ2.getBytes(PVC.LIZ)) != null) {
            long abs = Math.abs(C65979Pux.LIZ(bytes));
            DefaultSampleRateConfig defaultSampleRateConfig = sampleRateConfig.defaultLowPriorityConfig;
            LIZIZ = new C65977Puv(LIZIZ(sampleRateConfig.appOpsConfig, abs), LIZIZ(sampleRateConfig.autoStartConfig, abs), LIZIZ(sampleRateConfig.exceptionConfig, abs), LIZIZ(sampleRateConfig.exceptionAlogConfig, abs), LIZIZ(sampleRateConfig.appExitConfig, abs), LIZIZ(sampleRateConfig.strictModeConfig, abs), new C65976Puu(LIZIZ(defaultSampleRateConfig.getMonitorNormal(), abs), LIZIZ(defaultSampleRateConfig.getMonitorError(), abs), LIZIZ(defaultSampleRateConfig.getInterceptError(), abs), defaultSampleRateConfig.getLocalSampleRate()));
            ((LinkedHashMap) LIZJ).clear();
            List<ResourceSampleRateConfig> list = sampleRateConfig.resourceMediumPriorityConfigs;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (ResourceSampleRateConfig resourceSampleRateConfig : list) {
                LIZJ.put(resourceSampleRateConfig.getResourceId(), new C65976Puu(LIZIZ(resourceSampleRateConfig.getMonitorNormal(), abs), LIZIZ(resourceSampleRateConfig.getMonitorError(), abs), LIZIZ(resourceSampleRateConfig.getInterceptError(), abs), resourceSampleRateConfig.getLocalSampleRate()));
                arrayList.add(C76800UCe.LIZ);
            }
            ((LinkedHashMap) LIZLLL).clear();
            List<ApiSampleRateConfig> list2 = sampleRateConfig.apiHighPriorityConfigs;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            for (ApiSampleRateConfig apiSampleRateConfig : list2) {
                C65976Puu c65976Puu4 = new C65976Puu(LIZIZ(apiSampleRateConfig.getMonitorNormal(), abs), LIZIZ(apiSampleRateConfig.getMonitorError(), abs), LIZIZ(apiSampleRateConfig.getInterceptError(), abs), apiSampleRateConfig.getLocalSampleRate());
                Iterator<Integer> it = apiSampleRateConfig.getApiIds().iterator();
                while (it.hasNext()) {
                    LIZLLL.put(Integer.valueOf(it.next().intValue()), c65976Puu4);
                }
                arrayList2.add(C76800UCe.LIZ);
            }
            if (sampleRateConfig.enableMonitor && (!o.LJ(LIZIZ2, LIZ3))) {
                C66046Pw2.LIZIZ("sample_rate_date", LIZIZ2);
                ApmEvent apmEvent = new ApmEvent("helios_sample_rate");
                apmEvent.LIZ(LIZIZ2, "date");
                C65977Puv c65977Puv = LIZIZ;
                if (c65977Puv != null) {
                    bool = Boolean.valueOf(c65977Puv.LJLIL);
                } else {
                    bool = null;
                }
                apmEvent.LIZ(bool, "app_ops_config");
                C65977Puv c65977Puv2 = LIZIZ;
                if (c65977Puv2 != null) {
                    bool2 = Boolean.valueOf(c65977Puv2.LJLILLLLZI);
                } else {
                    bool2 = null;
                }
                apmEvent.LIZ(bool2, "auto_start_config");
                C65977Puv c65977Puv3 = LIZIZ;
                if (c65977Puv3 != null && (c65976Puu3 = c65977Puv3.LJLJL) != null) {
                    bool3 = Boolean.valueOf(c65976Puu3.LJLIL);
                } else {
                    bool3 = null;
                }
                apmEvent.LIZ(bool3, "default_monitor_normal");
                C65977Puv c65977Puv4 = LIZIZ;
                if (c65977Puv4 != null && (c65976Puu2 = c65977Puv4.LJLJL) != null) {
                    bool4 = Boolean.valueOf(c65976Puu2.LJLILLLLZI);
                } else {
                    bool4 = null;
                }
                apmEvent.LIZ(bool4, "default_monitor_error");
                C65977Puv c65977Puv5 = LIZIZ;
                if (c65977Puv5 != null && (c65976Puu = c65977Puv5.LJLJL) != null) {
                    bool5 = Boolean.valueOf(c65976Puu.LJLJI);
                } else {
                    bool5 = null;
                }
                apmEvent.LIZ(bool5, "default_intercept_error");
                for (Map.Entry entry : ((LinkedHashMap) LIZJ).entrySet()) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    apmEvent.LIZ(Boolean.valueOf(((C65976Puu) entry.getValue()).LJLIL), JBR.LJFF(LIZ4, (String) entry.getKey(), "_monitor_normal", LIZ4));
                    StringBuilder LIZ5 = X1D.LIZ();
                    apmEvent.LIZ(Boolean.valueOf(((C65976Puu) entry.getValue()).LJLILLLLZI), JBR.LJFF(LIZ5, (String) entry.getKey(), "_monitor_error", LIZ5));
                    StringBuilder LIZ6 = X1D.LIZ();
                    apmEvent.LIZ(Boolean.valueOf(((C65976Puu) entry.getValue()).LJLJI), JBR.LJFF(LIZ6, (String) entry.getKey(), "_intercept_error", LIZ6));
                }
                for (Map.Entry entry2 : ((LinkedHashMap) LIZLLL).entrySet()) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(((Number) entry2.getKey()).intValue());
                    LIZ7.append("_monitor_normal");
                    apmEvent.LIZ(Boolean.valueOf(((C65976Puu) entry2.getValue()).LJLIL), X1D.LIZIZ(LIZ7));
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append(((Number) entry2.getKey()).intValue());
                    LIZ8.append("_monitor_error");
                    apmEvent.LIZ(Boolean.valueOf(((C65976Puu) entry2.getValue()).LJLILLLLZI), X1D.LIZIZ(LIZ8));
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append(((Number) entry2.getKey()).intValue());
                    LIZ9.append("_intercept_error");
                    apmEvent.LIZ(Boolean.valueOf(((C65976Puu) entry2.getValue()).LJLJI), X1D.LIZIZ(LIZ9));
                }
                apmEvent.LIZIZ(LIZJ2, "device_id");
                apmEvent.LIZIZ(Long.valueOf(abs), "hash_code");
                C66059PwF.LIZIZ(apmEvent);
            }
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.postDelayed(new RunnableC65297Pjx(LIZJ2, abs, LIZIZ2, LIZ3, sampleRateConfig), 10000L);
        }
        C65929Pu9.LIZ(currentTimeMillis, "SamplerManager.onNewSettings", true);
    }

    public static boolean LIZIZ(double d, long j) {
        if (d <= 0) {
            return false;
        }
        if (d >= 1) {
            return true;
        }
        String plainString = new BigDecimal(String.valueOf(d)).toPlainString();
        o.LJIIIIZZ(plainString, "BigDecimal(sampleRateVal…String()).toPlainString()");
        String LJJJJZ = ujb.o.LJJJJZ(plainString, "0.", "", false);
        long parseLong = CastLongProtector.parseLong(LJJJJZ);
        long j2 = 1;
        for (int i = 0; i < LJJJJZ.length(); i++) {
            j2 *= 10;
        }
        long j3 = parseLong;
        long j4 = j2;
        while (j4 != 0) {
            long j5 = j4;
            j4 = j3 % j4;
            j3 = j5;
        }
        long j6 = parseLong / j3;
        long j7 = j2 / j3;
        long j8 = j % j7;
        int i2 = LIZ.get(6);
        long j9 = (i2 % (j7 / j6)) * j6;
        StringBuilder LIZJ2 = V10.LIZJ("generateSampleRate hashCode=", j, " sampleRateValue=");
        LIZJ2.append(j6);
        LIZJ2.append('/');
        LIZJ2.append(j7);
        LIZJ2.append('(');
        LIZJ2.append(d);
        LIZJ2.append(") dayOfYear=");
        LIZJ2.append(i2);
        LIZJ2.append(" range=");
        LIZJ2.append(j9);
        LIZJ2.append('-');
        long j10 = j6 + j9;
        LIZJ2.append(j10);
        C66063PwJ.LIZIZ("Helios-Common-Env", X1D.LIZIZ(LIZJ2));
        if (j8 >= j9 && j8 < j10) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(C66120PxE c66120PxE, C65976Puu c65976Puu) {
        if (!LJ(c65976Puu.LJLJJI)) {
            String str = c66120PxE.LJLLLLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("local_sample_rate");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(LIZIZ2, "<set-?>");
            c66120PxE.LJLLLLLL = LIZIZ2;
            return false;
        }
        if (o.LJ(c66120PxE.LJLZ, "SensitiveApiInterceptException")) {
            c66120PxE.LLF.remove("api_call");
            String str2 = c66120PxE.LJLLLLLL;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str2);
            LIZ3.append("intercept_error");
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            o.LJIIIZ(LIZIZ3, "<set-?>");
            c66120PxE.LJLLLLLL = LIZIZ3;
            return c65976Puu.LJLJI;
        }
        if (!(!c66120PxE.LLI.getRuleModels().isEmpty())) {
            o.LJIIIIZZ(HeliosEnvImpl.get(), "HeliosEnvImpl.get()");
            if (!(!ORZ.LJZI(r1.LJIIJ.errorWarningTypes, c66120PxE.LLF).isEmpty())) {
                String str3 = c66120PxE.LJLLLLLL;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str3);
                LIZ4.append("monitor_normal");
                String LIZIZ4 = X1D.LIZIZ(LIZ4);
                o.LJIIIZ(LIZIZ4, "<set-?>");
                c66120PxE.LJLLLLLL = LIZIZ4;
                c66120PxE.LLF.add("api_call");
                return c65976Puu.LJLIL;
            }
        }
        c66120PxE.LLF.remove("api_call");
        String str4 = c66120PxE.LJLLLLLL;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(str4);
        LIZ5.append("monitor_error");
        String LIZIZ5 = X1D.LIZIZ(LIZ5);
        o.LJIIIZ(LIZIZ5, "<set-?>");
        c66120PxE.LJLLLLLL = LIZIZ5;
        return c65976Puu.LJLILLLLZI;
    }
}
