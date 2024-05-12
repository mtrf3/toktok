package X;

/* renamed from: X.Rae, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69816Rae extends AbstractC69707RXj {
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    @Override // X.AbstractC69707RXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LIZ(java.lang.Object r10, X.RY7 r11) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r10 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel) r10
            java.lang.String r0 = "vm"
            java.util.ArrayList r2 = X.C72545SdZ.LJ(r10, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r4 = r10.LJLJLLL
            r8 = 0
            if (r4 == 0) goto Lcf
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 12
            X.RUs r5 = X.C1A7.LJJIJLIJ(r4, r3, r1, r8, r0)
        L17:
            android.content.Context r3 = X.EF7.LIZIZ()
            boolean r0 = r11.LIZLLL
            if (r0 != 0) goto L7b
            r6 = 1
            if (r5 == 0) goto Lc0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> r0 = r5.LJ
            if (r0 == 0) goto Lc0
            boolean r0 = X.C1GE.LJIILIIL(r0)
            if (r0 != r6) goto Lc0
        L2c:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> r0 = r5.LJ
            if (r0 == 0) goto Lcc
            boolean r0 = X.C1GE.LJIILIIL(r0)
            if (r0 != r6) goto Lcc
            r4 = 1
        L37:
            X.Ag8 r0 = X.C69717RXt.LIZ
            r2.add(r0)
            if (r5 == 0) goto L42
            java.lang.String r1 = r5.LIZIZ
            if (r1 != 0) goto L4e
        L42:
            r0 = 2131847170(0x7f116802, float:1.932781E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r0 = "context.getString(R.stri…_us_coupon_and_promotion)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L4e:
            X.Ast r3 = new X.Ast
            r7 = 2
            r3.<init>(r1, r8, r7)
            if (r4 == 0) goto L5f
            kotlin.jvm.internal.AqS143S0200000_12 r1 = new kotlin.jvm.internal.AqS143S0200000_12
            r0 = 158(0x9e, float:2.21E-43)
            r1.<init>(r10, r5, r0)
            r3.LJLJI = r1
        L5f:
            r2.add(r3)
            if (r5 == 0) goto L71
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> r0 = r5.LJ
            if (r0 == 0) goto L71
            boolean r0 = X.C1GE.LJIILIIL(r0)
            if (r0 != r6) goto L71
            r2.add(r5)
        L71:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r11.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance r5 = r0.promotionEntrance
            if (r5 == 0) goto L7b
            java.lang.Integer r3 = r5.entranceStyle
            if (r3 != 0) goto L7c
        L7b:
            return r2
        L7c:
            int r1 = r3.intValue()
            r0 = 4
            if (r1 != r0) goto L8c
        L83:
            X.Ar1 r0 = new X.Ar1
            r0.<init>(r5, r4)
            r2.add(r0)
            goto L7b
        L8c:
            int r1 = r3.intValue()
            r0 = 5
            if (r1 != r0) goto L94
            goto L83
        L94:
            int r0 = r3.intValue()
            if (r0 != r6) goto La2
        L9a:
            X.Aqz r0 = X.C62819Ol5.LJJIJ(r5, r4)
            r2.add(r0)
            goto L7b
        La2:
            int r0 = r3.intValue()
            if (r0 != r7) goto La9
            goto L9a
        La9:
            int r1 = r3.intValue()
            r0 = 3
            if (r1 != r0) goto Lb1
            goto L9a
        Lb1:
            int r1 = r3.intValue()
            r0 = 6
            if (r1 != r0) goto L7b
            X.Apw r0 = X.C62814Ol0.LJJIJIL(r5, r4)
            r2.add(r0)
            goto L7b
        Lc0:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r10.LJLJLLL
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance r0 = r0.promotionEntrance
            if (r0 == 0) goto L7b
            if (r5 == 0) goto Lcc
            goto L2c
        Lcc:
            r4 = 0
            goto L37
        Lcf:
            r5 = r8
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69816Rae.LIZ(java.lang.Object, X.RY7):java.util.List");
    }
}
