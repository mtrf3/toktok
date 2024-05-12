package X;

/* renamed from: X.3Vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC85173Vx {
    LIKED(0),
    POSTED(1),
    FAVORITES(2);

    public final int LJLIL;

    public static EnumC85173Vx valueOf(String str) {
        return (EnumC85173Vx) V0N.LJJJ(EnumC85173Vx.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC85173Vx(int i) {
        this.LJLIL = i;
    }
}
