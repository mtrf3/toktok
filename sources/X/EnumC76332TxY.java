package X;

/* renamed from: X.TxY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76332TxY {
    UNKNOWN(0),
    SCORE_UPDATE(1),
    BATTLE_END(2),
    OPT_OUT_UPDATE(3);

    public final int LJLIL;

    public static EnumC76332TxY valueOf(String str) {
        return (EnumC76332TxY) V0N.LJJJ(EnumC76332TxY.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC76332TxY(int i) {
        this.LJLIL = i;
    }
}
