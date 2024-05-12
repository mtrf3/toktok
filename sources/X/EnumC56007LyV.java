package X;

/* renamed from: X.LyV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56007LyV {
    FIRST_REQUEST(0),
    ERROR_RETRY(2),
    REFRESH(3);

    public final int LJLIL;

    public static EnumC56007LyV valueOf(String str) {
        return (EnumC56007LyV) V0N.LJJJ(EnumC56007LyV.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC56007LyV(int i) {
        this.LJLIL = i;
    }
}
