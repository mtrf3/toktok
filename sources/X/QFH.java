package X;

/* loaded from: classes12.dex */
public enum QFH {
    Low(0),
    Medium(1),
    High(2);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static QFH valueOf(String str) {
        return (QFH) V0N.LJJJ(QFH.class, str);
    }

    QFH(int i) {
        this.LJLIL = i;
    }
}
