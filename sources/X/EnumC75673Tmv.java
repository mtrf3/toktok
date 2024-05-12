package X;

/* renamed from: X.Tmv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75673Tmv {
    IDLE(0),
    WAITING(1),
    INVITING(2),
    LINKING(3),
    LINKING_SUCCESS(4);

    public final int LJLIL;

    public static EnumC75673Tmv valueOf(String str) {
        return (EnumC75673Tmv) V0N.LJJJ(EnumC75673Tmv.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC75673Tmv(int i) {
        this.LJLIL = i;
    }
}
