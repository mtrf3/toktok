package X;

/* loaded from: classes16.dex */
public enum YBS {
    TL_BR,
    BR,
    BL,
    TR,
    TL;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static YBS swigToEnum(int i) {
        YBS[] ybsArr = (YBS[]) YBS.class.getEnumConstants();
        if (i < ybsArr.length && i >= 0) {
            YBS ybs = ybsArr[i];
            if (ybs.LJLIL == i) {
                return ybs;
            }
        }
        for (YBS ybs2 : ybsArr) {
            if (ybs2.LJLIL == i) {
                return ybs2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", YBS.class, " with value ", i));
    }

    public static YBS valueOf(String str) {
        return (YBS) V0N.LJJJ(YBS.class, str);
    }

    YBS() {
        int i = YBT.LIZ;
        YBT.LIZ = i + 1;
        this.LJLIL = i;
    }
}
