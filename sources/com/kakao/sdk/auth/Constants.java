package com.kakao.sdk.auth;

/* loaded from: classes12.dex */
public final class Constants {
    public static final Constants INSTANCE = new Constants();
    public static final String EXTRA_APPLICATION_KEY = "com.kakao.sdk.talk.appKey";
    public static final String EXTRA_REDIRECT_URI = "com.kakao.sdk.talk.redirectUri";
    public static final String EXTRA_KA_HEADER = "com.kakao.sdk.talk.kaHeader";
    public static final String EXTRA_EXTRAPARAMS = "com.kakao.sdk.talk.extraparams";
    public static final String EXTRA_REDIRECT_URL = "com.kakao.sdk.talk.redirectUrl";
    public static final String EXTRA_ERROR_DESCRIPTION = "com.kakao.sdk.talk.error.description";
    public static final String EXTRA_ERROR_TYPE = "com.kakao.sdk.talk.error.type";
    public static final String NOT_SUPPORT_ERROR = "NotSupportError";
    public static final String UNKNOWN_ERROR = "unknown";

    public final String getEXTRA_APPLICATION_KEY() {
        return EXTRA_APPLICATION_KEY;
    }

    public final String getEXTRA_ERROR_DESCRIPTION() {
        return EXTRA_ERROR_DESCRIPTION;
    }

    public final String getEXTRA_ERROR_TYPE() {
        return EXTRA_ERROR_TYPE;
    }

    public final String getEXTRA_EXTRAPARAMS() {
        return EXTRA_EXTRAPARAMS;
    }

    public final String getEXTRA_KA_HEADER() {
        return EXTRA_KA_HEADER;
    }

    public final String getEXTRA_REDIRECT_URI() {
        return EXTRA_REDIRECT_URI;
    }

    public final String getEXTRA_REDIRECT_URL() {
        return EXTRA_REDIRECT_URL;
    }

    public final String getNOT_SUPPORT_ERROR() {
        return NOT_SUPPORT_ERROR;
    }

    public final String getUNKNOWN_ERROR() {
        return UNKNOWN_ERROR;
    }
}
