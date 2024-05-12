package X;

/* renamed from: X.Ome, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC62916Ome {
    FORCE_ON(1),
    ON(2),
    OFF(3),
    PARENT_SET_ON(4),
    NOT_SHOW(5),
    DEFAULT_ON(6),
    UNKNOWN(-1);

    public static final C62928Omq Companion = new C62928Omq();
    public final int LJLIL;

    public static EnumC62916Ome valueOf(String str) {
        return (EnumC62916Ome) V0N.LJJJ(EnumC62916Ome.class, str);
    }

    public final boolean isOn() {
        if (this == ON || this == FORCE_ON || this == DEFAULT_ON || this == PARENT_SET_ON) {
            return true;
        }
        return false;
    }

    public final boolean isSelfOrSystemOn() {
        if (this == ON || this == FORCE_ON || this == DEFAULT_ON) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC62916Ome(int i) {
        this.LJLIL = i;
    }
}
