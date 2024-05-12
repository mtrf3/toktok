package X;

/* renamed from: X.3Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC82403Lg {
    NULL(-1),
    ALL(0),
    UNREAD(1),
    NOT_REPLY(2),
    FOLLOWING(3);

    public static final C82393Lf Companion = new C82393Lf();
    public final int LJLIL;

    public static EnumC82403Lg valueOf(String str) {
        return (EnumC82403Lg) V0N.LJJJ(EnumC82403Lg.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC82403Lg(int i) {
        this.LJLIL = i;
    }
}
