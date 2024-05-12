package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.AyH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27965AyH {
    public static final /* synthetic */ C27965AyH LIZ = new C27965AyH();
    public static final InterfaceC789838c LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ("https://oec-api.tiktokv.com/");
        LIZ2.LIZIZ(new GecNetInterceptor());
        LIZIZ = LIZ2.LJFF();
    }

    public static HashMap LIZIZ(String str) {
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
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest r7, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C27992Ayi
            if (r0 == 0) goto L1e
            r4 = r8
            X.Ayi r4 = (X.C27992Ayi) r4
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
            X.Ayi r4 = new X.Ayi
            r4.<init>(r6, r8)
            goto L12
        L24:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L4d
            goto L4c
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.38c r1 = X.C27965AyH.LIZIZ     // Catch: java.lang.Exception -> L4d
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L4d
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi) r1     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = r7.LIZ     // Catch: java.lang.Exception -> L4d
            java.util.HashMap r0 = LIZIZ(r0)     // Catch: java.lang.Exception -> L4d
            r4.LJLJI = r2     // Catch: java.lang.Exception -> L4d
            java.lang.Object r1 = r1.cancelOrder(r7, r0, r4)     // Catch: java.lang.Exception -> L4d
            if (r1 != r3) goto L4c
            return r3
        L4c:
            return r1
        L4d:
            r0 = move-exception
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse r0 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse
            r1 = 0
            r4 = 5
            r3 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27965AyH.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest, X.2kd):java.lang.Object");
    }
}
