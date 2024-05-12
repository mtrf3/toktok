package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api.TranslationApi;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: X.2wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74842wi {
    public static final /* synthetic */ C74842wi LIZ = new C74842wi();
    public static final IRetrofitFactory LIZIZ;
    public static final TranslationApi LIZJ;
    public static final TranslationApi LIZLLL;
    public static final String LJ;

    static {
        IRetrofitFactory LIZLLL2 = RetrofitFactory.LIZLLL();
        LIZIZ = LIZLLL2;
        String str = EFJ.LIZJ;
        LIZJ = (TranslationApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL2, str, TranslationApi.class);
        LIZLLL = (TranslationApi) LIZLLL2.create("https://api16-normal-alisg.helo-api.com").create(TranslationApi.class);
        LJ = SettingServiceImpl.LIZ().getAppLanguage();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, X.InterfaceC67352kd<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C74852wj
            if (r0 == 0) goto L20
            r7 = r11
            X.2wj r7 = (X.C74852wj) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r6 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L5a
        L20:
            X.2wj r7 = new X.2wj
            r7.<init>(r9, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r1)
            if (r10 == 0) goto L39
            boolean r0 = ujb.o.LJJJJJL(r10)
            if (r0 == 0) goto L3d
        L39:
            r0 = 1
        L3a:
            if (r0 == 0) goto L3f
            return r4
        L3d:
            r0 = 0
            goto L3a
        L3f:
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationContent r0 = new com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationContent     // Catch: java.lang.Exception -> L78
            r0.<init>(r10)     // Catch: java.lang.Exception -> L78
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)     // Catch: java.lang.Exception -> L78
            java.lang.String r3 = X.C27739Aud.LJI(r0)     // Catch: java.lang.Exception -> L78
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api.TranslationApi r2 = X.C74842wi.LIZJ     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = X.C74842wi.LJ     // Catch: java.lang.Exception -> L78
            r7.LJLJI = r5     // Catch: java.lang.Exception -> L78
            r0 = 2
            java.lang.Object r1 = r2.getTranslation(r1, r3, r0, r7)     // Catch: java.lang.Exception -> L78
            if (r1 != r8) goto L5d
            return r8
        L5a:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L78
        L5d:
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationResponse r1 = (com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationResponse) r1     // Catch: java.lang.Exception -> L78
            java.lang.Integer r0 = r1.statusCode     // Catch: java.lang.Exception -> L78
            if (r0 != 0) goto L64
            goto L78
        L64:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L78
            if (r0 != 0) goto L78
            java.util.List<com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslatedContent> r0 = r1.translatedContentList     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L78
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r6, r0)     // Catch: java.lang.Exception -> L78
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslatedContent r0 = (com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslatedContent) r0     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L78
            java.lang.String r4 = r0.translatedContent     // Catch: java.lang.Exception -> L78
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74842wi.LIZ(java.lang.String, X.2kd):java.lang.Object");
    }
}
