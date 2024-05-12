package X;

/* loaded from: classes16.dex */
public enum YJT implements InterfaceC87191YJv {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);

    public final int LJLIL;

    public static InterfaceC87193YJx zzad() {
        return C87189YJt.LIZ;
    }

    @Override // X.InterfaceC87191YJv
    public final int zzac() {
        return this.LJLIL;
    }

    public static YJT zzh(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return UNENCRYPTED;
                }
                return TINK_HYBRID;
            }
            return BITSLICER;
        }
        return UNKNOWN_ENCRYPTION_METHOD;
    }

    YJT(int i) {
        this.LJLIL = i;
    }
}
