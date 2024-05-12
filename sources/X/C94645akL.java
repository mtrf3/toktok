package X;

/* renamed from: X.akL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94645akL extends AbstractC94465ahR<C94355aff> {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[SYNTHETIC] */
    @Override // X.AbstractC94465ahR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r21) {
        /*
            r20 = this;
            java.lang.String r0 = "response"
            r1 = r21
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.List r0 = r1.getUrl_prefix()
            java.lang.String r4 = X.AbstractC94197ad7.LIZLLL(r0)
            java.util.List r0 = r1.getCategory_responses()
            java.util.Iterator r10 = r0.iterator()
        L1c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r5 = r10.next()
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r5 = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = r5.getTotal_effects()
            java.util.Iterator r9 = r0.iterator()
        L35:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r7 = r9.next()
            com.ss.ugc.effectplatform.model.Effect r7 = (com.ss.ugc.effectplatform.model.Effect) r7
            java.lang.StringBuilder r8 = X.X1D.LIZ()
            java.lang.String r1 = ""
            r8.append(r1)
            org.json.JSONObject r6 = X.AbstractC94197ad7.LIZIZ(r7)
            java.lang.String r0 = "modelpic"
            if (r6 == 0) goto L59
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r6, r0)     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            r8.append(r0)
            java.lang.String r8 = X.X1D.LIZIZ(r8)
            java.lang.String r0 = r7.getExtra()
            if (r0 == 0) goto L77
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r0)
            java.lang.String r0 = "scalefactor"
            java.lang.String r1 = r6.optString(r0, r1)
            java.lang.String r0 = "extraJson.optString(MODEL_SCALEFACTOR, \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L77:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r4)
            r0.append(r8)
            java.lang.String r15 = X.X1D.LIZIZ(r0)
            X.ae4 r11 = new X.ae4
            java.lang.String r12 = r7.getName()
            java.lang.String r13 = r5.getName()
            java.lang.String r14 = r5.getKey()
            java.lang.String r16 = r7.getEffect_id()
            java.lang.String r17 = r7.getResource_id()
            r19 = 128(0x80, float:1.8E-43)
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r11)
            goto L35
        La6:
            java.lang.String r0 = r5.getName()
            r3.put(r0, r2)
            goto L1c
        Laf:
            X.aff r0 = new X.aff
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94645akL.LJFF(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse):java.lang.Object");
    }
}
