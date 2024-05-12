package X;

/* loaded from: classes16.dex */
public enum YJV implements InterfaceC87191YJv {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);

    public final int LJLIL;

    public static InterfaceC87193YJx zzad() {
        return C87188YJs.LIZ;
    }

    @Override // X.InterfaceC87191YJv
    public final int zzac() {
        return this.LJLIL;
    }

    public static YJV zzj(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PARTNER_SIGNALS;
                }
                return UNITY_SIGNALS;
            }
            return AFMA_SIGNALS;
        }
        return UNKNOWN_PROTO;
    }

    YJV(int i) {
        this.LJLIL = i;
    }
}
