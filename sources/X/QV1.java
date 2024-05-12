package X;

/* loaded from: classes12.dex */
public enum QV1 {
    ORIGIN(0),
    FILE_PATH(1);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static QV1 fromValue(int i) {
        QV1 qv1 = ORIGIN;
        if (i == qv1.getValue()) {
            return qv1;
        }
        QV1 qv12 = FILE_PATH;
        if (i == qv12.getValue()) {
            return qv12;
        }
        return null;
    }

    public static QV1 valueOf(String str) {
        return (QV1) V0N.LJJJ(QV1.class, str);
    }

    QV1(int i) {
        this.LJLIL = i;
    }
}
