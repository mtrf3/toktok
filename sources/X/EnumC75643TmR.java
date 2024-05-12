package X;

/* renamed from: X.TmR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75643TmR {
    ACCEPT("accept"),
    REJECT("reject"),
    OVER_TIME("over_time"),
    INVITE_WITHDRAW("invite_withdraw"),
    OTHERS_REJECT("others_reject"),
    UNKNOW("unknow");

    public final String LJLIL;

    public static EnumC75643TmR valueOf(String str) {
        return (EnumC75643TmR) V0N.LJJJ(EnumC75643TmR.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC75643TmR(String str) {
        this.LJLIL = str;
    }
}
