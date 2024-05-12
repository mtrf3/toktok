package X;

/* renamed from: X.5NA, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C5NA {
    NLE_GET_FRAMES_MODE_NORMAL,
    NLE_GET_FRAMES_MODE_NOEFFECT,
    NLE_GET_FRAMES_MODE_NOEFFECT_MULTI;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static C5NA swigToEnum(int i) {
        C5NA[] c5naArr = (C5NA[]) C5NA.class.getEnumConstants();
        if (i < c5naArr.length && i >= 0) {
            C5NA c5na = c5naArr[i];
            if (c5na.LJLIL == i) {
                return c5na;
            }
        }
        for (C5NA c5na2 : c5naArr) {
            if (c5na2.LJLIL == i) {
                return c5na2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", C5NA.class, " with value ", i));
    }

    public static C5NA valueOf(String str) {
        return (C5NA) V0N.LJJJ(C5NA.class, str);
    }

    C5NA() {
        int i = C133875Nf.LIZ;
        C133875Nf.LIZ = i + 1;
        this.LJLIL = i;
    }
}
