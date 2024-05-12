package X;

/* renamed from: X.CGx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31059CGx {
    DEFAULT(0),
    RANK_DIALOG(1),
    RANK_PAGE(2),
    BOTTOM_BAR(4);

    public static final C31060CGy Companion = new Object() { // from class: X.CGy
    };
    public final long LJLIL;

    public static EnumC31059CGx valueOf(String str) {
        return (EnumC31059CGx) V0N.LJJJ(EnumC31059CGx.class, str);
    }

    public final long getScene() {
        return this.LJLIL;
    }

    EnumC31059CGx(long j) {
        this.LJLIL = j;
    }
}
