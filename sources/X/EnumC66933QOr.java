package X;

import defpackage.b0;

/* renamed from: X.QOr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66933QOr {
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

    public static EnumC66933QOr valueOf(String str) {
        return (EnumC66933QOr) V0N.LJJJ(EnumC66933QOr.class, str);
    }

    EnumC66933QOr(int i) {
        this.LJLIL = i;
    }
}
