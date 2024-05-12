package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.AV1;
import X.AnonymousClass952;
import X.C0RN;
import X.C113554cx;
import X.C16880lQ;
import X.C19N;
import X.C1HQ;
import X.C239239aB;
import X.C33930DTi;
import X.C35559DxT;
import X.C35801E3h;
import X.C36839Ed1;
import X.C37046EgM;
import X.C37205Eiv;
import X.C37206Eiw;
import X.C38243Ezf;
import X.C38901fq;
import X.C38995FSd;
import X.C39215FaF;
import X.C39404FdI;
import X.C39405FdJ;
import X.C39569Ffx;
import X.C39574Fg2;
import X.C48475J0t;
import X.C51556KLg;
import X.C54217LPp;
import X.C58025Mpx;
import X.C58263Mtn;
import X.C58543MyJ;
import X.C58606MzK;
import X.C64402PPi;
import X.C64403PPj;
import X.C64409PPp;
import X.C64707PaR;
import X.C65369Pl7;
import X.C65370Pl8;
import X.C65935PuF;
import X.C65960Pue;
import X.C65962Pug;
import X.C65964Pui;
import X.C65967Pul;
import X.C65970Puo;
import X.C66226Pyw;
import X.C66227Pyx;
import X.C66231Pz1;
import X.C66232Pz2;
import X.C66233Pz3;
import X.C66236Pz6;
import X.C66238Pz8;
import X.C66239Pz9;
import X.C66241PzB;
import X.C66242PzC;
import X.C66243PzD;
import X.C66244PzE;
import X.C66245PzF;
import X.C66246PzG;
import X.C66248PzI;
import X.C66249PzJ;
import X.C66251PzL;
import X.C66253PzN;
import X.C66255PzP;
import X.C66257PzR;
import X.C66258PzS;
import X.C66260PzU;
import X.C66272Pzg;
import X.C66289Pzx;
import X.C66522jI;
import X.C87644YaW;
import X.C9CP;
import X.DSG;
import X.E79;
import X.E8T;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EKB;
import X.EOV;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HandlerThreadC39572Fg0;
import X.IF7;
import X.InterfaceC39570Ffy;
import X.InterfaceC66280Pzo;
import X.InterfaceC771330z;
import X.LU5;
import X.N5P;
import X.OGO;
import X.OSZ;
import X.PJZ;
import X.PRA;
import X.Q0A;
import X.RunnableC66234Pz4;
import X.U1F;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.PumbaaServiceImpl;
import com.bytedance.pumbaa.api.IPumbaaService;
import com.bytedance.pumbaa.hybrid.api.IHybridService;
import com.bytedance.pumbaa.hybrid.impl.HybridServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.HybridMonitorServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService;
import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BPEACacheSwitch;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BPEAScreenshotSwitch;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.PLNetMonitorConfig;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.ttm.TTMConfigSettings;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.tiktok.ttm.TTMCore;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PumbaaTask implements EE1 {
    public String LJLIL;
    public String LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "PumbaaTask";
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

    public static C1HQ LJ() {
        C1HQ c1hq = new C1HQ();
        c1hq.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        String uid = AV1.LIZIZ().getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        c1hq.put("uid", uid);
        c1hq.put("region_source", C64707PaR.LIZLLL);
        String str2 = C64707PaR.LIZJ;
        if (str2 != null) {
            str = str2.toLowerCase();
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
        }
        c1hq.put("region_code", str);
        String str3 = C64707PaR.LIZIZ;
        if (str3 != null && str3.length() != 0) {
            c1hq.put("region_idc", C64707PaR.LIZIZ);
        }
        LocationServiceImpl.LJIJJ().LJII();
        c1hq.put("request_location_permission", -1);
        C51556KLg.LIZ.getClass();
        for (Map.Entry<String, Object> entry : C51556KLg.LIZ().LJJJJZ().entrySet()) {
            c1hq.put(entry.getKey(), entry.getValue());
        }
        return c1hq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (X.EF7.LJFF() > r5) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.m LJII() {
        /*
            java.lang.String r3 = "conditions"
            r7 = 0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L72
            java.lang.Class<com.google.gson.m> r1 = com.google.gson.m.class
            java.lang.String r0 = "bpea_limit_config"
            java.lang.Object r4 = r2.LJIIIIZZ(r0, r1, r7)     // Catch: java.lang.Throwable -> L72
            com.google.gson.m r4 = (com.google.gson.m) r4     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L31
            java.lang.String r0 = "maxAppVersion"
            com.google.gson.j r0 = r4.LJJIJ(r0)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.LJJIFFI()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L2a
            long r5 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L72
        L25:
            long r1 = X.EF7.LJFF()     // Catch: java.lang.Throwable -> L72
            goto L2d
        L2a:
            r5 = 0
            goto L25
        L2d:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L32
        L31:
            r4 = r7
        L32:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L71
            java.lang.Class<com.google.gson.m> r1 = com.google.gson.m.class
            java.lang.String r0 = "region_location_sdk_settings"
            java.lang.Object r1 = r2.LJIIIIZZ(r0, r1, r7)     // Catch: java.lang.Throwable -> L71
            com.google.gson.m r1 = (com.google.gson.m) r1     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L73
            if (r4 != 0) goto L4a
            com.google.gson.m r0 = new com.google.gson.m     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            r4 = r0
        L4a:
            com.google.gson.m r0 = r4.LJJIJIL(r3)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L58
            com.google.gson.m r0 = new com.google.gson.m     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            r4.LJJII(r3, r0)     // Catch: java.lang.Throwable -> L71
        L58:
            com.google.gson.m r3 = r4.LJJIJIL(r3)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L73
            java.lang.String r2 = "config_17"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "config.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = LIZLLL(r1)     // Catch: java.lang.Throwable -> L71
            r3.LJJIIZ(r2, r0)     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r7 = r4
        L72:
            r4 = r7
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask.LJII():com.google.gson.m");
    }

    public static void LJIIJ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BPEACacheSwitch bPEACacheSwitch = C66244PzE.LIZ;
        BPEACacheSwitch bPEACacheSwitch2 = (BPEACacheSwitch) LIZLLL.LJIIIIZZ("carrier_cache_switcher", BPEACacheSwitch.class, bPEACacheSwitch);
        if (bPEACacheSwitch2 != null) {
            bPEACacheSwitch = bPEACacheSwitch2;
        }
        C39569Ffx.LIZJ = bPEACacheSwitch.enableCarrierCache;
        C39569Ffx.LIZ = bPEACacheSwitch.enableLocaleCache;
        C39569Ffx.LIZIZ = bPEACacheSwitch.enableGAIDCache;
    }

    public static void LJIIJJI() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BPEAScreenshotSwitch bPEAScreenshotSwitch = C35559DxT.LIZ;
        BPEAScreenshotSwitch bPEAScreenshotSwitch2 = (BPEAScreenshotSwitch) LIZLLL.LJIIIIZZ("bpea_screenshot_switch", BPEAScreenshotSwitch.class, bPEAScreenshotSwitch);
        if (bPEAScreenshotSwitch2 != null) {
            bPEAScreenshotSwitch = bPEAScreenshotSwitch2;
        }
        C39215FaF.LIZ = bPEAScreenshotSwitch.enable;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static String LIZLLL(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configuration", new JSONObject(str));
        jSONObject.put("params", jSONObject2);
        jSONObject.put("type", "config");
        String jSONObject3 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject3, "json.toString()");
        return jSONObject3;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Context context2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String str2;
        JSONObject jSONObject;
        System.nanoTime();
        if (DSG.LIZJ()) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "currentThread()");
            C35801E3h.LJIIIIZZ(LLLLIIIILLL);
        }
        OSZ osz = null;
        if (context != null) {
            context2 = C16880lQ.LLLLL(context);
        } else {
            context2 = null;
        }
        Application application = (Application) context2;
        if (application != null && !C33930DTi.LIZ) {
            if (C19N.LJ("pns_pl_net_monitor_switch", false)) {
                PLNetMonitorConfig LIZ = C65970Puo.LIZ();
                C65960Pue.LJIIIIZZ = new C65964Pui<>(LIZ.activityTraceLength, null, null, 6, null);
                C65960Pue.LJIIIZ = new C65964Pui<>(LIZ.fragmentTraceLength, null, null, 6, null);
                C64402PPi.LIZJ.add(new C65967Pul());
                C64409PPp.LJI(new C65962Pug());
            }
            try {
                C66272Pzg.LJLJJL.LIZIZ(application);
                C48475J0t.LJLJI.LIZIZ(application);
                C66242PzC c66242PzC = new C66242PzC();
                Map<String, InterfaceC66280Pzo> map = C66289Pzx.LIZ;
                map.put("network_type", c66242PzC);
                map.put("connection_info", new C66241PzB());
            } catch (Throwable th) {
                PJZ.LIZ(th);
            }
            if (C66258PzS.LIZ.compareAndSet(false, true)) {
                TTMConfigSettings.LIZ.getClass();
                Boolean bool = TTMConfigSettings.LIZ().globalEnable;
                Boolean bool2 = Boolean.TRUE;
                if (o.LJ(bool, bool2)) {
                    C66233Pz3 c66233Pz3 = new C66233Pz3();
                    c66233Pz3.LIZ = o.LJ(TTMConfigSettings.LIZ().ttmEnable, bool2);
                    Integer num = TTMConfigSettings.LIZ().timeStaticConfig;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    c66233Pz3.LIZIZ = i;
                    c66233Pz3.LIZJ = o.LJ(TTMConfigSettings.LIZ().reportEnable, bool2);
                    c66233Pz3.LIZLLL = o.LJ(TTMConfigSettings.LIZ().crashDumpEnable, bool2);
                    c66233Pz3.LJ = o.LJ(TTMConfigSettings.LIZ().multiInstCacheEnable, bool2);
                    Integer num2 = TTMConfigSettings.LIZ().multiInstCacheMaxSize;
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = 30;
                    }
                    c66233Pz3.LJI = i2;
                    Integer num3 = TTMConfigSettings.LIZ().multiInstCacheDefaultSize;
                    if (num3 != null) {
                        i3 = num3.intValue();
                    } else {
                        i3 = 20;
                    }
                    c66233Pz3.LJFF = i3;
                    if (c66233Pz3.LIZJ) {
                        c66233Pz3.LJII = C38901fq.LJLJJI;
                    }
                    if (c66233Pz3.LIZLLL) {
                        Npth.addUserCrashInfoCallback(C66232Pz2.LIZ, CrashType.NATIVE);
                    }
                    TTMCore tTMCore = TTMCore.LIZJ;
                    if (!tTMCore.LIZ) {
                        synchronized (tTMCore) {
                            if (!tTMCore.LIZ) {
                                boolean z = c66233Pz3.LIZ;
                                int i6 = c66233Pz3.LIZIZ;
                                if (i6 == 1) {
                                    i4 = (z ? 1 : 0) | 4;
                                } else if (i6 == 2) {
                                    i4 = (z ? 1 : 0) | 8;
                                } else {
                                    i4 = 2 | (z ? 1 : 0);
                                }
                                if (c66233Pz3.LIZJ) {
                                    i4 |= 16;
                                }
                                if (c66233Pz3.LJ) {
                                    i4 |= 32;
                                    i5 = ((c66233Pz3.LJI & 255) << 8) | (c66233Pz3.LJFF & 255);
                                } else {
                                    i5 = 0;
                                }
                                TTMCore.JNIHelper.init(i4, i5);
                                tTMCore.LIZIZ = c66233Pz3;
                                tTMCore.LIZ = true;
                            }
                        }
                    }
                    if (c66233Pz3.LJ) {
                        C38995FSd.LIZJ().execute(RunnableC66234Pz4.LJLIL);
                    }
                }
            }
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            RuleEngineConfig ruleEngineConfig = C66238Pz8.LIZ;
            RuleEngineConfig ruleEngineConfig2 = (RuleEngineConfig) LIZLLL.LJIIIIZZ("rule_engine_config", RuleEngineConfig.class, ruleEngineConfig);
            if (ruleEngineConfig2 == null) {
                ruleEngineConfig2 = ruleEngineConfig;
            }
            String string = KevaImpl.getRepoFromSp(application, "keva_repo_env_sdk", 1).getString("key_env_current", "");
            if (string != null && !ujb.o.LJJJJJL(string)) {
                try {
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(string), "configList");
                    if (jSONArray.length() > 0 && (jSONObject = (JSONObject) jSONArray.get(0)) != null) {
                        osz = new OSZ((String) jSONObject.get("env"), (String) jSONObject.get("lane"));
                    }
                } catch (Throwable unused) {
                }
            }
            IPumbaaService LJIILIIL = PumbaaServiceImpl.LJIILIIL();
            int i7 = EF7.LJIIIZ;
            long LJFF = EF7.LJFF();
            String str3 = EF7.LJIILIIL;
            boolean LIZLLL2 = s1.LIZLLL("isFirstInstallAndFirstLaunch()");
            String LJ = EF7.LJ();
            if (osz == null || (str = (String) osz.getFirst()) == null) {
                str = "";
            }
            if (osz == null || (str2 = (String) osz.getSecond()) == null) {
                str2 = "";
            }
            LJIILIIL.init(new C65935PuF(application, i7, LJFF, str3, LIZLLL2, LJ, str, str2), new C66231Pz1(new C66226Pyw(C66249PzJ.LJLIL, C9CP.LJLIL, C239239aB.LJLIL, N5P.LJLIL, C66255PzP.LJLIL, OGO.LJLIL, AnonymousClass952.LJLIL, C113554cx.LJJL(new OSZ("is_not_consent", IF7.LJLIL), new OSZ("is_guest_mode", EOV.LJLIL), new OSZ("is_kids_mode", E8T.LJLIL), new OSZ("is_login", C66522jI.LJLIL), new OSZ("is_teen_mode", LU5.LJLIL)), C66253PzN.LJLIL, PRA.LJLIL, "001", C37205Eiv.LJLIL, C37206Eiw.LJLIL, C58606MzK.LJLIL, 4169728), new C66248PzI(), new C66257PzR()), new C66227Pyx(E79.LJLIL, new AqS161S0100000_11(ruleEngineConfig2, 68), new AqS161S0100000_11(this, 69), C87644YaW.LJLIL, C58025Mpx.LJLIL), new C66243PzD(new C58263Mtn(this), 2));
            IHybridService LJIILIIL2 = HybridServiceImpl.LJIILIIL();
            if (LJIILIIL2 != null) {
                LJIILIIL2.LJI(new C38243Ezf());
            }
            IHybridMonitorService LJIIIIZZ = HybridMonitorServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.LJII(C54217LPp.LJLIL);
            }
            RaspServiceImpl.LJIIIIZZ().LJ(new C37046EgM());
            C58543MyJ listener = C58543MyJ.LJLIL;
            o.LJIIIZ(listener, "listener");
            SettingsManager.LIZLLL().LJIIIZ(new C66251PzL(listener));
            if (C36839Ed1.LIZIZ(application)) {
                IMonitorService LJIILIIL3 = MonitorServiceImpl.LJIILIIL();
                C1HQ LJ2 = LJ();
                LJ2.put("operation", "Initial Region");
                LJIILIIL3.LJ(LJ2);
                C64707PaR.LIZ().addObserver(new C65369Pl7(this));
                C66260PzU.LIZ(new C66239Pz9(this));
                SettingsManager.LIZLLL().LJIIIZ(new C65370Pl8(this));
                SettingRequestExtraInfoImpl.LIZJ().LIZ(new EKB(this));
            }
            Q0A q0a = C66236Pz6.LIZJ;
            InterfaceC771330z interfaceC771330z = new InterfaceC771330z() { // from class: X.30y
                @Override // X.InterfaceC771330z
                public final void LIZ(final float f, final int i8, final int i9, final String str4, final String str5, final String str6) {
                    C10K.LIZJ(new Callable() { // from class: X.30x
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Object LIZ2;
                            float f2 = f;
                            int i10 = i8;
                            String str7 = str4;
                            String str8 = str5;
                            String str9 = str6;
                            int i11 = i9;
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("costTime", Float.valueOf(f2));
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", i10);
                                jSONObject3.put("msg", str7);
                                jSONObject3.put("certToken", str8);
                                jSONObject3.put("encryptType", str9);
                                jSONObject3.put("retryCode", i11);
                                C09900aA.LJI("ropa_encrypt_event", jSONObject3, jSONObject2, null);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("ropa_encrypt_event: metric >>> ");
                                LIZ3.append(jSONObject2);
                                LIZ3.append("   category>>>");
                                LIZ3.append(jSONObject3);
                                LIZ2 = Integer.valueOf(android.util.Log.d("BPEA", X1D.LIZIZ(LIZ3)));
                                C3C5.m7constructorimpl(LIZ2);
                            } catch (Throwable th2) {
                                LIZ2 = C141335gf.LIZ(th2);
                                C3C5.m7constructorimpl(LIZ2);
                            }
                            C3C5.m10exceptionOrNullimpl(LIZ2);
                            return C3C5.m6boximpl(LIZ2);
                        }
                    });
                }
            };
            q0a.getClass();
            ((ArrayList) C66236Pz6.LIZ).add(interfaceC771330z);
            C66236Pz6.LIZIZ = new U1F();
            LJIIJJI();
            SettingsManager.LIZLLL().LJIIIZ(new C66245PzF(this));
            LJIIJ();
            SettingsManager.LIZLLL().LJIIIZ(new C66246PzG(this));
            if (context != null) {
                C39405FdJ.LJFF.getClass();
                try {
                    AtomicBoolean atomicBoolean = C39405FdJ.LIZ;
                    if (!atomicBoolean.get()) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        intentFilter.addAction("android.intent.action.SERVICE_STATE");
                        intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
                        C16880lQ.LJJLIIIJILLIZJL(C39405FdJ.LIZLLL, context, intentFilter);
                        new HandlerThreadC39572Fg0(context).start();
                        atomicBoolean.set(true);
                    }
                } catch (Throwable th2) {
                    InterfaceC39570Ffy interfaceC39570Ffy = C39569Ffx.LIZLLL;
                    if (interfaceC39570Ffy != null) {
                        interfaceC39570Ffy.LIZ("init", th2);
                    }
                }
            }
            C39569Ffx.LIZLLL = new C39574Fg2();
            C64403PPj.LJ(new C39404FdI());
        }
        if (DSG.LIZJ()) {
            Thread LLLLIIIILLL2 = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL2, "currentThread()");
            C35801E3h.LJIIJ(LLLLIIIILLL2);
        }
        System.nanoTime();
    }
}
