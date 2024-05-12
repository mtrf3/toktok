package X;

/* renamed from: X.8yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC228698yH {
    SUCCESS(0),
    EMPTY(1),
    ERROR(2);

    public int LJLIL;

    public static EnumC228698yH valueOf(String str) {
        return (EnumC228698yH) V0N.LJJJ(EnumC228698yH.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    public final void setStatus(int i) {
        this.LJLIL = i;
    }

    EnumC228698yH(int i) {
        this.LJLIL = i;
    }
}
