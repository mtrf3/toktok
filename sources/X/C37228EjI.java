package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi;

/* renamed from: X.EjI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37228EjI {
    public static final /* synthetic */ C37228EjI LIZ = new C37228EjI();
    public static final FavoriteApi LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ("https://oec-api.tiktokv.com/");
        LIZ2.LIZIZ(new GecNetInterceptor());
        LIZIZ = (FavoriteApi) LIZ2.LJFF().LIZ.LIZ(FavoriteApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo r7, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<java.lang.Object>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C37230EjK
            if (r0 == 0) goto L1e
            r5 = r8
            X.EjK r5 = (X.C37230EjK) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L24
        L1e:
            X.EjK r5 = new X.EjK
            r5.<init>(r6, r8)
            goto L12
        L24:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L48
            goto L47
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi r2 = X.C37228EjI.LIZIZ     // Catch: java.lang.Throwable -> L48
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest     // Catch: java.lang.Throwable -> L48
            java.util.List r0 = X.C47261Igj.LJJIJ(r7)     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r5.LJLJI = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r2.unFavoriteProduct(r1, r5)     // Catch: java.lang.Throwable -> L48
            if (r1 != r4) goto L47
            return r4
        L47:
            return r1
        L48:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37228EjI.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo r8, java.lang.String r9, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<java.lang.Object>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C37229EjJ
            if (r0 == 0) goto L1e
            r6 = r10
            X.EjJ r6 = (X.C37229EjJ) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            goto L24
        L1e:
            X.EjJ r6 = new X.EjJ
            r6.<init>(r7, r10)
            goto L12
        L24:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L56
            goto L55
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r9 != 0) goto L3c
            java.lang.String r9 = "0"
        L3c:
            java.lang.String r0 = "biz_type"
            r3.put(r0, r9)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi r2 = X.C37228EjI.LIZIZ     // Catch: java.lang.Throwable -> L56
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest     // Catch: java.lang.Throwable -> L56
            java.util.List r0 = X.C47261Igj.LJJIJ(r8)     // Catch: java.lang.Throwable -> L56
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L56
            r6.LJLJI = r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r1 = r2.favoriteProduct(r1, r3, r6)     // Catch: java.lang.Throwable -> L56
            if (r1 != r5) goto L55
            return r5
        L55:
            return r1
        L56:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37228EjI.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo, java.lang.String, X.2kd):java.lang.Object");
    }
}
