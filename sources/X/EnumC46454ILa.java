package X;

/* renamed from: X.ILa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46454ILa {
    AS_OPTION_FLAG_PICTURE_SIZE((byte) 1),
    AS_OPTION_FLAG_FPS_RANGE((byte) 2),
    AS_OPTION_FLAG_MTK_3DNR((byte) 4),
    AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED((byte) 8);

    public final byte LJLIL;

    public static EnumC46454ILa valueOf(String str) {
        return (EnumC46454ILa) V0N.LJJJ(EnumC46454ILa.class, str);
    }

    public final byte getOption() {
        return this.LJLIL;
    }

    EnumC46454ILa(byte b) {
        this.LJLIL = b;
    }
}
