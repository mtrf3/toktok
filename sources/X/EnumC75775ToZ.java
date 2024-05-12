package X;

/* renamed from: X.ToZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75775ToZ {
    PULLING_STREAM(0),
    NORMAL(1),
    FORWARD_STREAM_FAILED(2),
    RECONNECTING(3),
    PAUSE(4);

    public int LJLIL;

    public static EnumC75775ToZ valueOf(String str) {
        return (EnumC75775ToZ) V0N.LJJJ(EnumC75775ToZ.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final void setType(int i) {
        this.LJLIL = i;
    }

    EnumC75775ToZ(int i) {
        this.LJLIL = i;
    }
}
