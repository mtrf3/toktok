package X;

/* loaded from: classes11.dex */
public enum NQQ {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    public final String LJLIL;

    NQQ(String str) {
        this.LJLIL = str;
    }

    public static NQQ valueOf(String str) {
        return (NQQ) V0N.LJJJ(NQQ.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }
}
