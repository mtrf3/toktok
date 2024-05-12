package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi;

/* renamed from: X.2wE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74542wE {
    public static final /* synthetic */ C74542wE LIZ = new C74542wE();
    public static final ECActionApi LIZIZ = (ECActionApi) RetrofitFactory.LIZLLL().create(C71058Rug.LIZ()).create(ECActionApi.class);

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:13)(2:10|11))(3:22|23|(1:25))|14|(1:18)|20|21))|27|6|7|(0)(0)|14|(2:16|18)|20|21) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C74532wD
            if (r0 == 0) goto L1f
            r5 = r7
            X.2wD r5 = (X.C74532wD) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L25
            goto L3b
        L1f:
            X.2wD r5 = new X.2wD
            r5.<init>(r6, r7)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r4)
            com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi r0 = X.C74542wE.LIZIZ     // Catch: java.lang.Exception -> L52
            r5.LJLJI = r2     // Catch: java.lang.Exception -> L52
            java.lang.Object r4 = r0.getInboxEntrance(r5)     // Catch: java.lang.Exception -> L52
            if (r4 != r3) goto L3e
            return r3
        L3b:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L52
        L3e:
            X.Pbt r4 = (X.C64797Pbt) r4     // Catch: java.lang.Exception -> L52
            T r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L52
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Exception -> L52
            T r0 = r0.data     // Catch: java.lang.Exception -> L52
            com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi$InboxEntranceResponse r0 = (com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi.InboxEntranceResponse) r0     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            java.lang.Integer r0 = r0.cartItemCount     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L52
        L52:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74542wE.LIZ(X.2kd):java.lang.Object");
    }
}
