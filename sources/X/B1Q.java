package X;

/* loaded from: classes5.dex */
public final class B1Q {
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r7, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r8) {
        /*
            java.lang.String r0 = "element"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r6 = 0
            if (r8 != 0) goto L9
            return r6
        L9:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r7.subElementDTOList
            r5 = 1
            if (r0 == 0) goto L63
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r3
            java.lang.String r2 = r3.id
            if (r2 == 0) goto L62
            int r1 = r2.hashCode()
            r0 = -304863367(0xffffffffedd42779, float:-8.2073177E27)
            if (r1 == r0) goto L59
            r0 = 1981981399(0x7622a2d7, float:8.24663E32)
            if (r1 == r0) goto L50
            r0 = 2002908406(0x7761f4f6, float:4.58295E33)
            if (r1 == r0) goto L47
        L35:
            java.lang.String r0 = r3.id
            java.lang.String r0 = r8.LIZLLL(r0)
            if (r0 == 0) goto L43
            int r0 = r0.length()
            if (r0 != 0) goto L44
        L43:
            r6 = 1
        L44:
            r0 = r6 ^ 1
            return r0
        L47:
            java.lang.String r0 = "eg_ccdc_global_billing_address_street_mobile"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L12
            goto L35
        L50:
            java.lang.String r0 = "eg_ccdc_global_billing_address"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L12
            goto L35
        L59:
            java.lang.String r0 = "eg_ccdc_global_billing_address_postal_code"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L12
            goto L35
        L62:
            return r6
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1Q.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address):boolean");
    }
}
