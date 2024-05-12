package X;

/* renamed from: X.Tmm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75664Tmm {
    PAIR_SUCCESS(0),
    CANCEL_PAIR(1),
    TIMEOUT(2);

    public int LJLIL;

    public static EnumC75664Tmm valueOf(String str) {
        return (EnumC75664Tmm) V0N.LJJJ(EnumC75664Tmm.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final void setValue(int i) {
        this.LJLIL = i;
    }

    EnumC75664Tmm(int i) {
        this.LJLIL = i;
    }
}
