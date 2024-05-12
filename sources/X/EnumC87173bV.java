package X;

/* renamed from: X.3bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC87173bV {
    FAVORITE(1),
    NOT_FAVORITE(2);

    public final int LJLIL;

    public static EnumC87173bV valueOf(String str) {
        return (EnumC87173bV) V0N.LJJJ(EnumC87173bV.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC87173bV(int i) {
        this.LJLIL = i;
    }
}
