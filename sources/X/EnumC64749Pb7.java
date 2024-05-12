package X;

/* renamed from: X.Pb7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64749Pb7 {
    NormalStart(-1),
    ColdStart(0),
    HotStart(1),
    WarmStart(2),
    WeakNet(3),
    Default(4);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC64749Pb7 valueOf(String str) {
        return (EnumC64749Pb7) V0N.LJJJ(EnumC64749Pb7.class, str);
    }

    EnumC64749Pb7(int i) {
        this.LJLIL = i;
    }
}
