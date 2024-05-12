package X;

/* loaded from: classes6.dex */
public enum CNK {
    WEB_VIEW("webview"),
    LYNX("lynxview");

    public final String LJLIL;

    public static CNK valueOf(String str) {
        return (CNK) V0N.LJJJ(CNK.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    CNK(String str) {
        this.LJLIL = str;
    }
}
