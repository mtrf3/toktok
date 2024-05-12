package X;

/* loaded from: classes16.dex */
public enum YJU implements InterfaceC87191YJv {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);

    public final int LJLIL;

    public static InterfaceC87193YJx zzad() {
        return C87190YJu.LIZ;
    }

    @Override // X.InterfaceC87191YJv
    public final int zzac() {
        return this.LJLIL;
    }

    public static YJU zzi(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1000) {
                        return null;
                    }
                    return ENUM_UNKNOWN;
                }
                return ENUM_FAILURE;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    YJU(int i) {
        this.LJLIL = i;
    }
}
