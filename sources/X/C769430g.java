package X;

/* renamed from: X.30g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C769430g {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(long r10, java.lang.String r12, java.lang.String r13, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.im.sdk.chat.data.model.CallbackLinkResponse> r14) {
        /*
            boolean r0 = r14 instanceof X.C769530h
            if (r0 == 0) goto L1f
            r9 = r14
            X.30h r9 = (X.C769530h) r9
            int r2 = r9.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r9.LJLILLLLZI = r2
        L12:
            java.lang.Object r4 = r9.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r9.LJLILLLLZI
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L25
            goto L48
        L1f:
            X.30h r9 = new X.30h
            r9.<init>(r14)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r4)
            r5 = r13
            if (r5 != 0) goto L34
            return r2
        L34:
            r9.LJLILLLLZI = r0     // Catch: java.lang.Exception -> L4f
            X.Ol8 r0 = X.C30U.LJ     // Catch: java.lang.Exception -> L4f
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r4 = (com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi) r4     // Catch: java.lang.Exception -> L4f
            r8 = r12
            r6 = r10
            java.lang.Object r4 = r4.performMsgTemplateCallback(r5, r6, r8, r9)     // Catch: java.lang.Exception -> L4f
            if (r4 != r3) goto L4b
            return r3
        L48:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L4f
        L4b:
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.CallbackLinkResponse r4 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.CallbackLinkResponse) r4     // Catch: java.lang.Exception -> L4f
            r2 = r4
            goto L55
        L4f:
            r1 = move-exception
            java.lang.String r0 = "TTBA_ActionLink_Callback"
            X.C34B.LJ(r0, r1)
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C769430g.LIZ(long, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
