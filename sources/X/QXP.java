package X;

/* loaded from: classes12.dex */
public final class QXP {
    public static QXM LIZ(int i) {
        QXM qxm = QXM.RECONNECT_WS;
        if (i == qxm.getWhat()) {
            return qxm;
        }
        QXM qxm2 = QXM.PUSH_RECEIVE;
        if (i == qxm2.getWhat()) {
            return qxm2;
        }
        QXM qxm3 = QXM.IMSDK_RECEIVE;
        if (i == qxm3.getWhat()) {
            return qxm3;
        }
        QXM qxm4 = QXM.MIX_CHAIN_FIX;
        if (i == qxm4.getWhat()) {
            return qxm4;
        }
        QXM qxm5 = QXM.LOGOUT;
        if (i == qxm5.getWhat()) {
            return qxm5;
        }
        return QXM.UNKNOWN;
    }
}
