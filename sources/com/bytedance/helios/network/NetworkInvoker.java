package com.bytedance.helios.network;

import X.C16880lQ;
import X.C34656Diu;
import X.C39519Ff9;
import X.C60732Zx;
import X.C64656PZc;
import X.C65300Pk0;
import X.C65303Pk3;
import X.C65319PkJ;
import X.C65320PkK;
import X.C65371Pl9;
import X.C65372PlA;
import X.C65373PlB;
import X.C65777Prh;
import X.C65896Ptc;
import X.C65897Ptd;
import X.C65900Ptg;
import X.C65901Pth;
import X.C65902Pti;
import X.C65903Ptj;
import X.C65918Pty;
import X.C65920Pu0;
import X.C65922Pu2;
import X.C65924Pu4;
import X.C65926Pu6;
import X.HandlerThreadC64418PPy;
import X.InterfaceC39518Ff8;
import X.PYQ;
import Y.ARunnableS47S0100000_11;
import com.bytedance.helios.api.config.AllowNetworkIdConfig;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.ShutdownConfig;
import com.bytedance.helios.api.config.StackConfig;
import com.bytedance.helios.common.utils.CostTimeline;
import com.bytedance.helios.network.api.service.IAppLogService;
import com.bytedance.helios.network.api.service.IOkHttpService;
import com.bytedance.helios.network.api.service.ITTNetService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS109S0101000_11;
import kotlin.jvm.internal.AqS2S2001000_11;
import kotlin.jvm.internal.AqS46S0001000_11;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NetworkInvoker implements InterfaceC39518Ff8 {
    public static final C65303Pk3 Companion = new C65303Pk3();
    public static final String TAG = "NetworkInvoker";
    public static final NetworkInvoker networkInvoker = new NetworkInvoker();

    private final C39519Ff9 handleRequestStack(C65922Pu2 c65922Pu2) {
        Boolean bool;
        Throwable th;
        NetworkConfig networkConfig;
        StackConfig stackConfig;
        NetworkConfig networkConfig2;
        StackConfig stackConfig2;
        int i = c65922Pu2.LIZ;
        if (!C64656PZc.LJ.contains(Integer.valueOf(i))) {
            return null;
        }
        PYQ LIZIZ = C65900Ptg.LIZIZ(c65922Pu2, true);
        if (LIZIZ != null) {
            C65896Ptc c65896Ptc = (C65896Ptc) LIZIZ;
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            SettingsModel settings = networkComponent.getSettings();
            if (settings != null && (networkConfig2 = settings.networkConfig) != null && (stackConfig2 = networkConfig2.stackConfig) != null) {
                bool = Boolean.valueOf(stackConfig2.enabled);
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                C65924Pu4.LIZ(8, c65896Ptc);
                C65922Pu2 c65922Pu22 = c65896Ptc.LJLIL.LJLIL;
                SettingsModel settings2 = networkComponent.getSettings();
                if (settings2 != null && (networkConfig = settings2.networkConfig) != null && (stackConfig = networkConfig.stackConfig) != null && c65896Ptc.LJLJJLL) {
                    if (!C60732Zx.LIZ(stackConfig.frequencyConfig)) {
                        c65896Ptc.LJLJJI = new Throwable();
                        C60732Zx.LIZJ(c65922Pu22.LIZ, c65896Ptc.LJLIL.LJZ, stackConfig.frequencyConfig);
                    } else {
                        c65896Ptc.LJLJL = true;
                    }
                }
                C65922Pu2 c65922Pu23 = c65896Ptc.LJLIL.LJLIL;
                switch (c65922Pu23.LIZ) {
                    case 400000:
                        C65300Pk0 c65300Pk0 = (C65300Pk0) c65922Pu23.LJIIIZ;
                        if (c65300Pk0 != null) {
                            c65300Pk0.LIZ(c65896Ptc, "pns_network_stack");
                            break;
                        }
                        break;
                    case 400102:
                    case 400103:
                        HandlerThreadC64418PPy.LIZ();
                        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS47S0100000_11(c65896Ptc, 123));
                        break;
                    case 400204:
                    case 400205:
                        Map LIZJ = C65777Prh.LIZJ(c65896Ptc.LJLJLJ);
                        if (LIZJ != null) {
                            LIZJ.put("pns_network_stack", c65896Ptc);
                            break;
                        }
                        break;
                    case 400600:
                        HandlerThreadC64418PPy.LIZ();
                        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS47S0100000_11(c65896Ptc, 124));
                        break;
                }
                if (!((Boolean) C34656Diu.LJFF.getValue()).booleanValue()) {
                    Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                    o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                    AqS73S1100000_6 aqS73S1100000_6 = new AqS73S1100000_6(c65896Ptc, LLLLIIIILLL.getName(), 5);
                    if (networkComponent.isOffLineEnv()) {
                        th = c65896Ptc.LJLJJI;
                    } else {
                        th = null;
                    }
                    C65926Pu6.LIZ("Helios:Network-Stack", aqS73S1100000_6, 2, th);
                }
            }
            if (i == 400000) {
                return null;
            }
            return new C39519Ff9(null, false);
        }
        return new C39519Ff9(null, false);
    }

    private final C39519Ff9 handleTTNetGuardCallback(C65922Pu2 c65922Pu2) {
        long j;
        NetworkConfig networkConfig;
        int i = c65922Pu2.LIZ;
        if (i != 400201 && i != 400202) {
            return null;
        }
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null) {
            j = networkConfig.pairCacheInterval;
        } else {
            j = 1000;
        }
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.postDelayed(new ARunnableS47S0100000_11(c65922Pu2, 23), j);
        return new C39519Ff9(null, false);
    }

    private final C39519Ff9 filterAllowNetworkId(int i, String str) {
        Boolean bool;
        NetworkConfig networkConfig;
        List<AllowNetworkIdConfig> list;
        boolean z;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        boolean z2 = true;
        if (settings != null && (networkConfig = settings.networkConfig) != null && (list = networkConfig.allowNetworkIdConfigs) != null) {
            if (!list.isEmpty()) {
                for (AllowNetworkIdConfig allowNetworkIdConfig : list) {
                    if (o.LJ(allowNetworkIdConfig.invokeType, "around") || o.LJ(allowNetworkIdConfig.invokeType, str)) {
                        if (allowNetworkIdConfig.apiIds.contains(Integer.valueOf(i))) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if ((i != 400000 && i != 400001) || NetworkComponent.INSTANCE.getUrlConnectionService() != null) {
            z2 = false;
        }
        if (!o.LJ(bool, Boolean.TRUE) && !z2) {
            return null;
        }
        return new C39519Ff9(null, false);
    }

    public final void statisticsApiCost(int i, long j) {
        try {
            if (NetworkComponent.INSTANCE.isNetworkEnabled()) {
                C65920Pu0.LIZ(i, j);
            }
        } catch (Throwable th) {
            C65926Pu6.LIZ("Helios:Network-Invoke", null, 6, th);
        }
    }

    private final C39519Ff9 addInterceptor(int i, Object obj, Object[] objArr) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z = false;
        if (i != 400100) {
            if (i != 400200) {
                if (i != 400400) {
                    return null;
                }
                IAppLogService appLogService = NetworkComponent.INSTANCE.getAppLogService();
                if (appLogService != null) {
                    if (objArr != null) {
                        obj4 = objArr[0];
                    } else {
                        obj4 = null;
                    }
                    z = appLogService.addInterceptor(obj4);
                }
                C65926Pu6.LIZIZ("Helios:Network-Invoke", new C65897Ptd(i, z), 2, null, 8);
                return new C39519Ff9(null, z);
            }
            ITTNetService ttNetService = NetworkComponent.INSTANCE.getTtNetService();
            if (ttNetService != null) {
                obj3 = ttNetService.addInterceptor(obj);
            } else {
                obj3 = null;
            }
            C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS109S0101000_11(i, obj3, 1), 2, null, 8);
            return new C39519Ff9(null, false);
        }
        IOkHttpService okHttpService = NetworkComponent.INSTANCE.getOkHttpService();
        if (okHttpService != null) {
            obj2 = okHttpService.addInterceptor(obj);
        } else {
            obj2 = null;
        }
        C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS109S0101000_11(i, obj2, 0), 2, null, 8);
        return new C39519Ff9(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.Ff9] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // X.InterfaceC39518Ff8
    public C39519Ff9 preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C65300Pk0 c65300Pk0) {
        C39519Ff9 addInterceptor;
        NetworkConfig networkConfig;
        ?? r4 = 0;
        r4 = 0;
        try {
            CostTimeline costTimeline = new CostTimeline(0L, 1, r4);
            ?? r5 = 8;
            C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS2S2001000_11(i, str, str2, 1), 2, null, 8);
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            SettingsModel settings = networkComponent.getSettings();
            if ((settings == null || (networkConfig = settings.networkConfig) == null || networkConfig.enabled) && (addInterceptor = addInterceptor(i, obj, objArr)) != null) {
                return addInterceptor;
            }
            if (!networkComponent.isNetworkEnabled()) {
                C65926Pu6.LIZIZ("Helios:Network-Invoke", C65371Pl9.LJLIL, 2, null, 8);
                return new C39519Ff9(null, false);
            }
            C39519Ff9 filterAllowNetworkId = filterAllowNetworkId(i, "before");
            try {
                if (i != 400401 && i != 400501 && filterAllowNetworkId == null) {
                    try {
                        C65922Pu2 createOriginalInvokeContext$default = createOriginalInvokeContext$default(this, "before", i, str, str2, obj, objArr, c65300Pk0, str3, null, false, 768, null);
                        r4 = handleRequestStack(createOriginalInvokeContext$default);
                        if (r4 != 0) {
                            return r4;
                        }
                        C39519Ff9 handleTTNetGuardCallback = handleTTNetGuardCallback(createOriginalInvokeContext$default);
                        try {
                            if (handleTTNetGuardCallback != null) {
                                C65926Pu6.LIZIZ("Helios:Network-Invoke", C65319PkJ.LJLIL, 2, null, 8);
                                return handleTTNetGuardCallback;
                            }
                            CostTimeline.logCostTime$default(costTimeline, "beforeNetworkEvent", null, 0L, null, 14, null);
                            PYQ LIZIZ = C65900Ptg.LIZIZ(createOriginalInvokeContext$default, false);
                            if (LIZIZ != null) {
                                CostTimeline.logCostTime$default(costTimeline, "createNetworkEvent", null, 0L, null, 14, null);
                                return C65918Pty.LIZIZ(LIZIZ, costTimeline);
                            }
                            return new C39519Ff9(null, false);
                        } catch (Throwable th) {
                            th = th;
                            r5 = 0;
                            C65926Pu6.LIZ("Helios:Network-Invoke", C65320PkK.LJLIL, 6, th);
                            return new C39519Ff9(r4, r5);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = 0;
                    }
                }
                C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS46S0001000_11(i, 1), 2, null, 8);
                if (filterAllowNetworkId != null) {
                    return filterAllowNetworkId;
                }
                return new C39519Ff9(null, false);
            } catch (Throwable th3) {
                th = th3;
                C65926Pu6.LIZ("Helios:Network-Invoke", C65320PkK.LJLIL, 6, th);
                return new C39519Ff9(r4, r5);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC39518Ff8
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C65300Pk0 c65300Pk0, boolean z) {
        NetworkConfig networkConfig;
        ShutdownConfig shutdownConfig;
        try {
            Object obj3 = null;
            CostTimeline costTimeline = new CostTimeline(0L, 1, 0 == true ? 1 : 0);
            C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS2S2001000_11(i, str, str2, 0), 2, null, 8);
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            if (!networkComponent.isNetworkEnabled()) {
                C65926Pu6.LIZIZ("Helios:Network-Invoke", C65372PlA.LJLIL, 2, null, 8);
                return;
            }
            if (i != 400401 && i != 400501 && filterAllowNetworkId(i, "after") != null) {
                C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS46S0001000_11(i, 0), 2, null, 8);
                return;
            }
            try {
                C65922Pu2 createOriginalInvokeContext$default = createOriginalInvokeContext$default(this, "after", i, str, str2, obj, objArr, c65300Pk0, null, obj2, z, 128, null);
                CostTimeline.logCostTime$default(costTimeline, "beforeNetworkEvent", null, 0L, null, 14, null);
                PYQ LIZIZ = C65900Ptg.LIZIZ(createOriginalInvokeContext$default, false);
                if (LIZIZ != null) {
                    SettingsModel settings = networkComponent.getSettings();
                    if (settings != null && (networkConfig = settings.networkConfig) != null && (shutdownConfig = networkConfig.shutdownConfig) != null && shutdownConfig.urlReplace && C64656PZc.LIZJ.contains(Integer.valueOf(i)) && (LIZIZ instanceof C65902Pti)) {
                        if (objArr != null) {
                            obj3 = objArr[objArr.length - 1];
                        }
                        C65902Pti c65902Pti = (C65902Pti) obj3;
                        if (c65902Pti != null) {
                            C65902Pti c65902Pti2 = (C65902Pti) LIZIZ;
                            c65902Pti2.LJLJJI = c65902Pti.getUrl();
                            c65902Pti2.LJLJJLL = c65902Pti.getDomain();
                            c65902Pti2.LJLJJL = c65902Pti.U();
                            c65902Pti2.LJLJL = c65902Pti.getPath();
                            C65901Pth c65901Pth = c65902Pti2.LJLIL;
                            Set<String> set = c65902Pti.LJLIL.LJLLJ;
                            c65901Pth.getClass();
                            o.LJIIIZ(set, "<set-?>");
                            c65901Pth.LJLLJ = set;
                        }
                    }
                    CostTimeline.logCostTime$default(costTimeline, "createNetworkEvent", null, 0L, null, 14, null);
                    if (i != 400401 && i != 400501) {
                        C65918Pty.LIZJ(LIZIZ, costTimeline);
                        return;
                    }
                    if (filterAllowNetworkId(i, "before") == null) {
                        C65922Pu2 c65922Pu2 = LIZIZ.LJJJJL().LJLIL;
                        c65922Pu2.getClass();
                        c65922Pu2.LIZIZ = "before";
                        C65918Pty.LIZIZ(LIZIZ, costTimeline);
                    }
                    if (filterAllowNetworkId(i, "after") == null) {
                        C65918Pty.LIZJ(((C65903Ptj) LIZIZ).L(C65922Pu2.LIZ(LIZIZ.LJJJJL().LJLIL)), costTimeline);
                    }
                }
            } catch (Throwable th) {
                th = th;
                C65926Pu6.LIZ("Helios:Network-Invoke", C65373PlB.LJLIL, 6, th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r14 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0 = r1.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r15 = X.ORY.LJLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return new X.C65922Pu2(r18, r17, r5, r6, r21, r22, r9, r25, r26, r23, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r15 = new java.util.LinkedHashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C65922Pu2 createOriginalInvokeContext(java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, java.lang.Object[] r22, X.C65300Pk0 r23, java.lang.String r24, java.lang.Object r25, boolean r26) {
        /*
            r16 = this;
            r6 = r20
            r9 = r24
            r5 = r19
            java.util.Map<java.lang.Integer, X.Pv5> r1 = com.bytedance.helios.statichook.config.ApiHookConfig.LIZIZ
            r3 = r18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r0)
            X.Pv5 r1 = (X.C65987Pv5) r1
            if (r1 == 0) goto L56
        L16:
            X.Pu2 r2 = new X.Pu2
            java.lang.String r0 = ""
            if (r5 == 0) goto L54
        L1c:
            if (r6 == 0) goto L52
        L1e:
            if (r9 == 0) goto L50
        L20:
            if (r1 == 0) goto L42
            java.lang.String r13 = r1.LIZJ
            if (r13 == 0) goto L42
        L26:
            java.lang.String r14 = r1.LIZLLL
            if (r14 == 0) goto L46
        L2a:
            java.lang.String[] r0 = r1.LJI
            if (r0 == 0) goto L4a
            java.util.Set r15 = X.ORY.LJLIIL(r0)
        L32:
            r8 = r22
            r7 = r21
            r4 = r17
            r11 = r26
            r10 = r25
            r12 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L42:
            r13 = r0
            if (r1 == 0) goto L46
            goto L26
        L46:
            r14 = r0
            if (r1 == 0) goto L4a
            goto L2a
        L4a:
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            r15.<init>()
            goto L32
        L50:
            r9 = r0
            goto L20
        L52:
            r6 = r0
            goto L1e
        L54:
            r5 = r0
            goto L1c
        L56:
            java.util.Map<java.lang.Integer, X.Pv5> r1 = X.C65988Pv6.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r0)
            X.Pv5 r1 = (X.C65987Pv5) r1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.NetworkInvoker.createOriginalInvokeContext(java.lang.String, int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], X.Pk0, java.lang.String, java.lang.Object, boolean):X.Pu2");
    }

    public static /* synthetic */ C65922Pu2 createOriginalInvokeContext$default(NetworkInvoker networkInvoker2, String str, int i, String str2, String str3, Object obj, Object[] objArr, C65300Pk0 c65300Pk0, String str4, Object obj2, boolean z, int i2, Object obj3) {
        boolean z2 = z;
        String str5 = str4;
        Object obj4 = null;
        if ((i2 & 128) != 0) {
            str5 = null;
        }
        if ((i2 & 256) == 0) {
            obj4 = obj2;
        }
        if ((i2 & 512) != 0) {
            z2 = true;
        }
        return networkInvoker2.createOriginalInvokeContext(str, i, str2, str3, obj, objArr, c65300Pk0, str5, obj4, z2);
    }
}
