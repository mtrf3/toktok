package X;

/* renamed from: X.LoR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55383LoR {
    public static final C55383LoR LIZ = new C55383LoR();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L94.LJLIL);

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: JSONException -> 0x00a9, LOOP:0: B:26:0x0088->B:28:0x008e, LOOP_END, TryCatch #0 {JSONException -> 0x00a9, blocks: (B:36:0x0074, B:38:0x009c, B:25:0x007f, B:26:0x0088, B:28:0x008e, B:30:0x00a2, B:24:0x007a), top: B:35:0x0074 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.lang.String r4, java.lang.String r5, org.json.JSONObject r6) {
        /*
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "extJson"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "draw_ad"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "background_ad"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto La9
        L1f:
            X.Ol8 r0 = X.C55383LoR.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La9
            X.Ol8 r0 = X.C52958KqQ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
            return
        L3c:
            X.F6c r0 = X.C38423F6d.LIZ
            r0.getClass()
            boolean r0 = X.C38422F6c.LIZIZ()
            if (r0 != 0) goto L48
            return
        L48:
            int r0 = X.EF7.LJIIIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.bytedance.pitaya.api.feature.FeatureCoreFactory r0 = com.bytedance.pitaya.api.feature.FeatureCoreFactory.INSTANCE
            com.bytedance.pitaya.api.feature.IFeatureCore r1 = r0.getFeatureCore(r1)
            if (r1 != 0) goto L57
            return
        L57:
            java.lang.String r0 = "screen_area"
            com.bytedance.pitaya.api.feature.IKVStore r1 = r1.createInMemoryKVStore(r0)
            java.lang.String r0 = "pitaya_feature_screen_area_model"
            java.lang.Object r5 = r1.getValueForKey(r0)
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L6b
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            if (r5 != 0) goto L6c
        L6b:
            return
        L6c:
            java.lang.String r4 = "ad_extra_data"
            java.lang.String r1 = r6.optString(r4)
            if (r1 == 0) goto L7a
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L9c
        L7a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> La9
            r0.<init>()     // Catch: org.json.JSONException -> La9
        L7f:
            java.util.Iterator r3 = r5.keys()     // Catch: org.json.JSONException -> La9
            java.lang.String r1 = "screenAreaData.keys()"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r1)     // Catch: org.json.JSONException -> La9
        L88:
            boolean r1 = r3.hasNext()     // Catch: org.json.JSONException -> La9
            if (r1 == 0) goto La2
            java.lang.Object r2 = r3.next()     // Catch: org.json.JSONException -> La9
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> La9
            java.lang.Object r1 = r5.opt(r2)     // Catch: org.json.JSONException -> La9
            r0.put(r2, r1)     // Catch: org.json.JSONException -> La9
            goto L88
        L9c:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> La9
            r0.<init>(r1)     // Catch: org.json.JSONException -> La9
            goto L7f
        La2:
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> La9
            r6.put(r4, r0)     // Catch: org.json.JSONException -> La9
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55383LoR.LIZ(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
