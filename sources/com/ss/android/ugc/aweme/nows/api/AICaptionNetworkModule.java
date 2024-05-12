package com.ss.android.ugc.aweme.nows.api;

import X.C221108m2;
import X.C36688Eaa;
import X.C36690Eac;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes7.dex */
public final class AICaptionNetworkModule {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C36690Eac.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C36688Eaa.LJLIL);

    /* loaded from: classes3.dex */
    public static final class AICaptionResponse {

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("generated_text_list")
        public final List<String> textList;

        public AICaptionResponse(int i, List<String> list) {
            this.statusCode = i;
            this.textList = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.AICaptionResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C36687EaZ
            if (r0 == 0) goto L1f
            r7 = r10
            X.EaZ r7 = (X.C36687EaZ) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            goto L25
        L1f:
            X.EaZ r7 = new X.EaZ
            r7.<init>(r8, r10)
            goto L12
        L25:
            X.C141335gf.LIZJ(r1)     // Catch: java.io.IOException -> L52
            goto L50
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C141335gf.LIZJ(r1)
            com.bytedance.retrofit2.mime.TypedFile r3 = new com.bytedance.retrofit2.mime.TypedFile
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            java.lang.String r0 = "image/*"
            r3.<init>(r0, r1)
            X.EaY r2 = new X.EaY     // Catch: java.io.IOException -> L52
            r2.<init>(r3, r5)     // Catch: java.io.IOException -> L52
            r7.LJLJI = r4     // Catch: java.io.IOException -> L52
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = X.C74209TAn.LIZJ(r0, r2, r7)     // Catch: java.io.IOException -> L52
            if (r1 != r6) goto L50
            return r6
        L50:
            r5 = r1
            goto L57
        L52:
            java.lang.String r0 = "AICaption: submitImage IOException"
            X.H78.LJII(r0)
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.LIZ(java.lang.String, X.2kd):java.lang.Object");
    }
}
