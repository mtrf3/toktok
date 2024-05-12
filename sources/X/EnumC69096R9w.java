package X;

/* renamed from: X.R9w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC69096R9w {
    ACTIVATION_DEFAULT(0),
    ACTIVATION_REGISTER(1),
    ACTIVATION_BIND(2),
    ACTIVATION_FORGET(3),
    ACTIVATION_MODIFY(4),
    ACTIVATION_REGISTER_WAP(5),
    ACTIVATION_BIND_WAP(6),
    ACTIVATION_NEW_REGISTER(7),
    ACTIVATION_LOGIN_PASSWORD_NOTIFY(8),
    ACTIVATION_BIND_V2(9),
    ACTIVATION_CHANGE_MOBILE(10),
    ACTIVATION_QUICK_LOGIN(11),
    ACTIVATION_IDENTIFY_VERIFICATION(13),
    ACTIVATION_CHANGE_MOBILE_VERIFY(14),
    ACTIVATION_SAFE_LOCK(15),
    ACTIVATION_SAFE_UNLOCK(16),
    ACTIVATION_AUTHORIZE(17),
    ACTIVATION_GET_OR_REGISTER(18),
    ACTIVATION_LOGIN_ONLY(19),
    ACTIVATION_SUBJECT_INVITE_DEPUTY(100);

    public final int LJLIL;

    public static EnumC69096R9w valueOf(String str) {
        return (EnumC69096R9w) V0N.LJJJ(EnumC69096R9w.class, str);
    }

    public final int getScene() {
        return this.LJLIL;
    }

    EnumC69096R9w(int i) {
        this.LJLIL = i;
    }
}
