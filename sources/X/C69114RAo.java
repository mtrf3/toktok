package X;

/* renamed from: X.RAo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C69114RAo {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC69113RAn.values().length];
        try {
            iArr[EnumC69113RAn.RESET_PASSWORD_FOR_EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC69113RAn.RESET_PASSWORD_FOR_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_PASSWORD_FOR_EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_SMS_FIND_PASSWORD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_FIND_PASSWORD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_SIGN_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_LOGIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_SMS_SIGN_UP.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_BIND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_VERIFY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_MODIFY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_SMS_VERIFY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_PHONE_FIND_PASSWORD.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_PHONE_BIND.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_PHONE_MODIFY.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_EMAIL_FIND_PASSWORD.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_PASSWORD_LOGIN.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_EMAIL_LOGIN.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_EMAIL_SIGN_UP.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[EnumC69113RAn.COMBINED_LOGIN_SIGN_UP.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_NICKNAME.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_PASSWORD_LOGIN.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_EMAIL_LOGIN.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_PHONE_LOGIN.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_PHONE_SIGN_UP.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_EMAIL_SIGN_UP.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[EnumC69113RAn.RECOVER_EMAIL_LOGIN.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[EnumC69113RAn.RECOVER_PHONE_LOGIN.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[EnumC69113RAn.RECOVER_PHONE_SEND_CODE.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[EnumC69113RAn.CHANGE_PASSWORD.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[EnumC69113RAn.VERIFY_PASSWORD.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[EnumC69113RAn.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_PASSWORD.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_PHONE_VERIFY_USING_PASSWORD.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_EMAIL_BIND.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_SMS_BIND.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_SMS_CHANGE.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[EnumC69113RAn.VERIFY_EMAIL_BEFORE_CHANGE.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[EnumC69113RAn.INPUT_EMAIL_CHANGE.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[EnumC69113RAn.CONFIRM_EMAIL_BEFORE_VERIFY.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[EnumC69113RAn.VERIFY_PHONE.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[EnumC69113RAn.EMAIL_SMS_CHANGE_PASSWORD.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[EnumC69113RAn.ONE_KEY_LOGIN.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[EnumC69113RAn.TERMS_CONSENT_SIGN_UP.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER_PHONE_RECYCLE_PROCESS_LOGIN.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[EnumC69113RAn.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[EnumC69113RAn.FTC_CREATE_ACCOUNT.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[EnumC69113RAn.FTC_CREATE_PASSWORD.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[EnumC69113RAn.CHANGE_PASSWORD_FOR_CHILDREN.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[EnumC69113RAn.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[EnumC69113RAn.VERIFY_EMAIL_FOR_TICKET.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[EnumC69113RAn.VERIFY_PHONE_FOR_TICKET.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[EnumC69113RAn.PRIVATE_ACCOUNT_TIPS.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[EnumC69113RAn.PHONE_RECYCLE_PROCESS.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_PHONE_CONFIRM.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_EMAIL_CONFIRM.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_PHONE_VERIFY.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_EMAIL.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_PHONE.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[EnumC69113RAn.UNBIND_PHONE_VERIFY_USING_EMAIL.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[EnumC69113RAn.RU_INSTANT_LOGIN_SI.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[EnumC69113RAn.RU_INSTANT_LOGIN_ERROR_NEW_USER.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[EnumC69113RAn.BIND_EMAIL_WITHOUT_VERIFY_ON_SIGN_UP_OR_LOGIN.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[EnumC69113RAn.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[EnumC69113RAn.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_CODE.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[EnumC69113RAn.TOTP_BIND.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[EnumC69113RAn.VERIFY_TOTP.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_AVATAR.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_AVATAR_AND_NICKNAME.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[EnumC69113RAn.PRIVATE_ACCOUNT_PROMPT.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[EnumC69113RAn.PRIVACY_HIGHLIGHT_FOR_TEENS.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[EnumC69113RAn.ADD_AUTH_DEVICE.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[EnumC69113RAn.TRUSTED_DEVICE.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[EnumC69113RAn.RECENT_DEVICE.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[EnumC69113RAn.PASSKEY.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        LIZ = iArr;
    }
}
