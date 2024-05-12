package X;

/* renamed from: X.8Dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC207888Dw {
    ONLY_AVATAR(true, false),
    ONLY_NICKNAME(false, true),
    BOTH_AVATAR_AND_NICKNAME(true, true);

    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    public static EnumC207888Dw valueOf(String str) {
        return (EnumC207888Dw) V0N.LJJJ(EnumC207888Dw.class, str);
    }

    public final boolean getShowAvatar() {
        return this.LJLIL;
    }

    public final boolean getShowNickname() {
        return this.LJLILLLLZI;
    }

    EnumC207888Dw(boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }
}
