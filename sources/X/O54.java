package X;

/* loaded from: classes11.dex */
public enum O54 {
    PARSE(0),
    DOWNLOAD(1),
    TYPE(2),
    DECODE(3),
    STREAM(4),
    UNKNOWN_EXCEPTION(5);

    public final int LJLIL;

    public static O54 valueOf(String str) {
        return (O54) V0N.LJJJ(O54.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    O54(int i) {
        this.LJLIL = i;
    }
}
