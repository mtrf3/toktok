package X;

/* renamed from: X.Rif, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70313Rif {
    public static final C70313Rif LIZ = new C70313Rif();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r6.get("enter_from_merge");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r0 = r6.get("previous_page");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo(new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDaInfo(r3, r4, r2, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0024, code lost:
    
        if (r6 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0013, code lost:
    
        if (r6 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo LIZ(java.util.HashMap r6) {
        /*
            java.lang.String r5 = ""
            if (r6 == 0) goto L12
            java.lang.String r0 = "enter_from_info"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L12
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L15
        L12:
            r4 = r5
            if (r6 == 0) goto L23
        L15:
            java.lang.String r0 = "enter_from"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L23
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L26
        L23:
            r3 = r5
            if (r6 == 0) goto L34
        L26:
            java.lang.String r0 = "enter_from_merge"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L34
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L37
        L34:
            r2 = r5
            if (r6 == 0) goto L45
        L37:
            java.lang.String r0 = "previous_page"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L50
        L45:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDaInfo r1 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDaInfo
            r1.<init>(r3, r4, r2, r5)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo r0 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo
            r0.<init>(r1)
            return r0
        L50:
            r5 = r0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70313Rif.LIZ(java.util.HashMap):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r15 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.content.Context r14, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r15, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r16, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r17, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r18, boolean r19, java.lang.String r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, kotlin.jvm.internal.AqS3S2300000_4 r25) {
        /*
            java.lang.String r0 = "nodeId"
            r13 = r20
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            r4 = 0
            r8 = r15
            if (r8 == 0) goto L5d
            java.lang.String r0 = r8.productId
            if (r0 == 0) goto L5d
            X.Ro2 r3 = X.C70077Rer.LIZ(r0)
        L13:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r0 = r8.flashSale
            if (r0 == 0) goto L61
            java.lang.String r2 = r0.activityId
        L19:
            r1 = 3
            if (r3 == 0) goto L55
            int r0 = r3.LJIIIIZZ
            if (r0 != r1) goto L55
        L20:
            r11 = r4
        L21:
            int r0 = X.C27823Avz.LIZ()
            r3 = 2
            if (r0 != r3) goto L52
        L28:
            r0 = r25
            if (r0 == 0) goto L30
            r0.invoke(r11)
        L2f:
            return
        L30:
            X.34l r2 = X.C780334l.LJLIL
            X.UtN r1 = X.C36636EZk.LIZ
            X.AwM r5 = new X.AwM
            r0 = r5
            r12 = r19
            r10 = r18
            r9 = r17
            r7 = r16
            r6 = r14
            r17 = r24
            r16 = r23
            r15 = r22
            r14 = r21
            r18 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.XKX.LIZLLL(r2, r1, r4, r0, r3)
            goto L2f
        L52:
            if (r0 != r1) goto L2f
            goto L28
        L55:
            if (r2 != 0) goto L58
            goto L20
        L58:
            java.util.List r11 = X.C47261Igj.LJJIJ(r2)
            goto L21
        L5d:
            r3 = r4
            if (r8 == 0) goto L61
            goto L13
        L61:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70313Rif.LIZJ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, kotlin.jvm.internal.AqS3S2300000_4):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC70422pa r65, android.content.Context r66, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r67, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r68, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r69, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r70, java.util.List<java.lang.String> r71, boolean r72, java.lang.String r73, java.lang.Integer r74, java.lang.String r75, java.lang.String r76, java.lang.Integer r77, X.InterfaceC67352kd<? super X.C76800UCe> r78) {
        /*
            Method dump skipped, instructions count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70313Rif.LIZIZ(X.2pa, android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, java.util.List, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, X.2kd):java.lang.Object");
    }
}
