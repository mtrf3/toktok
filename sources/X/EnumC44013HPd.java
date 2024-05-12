package X;

/* renamed from: X.HPd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC44013HPd {
    DEFAULT(0),
    ALL(1),
    PHOTO(2),
    VIDEO(3);

    public final int LJLIL;

    public static EnumC44013HPd valueOf(String str) {
        return (EnumC44013HPd) V0N.LJJJ(EnumC44013HPd.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC44013HPd(int i) {
        this.LJLIL = i;
    }
}
