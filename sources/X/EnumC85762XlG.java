package X;

/* renamed from: X.XlG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85762XlG {
    PASSKEY_LOGIN_CANCELLATION_EXCEPTION(-2000),
    PASSKEY_LOGIN_CUSTOM_EXCEPTION(-2001),
    PASSKEY_LOGIN_INTERRUPTED_EXCEPTION(-2002),
    PASSKEY_LOGIN_PROVIDER_CONFIGURATION_EXCEPTION(-2003),
    PASSKEY_LOGIN_UNKNOWN_EXCEPTION(-2004),
    PASSKEY_LOGIN_UNSUPPORTED_EXCEPTION(-2005),
    PASSKEY_LOGIN_PUBLIC_KEY_EXCEPTION(-2006),
    PASSKEY_LOGIN_NO_CREDENTIAL_EXCEPTION(-2007),
    PASSKEY_LOGIN_DEFAULT_EXCEPTION(-2008),
    PASSKEY_LOGIN_UNEXPECTED_CREDENTIAL_TYPE(-2009),
    PASSKEY_LOGIN_NONCE_VERIFICATION_FAIL(-2010),
    PASSKEY_LOGIN_MISSING_RESPONSE_JSON(-2011),
    PASSKEY_LOGIN_TOKEN_PARSING_EXCEPTION(-2012),
    PASSKEY_LOGIN_JSON_EXCEPTION(-2013),
    PASSKEY_LOGIN_ILLEGAL_ARGUMENT(-2014),
    PASSKEY_LOGIN_NULL_POINTER(-2015);

    public final int LJLIL;

    public static EnumC85762XlG valueOf(String str) {
        return (EnumC85762XlG) V0N.LJJJ(EnumC85762XlG.class, str);
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    EnumC85762XlG(int i) {
        this.LJLIL = i;
    }
}