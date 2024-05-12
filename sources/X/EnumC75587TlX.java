package X;

/* renamed from: X.TlX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75587TlX {
    TOPIC_QUIT(0),
    TOPIC_CHANGE(1),
    DISCONNECT(2),
    MATCH_START(3);

    public int LJLIL;

    public static EnumC75587TlX valueOf(String str) {
        return (EnumC75587TlX) V0N.LJJJ(EnumC75587TlX.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final void setValue(int i) {
        this.LJLIL = i;
    }

    EnumC75587TlX(int i) {
        this.LJLIL = i;
    }
}
