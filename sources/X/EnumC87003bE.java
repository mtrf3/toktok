package X;

/* renamed from: X.3bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC87003bE {
    STICKER_STORE(1),
    PERSONAL_PROFILE_FROM_STICKER_STORE(2),
    PERSONAL_PROFILE_NOT_FROM_STICKER_STORE(3),
    OTHERS_PROFILE_FROM_STICKER_STORE(4),
    OTHERS_PROFILE_NOT_FROM_STICKER_STORE(5);

    public final int LJLIL;

    public static EnumC87003bE valueOf(String str) {
        return (EnumC87003bE) V0N.LJJJ(EnumC87003bE.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC87003bE(int i) {
        this.LJLIL = i;
    }
}
