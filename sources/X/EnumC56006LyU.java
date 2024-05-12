package X;

/* renamed from: X.LyU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56006LyU {
    PREFETCH(0),
    PRELOAD(1),
    FIRST_REQUEST(2),
    REFRESH(3),
    ERROR_RETRY(4),
    RETURN_MALL(5);

    public final int LJLIL;

    public static EnumC56006LyU valueOf(String str) {
        return (EnumC56006LyU) V0N.LJJJ(EnumC56006LyU.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC56006LyU(int i) {
        this.LJLIL = i;
    }
}
