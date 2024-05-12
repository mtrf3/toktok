package X;

/* renamed from: X.3ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101483ya {
    EVERYONE(EnumC101503yc.EVERYONE, 0),
    MAF(EnumC101503yc.SUGGESTED_FRIENDS, 1),
    FRIENDS(EnumC101503yc.FRIENDS, 2),
    NO_ONE(EnumC101503yc.NO_ONE, 3);

    public final EnumC101503yc LJLIL;
    public final int LJLILLLLZI;

    public static EnumC101483ya valueOf(String str) {
        return (EnumC101483ya) V0N.LJJJ(EnumC101483ya.class, str);
    }

    public final int getEventTrackingConstant() {
        return this.LJLILLLLZI;
    }

    public final EnumC101503yc getOption() {
        return this.LJLIL;
    }

    EnumC101483ya(EnumC101503yc enumC101503yc, int i) {
        this.LJLIL = enumC101503yc;
        this.LJLILLLLZI = i;
    }
}
