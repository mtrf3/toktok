package X;

/* loaded from: classes13.dex */
public final class RYT {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (ujb.o.LJJJJJL(r2) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (ujb.o.LJJJJJL(r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r0 = r3.standardSaleProp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r4 = r0.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r0 = r15.saleProps;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r1 = X.ORZ.LLJILJILJ(r0);
        r7 = new java.util.ArrayList(X.C32I.LJJL(r1, 10));
        r3 = ((java.util.ArrayList) r1).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r3.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2.propId, r4.propId) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        r7.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct.LIZ(r15, null, r7, null, null, null, null, null, null, -129, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0042, code lost:
    
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r15) {
        /*
            r5 = r15
            if (r5 == 0) goto L7
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps r3 = r5.localSizeSaleProp
            if (r3 != 0) goto L8
        L7:
            return r5
        L8:
            com.ss.android.ugc.aweme.app.host.AwemeHostApplication r0 = X.FKM.LIZ()
            X.Cru r1 = X.C72264SXs.LIZ(r0)
            java.lang.String r0 = "ec_localized_size_info_key"
            java.lang.Object r0 = r1.LIZLLL(r0)
            r2 = 0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.toString()
            goto L1f
        L1e:
            r0 = r2
        L1f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L38
            if (r0 != 0) goto L25
            java.lang.String r0 = "{}"
        L25:
            r1.<init>(r0)     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = "ec_localized_size_identifier"
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L40
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L37
            goto L40
        L37:
            r2 = r1
        L38:
            if (r2 == 0) goto L40
            boolean r0 = ujb.o.LJJJJJL(r2)
            if (r0 == 0) goto L44
        L40:
            java.lang.String r2 = r3.defaultStandardSign
            if (r2 == 0) goto L4a
        L44:
            boolean r0 = ujb.o.LJJJJJL(r2)
            if (r0 == 0) goto L4b
        L4a:
            return r5
        L4b:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r0 = r3.standardSaleProp
            if (r0 == 0) goto L7
            java.lang.Object r4 = r0.get(r2)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r4 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r4
            if (r4 != 0) goto L58
            goto L7
        L58:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r0 = r5.saleProps
            if (r0 == 0) goto L7
            java.util.List r1 = X.ORZ.LLJILJILJ(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r7.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r3 = r1.iterator()
        L71:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r2
            java.lang.String r1 = r2.propId
            java.lang.String r0 = r4.propId
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L88
            r2 = r4
        L88:
            r7.add(r2)
            goto L71
        L8c:
            r6 = 0
            r14 = -129(0xffffffffffffff7f, float:NaN)
            r15 = -1
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r5 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RYT.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct):com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct");
    }
}
