package com.ss.android.ugc.aweme.stemfeed.utils;

import com.bytedance.router.route.IRouteAction;

/* loaded from: classes11.dex */
public final class StemOptionalSettingUpdateRouteAction implements IRouteAction {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (r3 == null) goto L16;
     */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r32, java.lang.String r33, android.os.Bundle r34) {
        /*
            r31 = this;
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r33)
            java.lang.String r1 = "stem"
            r0 = 0
            boolean r0 = r2.getBooleanQueryParameter(r1, r0)
            com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService r2 = yq4.a.LJIIZILJ()
            if (r0 == 0) goto La8
            X.Ome r0 = X.EnumC62916Ome.ON
        L13:
            int r1 = r0.getValue()
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r3 = r2.LJIIL()
            if (r3 == 0) goto L65
            r4 = 0
            r23 = 0
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r0 = r2.LJIIL()
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings r0 = r0.getPreferenceSettings()
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings r0 = r0.copy(r1)
            if (r0 != 0) goto L37
        L32:
            com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings r0 = new com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings
            r0.<init>(r1)
        L37:
            r29 = 29360127(0x1bfffff, float:7.0529655E-38)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r24 = r23
            r25 = r23
            r26 = r0
            r27 = r23
            r28 = r4
            r30 = r4
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r3 = com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r3 != 0) goto L9a
        L65:
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r3 = new com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting
            r4 = 0
            r23 = 0
            com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings r0 = new com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings
            r0.<init>(r1)
            r29 = 29360127(0x1bfffff, float:7.0529655E-38)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r24 = r23
            r25 = r23
            r26 = r0
            r27 = r23
            r28 = r4
            r30 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L9a:
            r2.LJIILJJIL(r3)
            X.OmY r0 = new X.OmY
            r0.<init>()
            X.C2U8.LIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        La8:
            X.Ome r0 = X.EnumC62916Ome.OFF
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.stemfeed.utils.StemOptionalSettingUpdateRouteAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
