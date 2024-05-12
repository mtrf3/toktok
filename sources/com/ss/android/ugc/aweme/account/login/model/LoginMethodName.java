package com.ss.android.ugc.aweme.account.login.model;

import X.V0N;

/* loaded from: classes12.dex */
public enum LoginMethodName {
    DEFAULT,
    EMAIL_PASS,
    USER_NAME_PASS,
    PHONE_NUMBER_PASS,
    PHONE_SMS,
    THIRD_PARTY;

    public static LoginMethodName valueOf(String str) {
        return (LoginMethodName) V0N.LJJJ(LoginMethodName.class, str);
    }
}
