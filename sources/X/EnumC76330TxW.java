package X;

/* renamed from: X.TxW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76330TxW {
    UNKNOWN(0),
    MATCH_TYPE_1V1(1),
    MATCH_TYPE_2V2(2);

    public final int LJLIL;

    public static EnumC76330TxW valueOf(String str) {
        return (EnumC76330TxW) V0N.LJJJ(EnumC76330TxW.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC76330TxW(int i) {
        this.LJLIL = i;
    }
}
