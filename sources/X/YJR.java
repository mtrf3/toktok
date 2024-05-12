package X;

/* loaded from: classes16.dex */
public enum YJR implements InterfaceC87191YJv {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3);

    public final int LJLIL;

    public static InterfaceC87193YJx zzad() {
        return C87186YJq.LIZ;
    }

    @Override // X.InterfaceC87191YJv
    public final int zzac() {
        return this.LJLIL;
    }

    public static YJR zzf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DEBUGGER_STATE_ACTIVE;
                }
                return DEBUGGER_STATE_INSTALLED;
            }
            return DEBUGGER_STATE_NOT_INSTALLED;
        }
        return DEBUGGER_STATE_UNSPECIFIED;
    }

    YJR(int i) {
        this.LJLIL = i;
    }
}
