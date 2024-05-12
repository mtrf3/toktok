package X;

/* renamed from: X.Zzu, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91766Zzu {
    Loading("loading"),
    Showing("showing"),
    NotFound("not_found");

    public final String LJLIL;

    public static EnumC91766Zzu valueOf(String str) {
        return (EnumC91766Zzu) V0N.LJJJ(EnumC91766Zzu.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    EnumC91766Zzu(String str) {
        this.LJLIL = str;
    }
}
