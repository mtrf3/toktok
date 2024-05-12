package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveUserRiskVerify {

    @InterfaceC65349Pkn("email_verify_url")
    public String emailVerifyUrl;

    @InterfaceC65349Pkn("phone_verify_url")
    public String phoneVerifyUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveUserRiskVerify() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public LiveUserRiskVerify(String emailVerifyUrl, String phoneVerifyUrl) {
        o.LJIIIZ(emailVerifyUrl, "emailVerifyUrl");
        o.LJIIIZ(phoneVerifyUrl, "phoneVerifyUrl");
        this.emailVerifyUrl = emailVerifyUrl;
        this.phoneVerifyUrl = phoneVerifyUrl;
    }

    public /* synthetic */ LiveUserRiskVerify(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
