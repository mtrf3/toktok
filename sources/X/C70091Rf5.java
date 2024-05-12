package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Rf5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70091Rf5 {
    public static final /* synthetic */ C70091Rf5 LIZ = new C70091Rf5();
    public static final InterfaceC789838c LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ("https://oec-api.tiktokv.com/");
        LIZ2.LIZIZ(new GecNetInterceptor());
        LIZIZ = LIZ2.LJFF();
    }

    public static HashMap LJI(String str) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("biz_type", str);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseRequest r6, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C70093Rf7
            if (r0 == 0) goto L1e
            r4 = r7
            X.Rf7 r4 = (X.C70093Rf7) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L24
        L1e:
            X.Rf7 r4 = new X.Rf7
            r4.<init>(r5, r7)
            goto L12
        L24:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L47
            goto L46
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.38c r1 = X.C70091Rf5.LIZIZ     // Catch: java.lang.Exception -> L47
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L47
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L47
            r4.LJLJI = r2     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r0.addToShowCase(r6, r4)     // Catch: java.lang.Exception -> L47
            if (r1 != r3) goto L46
            return r3
        L46:
            return r1
        L47:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70091Rf5.LIZ(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseRequest, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C70094Rf8
            if (r0 == 0) goto L1e
            r4 = r9
            X.Rf8 r4 = (X.C70094Rf8) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L24
            goto L42
        L1e:
            X.Rf8 r4 = new X.Rf8
            r4.<init>(r7, r9)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            X.38c r1 = X.C70091Rf5.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L48
            r4.LJLJI = r2     // Catch: java.lang.Exception -> L48
            java.lang.Object r1 = r0.getBundleDeal(r8, r4)     // Catch: java.lang.Exception -> L48
            if (r1 != r3) goto L45
            return r3
        L42:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse) r1     // Catch: java.lang.Exception -> L48
            goto L5b
        L48:
            r0 = move-exception
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse
            r2 = 0
            r5 = 5
            r4 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70091Rf5.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecallBoxRequest r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C70095Rf9
            if (r0 == 0) goto L1f
            r6 = r9
            X.Rf9 r6 = (X.C70095Rf9) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r5 = r6.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L25
            goto L43
        L1f:
            X.Rf9 r6 = new X.Rf9
            r6.<init>(r7, r9)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r5)
            X.38c r1 = X.C70091Rf5.LIZIZ     // Catch: java.lang.Exception -> L7b
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L7b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L7b
            r6.LJLJI = r3     // Catch: java.lang.Exception -> L7b
            java.lang.Object r5 = r0.getDelayRequest(r8, r6)     // Catch: java.lang.Exception -> L7b
            if (r5 != r4) goto L46
            return r4
        L43:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> L7b
        L46:
            X.RYH r5 = (X.RYH) r5     // Catch: java.lang.Exception -> L7b
            if (r5 == 0) goto L7b
            T r0 = r5.data     // Catch: java.lang.Exception -> L7b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData) r0     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L7b
            T r1 = r5.data     // Catch: java.lang.Exception -> L7b
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData) r1     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L79
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct> r0 = r1.productionInfoPack     // Catch: java.lang.Exception -> L7b
        L5c:
            boolean r0 = X.C1GE.LJIILIIL(r0)     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L7b
            T r1 = r5.data     // Catch: java.lang.Exception -> L7b
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData) r1     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct> r1 = r1.productionInfoPack     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L7b
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)     // Catch: java.lang.Exception -> L7b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct) r0     // Catch: java.lang.Exception -> L7b
            r2 = r0
            goto L7b
        L79:
            r0 = r2
            goto L5c
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70091Rf5.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecallBoxRequest, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoRequest r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C70096RfA
            if (r0 == 0) goto L1e
            r4 = r9
            X.RfA r4 = (X.C70096RfA) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L24
            goto L42
        L1e:
            X.RfA r4 = new X.RfA
            r4.<init>(r7, r9)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            X.38c r1 = X.C70091Rf5.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L48
            r4.LJLJI = r2     // Catch: java.lang.Exception -> L48
            java.lang.Object r1 = r0.getSkuInfo(r8, r4)     // Catch: java.lang.Exception -> L48
            if (r1 != r3) goto L45
            return r3
        L42:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoResponse r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoResponse) r1     // Catch: java.lang.Exception -> L48
            goto L5b
        L48:
            r0 = move-exception
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoResponse r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoResponse
            r2 = 0
            r5 = 5
            r4 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70091Rf5.LJFF(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoRequest, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.util.List<java.lang.Integer> r25, java.util.Map<java.lang.String, ? extends java.lang.Object> r26, java.lang.String r27, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse> r28) {
        /*
            r19 = this;
            r3 = r28
            boolean r0 = r3 instanceof X.C70092Rf6
            if (r0 == 0) goto L20
            r4 = r3
            X.Rf6 r4 = (X.C70092Rf6) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJI = r2
        L14:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L77
        L20:
            X.Rf6 r4 = new X.Rf6
            r0 = r19
            r4.<init>(r0, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            r6 = r20
            int r0 = r6.length()
            if (r0 != 0) goto L47
            java.lang.String r2 = "product_id is empty."
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse r0 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse
            r1 = 0
            r4 = 5
            r3 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L47:
            X.38c r1 = X.C70091Rf5.LIZIZ     // Catch: java.lang.Exception -> L7d
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r1     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadRequest r5 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadRequest     // Catch: java.lang.Exception -> L7d
            r7 = 0
            r8 = 0
            r17 = 142(0x8e, float:1.99E-43)
            r14 = r24
            r12 = r23
            r11 = r22
            r16 = r26
            r10 = r21
            r15 = r25
            r9 = r8
            r13 = r7
            r18 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L7d
            java.util.HashMap r0 = LJI(r27)     // Catch: java.lang.Exception -> L7d
            r4.LJLJI = r2     // Catch: java.lang.Exception -> L7d
            java.lang.Object r1 = r1.getProductRecommend(r5, r0, r4)     // Catch: java.lang.Exception -> L7d
            if (r1 != r3) goto L7a
            return r3
        L77:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L7d
        L7a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse) r1     // Catch: java.lang.Exception -> L7d
            goto L90
        L7d:
            r0 = move-exception
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse
            r2 = 0
            r5 = 5
            r4 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70091Rf5.LIZLLL(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.util.Map, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, java.util.List<java.lang.Integer> r27, java.lang.String r28, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse> r29) {
        /*
            r19 = this;
            r3 = r29
            boolean r0 = r3 instanceof X.C70097RfB
            if (r0 == 0) goto L20
            r4 = r3
            X.RfB r4 = (X.C70097RfB) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJI = r2
        L14:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L7e
        L20:
            X.RfB r4 = new X.RfB
            r0 = r19
            r4.<init>(r0, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            r6 = r20
            int r0 = r6.length()
            if (r0 != 0) goto L47
            java.lang.String r2 = "product_id is empty."
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse r0 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse
            r1 = 0
            r4 = 5
            r3 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L47:
            X.38c r1 = X.C70091Rf5.LIZIZ     // Catch: java.lang.Exception -> L84
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L84
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r1     // Catch: java.lang.Exception -> L84
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadRequest r5 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadRequest     // Catch: java.lang.Exception -> L84
            r8 = 6
            r9 = 0
            java.lang.Integer r14 = new java.lang.Integer     // Catch: java.lang.Exception -> L84
            r0 = r26
            r14.<init>(r0)     // Catch: java.lang.Exception -> L84
            r16 = 0
            r17 = 1032(0x408, float:1.446E-42)
            r7 = r24
            r12 = r23
            r11 = r22
            r10 = r21
            r15 = r27
            r13 = r25
            r18 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L84
            java.util.HashMap r0 = LJI(r28)     // Catch: java.lang.Exception -> L84
            r4.LJLJI = r2     // Catch: java.lang.Exception -> L84
            java.lang.Object r1 = r1.getShopRecommend(r5, r0, r4)     // Catch: java.lang.Exception -> L84
            if (r1 != r3) goto L81
            return r3
        L7e:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L84
        L81:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse) r1     // Catch: java.lang.Exception -> L84
            goto L97
        L84:
            r0 = move-exception
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse
            r2 = 0
            r5 = 5
            r4 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70091Rf5.LJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, X.2kd):java.lang.Object");
    }
}
