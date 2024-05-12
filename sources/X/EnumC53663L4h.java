package X;

/* renamed from: X.L4h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC53663L4h {
    LIVE("live"),
    STORY("story"),
    PROFILE("profile"),
    ACTIVE("active"),
    FOLLOW("follow"),
    INTERACTION("interaction");

    public final String LJLIL;

    public static EnumC53663L4h valueOf(String str) {
        return (EnumC53663L4h) V0N.LJJJ(EnumC53663L4h.class, str);
    }

    public final String getString() {
        return this.LJLIL;
    }

    EnumC53663L4h(String str) {
        this.LJLIL = str;
    }
}
