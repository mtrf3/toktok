package X;

/* renamed from: X.a4r, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92073a4r {
    CANCEL(0),
    SUCCESS(1),
    ERROR(2);

    public final int LJLIL;

    public static EnumC92073a4r valueOf(String str) {
        return (EnumC92073a4r) V0N.LJJJ(EnumC92073a4r.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC92073a4r(int i) {
        this.LJLIL = i;
    }
}
