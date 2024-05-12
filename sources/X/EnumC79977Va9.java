package X;

/* renamed from: X.Va9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79977Va9 {
    Finished(0),
    Playing(1),
    Stopped(2);

    public final int LJLIL;

    public static EnumC79977Va9 valueOf(String str) {
        return (EnumC79977Va9) V0N.LJJJ(EnumC79977Va9.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC79977Va9(int i) {
        this.LJLIL = i;
    }
}
