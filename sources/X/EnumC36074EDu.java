package X;

/* renamed from: X.EDu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC36074EDu {
    UNKNOWN(0),
    MISSING(1),
    EMPTY(2),
    WRONG_TYPE(3),
    OUT_OF_RANGE(4),
    CONTENT_EXCEEDS_LIMIT(5),
    REDUNDANT(6);

    public final int LJLIL;

    public static EnumC36074EDu valueOf(String str) {
        return (EnumC36074EDu) V0N.LJJJ(EnumC36074EDu.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC36074EDu(int i) {
        this.LJLIL = i;
    }
}
