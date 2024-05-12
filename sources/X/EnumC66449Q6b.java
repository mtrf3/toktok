package X;

/* renamed from: X.Q6b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66449Q6b {
    AUTOMATIC("AUTOMATIC", "automatic"),
    DISPLAY_ALWAYS("DISPLAY_ALWAYS", "display_always"),
    NEVER_DISPLAY("NEVER_DISPLAY", "never_display");

    public static EnumC66449Q6b DEFAULT = AUTOMATIC;
    public final String LJLIL;
    public final int LJLILLLLZI;

    public int getValue() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static EnumC66449Q6b fromInt(int i) {
        for (EnumC66449Q6b enumC66449Q6b : values()) {
            if (enumC66449Q6b.getValue() == i) {
                return enumC66449Q6b;
            }
        }
        return null;
    }

    EnumC66449Q6b(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
