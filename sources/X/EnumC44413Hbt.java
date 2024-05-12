package X;

/* renamed from: X.Hbt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC44413Hbt {
    INVALID(-1),
    SINGLE_CHOICE(1),
    RATING_CHOICE(4);

    public final int LJLIL;

    public static EnumC44413Hbt valueOf(String str) {
        return (EnumC44413Hbt) V0N.LJJJ(EnumC44413Hbt.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC44413Hbt(int i) {
        this.LJLIL = i;
    }
}
