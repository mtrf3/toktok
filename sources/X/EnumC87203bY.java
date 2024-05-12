package X;

/* renamed from: X.3bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC87203bY {
    DEFAULT(-1),
    ADD(0),
    REMOVE(1);

    public final int LJLIL;

    public static EnumC87203bY valueOf(String str) {
        return (EnumC87203bY) V0N.LJJJ(EnumC87203bY.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC87203bY(int i) {
        this.LJLIL = i;
    }
}
