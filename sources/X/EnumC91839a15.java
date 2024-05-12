package X;

/* renamed from: X.a15, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91839a15 {
    Credit("Credit"),
    Debit("Debit"),
    ALL("ALL"),
    UNKNOWN("UNKNOWN");

    public final String LJLIL;

    public static EnumC91839a15 valueOf(String str) {
        return (EnumC91839a15) V0N.LJJJ(EnumC91839a15.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC91839a15(String str) {
        this.LJLIL = str;
    }
}
