package X;

/* renamed from: X.XqU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86086XqU {
    MINOR(0),
    MEDIUM(1),
    MAJOR(2);

    public static final C86087XqV Companion = new C86087XqV();
    public final int LJLIL;

    public static EnumC86086XqU valueOf(String str) {
        return (EnumC86086XqU) V0N.LJJJ(EnumC86086XqU.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC86086XqU(int i) {
        this.LJLIL = i;
    }
}
