package X;

/* renamed from: X.863, reason: invalid class name */
/* loaded from: classes4.dex */
public enum AnonymousClass863 {
    CHARACTER_LINE_BREAK('\n', "<br>"),
    CHARACTER_LOWER_THAN('<', "&lt;"),
    CHARACTER_GREATER_THAN('>', "&gt;"),
    CHARACTER_AND('&', "&amp;");

    public static final AnonymousClass869 Companion = new Object() { // from class: X.869
    };
    public final char LJLIL;
    public final String LJLILLLLZI;

    public static AnonymousClass863 valueOf(String str) {
        return (AnonymousClass863) V0N.LJJJ(AnonymousClass863.class, str);
    }

    public final String getMarkup() {
        return this.LJLILLLLZI;
    }

    public final char getText() {
        return this.LJLIL;
    }

    AnonymousClass863(char c, String str) {
        this.LJLIL = c;
        this.LJLILLLLZI = str;
    }
}
