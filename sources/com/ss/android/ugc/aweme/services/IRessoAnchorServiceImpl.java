package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C58096Mr6;
import X.C61924OSa;
import X.OSZ;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;
import com.google.gson.p;

/* loaded from: classes11.dex */
public final class IRessoAnchorServiceImpl implements IRessoAnchorService {
    public static IRessoAnchorService createIRessoAnchorServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IRessoAnchorService.class, z);
        if (LIZ != null) {
            return (IRessoAnchorService) LIZ;
        }
        return new IRessoAnchorServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.services.IRessoAnchorService
    public OSZ<Long, Integer> getCopyrightLimitMsUninstalledResso(String str) {
        m LJJIJIL;
        m mVar = (m) SettingsManager.LIZLLL().LJIIIIZZ("resso_control_list", m.class, C61924OSa.LIZ);
        long j = Long.MAX_VALUE;
        int i = 0;
        if (mVar != null) {
            try {
                if (mVar.LJJIJLIJ(str) && (LJJIJIL = mVar.LJJIJIL(str)) != null) {
                    p LJJIJL = LJJIJIL.LJJIJL("show_interval_in_millSeconds");
                    if (LJJIJL != null) {
                        j = LJJIJL.LJIJJLI();
                    } else {
                        j = 0;
                    }
                    p LJJIJL2 = LJJIJIL.LJJIJL("max_finish_count");
                    if (LJJIJL2 != null) {
                        i = LJJIJL2.LJIILJJIL();
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return new OSZ<>(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.services.IRessoAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean showAnchorUninstalledResso(java.lang.String r13, android.content.Context r14) {
        /*
            r12 = this;
            java.lang.String r0 = "copyRightOwnerLabel"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.google.gson.m> r2 = com.google.gson.m.class
            com.google.gson.m r1 = X.C61924OSa.LIZ
            java.lang.String r0 = "resso_control_list"
            java.lang.Object r1 = r3.LJIIIIZZ(r0, r2, r1)
            com.google.gson.m r1 = (com.google.gson.m) r1
            r11 = 0
            r3 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L51
            boolean r0 = r1.LJJIJLIJ(r13)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L51
            com.google.gson.m r1 = r1.LJJIJIL(r13)     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L51
            java.lang.String r0 = "show_interval_in_millSeconds"
            com.google.gson.p r0 = r1.LJJIJL(r0)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L4a
            long r9 = r0.LJIJJLI()     // Catch: java.lang.Exception -> L4d
        L3d:
            java.lang.String r0 = "max_finish_count"
            com.google.gson.p r0 = r1.LJJIJL(r0)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L51
            int r8 = r0.LJIILJJIL()     // Catch: java.lang.Exception -> L4d
            goto L52
        L4a:
            r9 = 0
            goto L3d
        L4d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L51:
            r8 = 0
        L52:
            int r0 = r13.length()
            r6 = 1
            if (r0 != 0) goto L67
        L59:
            r5 = 0
        L5a:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L66
            if (r5 >= r8) goto L66
            r11 = 1
        L66:
            return r11
        L67:
            r0 = 0
            r2 = 0
            if (r0 == 0) goto L6c
            goto L59
        L6c:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            r5[r11] = r0
            java.lang.String r1 = "resso_exp_%s"
            java.lang.String r0 = "format(format, *args)"
            java.lang.String r1 = X.Q8U.LIZIZ(r5, r6, r1, r0)
            X.Cru r0 = X.C72264SXs.LIZ(r14)     // Catch: java.lang.Exception -> Ld4
            java.lang.Object r1 = r0.LIZLLL(r1)     // Catch: java.lang.Exception -> Ld4
            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Exception -> Ld4
            if (r0 == 0) goto L96
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> Ld4
            if (r1 == 0) goto L96
            java.lang.Object r2 = r1.get(r13)     // Catch: java.lang.Exception -> Ld4
        L96:
            boolean r0 = r2 instanceof java.util.Map     // Catch: java.lang.Exception -> Ld4
            if (r0 == 0) goto L59
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> Ld4
            if (r2 == 0) goto L59
            java.lang.String r0 = "lifetime_finished_count"
            java.lang.Object r1 = r2.get(r0)     // Catch: java.lang.Exception -> Ld4
            boolean r0 = r1 instanceof java.lang.Double     // Catch: java.lang.Exception -> Ld4
            if (r0 == 0) goto Lcd
            java.lang.Double r1 = (java.lang.Double) r1     // Catch: java.lang.Exception -> Ld4
            if (r1 == 0) goto Lcd
            double r0 = r1.doubleValue()     // Catch: java.lang.Exception -> Ld4
            int r7 = (int) r0     // Catch: java.lang.Exception -> Ld4
        Lb1:
            java.lang.String r0 = "last_finished_time"
            java.lang.Object r1 = r2.get(r0)     // Catch: java.lang.Exception -> Ld4
            boolean r0 = r1 instanceof java.lang.Double     // Catch: java.lang.Exception -> Ld4
            if (r0 == 0) goto Lca
            java.lang.Double r1 = (java.lang.Double) r1     // Catch: java.lang.Exception -> Ld4
            if (r1 == 0) goto Lca
            double r5 = r1.doubleValue()     // Catch: java.lang.Exception -> Ld4
            long r1 = (long) r5     // Catch: java.lang.Exception -> Ld4
        Lc4:
            com.ss.android.ugc.aweme.miniapp.anchor.RessoPlayRecord r0 = new com.ss.android.ugc.aweme.miniapp.anchor.RessoPlayRecord     // Catch: java.lang.Exception -> Ld4
            r0.<init>(r7, r1)     // Catch: java.lang.Exception -> Ld4
            goto Lcf
        Lca:
            r1 = 0
            goto Lc4
        Lcd:
            r7 = 0
            goto Lb1
        Lcf:
            long r3 = r0.lastFinishedTime
            int r5 = r0.lifetimeFinishedCount
            goto L5a
        Ld4:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.IRessoAnchorServiceImpl.showAnchorUninstalledResso(java.lang.String, android.content.Context):boolean");
    }
}
