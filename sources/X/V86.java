package X;

/* loaded from: classes14.dex */
public enum V86 {
    DYABindEmailSourceTypeUnknown(0),
    DYABindEmailSourceTypeAccountManagementEmail(1),
    DYABindEmailSourceTypeAccountManagementPassword(2),
    DYABindEmailSourceTypeTwoStepVerification(3),
    DYABindEmailSourceTypeSecurityAlertToast(4),
    DYABindEmailSourceTypeLogoutAlert(5),
    DYA_BIND_EMAIL_SOURCE_TYPE_SIGN_UP(6),
    DYA_BIND_EMAIL_SOURCE_TYPE_LOGIN(7),
    DYA_BIND_EMAIL_SOURCE_TYPE_FEED(8),
    DYA_BIND_EMAIL_SOURCE_TYPE_INBOX(9),
    DYA_BIND_EMAIL_SOURCE_TYPE_PROFILE(10),
    DYA_BIND_EMAIL_SOURCE_TYPE_EMAIL_NOTIFICATION(12);

    public final int LJLIL;

    public static V86 valueOf(String str) {
        return (V86) V0N.LJJJ(V86.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    V86(int i) {
        this.LJLIL = i;
    }
}
