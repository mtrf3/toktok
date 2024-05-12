package com.ss.android.ugc.aweme.setting.api;

import X.C43588H8u;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class EmailRequestBody {

    @InterfaceC65349Pkn("aid")
    public final int aid;

    @InterfaceC65349Pkn("email")
    public final String email;

    @InterfaceC65349Pkn("country")
    public final String region;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @InterfaceC65349Pkn("version")
    public final String versionName;

    public EmailRequestBody(String str, int i, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "email", str2, "uid", str3, "region", str4, "versionName");
        this.email = str;
        this.aid = i;
        this.uid = str2;
        this.region = str3;
        this.versionName = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EmailRequestBody(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L6
            int r3 = X.EF7.LJIIIZ
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r4 = r0.getCurUserId()
            java.lang.String r0 = "userService().curUserId"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
        L19:
            r0 = r7 & 8
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.IAccountService r0 = com.ss.android.ugc.aweme.AccountService.LJIJ()
            java.lang.String r5 = r0.LJIILL()
            java.lang.String r0 = "get()\n        .getServic…ava).storeRegionUpperCase"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
        L2a:
            r0 = r7 & 16
            if (r0 == 0) goto L32
            java.lang.String r6 = X.EF7.LJII()
        L32:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.api.EmailRequestBody.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
