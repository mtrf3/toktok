package X;

/* renamed from: X.Jyl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC50927Jyl {
    ON_BACKGROUND(1),
    ENTER_MIDDLE_PAGE(2),
    SEND_NEW_SEARCH(3),
    ENTER_OTHER_BUSINESS(4),
    ENTER_SUG_PAGE(5),
    OTHERS(6);

    public final int LJLIL;

    public static EnumC50927Jyl valueOf(String str) {
        return (EnumC50927Jyl) V0N.LJJJ(EnumC50927Jyl.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC50927Jyl(int i) {
        this.LJLIL = i;
    }
}
