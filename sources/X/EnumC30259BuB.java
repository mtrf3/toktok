package X;

/* renamed from: X.BuB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30259BuB {
    ICON(EnumC30260BuC.ICON, new C30271BuN(false)),
    ICON_WITH_TEXT(EnumC30260BuC.ICON_WITH_TEXT, new C30271BuN(true)),
    LANDSCAPE_ICON(EnumC30260BuC.ICON_LAND, new C30271BuN(false));

    public final EnumC30260BuC LJLIL;
    public final C30271BuN LJLILLLLZI;

    public static EnumC30259BuB valueOf(String str) {
        return (EnumC30259BuB) V0N.LJJJ(EnumC30259BuB.class, str);
    }

    public final EnumC30260BuC getLayoutStyle() {
        return this.LJLIL;
    }

    public final C30271BuN getStyleDesc() {
        return this.LJLILLLLZI;
    }

    EnumC30259BuB(EnumC30260BuC enumC30260BuC, C30271BuN c30271BuN) {
        this.LJLIL = enumC30260BuC;
        this.LJLILLLLZI = c30271BuN;
    }
}
