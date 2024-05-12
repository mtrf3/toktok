package com.ss.android.ugc.aweme.setting.api;

import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class InboxMsgRequestBody {

    @InterfaceC65349Pkn("msg_type")
    public final int msgType;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @InterfaceC65349Pkn("build_number")
    public final String versionCode;

    @InterfaceC65349Pkn("version_code")
    public final String versionName;

    public InboxMsgRequestBody(int i, String str, String str2, String str3) {
        HH1.LIZ(str, "uid", str2, "versionName", str3, "versionCode");
        this.msgType = i;
        this.uid = str;
        this.versionName = str2;
        this.versionCode = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InboxMsgRequestBody(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r2 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L13
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r4 = r0.getCurUserId()
            java.lang.String r0 = "userService().curUserId"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
        L13:
            r0 = r7 & 4
            if (r0 == 0) goto L1b
            java.lang.String r5 = X.EF7.LJII()
        L1b:
            r0 = r7 & 8
            if (r0 == 0) goto L27
            long r0 = X.EF7.LJI()
            java.lang.String r6 = java.lang.String.valueOf(r0)
        L27:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
