package X;

/* renamed from: X.GlV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42461GlV {
    NOT_RETRY(0),
    RETRY(1),
    CLEAR(2);

    public final int LJLIL;

    public static EnumC42461GlV valueOf(String str) {
        return (EnumC42461GlV) V0N.LJJJ(EnumC42461GlV.class, str);
    }

    public final int getId() {
        return this.LJLIL;
    }

    EnumC42461GlV(int i) {
        this.LJLIL = i;
    }
}
