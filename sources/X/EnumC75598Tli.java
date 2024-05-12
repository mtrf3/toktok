package X;

/* renamed from: X.Tli, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75598Tli {
    TOPIC_QUIT(0),
    TOPIC_CHANGE(1),
    DISCONNECT(2),
    MATCH_START(3),
    CROSS_ARCH_P2P(4);

    public int LJLIL;

    public static EnumC75598Tli valueOf(String str) {
        return (EnumC75598Tli) V0N.LJJJ(EnumC75598Tli.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final void setValue(int i) {
        this.LJLIL = i;
    }

    EnumC75598Tli(int i) {
        this.LJLIL = i;
    }
}
