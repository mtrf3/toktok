package com.ss.android.ugc.aweme.service.protection;

import X.C58096Mr6;
import X.C65429Pm5;
import X.E63;
import X.E64;
import X.E67;
import X.HG3;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TooltipApplicabilityService implements ITooltipApplicabilityService {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r5 = this;
            X.E64.LIZ()
            r4 = 0
            com.ss.android.ugc.aweme.plugin.IPluginService r0 = com.ss.android.ugc.aweme.plugin.PluginService.createIPluginServicebyMonsterPlugin(r4)
            java.util.List r0 = r0.getCurrentPluginListPluginData()
            java.util.Iterator r3 = r0.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
            int r1 = r0.id
            X.E4t r0 = X.EnumC35839E4t.TOOLTIP_PROTECTION
            int r0 = r0.getValue()
            if (r1 != r0) goto L11
        L28:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r2 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r2
            if (r2 == 0) goto L4c
            com.ss.android.ugc.aweme.plugin.IPluginService$ShowConfig r0 = r2.showConfig
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = r0.shouldShow
            if (r0 == 0) goto L4e
            boolean r1 = r0.booleanValue()
        L38:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r0 = r0.tooltipDataProtection
            if (r0 == 0) goto L52
            java.lang.Boolean r0 = r0.enabled
            if (r0 == 0) goto L52
            boolean r0 = r0.booleanValue()
        L48:
            if (r1 == 0) goto L4d
            if (r0 == 0) goto L4d
        L4c:
            r4 = 1
        L4d:
            return r4
        L4e:
            r1 = 1
            if (r2 == 0) goto L52
            goto L38
        L52:
            r0 = 1
            goto L48
        L54:
            r2 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService.LIZIZ():boolean");
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final int LIZJ() {
        return Keva.getRepo("tooltip_protection").getInt("active_days", 1);
    }

    public static ITooltipApplicabilityService LJII() {
        Object LIZ = C58096Mr6.LIZ(ITooltipApplicabilityService.class, false);
        if (LIZ != null) {
            return (ITooltipApplicabilityService) LIZ;
        }
        if (C58096Mr6.f89v5 == null) {
            synchronized (ITooltipApplicabilityService.class) {
                if (C58096Mr6.f89v5 == null) {
                    C58096Mr6.f89v5 = new TooltipApplicabilityService();
                }
            }
        }
        return C58096Mr6.f89v5;
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean LIZ() {
        return HG3.LJIILL().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean LIZLLL() {
        return E63.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean isNewUser() {
        return E63.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean LJ(E67 dependency) {
        o.LJIIIZ(dependency, "dependency");
        return E64.LIZ().LIZIZ(dependency);
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final void LJFF(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        C65429Pm5.LJ("new_user_", secUid, E63.LIZ, true);
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final int LJI(E67 dependency) {
        o.LJIIIZ(dependency, "dependency");
        return E64.LIZ().LIZ(dependency);
    }
}
