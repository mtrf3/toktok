package X;

/* renamed from: X.RXk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69708RXk extends AbstractC69707RXj {
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
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
            java.util.ArrayList r3 = X.C72545SdZ.LJ(r10, r0)
            boolean r0 = r11.LIZLLL
            if (r0 != 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r6 = r11.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r10.LJLL
            r5 = 0
            if (r0 == 0) goto L77
            java.lang.String r1 = r0.getSkuId()
        L17:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotion r0 = r6.sellerPromotion
            if (r0 == 0) goto L75
            java.util.List<java.lang.String> r0 = r0.defaultSellerPromotionIds
        L22:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r1 == 0) goto L39
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = X.C70053ReT.LIZLLL(r6, r1)
            if (r0 == 0) goto L33
            java.util.List<java.lang.String> r0 = r0.sellerPromotionIds
            if (r0 != 0) goto L39
        L33:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotion r0 = r6.sellerPromotion
            if (r0 == 0) goto L79
            java.util.List<java.lang.String> r0 = r0.defaultSellerPromotionIds
        L39:
            if (r0 == 0) goto L79
            java.util.Iterator r8 = r0.iterator()
        L3f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r7 = r8.next()
            java.lang.String r0 = "id"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotion r0 = r6.sellerPromotion
            if (r0 == 0) goto L3f
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem> r0 = r0.itemList
            if (r0 == 0) goto L3f
            java.util.Iterator r2 = r0.iterator()
        L5a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem) r0
            java.lang.String r0 = r0.id
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L3f
            r4.add(r1)
            goto L3f
        L75:
            r0 = r5
            goto L22
        L77:
            r1 = r5
            goto L17
        L79:
            boolean r0 = X.C1GE.LJIILIIL(r4)
            if (r0 == 0) goto L94
            X.Add r2 = new X.Add
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotion r1 = r6.sellerPromotion
            if (r1 == 0) goto L95
            java.lang.String r0 = r1.title
            java.lang.String r5 = r1.schema
        L89:
            r2.<init>(r0, r5, r4)
            X.Ag8 r0 = X.C69717RXt.LIZ
            r3.add(r0)
            r3.add(r2)
        L94:
            return r3
        L95:
            r0 = r5
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69708RXk.LIZ(java.lang.Object, X.RY7):java.util.List");
    }
}
