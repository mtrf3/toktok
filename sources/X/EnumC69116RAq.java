package X;

import java.util.LinkedHashMap;

/* renamed from: X.RAq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC69116RAq {
    NONE(-1),
    SIGN_UP(0),
    LOGIN(1),
    SET_OR_RESET_PASSWORD(2),
    BIND_PHONE(3),
    MODIFY_PHONE(4),
    RECOVER_ACCOUNT(5),
    CHANGE_PASSWORD(9),
    BIND_EMAIL(6),
    VERIFY(7),
    CHANGE_EMAIL(8),
    ONE_KEY_LOGIN(10),
    TWO_STEP_VERIFICATION(11),
    LOGIN_FLOW(12),
    UNBIND_PHONE(14),
    UNBIND_EMAIL(15),
    BIND_PHONE_OR_EMAIL_3P_LOGIN(16),
    BIND_PHONE_OR_EMAIL_3P_SIGN_UP(17),
    BIND_EMAIL_FROM_FEED(18),
    BIND_EMAIL_FROM_INBOX(19),
    BIND_EMAIL_FROM_PROFILE(20),
    BIND_TOTP(21),
    VERIFY_TOTP(22),
    UPDATE_TOTP(23),
    REMOVE_TOTP(24),
    VERIFY_ACCOUNT_FROM_2SV(25),
    HISTORY_LOGIN(26),
    ADD_CURRENT_DEVICE_TO_TRUST_DEVICE(27),
    MANAGE_TRUSTED_DEVICE(28),
    PASSKEY_REGISTRATION(29);

    public static final RAK Companion = new RAK();
    public static final java.util.Map<Integer, EnumC69116RAq> VALUES_MAP;
    public final int LJLIL;

    public static EnumC69116RAq valueOf(String str) {
        return (EnumC69116RAq) V0N.LJJJ(EnumC69116RAq.class, str);
    }

    static {
        EnumC69116RAq[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ >= 16 ? LJJIIZ : 16);
        for (EnumC69116RAq enumC69116RAq : values) {
            linkedHashMap.put(Integer.valueOf(enumC69116RAq.LJLIL), enumC69116RAq);
        }
        VALUES_MAP = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC69116RAq(int i) {
        this.LJLIL = i;
    }
}
