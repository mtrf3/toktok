package X;

/* renamed from: X.SUx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC72191SUx {
    NEW_RELEASE_ANCHOR_MAJOR(1),
    PLAY_LIST_ANCHOR_MAJOR(2),
    BRAND_ICON(3),
    NEW_RELEASE_ANCHOR_MINOR(10),
    PLAY_LIST_ANCHOR_MINOR(20);

    public final int LJLIL;

    public static EnumC72191SUx valueOf(String str) {
        return (EnumC72191SUx) V0N.LJJJ(EnumC72191SUx.class, str);
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    EnumC72191SUx(int i) {
        this.LJLIL = i;
    }
}
