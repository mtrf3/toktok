package X;

/* renamed from: X.Uz3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC78973Uz3 {
    DYABindPhoneNumberSourceTypeUnknown(0),
    DYABindPhoneNumberSourceTypeAccountManagementPhoneNumber(1),
    DYABindPhoneNumberSourceTypeAccountManagementPassword(2),
    DYABindPhoneNumberSourceTypeTwoStepVerification(3),
    DYABindPhoneNumberSourceTypeTypeSecurityAlertToast(4),
    DYABindPhoneNumberSourceTypeLogoutAlert(5),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_SIGN_UP(6),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_LOGIN(7),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_FYP_POP_UP(8),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_INBOX_POP_UP(9),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_PROFILE_POP_UP(10),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_PROFILE_FLOATING_NOTICE(11),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_PROFILE_MISSION_CARD(12),
    DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_SUGGEST_CONTACTS(13),
    DYA_BIND_PHONE_CONDITIONAL_BIND_PHONE(15);

    public final int LJLIL;

    public static EnumC78973Uz3 valueOf(String str) {
        return (EnumC78973Uz3) V0N.LJJJ(EnumC78973Uz3.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC78973Uz3(int i) {
        this.LJLIL = i;
    }
}
