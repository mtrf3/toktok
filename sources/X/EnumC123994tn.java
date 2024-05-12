package X;

/* renamed from: X.4tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123994tn {
    RESIZE_ALGORITHM_BILINEAR(0),
    RESIZE_ALGORITHM_LANCZOS(215);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123994tn swigToEnum(int i) {
        EnumC123994tn[] enumC123994tnArr = (EnumC123994tn[]) EnumC123994tn.class.getEnumConstants();
        if (i < enumC123994tnArr.length && i >= 0) {
            EnumC123994tn enumC123994tn = enumC123994tnArr[i];
            if (enumC123994tn.LJLIL == i) {
                return enumC123994tn;
            }
        }
        for (EnumC123994tn enumC123994tn2 : enumC123994tnArr) {
            if (enumC123994tn2.LJLIL == i) {
                return enumC123994tn2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123994tn.class, " with value ", i));
    }

    public static EnumC123994tn valueOf(String str) {
        return (EnumC123994tn) V0N.LJJJ(EnumC123994tn.class, str);
    }

    EnumC123994tn(int i) {
        this.LJLIL = i;
    }
}
