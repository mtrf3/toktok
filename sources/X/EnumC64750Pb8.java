package X;

/* renamed from: X.Pb8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64750Pb8 {
    NormalStart(-1),
    ColdStart(0),
    HotStart(1),
    WarmStart(2);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC64750Pb8 valueOf(String str) {
        return (EnumC64750Pb8) V0N.LJJJ(EnumC64750Pb8.class, str);
    }

    EnumC64750Pb8(int i) {
        this.LJLIL = i;
    }
}
