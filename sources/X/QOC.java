package X;

import defpackage.b0;

/* loaded from: classes12.dex */
public enum QOC {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);

    public final int LJLIL;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConnectionState{State=");
        return b0.LIZJ(LIZ, this.LJLIL, '}', LIZ);
    }

    public int getTypeValue() {
        return this.LJLIL;
    }

    public static QOC valueOf(String str) {
        return (QOC) V0N.LJJJ(QOC.class, str);
    }

    QOC(int i) {
        this.LJLIL = i;
    }
}
