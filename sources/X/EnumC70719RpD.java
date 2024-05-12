package X;

/* renamed from: X.RpD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC70719RpD {
    OLD_REVIEW_GALLERY(0),
    US_REVIEW_GALLERY(1),
    SHOP_TAB_REVIEW_GALLERY(2);

    public final int LJLIL;

    public static EnumC70719RpD valueOf(String str) {
        return (EnumC70719RpD) V0N.LJJJ(EnumC70719RpD.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC70719RpD(int i) {
        this.LJLIL = i;
    }
}
