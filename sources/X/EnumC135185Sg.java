package X;

/* renamed from: X.5Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC135185Sg {
    ANY(0),
    IDLE(3),
    PREPARED(5),
    STARTED(6),
    PAUSED(7),
    SEEKING(8),
    STOPPED(9),
    COMPLETED(10),
    ENGINE_NOT_CRATED(11),
    DESTROYING(12);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC135185Sg swigToEnum(int i) {
        EnumC135185Sg[] enumC135185SgArr = (EnumC135185Sg[]) EnumC135185Sg.class.getEnumConstants();
        if (i < enumC135185SgArr.length && i >= 0) {
            EnumC135185Sg enumC135185Sg = enumC135185SgArr[i];
            if (enumC135185Sg.LJLIL == i) {
                return enumC135185Sg;
            }
        }
        for (EnumC135185Sg enumC135185Sg2 : enumC135185SgArr) {
            if (enumC135185Sg2.LJLIL == i) {
                return enumC135185Sg2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC135185Sg.class, " with value ", i));
    }

    public static EnumC135185Sg valueOf(String str) {
        return (EnumC135185Sg) V0N.LJJJ(EnumC135185Sg.class, str);
    }

    EnumC135185Sg(int i) {
        this.LJLIL = i;
    }
}
