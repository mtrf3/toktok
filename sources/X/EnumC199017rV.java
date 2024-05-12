package X;

/* renamed from: X.7rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC199017rV {
    LIKE(1),
    DISLIKE(2),
    CANCEL_LIKE(3),
    CANCEL_DISLIKE(4),
    DELETE(10);

    public final int LJLIL;

    public static EnumC199017rV valueOf(String str) {
        return (EnumC199017rV) V0N.LJJJ(EnumC199017rV.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC199017rV(int i) {
        this.LJLIL = i;
    }
}
