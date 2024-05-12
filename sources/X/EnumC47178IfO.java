package X;

/* renamed from: X.IfO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC47178IfO {
    Undefine(0),
    Standard(1),
    High(2),
    SuperHigh(3),
    ExtremelyHigh(4),
    FourK(5),
    HDR(6),
    Auto(7),
    L_Standard(8),
    H_High(9),
    TwoK(10),
    ExtremelyHigh_50F(11),
    TwoK_50F(12),
    FourK_50F(13),
    ExtremelyHigh_60F(14),
    TwoK_60F(15),
    FourK_60F(16),
    ExtremelyHigh_120F(17),
    TwoK_120F(18),
    FourK_120F(19);

    public final EnumC47177IfN LJLIL;

    public static EnumC47178IfO[] getAllResolution() {
        try {
            return new EnumC47178IfO[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F};
        } catch (Exception unused) {
            return new EnumC47178IfO[0];
        }
    }

    public int getIndex() {
        return ordinal();
    }

    public EnumC47177IfN getResolution() {
        return this.LJLIL;
    }

    public static EnumC47178IfO valueOf(int i) {
        EnumC47178IfO enumC47178IfO = Undefine;
        if (i >= enumC47178IfO.ordinal() && i <= FourK_120F.ordinal()) {
            return values()[i];
        }
        return enumC47178IfO;
    }

    public static EnumC47178IfO valueOf(String str) {
        return (EnumC47178IfO) V0N.LJJJ(EnumC47178IfO.class, str);
    }

    EnumC47178IfO(int i) {
        this.LJLIL = r2;
    }
}
