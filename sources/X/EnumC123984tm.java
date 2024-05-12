package X;

/* renamed from: X.4tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123984tm {
    NLE_ALLOWLISTOPERATION_TYPE_ADD(0),
    NLE_ALLOWLISTOPERATION_TYPE_REMOVE(1),
    NLE_ALLOWLISTOPERATION_TYPE_RESET(2),
    NLE_ALLOWLISTOPERATION_TYPE_CLEAR(3);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123984tm swigToEnum(int i) {
        EnumC123984tm[] enumC123984tmArr = (EnumC123984tm[]) EnumC123984tm.class.getEnumConstants();
        if (i < enumC123984tmArr.length && i >= 0) {
            EnumC123984tm enumC123984tm = enumC123984tmArr[i];
            if (enumC123984tm.LJLIL == i) {
                return enumC123984tm;
            }
        }
        for (EnumC123984tm enumC123984tm2 : enumC123984tmArr) {
            if (enumC123984tm2.LJLIL == i) {
                return enumC123984tm2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123984tm.class, " with value ", i));
    }

    public static EnumC123984tm valueOf(String str) {
        return (EnumC123984tm) V0N.LJJJ(EnumC123984tm.class, str);
    }

    EnumC123984tm(int i) {
        this.LJLIL = i;
    }
}
