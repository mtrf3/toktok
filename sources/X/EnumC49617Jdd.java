package X;

/* renamed from: X.Jdd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC49617Jdd {
    REGULAR("REGULAR", "regular"),
    BOLD("BOLD", "bold"),
    BOLD_ITALIC("BOLD_ITALIC", "boldItalic"),
    ITALIC("ITALIC", "italic"),
    LIGHT("LIGHT", "light"),
    LIGHT_ITALIC("LIGHT_ITALIC", "lightItalic"),
    MEDIUM("MEDIUM", "medium"),
    MEDIUM_ITALIC("MEDIUM_ITALIC", "mediumItalic");

    public final String LJLIL;
    public final int LJLILLLLZI;

    public static EnumC49617Jdd valueOf(String str) {
        return (EnumC49617Jdd) V0N.LJJJ(EnumC49617Jdd.class, str);
    }

    public final String getFONT_NAME() {
        return this.LJLIL;
    }

    public final int getVALUE() {
        return this.LJLILLLLZI;
    }

    EnumC49617Jdd(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
