package com.ss.n_project.opensdk_tt.bean;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AuthResultBean {

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMsg;

    @InterfaceC65349Pkn("error_type")
    public final String errorType;

    @InterfaceC65349Pkn("is_new_user")
    public final int isNewUser;

    @InterfaceC65349Pkn("scope")
    public final String scope;

    @InterfaceC65349Pkn("success")
    public final boolean success;

    @InterfaceC65349Pkn("toast_msg")
    public final String toastMsg;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuthResultBean() {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r1
            r7 = r2
            r8 = r2
            r10 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.n_project.opensdk_tt.bean.AuthResultBean.<init>():void");
    }

    public AuthResultBean(boolean z, String str, int i, String str2, String str3, int i2, String str4, String str5) {
        this.success = z;
        this.uid = str;
        this.isNewUser = i;
        this.scope = str2;
        this.errorType = str3;
        this.errorCode = i2;
        this.errorMsg = str4;
        this.toastMsg = str5;
    }

    public /* synthetic */ AuthResultBean(boolean z, String str, int i, String str2, String str3, int i2, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : str4, (i3 & 128) == 0 ? str5 : null);
    }
}
