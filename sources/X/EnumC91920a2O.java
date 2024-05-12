package X;

/* renamed from: X.a2O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91920a2O {
    USER_NORMAL("USER_NORMAL"),
    USER_OVERDUE("USER_OVERDUE"),
    USER_FREEZE("USER_FREEZE");

    public static final C91919a2N Companion = new C91919a2N();
    public final String LJLIL;

    public static EnumC91920a2O valueOf(String str) {
        return (EnumC91920a2O) V0N.LJJJ(EnumC91920a2O.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC91920a2O(String str) {
        this.LJLIL = str;
    }
}
