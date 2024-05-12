package X;

/* renamed from: X.L3f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC53635L3f {
    NONE(0),
    OVER(1),
    EXCLUDE(-1);

    public final int LJLIL;

    public static EnumC53635L3f valueOf(String str) {
        return (EnumC53635L3f) V0N.LJJJ(EnumC53635L3f.class, str);
    }

    public final int getFlag() {
        return this.LJLIL;
    }

    EnumC53635L3f(int i) {
        this.LJLIL = i;
    }
}
