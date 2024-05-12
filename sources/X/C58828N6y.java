package X;

/* renamed from: X.N6y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58828N6y extends N75 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("ad_google_map_enable", false) == false) goto L5;
     */
    @Override // X.AbstractC37594EpC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r7, X.C37356ElM r8, X.EnumC37844EtE r9) {
        /*
            r6 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.Class<X.N74> r0 = X.N74.class
            r4 = 0
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r3 = X.ED5.LIZJ(r0, r4)
            X.N74 r3 = (X.N74) r3
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.setCode(r1)
            r5 = 0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = "ad_google_map_enable"
            r2.getClass()     // Catch: java.lang.Exception -> L26
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r5)     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L38
        L26:
            com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService r0 = com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl.LJFF()
            boolean r0 = r0.LJ()
            if (r0 != 0) goto L38
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setCode(r0)
        L38:
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r5)
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            if (r0 == 0) goto L48
            java.lang.String r4 = r0.getUid()
        L48:
            boolean r0 = X.C6D8.LIZLLL()
            if (r0 == 0) goto L56
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setCode(r0)
        L56:
            if (r4 == 0) goto L5e
            int r0 = r4.length()
            if (r0 != 0) goto L66
        L5e:
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setCode(r0)
        L66:
            com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService r0 = com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl.LJFF()
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L78
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setCode(r0)
        L78:
            java.lang.Number r0 = r3.getCode()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L92
            com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService r2 = com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl.LJFF()
            java.lang.String r0 = "get().getService(IGoogleMapService::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            X.8gJ r1 = X.EnumC217558gJ.KEEP
            java.lang.String r0 = "COMMERCE_GOOGLE_MAP_JSB_TASK"
            X.C58212Msy.LIZ(r2, r1, r0)
        L92:
            java.lang.String r0 = ""
            r8.onSuccess(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58828N6y.LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, X.ElM, X.EtE):void");
    }
}
