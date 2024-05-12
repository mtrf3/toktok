package X;

/* loaded from: classes13.dex */
public final class SA5 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r15 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
    
        if (r15 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0045, code lost:
    
        if (r15 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0020, code lost:
    
        if (r15 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
    
        if (r15 != null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r15, boolean r16) {
        /*
            r8 = 0
            if (r16 == 0) goto Ld4
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L5:
            if (r15 == 0) goto Lcc
        L7:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r15.paymentMethodInfo
            if (r0 == 0) goto Lcc
            java.lang.String r3 = r0.getId()
        Lf:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r15.paymentMethodInfo
            if (r0 == 0) goto Ld1
            java.lang.String r4 = r0.getToken()
        L17:
            if (r1 == 0) goto L1f
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L4c
        L1f:
            r5 = r8
        L20:
            if (r15 == 0) goto L44
        L22:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r15.paymentMethodInfo
            if (r0 == 0) goto L44
            java.lang.Boolean r6 = r0.isChooseSave()
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r15.paymentMethodInfo
            if (r0 == 0) goto L48
            java.lang.String r7 = r0.getTenure()
        L32:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r15.paymentMethodInfo
            if (r0 == 0) goto L3a
            java.lang.String r8 = r0.getInstallmentPlanId()
        L3a:
            r9 = 0
            r10 = 64
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L44:
            r6 = r8
            if (r15 == 0) goto L48
            goto L2a
        L48:
            r7 = r8
            if (r15 == 0) goto L3a
            goto L32
        L4c:
            if (r15 == 0) goto Lc8
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r15.paymentMethodInfo
            if (r0 == 0) goto Lc8
            java.util.List r1 = r0.getPaymentElements()
            if (r1 == 0) goto Lc8
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r1
            java.lang.Boolean r0 = r1.getNeedEncryption()
            if (r0 == 0) goto L83
            java.lang.Boolean r0 = r1.getNeedEncryption()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb3
        L83:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r9 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            java.lang.String r10 = r1.getElement()
            java.lang.String r11 = r1.getParamName()
            X.16n r0 = X.C82950Wh0.LIZ()
            java.lang.String r1 = r1.getParamValue()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZ
            boolean r0 = r0.get()
            if (r0 == 0) goto Le1
            X.16o r0 = X.C276216o.LJIIL
            X.16m r0 = r0.LIZ
            java.lang.String r0 = r0.LJIIIIZZ
            X.0TI r0 = X.C0TJ.LIZ(r0, r1)
            java.lang.String r12 = r0.LIZIZ
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
        Laf:
            r5.add(r9)
            goto L67
        Lb3:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r9 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            java.lang.String r10 = r1.getElement()
            java.lang.String r11 = r1.getParamName()
            java.lang.String r12 = r1.getParamValue()
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto Laf
        Lc8:
            X.OQg r5 = X.C61878OQg.INSTANCE
            goto L20
        Lcc:
            r3 = r8
            if (r15 == 0) goto Ld1
            goto Lf
        Ld1:
            r4 = r8
            goto L17
        Ld4:
            if (r15 == 0) goto Lde
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r15.paymentMethod
            if (r0 == 0) goto Lde
            java.lang.Boolean r1 = r0.pciSensitive
            goto L7
        Lde:
            r1 = r8
            goto L5
        Le1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "please init first"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SA5.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo");
    }
}
