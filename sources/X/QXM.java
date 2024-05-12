package X;

/* loaded from: classes12.dex */
public enum QXM {
    UNKNOWN(0),
    RECONNECT_WS(1),
    PUSH_RECEIVE(2),
    IMSDK_RECEIVE(3),
    MIX_CHAIN_FIX(4),
    LOGOUT(5);

    public static final QXP Companion = new QXP();
    public final int LJLIL;

    public static final QXM getByWhat(int i) {
        Companion.getClass();
        return QXP.LIZ(i);
    }

    public static QXM valueOf(String str) {
        return (QXM) V0N.LJJJ(QXM.class, str);
    }

    public final int getWhat() {
        return this.LJLIL;
    }

    QXM(int i) {
        this.LJLIL = i;
    }
}
