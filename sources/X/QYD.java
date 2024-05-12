package X;

/* loaded from: classes12.dex */
public enum QYD {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    public final int LJLIL;

    public int getCode() {
        return this.LJLIL;
    }

    public static QYD valueOf(String str) {
        return (QYD) V0N.LJJJ(QYD.class, str);
    }

    QYD(int i) {
        this.LJLIL = i;
    }
}
