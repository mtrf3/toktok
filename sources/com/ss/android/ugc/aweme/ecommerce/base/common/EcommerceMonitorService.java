package com.ss.android.ugc.aweme.ecommerce.base.common;

import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceMonitorService;

/* loaded from: classes7.dex */
public final class EcommerceMonitorService implements IEcommerceMonitorService {
    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(1:53)|3|(1:5)|6|(1:52)|8|(1:10)|11|(2:12|13)|(12:15|(1:17)|18|19|20|(1:47)|22|(3:24|25|(4:27|(7:32|33|(1:35)|36|(1:42)|38|(1:41))|29|30))|46|(0)|29|30)|49|(0)|18|19|20|(0)|22|(0)|46|(0)|29|30) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[Catch: Exception -> 0x009b, TryCatch #1 {Exception -> 0x009b, blocks: (B:20:0x0074, B:22:0x0084, B:24:0x008a, B:25:0x0095), top: B:19:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceMonitorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC65105Pgr> LIZ() {
        /*
            r7 = this;
            java.lang.String r5 = "trace_fetch_intercept_path"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig$EcomRequestParamVerifierModel> r2 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig$EcomRequestParamVerifierModel r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig.LIZ
            java.lang.String r0 = "ttec_request_rule_verification_v1"
            java.lang.Object r0 = r4.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig$EcomRequestParamVerifierModel r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel) r0
            if (r0 != 0) goto L51
        L19:
            java.lang.Boolean r1 = r1.getEnableVerification()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2d
            X.E7B r0 = new X.E7B
            r0.<init>()
            r3.add(r0)
        L2d:
            java.lang.String r0 = "ecom_blank_detect_enable"
            r4 = 0
            boolean r0 = X.C19N.LJ(r0, r4)
            if (r0 != 0) goto L48
        L36:
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomNetworkInterceptorSwitch$EcomNetworkInterceptorSwitchModel r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomNetworkInterceptorSwitch.LIZ
            boolean r0 = r0.getSwitch()
            if (r0 == 0) goto L46
            X.ENT r0 = new X.ENT
            r0.<init>()
            r3.add(r0)
        L46:
            r2 = 1
            goto L53
        L48:
            X.EaC r0 = new X.EaC
            r0.<init>()
            r3.add(r0)
            goto L36
        L51:
            r1 = r0
            goto L19
        L53:
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L64
            java.lang.String r0 = "ecom_search_pdp_optimize_setting_v2"
            r1.getClass()     // Catch: java.lang.Exception -> L64
            int r0 = com.bytedance.ies.abmock.SettingsManager.LJ(r0, r4)     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L64
            r0 = 1
            goto L65
        L64:
            r0 = 0
        L65:
            if (r0 == 0) goto L6f
            X.EA2 r0 = new X.EA2
            r0.<init>()
            r3.add(r0)
        L6f:
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.LIZ
            r0.getClass()
            com.bytedance.ies.abmock.SettingsManager r6 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L9b
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor$EcomNetworkTraceInterceptorSwitch> r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.EcomNetworkTraceInterceptorSwitch.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor$EcomNetworkTraceInterceptorSwitch r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.LIZIZ     // Catch: java.lang.Exception -> L9b
            java.lang.Object r0 = r6.LJIIIIZZ(r5, r0, r1)     // Catch: java.lang.Exception -> L9b
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor$EcomNetworkTraceInterceptorSwitch r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.EcomNetworkTraceInterceptorSwitch) r0     // Catch: java.lang.Exception -> L9b
            if (r0 != 0) goto L93
        L84:
            java.util.List r0 = r1.getPaths()     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L9b
            java.util.List r0 = r1.getPaths()     // Catch: java.lang.Exception -> L9b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L9b
            goto L95
        L93:
            r1 = r0
            goto L84
        L95:
            r0 = r0 ^ 1
            if (r0 == 0) goto L9b
            r0 = 1
            goto L9c
        L9b:
            r0 = 0
        L9c:
            if (r0 == 0) goto Ld0
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = "ec_trace_parent_enable"
            r0.getClass()     // Catch: java.lang.Exception -> Lb0
            r0 = 31744(0x7c00, float:4.4483E-41)
            int r0 = X.FFL.LJIIJ(r0, r4, r1, r2)     // Catch: java.lang.Exception -> Lb0
            if (r0 != r2) goto Lb0
            r4 = 1
        Lb0:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor$EcomNetworkTraceInterceptorSwitch> r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.EcomNetworkTraceInterceptorSwitch.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor$EcomNetworkTraceInterceptorSwitch r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.LIZIZ
            java.lang.Object r0 = r2.LJIIIIZZ(r5, r0, r1)
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor$EcomNetworkTraceInterceptorSwitch r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.EcomTraceInterceptor.EcomNetworkTraceInterceptorSwitch) r0
            if (r0 != 0) goto Ld9
        Lc0:
            java.util.List r1 = r1.getPaths()
            if (r4 == 0) goto Ld0
            if (r1 == 0) goto Ld0
            X.Pdb r0 = new X.Pdb
            r0.<init>(r1)
            r3.add(r0)
        Ld0:
            X.EN1 r0 = new X.EN1
            r0.<init>()
            r3.add(r0)
            return r3
        Ld9:
            r1 = r0
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceMonitorService.LIZ():java.util.List");
    }
}
