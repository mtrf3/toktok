package X;

/* renamed from: X.Gic, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42282Gic {
    OTHER(0),
    CLOSE_GONE(1),
    CLOSE_VISIBLE(2),
    CLOSE_VISIBLE_5S(3),
    CLOSE_VISIBLE_15S(4);

    public final int LJLIL;

    public static EnumC42282Gic valueOf(String str) {
        return (EnumC42282Gic) V0N.LJJJ(EnumC42282Gic.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC42282Gic(int i) {
        this.LJLIL = i;
    }
}
