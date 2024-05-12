package X;

import com.lynx.tasm.base.LLog;

/* loaded from: classes9.dex */
public final class J7Z {
    public static final J7Z LIZ = new J7Z();

    static {
        new C1DF();
    }

    public static final void LIZ(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("XAudio-");
        LIZ2.append(str);
        LLog.LIZLLL(4, X1D.LIZIZ(LIZ2), str2);
    }

    public static final void LIZIZ(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("XAudio-");
        LIZ2.append(str);
        LLog.LIZLLL(2, X1D.LIZIZ(LIZ2), str2);
    }

    public static final void LIZJ(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("XAudio-");
        LIZ2.append(str);
        LLog.LIZLLL(3, X1D.LIZIZ(LIZ2), str2);
    }
}
