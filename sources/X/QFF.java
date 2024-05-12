package X;

/* loaded from: classes12.dex */
public enum QFF {
    UNKNOWN(-1),
    QUIC(0),
    TLS(1),
    HTTP2(2),
    SPDY(3);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static QFF valueOf(String str) {
        return (QFF) V0N.LJJJ(QFF.class, str);
    }

    QFF(int i) {
        this.LJLIL = i;
    }
}
