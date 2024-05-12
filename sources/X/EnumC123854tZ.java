package X;

/* renamed from: X.4tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123854tZ {
    NLEDurationType_Unknown(-1),
    NLEDurationType_Fixed(0),
    NLEDurationType_FollowMax(1),
    NLEDurationType_FollowMin(2);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123854tZ swigToEnum(int i) {
        EnumC123854tZ[] enumC123854tZArr = (EnumC123854tZ[]) EnumC123854tZ.class.getEnumConstants();
        if (i < enumC123854tZArr.length && i >= 0) {
            EnumC123854tZ enumC123854tZ = enumC123854tZArr[i];
            if (enumC123854tZ.LJLIL == i) {
                return enumC123854tZ;
            }
        }
        for (EnumC123854tZ enumC123854tZ2 : enumC123854tZArr) {
            if (enumC123854tZ2.LJLIL == i) {
                return enumC123854tZ2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123854tZ.class, " with value ", i));
    }

    public static EnumC123854tZ valueOf(String str) {
        return (EnumC123854tZ) V0N.LJJJ(EnumC123854tZ.class, str);
    }

    EnumC123854tZ(int i) {
        this.LJLIL = i;
    }
}
