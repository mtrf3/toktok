package X;

/* renamed from: X.2u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC73222u6 {
    STATIC(1),
    ANIMATED(2),
    VIDEO_STICKER_STATIC(3),
    VIDEO_STICKER_ANIMATED(4),
    ENTRANCE(5);

    public final int LJLIL;

    public static EnumC73222u6 valueOf(String str) {
        return (EnumC73222u6) V0N.LJJJ(EnumC73222u6.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC73222u6(int i) {
        this.LJLIL = i;
    }
}
