package X;

/* renamed from: X.QMb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66865QMb {
    Default(0),
    TimeOut(1),
    Failed(2),
    Success(3);

    public final int LJLIL;

    public int getTypeValue() {
        return this.LJLIL;
    }

    public static EnumC66865QMb valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Default;
                }
                return Success;
            }
            return Failed;
        }
        return TimeOut;
    }

    public static EnumC66865QMb valueOf(String str) {
        return (EnumC66865QMb) V0N.LJJJ(EnumC66865QMb.class, str);
    }

    EnumC66865QMb(int i) {
        this.LJLIL = i;
    }
}
