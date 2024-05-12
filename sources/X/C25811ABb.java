package X;

import com.ss.android.ugc.trill.language.view.AppLanguageListFragment;

/* renamed from: X.ABb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25811ABb implements InterfaceC252739vx {
    public final /* synthetic */ AppLanguageListFragment LIZ;

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(1:33)(1:11)|12|(9:16|17|18|(1:20)(1:29)|21|(1:28)|23|24|25)|32|17|18|(0)(0)|21|(0)|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // X.InterfaceC252739vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r1 = r7.LIZ
            X.9vu r0 = r1.LJLILLLLZI
            java.util.Objects.requireNonNull(r0)
            r1.LJLILLLLZI = r0
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            X.9vu r1 = r0.LJLILLLLZI
            java.lang.String r0 = "end_text"
            android.view.View r0 = r1.LJI(r0)
            if (r0 == 0) goto L1b
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L21
        L1b:
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            r0.LIZ()
            return
        L21:
            com.ss.android.ugc.aweme.setting.services.ISettingService r0 = com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.LIZ()
            java.util.List r2 = r0.getI18nItems()
            java.lang.String r6 = ""
            if (r2 == 0) goto L70
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            int r1 = r0.LJLJJL
            if (r1 < 0) goto L70
            int r0 = r2.size()
            if (r1 >= r0) goto L70
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            int r0 = r0.LJLJJL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.G36 r0 = (X.G36) r0
            java.lang.String r5 = r0.LIZ()
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            int r0 = r0.LJLJJL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.G36 r0 = (X.G36) r0
            java.lang.String r4 = r0.LIZJ()
        L55:
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            int r1 = r0.LJLJJLL
            if (r1 < 0) goto L75
            int r0 = r2.size()
            if (r1 >= r0) goto L75
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            int r0 = r0.LJLJJLL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.G36 r0 = (X.G36) r0
            java.lang.String r3 = r0.LIZ()
            goto L76
        L70:
            r5 = r6
            r4 = r6
            if (r2 == 0) goto L75
            goto L55
        L75:
            r3 = r6
        L76:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L94
            r2.<init>()     // Catch: java.lang.Exception -> L94
            java.lang.String r1 = "pre_label"
            if (r3 != 0) goto L81
            r0 = r6
            goto L82
        L81:
            r0 = r3
        L82:
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = "label"
            if (r5 != 0) goto L92
        L89:
            r2.put(r0, r6)     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = "change_language"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3(r0, r2)     // Catch: java.lang.Exception -> L94
            goto L98
        L92:
            r6 = r5
            goto L89
        L94:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L98:
            X.YGb r2 = X.C43286Gyo.LIZ
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r0 = r7.LIZ
            android.content.Context r1 = r0.getContext()
            X.ABd r0 = new X.ABd
            r0.<init>(r3, r5)
            r2.LJ(r5, r4, r1, r0)
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.external.ICacheService r0 = r0.cacheConfig()
            r0.clearFilterCache()
            r0 = 0
            X.C25815ABf.LIZ = r0
            com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService r0 = yq4.a.LIZIZ()
            r0.LJIJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25811ABb.LIZ():void");
    }

    public C25811ABb(AppLanguageListFragment appLanguageListFragment) {
        this.LIZ = appLanguageListFragment;
    }
}
