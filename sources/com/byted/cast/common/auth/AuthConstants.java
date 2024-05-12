package com.byted.cast.common.auth;

import X.V0N;

/* loaded from: classes29.dex */
public class AuthConstants {

    /* loaded from: classes29.dex */
    public enum LicenseParam {
        ID,
        BUSINESS_ID,
        APP_ID,
        PROJECT_ID,
        CHANNEL_ID;

        public static LicenseParam valueOf(String str) {
            return (LicenseParam) V0N.LJJJ(LicenseParam.class, str);
        }
    }
}
