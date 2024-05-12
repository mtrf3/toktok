package X;

/* renamed from: X.2rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC71912rz {
    LOADING(6),
    ADDED(5),
    IN_STORE(4);

    public final int LJLIL;

    public static EnumC71912rz valueOf(String str) {
        return (EnumC71912rz) V0N.LJJJ(EnumC71912rz.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC71912rz(int i) {
        this.LJLIL = i;
    }
}
