package X;

/* renamed from: X.TnE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75692TnE {
    IDLE(0),
    WAITING(1),
    INVITING(2),
    LINKING(3),
    LINKING_SUCCESS(4);

    public final int LJLIL;

    public static EnumC75692TnE valueOf(String str) {
        return (EnumC75692TnE) V0N.LJJJ(EnumC75692TnE.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC75692TnE(int i) {
        this.LJLIL = i;
    }
}
